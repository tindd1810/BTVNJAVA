package BT;

public class Doctor extends Person{
    private String specialist;
    private int hours;

    public Doctor(String name, String specialist, int hours) {
        super(name);
        this.specialist = specialist;
        this.hours = hours;
    }

    public void printInfo() {
        System.out.println("Tên bác sỹ: "+getName());
        System.out.println("Chuyên Khoa: "+specialist);
        System.out.println("Số giờ làm việc: "+hours);
    }
}
