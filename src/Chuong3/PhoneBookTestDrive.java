package Chuong3;

public class PhoneBookTestDrive {
    public static void main(String[] args) {
        PhoneBookEntry sv1 = new PhoneBookEntry();
        sv1.name = "Tom";
        sv1.phone = "096190712";
        PhoneBookEntry sv2 = new PhoneBookEntry();
        sv2.name = "Cat";
        sv2.phone = "02132121212";

        sv1.display();
        sv2.display();

    }
}
