package Chuong2.BaiTap;

public class BtDoWhile {
    /*Viết một chương trình tính tổng các số nguyên từ 1 đến 10, sử dụng vòng for cho
nhiệm vụ lặp. */
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        do {
            i++;
            sum += i;
        } while (i < 10);
        System.out.println("Tổng các số nguyên từ 1 đến 10 là: " + sum);
    }
}
