import java.time.DayOfWeek;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

/*
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, informe o seu nome:");
        String nome = scan.nextLine();

        System.out.println("Por favor, informe a sua idade");
        int idade = scan.nextInt();

        boolean isMaiorIdade = idade >= 18;
*/

/*
        if (isMaiorIdade) {
            System.out.println("Olá meu nome é " + nome + " e eu sou maior de idade");
        } else if (idade == 17) {
            System.out.println("Olá meu nome é " + nome + " e eu sou quase de maior");
        } else {
            System.out.println("Olá meu nome é " + nome + " e eu não sou maior de idade");
        }
*/

        // quando o if () não tem { apenas o proximo statement seria executado
/*        if (isMaiorIdade)
            System.out.println("É maior idade");
        else
            System.out.println("É menor de idade");*/

        // condicao ? "" : ""
        //String mensagem = isMaiorIdade ? "Sim, sou maior de idade" : idade == 17 ? "Você está quase lá" : "Não, não sou maior de idade";

        //System.out.println(mensagem);


/*        String mensagem;

        switch (idade) {
            case 18: {
                mensagem = "Eu sou maior de idade";
                break;
            }
            case 17: {
                mensagem = "Eu tenho 17 anos";
                break;
            }
            default: {
                mensagem = "Não sei";
                break;
            }
        }*/

  //      System.out.println(mensagem);

        //byte, short, int, char, String, Enums
        MesesAno mes = MesesAno.MAIO;

        switch (mes) {
            case JANEIRO: {
                System.out.println("Janeiro");
                break;
            }
            case FEVEREIRO: {
                System.out.println("Fevereiro");
                break;
            }
            case MARCO: {
                System.out.println("Março");
                break;
            }
            case ABRIL: {
                System.out.println("Abril");
                break;
            }
            case MAIO: {
                System.out.println("Maio");
                break;
            }
            case JUNHO: {
                System.out.println("Junho");
                break;
            }
            case JULHO: {
                System.out.println("Julho");
                break;
            }
            case AGOSTO: {
                System.out.println("Agosto");
                break;
            }
            case SETEMBRO: {
                System.out.println("Setembro");
                break;
            }
            case OUTUBRO: {
                System.out.println("Outubro");
                break;
            }
            case NOVEMBRO: {
                System.out.println("Novembro");
                break;
            }
            case DEZEMBRO: {
                System.out.println("Dezembro");
                break;
            }
            default: {
                System.out.println("Por favor, informe um valor de 1 a 12");
            }


        }









  //      scan.close();
    }
}

