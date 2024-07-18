import java.util.Scanner;

public class ExercicioOperacaoMatematica {

/*

    Exercício 1: Enum com Switch-Case e Scanner
    Crie um enum chamado OperacaoMatematica representando operações matemáticas básicas (+, -, *, /).
    Utilize um Scanner para obter a operação do usuário e realizar o cálculo com dois números.

*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, informe a operação (+ - * /)");

        String operacao = scan.nextLine();

        System.out.println("Por favor, informe o primeiro número: ");

        double primeiroNumero = scan.nextDouble();

        System.out.println("Por favor, informe o segundo número: ");

        double segundoNumero = scan.nextDouble();

        OperacaoMatematica operacaoMatematica;

        switch(operacao) {
            case "+": {
                operacaoMatematica = OperacaoMatematica.ADICAO;
                break;
            }

            case "-": {
                operacaoMatematica = OperacaoMatematica.SUBTRACAO;
                break;
            }

            case "*": {
                operacaoMatematica = OperacaoMatematica.MULTIPLICACAO;
                break;
            }

            case "/": {
                operacaoMatematica = OperacaoMatematica.DIVISAO;
                break;
            }
            default: {
                System.out.println("Por favor, informe um valor válido entre (+ - * /)");
                operacaoMatematica = null;
                break;
            }
        }

        switch (operacaoMatematica) {
            case ADICAO: {
                System.out.println("O resultado da adição do número um com o número dois é: " + (primeiroNumero + segundoNumero));
                break;
            }
            case SUBTRACAO: {
                System.out.println("O resultado da subtração do número um com o número dois é: " + (primeiroNumero - segundoNumero));
                break;
            }
            case MULTIPLICACAO: {
                System.out.println("O resultado da multiplicação do número um com o número dois é: " + (primeiroNumero * segundoNumero));
                break;
            }
            case DIVISAO: {
                System.out.println("O resultado da divisão do número um com o número dois é: " + (primeiroNumero / segundoNumero));
                break;
            }
        }



    }




}
