public class Main {
    public static void main(String[] args) {
        SinhVien sV1 = new SinhVien("Nguyễn Văn A","0001",8,8.5,5.5);
        SinhVien sV2 = new SinhVien("Nguyễn Văn B","0002",6.25,6.75,4.5);

        double dtb1 = sV1.tinhDiemTrungBinh();
        double dtb2 = sV2.tinhDiemTrungBinh();

        System.out.println("SV1: "+"DTB: "+dtb1+"-"+sV1.kiemTraXepLoai(dtb1));
        System.out.println("SV2: "+"DTB: "+dtb2+"-"+sV2.kiemTraXepLoai(dtb2));

    }
}