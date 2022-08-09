package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many number you want to input? = ");
        int inputs = sc.nextInt();

        int[] numbers = new int[inputs];

        for (int i=0; i<inputs; i++){
            System.out.print("Input a number = ");
            numbers[i] = sc.nextInt();
        }
        System.out.println("Negative Numbers:");
        for (int i=0; i<inputs; i++){
            if (numbers[i] < 0){
                System.out.println(numbers[i]);
            }
        }
    }
}
