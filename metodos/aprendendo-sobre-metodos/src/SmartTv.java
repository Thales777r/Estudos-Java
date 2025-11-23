public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    String marca = "Thales777r";

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void mudarCanal(int novoCanal25) {
        canal = novoCanal25;
    }

}
