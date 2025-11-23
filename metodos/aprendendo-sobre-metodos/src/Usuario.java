public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("Marca da TV " + smartTv.marca);

        System.out.println("Esta Ligada? " + smartTv.ligada);
        smartTv.ligar();

        System.out.println("E Agora? " + smartTv.ligada);

        System.out.println("Dminuir Volume");
        smartTv.diminuirVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        System.out.println("Muda Canal para 25");
        smartTv.mudarCanal(25);
        System.out.println("Canal Atual " + smartTv.canal);

    }
}
