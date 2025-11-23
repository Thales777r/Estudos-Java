   import java.util.Scanner;
   import java.util.Locale;

   public class Empresa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        System.out.println("DIGITE O NOME DA EMPRESA:");
        String nomeEmpresa = scanner.nextLine();

        System.out.println("QUANTOS FUNCIONÁRIOS POSSUEM A EMPRESA?:");
        int quantidadeFuncionarios = scanner.nextInt();

        System.out.println("QUAL O FATURAMENTO ANUAL DA EMPRESA?:");
        double faturamentoAnual = scanner.nextDouble();

        System.out.println("QUEM É O CEO DA EMPRESA?:");
        scanner.nextLine();
        String nomeCeo = scanner.nextLine();

        System.out.println("QUANTOS ANOS TEM O CEO?:");
        int idadeCeo = scanner.nextInt();

        System.out.println("NOME DA EMPRESA: " + nomeEmpresa);
        System.out.println("QUANTIDADE DE FUNCIONÁRIOS: " + quantidadeFuncionarios);
        System.out.println("FATURAMENTO ANUAL: " + faturamentoAnual);
        System.out.println("NOME DO CEO: " + nomeCeo);
        System.out.println("IDADE DO CEO: " + idadeCeo);
    }
    























}
