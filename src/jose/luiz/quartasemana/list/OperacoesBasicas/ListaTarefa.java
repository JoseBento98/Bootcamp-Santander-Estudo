package jose.luiz.quartasemana.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
          //atributo
          private List <tarefa> tarefalist;

          public ListaTarefa() {
                    this.tarefalist = new ArrayList<>();
          }

          
          public void adicionarTarefa(String descricao) {
                    tarefalist.add(new tarefa(descricao));
          }

          public void removerTarefa(String descricao) {
                    List<tarefa> tarefaParaRemover = new ArrayList<>();
                    for (tarefa t : tarefalist) {
                              if (t.getDescricao().equalsIgnoreCase(descricao)) {
                                        tarefaParaRemover.add(t);
                              }
                    }
                    tarefalist.removeAll(tarefaParaRemover);
          }

          public int obterNumeroTotalTarefas () {
                    return tarefalist.size();
          }

          public void obterDescricoesTarefas () {
                    System.out.println(tarefalist);
          }

public static void main(String[] args) {
          ListaTarefa listaTarefa = new ListaTarefa();

          System.out.println("Número total de elementos lista:" + listaTarefa.obterNumeroTotalTarefas());

          listaTarefa.adicionarTarefa("Tarefa 1");
          listaTarefa.adicionarTarefa("Tarefa 2");
          listaTarefa.adicionarTarefa("Tarefa 1");

          System.out.println("Número total de elementos lista:" + listaTarefa.obterNumeroTotalTarefas());

          listaTarefa.removerTarefa("Tarefa 1");

          System.out.println("Número total de elementos lista:" + listaTarefa.obterNumeroTotalTarefas());

          listaTarefa.obterDescricoesTarefas();

}

}
