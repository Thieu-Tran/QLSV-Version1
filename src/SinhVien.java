public class SinhVien {
    private String ten;
    private String maSv;
    private double diemToan;
    private double diemLy;
    private double diemHoa;
    private double diemTB;
    private String xepLoai = "";

    public SinhVien(String ten, String maSv, double diemToan, double diemLy, double diemHoa) {
        this.ten = ten;
        this.maSv = maSv;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }

    public double getDiemTB() {
        return diemTB;
    }

//    public void setDiemTB(double diemTB) {
//        this.diemTB = diemTB;
//    }

    public String getXepLoai() {
        return xepLoai;
    }

//    public void setXepLoai(String xepLoai) {
//        this.xepLoai = xepLoai;
//    }

    public double tinhDiemTrungBinh() {
        return (diemToan + diemLy + diemHoa) / 3;
    }

    public String kiemTraXepLoai(double diemTB) {

        if (diemTB >= 9) {
            xepLoai = "Xuất sắc";
        } else if (diemTB >= 8 && diemTB < 9) {
            xepLoai = "Giỏi";
        } else if (diemTB >= 7 && diemTB < 8) {
            xepLoai = "Khá";
        } else if (diemTB >= 6 && diemTB < 7) {
            xepLoai = "TB Khá";
        } else if (diemTB >= 5 && diemTB < 6) {
            xepLoai = "TB";
        } else {
            xepLoai = "Yếu";
        }
        return xepLoai;
    }


}
