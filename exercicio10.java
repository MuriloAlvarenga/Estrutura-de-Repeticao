//Escreva um programa em Java que simule uma urna eletrônica para 3 candidatos
// (números 1, 2 e 3).
//Em loop, leia os votos digitados. O voto 0 encerra a votação. Ao final, exiba o total
// de votos de cada
//candidato, o percentual de cada um e o vencedor. Votos inválidos devem ser contados
//separadamente
import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //variáveis para calcular a quantidade de votos
        int voto = 1;
        int votoInvalido = 0;
        int candidato1 = 0, candidato2 = 0, candidato3 = 0;

        //variáveis para calcular a porcentagem de votos
        int total;
        double prc1, prc2, prc3;


        //laço de repetição
        while (voto != 0) {
            //o barra n pula linha (\n)
            System.out.println("(1) Candidato 1\n(2) Candidato 2\n" +
                    "(3) Candidato 3\n" + "(0) Finalizar");
            voto = sc.nextInt();

            if (voto == 0) {
                break;
            }
            if (voto == 1) {
                candidato1++;
            } else if (voto == 2) {
                candidato2++;
            } else if (voto == 3) {
                candidato3++;
            } else {
                votoInvalido++;
            }
        }

        System.out.println("Candidato 1 = " + candidato1);
        System.out.println("Candidato 2 = " + candidato2);
        System.out.println("Candidato 3 = " + candidato3);
        System.out.println("Voto inválido = " + votoInvalido);

        //calcular o total de votos (porcentagem)
        total = candidato1 + candidato2 + candidato3;
        prc1 = (double) candidato1 / total * 100;
        prc2 = (double) candidato2 / total * 100;
        prc3 = (double) candidato3 / total * 100;

        //sout sem nada = pula linha
        System.out.println();
        System.out.println("Total de votos = " + total);
        System.out.println("Porcentagem do candidato 1 = " + prc1 + ("%"));
        System.out.println("Porcentagem do candidato 2 = " + prc2 + ("%"));
        System.out.println("Porcentagem do candidato 3 = " + prc3 + ("%"));

        if (candidato1 > candidato2 && candidato1 > candidato3) {
            System.out.println("Vencedor --> Candidato 1");
        } else if (candidato2 > candidato3) {
            System.out.println("Vencedor --> Candidado 2");
        } else {
            System.out.println("Vencedor --> Candidato 3");
        }
    }
}
