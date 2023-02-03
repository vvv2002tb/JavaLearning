package Chuong2;

public class Variable {
    public static void main(String[] args) {
        /* int totalAplles;
        int numberOfAplles = 5;
        int apllePerBasket = 10;
        totalAplles = numberOfAplles * apllePerBasket;
        System.out.println("Number of aplles: " + totalAplles); */


        // ++ -- truoc va sau
        int x = 5;

        // ++ trước biến
        int y = ++x;
        System.out.println("y: " + y + " x: " + x); // in ra y: 6 x: 6

        // ++ sau biến
        int z = x++;
        System.out.println("z: " + z + " x: " + x); // in ra z: 6 x: 7
    }
}
