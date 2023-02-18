package SS7.Interface;

public interface IPerson {
    public static final float BASIC_SALARY = 13000000;
    final int A = 10; // mặc định bộ từ truy cập là public


    // pt trừu tượng
    // public abstact void
    void inputData();
    public abstract void displayData();


}
