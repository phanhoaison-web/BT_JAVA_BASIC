package btjavabasic4;

public class BtVongLapForMang {
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
        BtVongLapForMang bt = new BtVongLapForMang();
        bt.InSoChan();
        System.out.println("==================================");
        bt.InMangSoChan();

    }
}
