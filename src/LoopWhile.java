import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;
        //Crianção de um contador
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Qual a sua avaliação do filme? ou digite -1 para encerrar o programa.");
            nota = leitura.nextDouble();

            if (nota != -1){
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }

        System.out.println(String.format("Sua média é: %.2f",mediaAvaliacao/totalDeNotas));
    }
}
