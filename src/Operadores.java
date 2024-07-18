public class Operadores {

    public static void main(String[] args) {

        // + - / * %
        double numeroUm = 10;
        double numeroDois = 3;

        double soma = numeroUm + numeroDois;
        double subtracao = numeroUm - numeroDois;
        double divisao = numeroUm / numeroDois;
        double multiplicao = numeroUm * numeroDois;
        double restoDaDivisao = numeroUm % numeroDois;

        String apresentacao = "Oi, meu nome é ";

        String nome = "Rodolfo";

        //System.out.println(restoDaDivisao);

        // < > <= >= == !=

        double n1 = 10;
        double n2 = 10;

        boolean isN1MaiorQueN2 = n1 > n2;
        boolean isN1MenorQueN2 = n1 < n2;
        boolean isN1MenorOuIgualN2 = n1 <= n2;
        boolean isN1MaiorOuIgualN2 = n1 >= n2;
        boolean isN1IgualAN2 = n1 == n2;
        boolean isN1DiferenteN2 = n1 != n2;

       // System.out.println(isN1DiferenteN2);

        //operadores lógicos && (AND) || (OR) ! (NEGAÇÃO)
        int idade = 18;
        double salario = 1200.00;

        boolean possuiSalarioMaiorQueMil = salario > 1000;
        boolean isMaiorIdade = idade >= 18;

        boolean isMaiorIdadeSalarioMaiorQueMil = isMaiorIdade && possuiSalarioMaiorQueMil ;
        boolean isMaiorIdadeOuSalarioMaiorQueMil = isMaiorIdade || possuiSalarioMaiorQueMil;
        boolean negacaoIsMaiorIdadeOuSalarioMaiorQueMil = !isMaiorIdadeOuSalarioMaiorQueMil;


       // System.out.println(negacaoIsMaiorIdadeOuSalarioMaiorQueMil);

        // atribuicao = += -= *= /= %=
        int b = 3;
        //b = b + 3;
        //b += 3;

        //b = b - 2;
        //b -= 2;

        //b = b * 2;
        //b *= 2;

        //b = b / 3;
        //b /= 3;

        //b = b % 3;
        b %= 3;

        //System.out.println(b);

        //++ e --
        int c = 1;
        //c++;
        //c = c + 1;

        //c--;
        //c = c - 1;
        //System.out.println(c);

        //precedencia
        // parenteses -> operadores de multiplicao, divisao, modulo ->
        // operadores aritmeticos de soma, subtracao
        // operadores relacionais e lógicos
        int b2 = 3;
        int b3 = 4;
        int somaB2b3 = b2 + b3;

        System.out.println("O resultado da soma de b2 e b3 é " + b2 + " " + b3);

        System.out.printf("Estou imprimindo utilizando print format b2 %s b3 %s", b2, b3);

    }
}
