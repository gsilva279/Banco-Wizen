
//Biblioteca de gerar número aleátorio
import java.util.Random;
import java.util.Scanner;

public class ContaBanco {
    Scanner input = new Scanner(System.in);
    
    // Para gerar um número aleátorio de 1000 a 5000
    Random numeroAleatorio = new Random();

    private double saldo = numeroAleatorio.nextDouble(100, 5000);
    private double valorUtilizadoChequeEspecial = 0;
    private double conta = numeroAleatorio.nextDouble(0, 1000);

    // Número booleano aleatório (true ou false)
    private boolean booleano = numeroAleatorio.nextBoolean();

    public String ConsultarSaldo() {
        // String.format("%.2f", saldo) -> formata para duas casas decimais
        System.out.println("Seu saldo é R$: " + String.format("%.2f", saldo));
        return null;
    }

    public double ChequeEspecial() {
        double limiteChequeEspecial = 0;
        if (saldo <= 500) {
            limiteChequeEspecial = 50;
        } else {
            limiteChequeEspecial = saldo * 0.5;
        }
        System.out.println("Cheque especial");
        return limiteChequeEspecial;
    }

    public String VerificarChequeEspecial() {
        System.out.println("Verificando cheque especial");
        if (saldo < 0) {
            System.out.println("Está usando o cheque especial!");
            double limite = ChequeEspecial();
            return "Limite do cheque especial: R$" + limite +
                    ", Valor utilizado: R$" + valorUtilizadoChequeEspecial;

        } else {
            System.out.println("Não está usando o cheque especial!");
            return "Saldo disponível: R$" + saldo;
        }
    }

    public String Depositar() {
        System.out.println("Informe o valor do depósito (R$): ");
        double deposito = input.nextDouble();

        if (valorUtilizadoChequeEspecial > 0) {
            double taxa = valorUtilizadoChequeEspecial * 0.2;
            if (deposito >= taxa) {
                deposito -= taxa;
                System.out.println("Taxa de cheque especial cobrada: R$" + String.format("%.2f", taxa));
                valorUtilizadoChequeEspecial = 0;
            } else {
                System.out.println("Depósito insuficiente para cobrir a taxa de cheque especial.");
                return null;
            }
        }

        saldo += deposito;
        System.out.println("Deposito realizado com sucesso!");
        return null;
    }

    public String Sacar() {
        System.out.println("Notas disponíveis: 100 - 50 - 20");
        System.out.println("Informe o valor do saque (R$): ");
        double saque = input.nextDouble();

        double limiteChequeEspecial = ChequeEspecial();

        if (saldo < (saldo + limiteChequeEspecial)) {
            if (saque > saldo) {
                valorUtilizadoChequeEspecial = saque - saldo;
                saldo = 0;
            } else {
                saldo -= saque;
            }
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
        return null;
    }

    public String PagarBoleto() {
        if (booleano == true) {
            int escolha;

            System.out.println("Seu boleto é de R$ " + String.format("%.2f", conta));
            System.out.println(" 1 - Pagar.");
            System.out.println(" 2 - Sair.");
            escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    saldo = saldo - conta;
                    System.out.println("Boleto pago!");
                    System.out.println("Saldo atualizado: " + String.format("%.2f", saldo));
                    break;
                case 2:
                    // fazer voltar para o loop principal
                    System.exit(0);
                    break;
                default:
                    System.out.println("Informe uma opção válida");
            }
        } else {
            System.out.println("Você não tem boletos para pagar");
        }
        return null;
    }
}
