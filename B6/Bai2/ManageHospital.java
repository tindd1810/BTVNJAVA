package BT;

import java.util.Scanner;

public class ManageHospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Patient
//        System.out.println("Nhập tên bệnh nhân: ");
//        String name = scanner.nextLine();
//        System.out.println("Nhập số bệnh án: ");
//        int medicalRecord = Integer.parseInt(scanner.nextLine());
//        System.out.println("Ngày nhập viện: ");
//        String dayIn = scanner.nextLine();
//
//        Patient patient = new Patient(name, medicalRecord, dayIn);
//        System.out.println("Thông tin bệnh nhân: ");
//        patient.printInfo();

        //Doctor
        System.out.println("Nhập tên bác sỹ: ");
        String name = scanner.nextLine();
        System.out.println("Nhập chuyên khoa: ");
        String specialist = scanner.nextLine();
        System.out.println("Số giờ làm việc: ");
        int hours = Integer.parseInt(scanner.nextLine());

        Doctor doctor = new Doctor(name, specialist, hours);
        System.out.println("Thông tin bác sỹ: ");
        doctor.printInfo();
    }
}
