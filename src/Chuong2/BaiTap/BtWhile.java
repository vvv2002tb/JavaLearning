package Chuong2.BaiTap;

public class BtWhile {
    public static void main(String[] args) {
        /*Viết một chương trình tính tổng các số nguyên từ 1 đến 10, sử dụng vòng while
cho nhiệm vụ lặp.*/
        int i = 0;
        int sum = 0;
        while (i < 10 ) {
            i++;
            sum += i;
            System.out.print(i + "\t");

        }
        System.out.print(sum);
    }
}
