/* programa para imprimir no video os números dentro de um intervalor
fornecido pelo usuário */

import java.util.Scanner;

public class exemplo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inicio, fim, contador;

        System.out.print("Início do intervalo: ");
        inicio = sc.nextInt();

        System.out.print("Fim do intervalo: ");
        fim = sc.nextInt();
        contador = inicio;
        while (contador <= fim) {
            System.out.println(contador + " ");
            contador = contador + 1;
        }
    }
}
