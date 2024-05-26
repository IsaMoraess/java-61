import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
/*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
Exemplos:
Entrada: Saída:
12 PAR
Entrada: Saída:
-27 IMPAR
Entrada: Saída:
0 PAR */
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um Número inteiro!");
    int num = sc.nextInt();
    if (num %2 == 0){
        System.out.println("Esse número e Par! " +num);
    }else{
        System.out.println("Esse é um número Impar! " +num);
    }
    }
}
