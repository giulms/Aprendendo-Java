import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String cliente = "Giulliano Muniz";
    String tipoDeConta = "Corrente";
    double saldo = 2500;
    int opcaoEscolhida = 0;

        System.out.printf("""
                ***************************
                Dados iniciais do cliente
                
                Nome: %s
                Tipo de conta: %s
                Saldo inicial: R$ %.2f
                ***************************
                """,cliente,tipoDeConta,saldo);
        while (opcaoEscolhida != 4) {

            System.out.println("""
                    \n
                    Operações
                    
                    1- Consultar saldo
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    
                    Digite a opção desejada:
                    """);
            opcaoEscolhida= input.nextInt();

            switch (opcaoEscolhida) {
                case 1:
                    System.out.printf("Seu saldo atual é de: R$ %.2f", saldo);
                    break;
                case 2:
                    System.out.println("insira o valor que deseja receber:");
                    double valorRecebido = input.nextDouble();
                    saldo += valorRecebido;
                    System.out.printf("Saldo atualizado R$ %.2f", saldo);
                    break;
                case 3:
                    System.out.println("insira o valor que deseja transferir:");
                    double valorTransferido = input.nextDouble();
                    if (valorTransferido > saldo) {
                        System.out.println("Você não possui saldo o suficiente para transferir para outra conta");
                    }
                    else {
                        saldo -= valorTransferido;
                        System.out.printf("Saldo atualizado R$ %.2f", saldo);
                    }
                    break;
                case 4:
                    System.out.println("Obrigado por utilizar os nossos serviços!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

    }
}
