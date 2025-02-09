package Java;
import java.util.Scanner;

public class CalculadoraApp {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// Le os Valores

        Double valorUm;
        Double valorDois;
        String operacao;

        System.out.println("Digite o valor um: ");
        valorUm = scanner.nextDouble(); // receber o scanner, salva aqui o que foi lido

        System.out.println("Digite a operação (+, -, /, *): ");
        operacao = scanner.next();

        System.out.println("Digite o valor dois: ");
        valorDois = scanner.nextDouble();

        System.out.println("Resultado: " + realizarCalculo(valorUm, valorDois, operacao));
    }

    public static Double realizarCalculo(Double valorUm, Double valorDois, String operacao) {
        Double respostaCalculo = 0.0;
        switch (operacao){
            case "+":
            respostaCalculo = valorUm + valorDois;
            break;

            case "-":
            respostaCalculo = valorUm - valorDois;
            break;

            case "*":
            respostaCalculo = valorUm * valorDois;
            break;

            case "/":
            respostaCalculo = valorUm / valorDois;
            break;

            default:
                System.out.println("Operação é Inválida");
        }
            return respostaCalculo;
    }
}
