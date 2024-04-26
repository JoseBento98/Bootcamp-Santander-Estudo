package jose.luiz.primeirasemana;

public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M" ;
        switch (plano) { // não utiliza o breake para complementar
            case "T":{
                System.out.println("5Gb Youtube");
            }
            case "M": {
                System.out.println("Whats e Instagram gratis");
            }   
            case "B": {
                System.out.println("100 minutos de ligação");
            }
                break;
        
            default:
                break;
        }
    }
}
