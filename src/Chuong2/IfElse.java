package Chuong2;

import java.awt.*;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input your scores: ");
        double score = Double.parseDouble(sc.nextLine());
        if (score >= 9.0)
            System.out.println("Excellent!");
        else if ( score >= 8.5) {
            System.out.println("A!");
        }
        else if (score >= 7.0)
            System.out.println("B!");
        else if (score >= 5.5)
            System.out.println("C!");
        else if (score >= 4.0)
            System.out.println("D!");
        else
            System.out.println("F!");

        System.out.print("Ban co hai long ve ket qua? yes or no : ");

        String choose = sc.nextLine();
        switch (choose) {
            case "yes":
                System.out.print("You said 'yes'"); break;
            case "no":
                System.out.print("You said 'no'"); break;
            default:
                System.out.print("I don't get what you mean.");
        }

    }
}
