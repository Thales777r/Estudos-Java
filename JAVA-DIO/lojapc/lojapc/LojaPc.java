package lojapc;
public class LojaPc {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String nome = "Loja";
        String produto = "Placa de Video";
        String modelo = "RTX 5090";
        double preco = 30000.00;
        int quantidade = 10;
        double saldoCarteira = 35000.00;

        if (preco <= saldoCarteira) {
            System.out.println("Compra realizada com sucesso!");
            saldoCarteira -= preco;
            quantidade--;
        } else {
            System.out.println("Saldo insuficiente para a compra.");
        }

    }
}