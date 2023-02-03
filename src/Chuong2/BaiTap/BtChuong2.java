package Chuong2.BaiTap;

public class BtChuong2 {
    public static void main(String[] args) {
        // Dùng một lệnh để gán tổng của x và y cho z và tăng x thêm 1 sau phép
        //tính trên.
        int x = 10;
        int y = 2;
        x++;
        int z = x + y;
        System.out.println(z);
        // Kiểm tra xem giá trị biến count có lớn hơn 10 hay không, nếu có thì in ra
        //dòng text "Count is greater than 10"
        if (z > 10) {
            System.out.println("Count is greater than 10");
        }
        // Giảm x đi 1 đơn vị, sau đó gán cho biến total giá trị là hiệu của total và x.
        //Chỉ dùng một lệnh.
        int total = 0;
        total -= --x;
        System.out.println("total: " + total); // in ra total: 19


        //Tính phần dư của phép chia q cho d rồi gán kết quả đó cho q.
        int q = 10;
        int d = 3;
        q %= d;
        System.out.println("q: " + q); // in ra q: 1

        //  Khai báo các biến sum và x thuộc kiểu int
        int sum = 0;
        int h = 10;
        sum += h;
        System.out.println("the sum is " + sum);


        //Tính tổng các số chẵn trong khoảng từ 1 đến 99
        int sumchan = 0;
        for (int i = 1; i < 99; i++) {
            if (i % 2 == 0) {
                System.out.println(" " + i);
                sumchan += i;

            }
        }
        System.out.println(sumchan);


        int sumtest = 0;
        for (int i = 2; i <= 99; i += 2) {
            sumtest += i;
        }
        System.out.println("Sum of even numbers from 1 to 99: " + sumtest);

    }
}
