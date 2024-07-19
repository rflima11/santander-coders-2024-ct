import java.util.Scanner;
public class ExercicioFuncoes {

/*

    Exercício 1: Função com Scanner
    Escreva uma função que receba três notas de alunos,
    calcule a média simples, imprima o resultado na tela e, caso o resultado seja menor que 6,
    informe que o aluno está reprovado.
    Receba as notas utilizando o Scanner dentro do
    método main e teste os cenários onde o aluno foi aprovado ou reprovado.
*/

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Por favor, informe três notas:");
            System.out.println("Nota 1:");
            double notaUm = scan.nextDouble();

            System.out.println("Nota 2");
            double notaDois = scan.nextDouble();

            System.out.println("Nota 3");
            double notaTres = scan.nextDouble();

            calcularMedia(notaUm, notaDois, notaTres);
    }

    public static void calcularMedia(double notaUm, double notaDois, double notaTres) {
        double media = (notaUm + notaDois + notaTres) / 3;

        if (media < 6) {
            System.out.println("O aluno foi reprovado");
        }

        System.out.println("A média final do aluno foi: " + media);
    }

}
