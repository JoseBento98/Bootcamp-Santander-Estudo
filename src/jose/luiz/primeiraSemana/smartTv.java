public class smartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal (int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarVolume(){
        System.out.println("Aumentado Volume para: " + volume);
        volume ++;
    }

    public void diminuirVolume(){
        System.out.println("Diminuindo Volume para: " + volume);
        volume --;
    }

    public void aumentarCanal() {
        canal ++;
    }

    public void diminuirCanal() {
        canal --;
    }

    public void ligar() {
        ligada = true;
    }

    public void deligar () {
        ligada = false;
    }

}
