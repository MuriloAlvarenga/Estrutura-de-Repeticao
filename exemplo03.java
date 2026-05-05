/* programa para imprimir apenas os números impares dentro de um intervalo informado
pelo usuário*/

import java.util.Scanner;

public class exemplo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inicio, fim, contador;

        System.out.print("Início do intervalo: ");
        inicio = sc.nextInt();;

        System.out.print("Fim do intervalo: ");
        fim = sc.nextInt();

        contador = inicio;

        while (contador <= fim) {
            if (contador % 2 == 0) {
                contador = contador + 1;
            }
            System.out.println(contador + " ");
            contador = contador + 2;
        }
    }
}
