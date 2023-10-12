package B6;

public class Rectangle extends HinhHoc{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(Double tinhDienTich, Double tinhChuVi, double length, double width) {
        super(tinhDienTich, tinhChuVi);
        this.length = length;
        this.width = width;
    }

    public double tinhDienTich() {
        return length*width;
    }

    public double tinhChuVi() {
        return (length+width)*2;
    }

    public void printInfo() {
        System.out.println("Chiều rông= "+width);
        System.out.println("Chiều dài= "+length);
    }

//    @Override
//    public String toString() {
//        return "Rectangle{" +
//                "length=" + length +
//                ", width=" + width +
//                '}';
//    }
}
