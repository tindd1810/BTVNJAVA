package B6;

public class HinhHoc {
    private Double tinhDienTich;
    private Double tinhChuVi;

    public HinhHoc() {
    }

    public HinhHoc(Double tinhDienTich, Double tinhChuVi) {
        this.tinhDienTich = tinhDienTich;
        this.tinhChuVi = tinhChuVi;
    }

    public void printInfo() {
        System.out.println();
    }

    public double tinhChuVi() {
        return this.tinhChuVi;
    }

    public double tinhDienTich() {
        return this.tinhDienTich;
    }
}
