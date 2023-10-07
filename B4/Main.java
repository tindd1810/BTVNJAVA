package B4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // BTVN1
        Scanner scanner = new Scanner(System.in);
        String select = "";
        int sum = 0;
        while (true){
            System.out.println("Moi nhap n: ");
            int n = Integer.parseInt(scanner.nextLine());
            sum+=n;
            System.out.println("Do u want to continue? (Y/N)");
            select=scanner.nextLine();
            if (!select.equalsIgnoreCase("Y")){
                break;
            }
        }
        System.out.println("sum="+sum);

        //BTVN2
/*        Scanner scanner = new Scanner(System.in);
        String name = "";
        String address = "";
        String select = "";
        int age;
        do {
            System.out.println("Moi nhap ten: ");
            name = scanner.nextLine();
            System.out.println("Moi nhap dia chi: ");
            address = scanner.nextLine();
            System.out.println("Moi nhap tuoi: ");
            age = Integer.parseInt(scanner.nextLine());
            System.out.println("Do u want to continue: (Y/N)");
            select = scanner.nextLine();
        } while (select.equalsIgnoreCase("Y"));
        System.out.println(name);
        System.out.println(address);
        System.out.println(age);*/
    }
}
