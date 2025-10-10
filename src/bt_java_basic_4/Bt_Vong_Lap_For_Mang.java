package bt_java_basic_4;

public class Bt_Vong_Lap_For_Mang {
    //khai bao mang để lưu trữ các số chẵn từ 0 đến 50
    int mangSoChan [] = new int [26];

    void InSoChan(){
        System.out.print("In ra các số chẵn từ 0 đến 50: ");
        int j = 0;
        for(int i = 0; i <= 50; i+=2) {
            System.out.print(i + " ");
            mangSoChan[j] = i;
            j++;
        }
        System.out.println("");
    }

    void InMangSoChan(){
        System.out.println("Duyệt mảng số chẵn để in ra các phần tử trong mảng: ");
        for (int i:mangSoChan){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Bt_Vong_Lap_For_Mang bt = new Bt_Vong_Lap_For_Mang();
        bt.InSoChan();
        System.out.println("==================================");
        bt.InMangSoChan();
    }
}
