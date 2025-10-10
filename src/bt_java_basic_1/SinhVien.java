package bt_java_basic_1;

public class SinhVien {
    //khai báo biến instance
    public String maSV; // biến instance có giá trị mặc định là null
    public String tenSV; // biến instance có giá trị mặc định là null
    public int tuoi = 0; // biến instance có giá trị mặc định là 0

    /**
     * Khai báo phương thức setTuoi để truyền giá trị cho biến tuoi
     */
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    /**
     * Khai báo phương thức in ra giá trị của biến instance
     */
    public void showInfo(){
        System.out.println("Giá trị của biến instance maSV là: " + maSV);
        System.out.println("Giá trị của biến instance tenSV là: " + tenSV);
        System.out.println("Giá trị của biến instance tuoi là: " + tuoi);
    }

    /**
     * Khai báo phương thức sử dụng biến local
     */
    public void wellcome(){
        String loiChao = "Chào mừng các bạn sinh viên";
        System.out.println("Giá trị của biến local loiChao là: " + loiChao);
    }

    public static void main(String[] args) {
        //Tạo đối tượng Sinh viên để sử dụng biến instance
        SinhVien sv = new SinhVien();
        sv.maSV ="SV1";
        sv.tenSV ="Sinh viên 1";
        sv.setTuoi(20);

        //in ra giá trị của biến local
        sv.wellcome();
        //in ra giá trị của biến instance
        sv.showInfo();
        //in ra giá trị của biến static
        System.out.println("Giá trị của biến static ThongTin.truong la: " + ThongTin.truong);
    }
}
