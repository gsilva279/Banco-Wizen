import java.util.Scanner;

public class Menu extends ContaBanco {
    public static void main(String[] args) {
        ContaBanco banco = new ContaBanco();
        Scanner input = new Scanner(System.in);
        int operacao;

        while (true) {
            System.out.println();
            System.out.println("=====Banco Wizen=====");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Pagar boleto");
            System.out.println("4 - Verificar cheque especial");
            System.out.println("5 - Consultar saldo");
            System.out.println("6 - Sair");
            System.out.println("escolha uma operação: ");
            operacao = input.nextInt();
            System.out.println("====================");

            switch (operacao) {
                case 1:
                    banco.Sacar();
                    break;
                case 2:
                    banco.Depositar();
                    break;
                case 3:
                    banco.PagarBoleto();
                    break;
                case 4:
                    banco.VerificarChequeEspecial();
                    break;
                case 5:
                    banco.ConsultarSaldo();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    input.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Operação inválida. Tente novamente.");
            }

        }
    }
}
