package Chuong2.Loop;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count, number;
        System.out.print("Enter your number: ");
        number = Integer.parseInt(sc.nextLine());

        count = 1;
        while (count <= number) {
            System.out.print(count + ", ");
            count++;
        }
        System.out.println("Booooom!");
    }
}
