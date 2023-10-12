package B6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Bai1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài HCN= ");
        double length = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chiều rộng HCM= ");
        double width = Double.parseDouble(scanner.nextLine());
        Rectangle rectangle = new Rectangle(length,width);
        rectangle.printInfo();
        System.out.println("CV HCN=  "+rectangle.tinhChuVi());
        System.out.println("Diện tích HCN= "+rectangle.tinhDienTich());

        System.out.println();

        System.out.println("Nhập cạnh HV= ");
        double site = Double.parseDouble(scanner.nextLine());
        Square square = new Square(site);
        square.printInfo();
        System.out.println("CV HV= "+square.tinhChuVi());
        System.out.println("Diện tích HV= "+square.tinhDienTich());

    }
}
