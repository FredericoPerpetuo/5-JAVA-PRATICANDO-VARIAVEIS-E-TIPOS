package exercicio7;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número: ");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println(String.format("%d é par", num));
        }else{
            System.out.println(String.format("%d é impar", num));
        }

        sc.close();
    }
}
