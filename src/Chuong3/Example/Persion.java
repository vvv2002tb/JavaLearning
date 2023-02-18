package Chuong3.Example;

public class Persion {
    String fullName;
    int age;
    Boolean sex;
    String jobTitle;

    public void showData() {
        if (sex == false) {
            System.out.println(fullName + " " + age + " " + "Nam" + " " + jobTitle);
        } else if (sex == true) {
            System.out.println(fullName + " " + age + " " + "Nữ" + " " + jobTitle);
        }

    }
}
