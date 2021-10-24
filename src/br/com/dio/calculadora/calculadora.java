package br.com.dio.calculadora;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o primeiro valor: ");
        b = scan.nextInt();

        int somar = somar(a, b);
        int sub = sub(a, b);
        int multi = multi(a, b);
        int div = div(a, b);

        System.out.println("a soma é " + somar);
        System.out.println("a subtração é " + sub);
        System.out.println("a multiplicação é " + multi);
        System.out.println("a divisão é " + div);
    }
    public static int somar(int a, int b){
        return a + b;
    }
    public static int sub(int a, int b){
        return a - b;
    }
    public static int multi(int a, int b){
        return a * b;
    }
    public static int div(int a, int b){
        return a / b;
    }

}
