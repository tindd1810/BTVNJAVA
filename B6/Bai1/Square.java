package B6;

public class Square extends HinhHoc{
    private double site;

    public Square(double site) {
        this.site = site;
    }

    public Square(Double tinhDienTich, Double tinhChuVi, double site) {
        super(tinhDienTich, tinhChuVi);
        this.site = site;
    }

    public double tinhChuVi() {
        return site*4;
    }

    public double tinhDienTich() {
        return site*site;
    }

    public void printInfo() {
        System.out.println("Cạnh= "+site);
    }

//    @Override
//    public String toString() {
//        return "Square{" +
//                "site=" + site +
//                '}';
//    }
}
