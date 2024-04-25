public class usuario {
    public static void main(String[] args) {
        smartTv SmartTv = new smartTv();

        SmartTv.diminuirVolume();
        SmartTv.diminuirVolume();
        SmartTv.diminuirVolume();
        SmartTv.diminuirVolume();
        SmartTv.aumentarVolume();

        System.out.println("Canal: " + SmartTv.canal);
        SmartTv.mudarCanal(13);
        System.out.println("Canal: " + SmartTv.canal);
        

        System.out.println("TV Ligada? "+ SmartTv.ligada);
        System.out.println("Canal: " + SmartTv.canal);
        System.out.println("Volume: " + SmartTv.volume);


    

        SmartTv.ligar();
        System.out.println("TV Ligada!");

        SmartTv.deligar();
        System.out.println("TV Desligada!");

    }
}
