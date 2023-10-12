package BT;

public class Patient extends Person {
    private int medicalRecord;
    private String dayIn;

    public Patient(String name, int medicalRecord, String dayIn) {
        super(name);
        this.medicalRecord = medicalRecord;
        this.dayIn = dayIn;
    }

    public void printInfo() {
        System.out.println("Tên bệnh nhân: "+getName());
        System.out.println("Số bệnh án: "+medicalRecord);
        System.out.println("Ngày nhập viện: "+dayIn);
    }

//    @Override
//    public String toString() {
//        return "Patient{" +
//                "name=" + getName() +
//                ", medicalRecord=" + medicalRecord +
//                ", dayIn='" + dayIn + '\'' +
//                '}';
//    }
}
