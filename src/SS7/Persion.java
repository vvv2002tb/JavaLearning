package SS7;


public abstract class Persion {
    private String name;
    private int age;
    private boolean sex;
    private String address;

    public void hello() {
        System.out.println("Hello");
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }


    // phuong thuc truu tuong
    // declare (khai bao thoi k có thân)
    public abstract void inputData();

    public abstract void displayData();
}
