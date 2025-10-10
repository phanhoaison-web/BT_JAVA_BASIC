package btjavabasic5;

import java.util.ArrayList;

public class BtCollection {
    //khai bao mang để lưu trữ các số chẵn từ 0 đến 50
    ArrayList<Integer> mangSoChan = new ArrayList<>();
    ArrayList<String> mangNhanVien = new ArrayList<>();

    void InSoChan(){
        System.out.print("In ra các số chẵn từ 0 đến 50: ");
        Integer j = 0;
        for(int i = 0; i <= 50; i+=2) {
            System.out.print(i + " ");
            mangSoChan.add(j);
            j++;
        }
        System.out.println("");
    }

    void InMangSoChan(){
        System.out.println("Duyệt mảng số chẵn để in ra các phần tử trong mảng: ");
        for (Integer i:mangSoChan){
            System.out.print(i + " ");
        }
    }

    void addEmployeeInfo(String ma, String ten, String phongBan  ){
       String nv = "Nhân viên " + ten + " ,mã "+ma+" ,phongban " + phongBan;
        mangNhanVien.add(nv);
    }

    public static void main(String[] args) {
        BtCollection bt = new BtCollection();
        bt.InSoChan();
        System.out.println("==================================");
        bt.InMangSoChan();
        System.out.println("==================================");
        System.out.println("Thêm thông tin nhân viên Trần Tuấn Hải, mã DEV_HTT, phòng ban Developer");
        bt.addEmployeeInfo("DEV_HTT", "Trần Tuấn Hải" ,"Developer");

        for (int i = 0 ; i < bt.mangNhanVien.size() ; i++ ){
            System.out.println("In thông tin của nhân viên :" + bt.mangNhanVien.get(i) );
        }
    }
}
