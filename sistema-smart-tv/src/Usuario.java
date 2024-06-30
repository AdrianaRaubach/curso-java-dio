public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: "+ smartTv.canal);
        System.out.println("Volume Atual?: "+ smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status 2 -> TV ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Novo Status -> Volume atual? " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Novo Status 2 -> Volume atual? " + smartTv.volume);

        smartTv.mudarCanal(10);
        System.out.println("Novo Status -> Canal atual? " + smartTv.canal);

    }
}
