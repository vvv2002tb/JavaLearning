package Chuong3.Example;

public class PersionTestDrive {
    public static void main(String[] args) {
        Persion student = new Persion();
        Persion teacher = new Persion();

        student.fullName = "Dao van hoang";
        student.age = 20;
        student.sex = false;
        student.jobTitle = "Student";

        teacher.fullName = "Hien Dep Trai";
        teacher.age = 32;
        teacher.sex = true;
        teacher.jobTitle = "Teacher";

        student.showData();
        teacher.showData();

    }
}
