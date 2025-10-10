package bt_java_basic_3;

public class Bt_ToanTu_If_Else {
    int a;
    int b;
    int c;

    int number = 100;

    public void kiemTra(int n){
        System.out.println("Giá trị của tham số n = " + n);
        if(n > number){
            System.out.println("Kết quả n > number");
        }else if(n == number){
            System.out.println("Kết quả n = number");
        }else {
            System.out.println("Kết quả n < number");
        }
    }

    public static void main(String[] args) {
        Bt_ToanTu_If_Else baitap = new  Bt_ToanTu_If_Else();
        System.out.println("============ Bài tập toán tử quan hệ =============");
        baitap.a = 100;
        baitap.b = 20;
        if(baitap.a > baitap.b){
            System.out.println("a lớn hơn b") ;
        }
        baitap.a = 20;
        baitap.b = 20;
        if(baitap.a == baitap.b){
            System.out.println("a bằng b") ;
        }
        baitap.a = 10;
        baitap.b = 20;
        if(baitap.a < baitap.b){
            System.out.println("a nhỏ hơn b") ;
        }
        System.out.println("============ Bài tập toán tử logic =============");
        baitap.a = 100;
        baitap.b = 200;
        baitap.c = 50;
        if((baitap.a <= baitap.b) && (baitap.a >= baitap.c)){
            System.out.println("a nhỏ hơn hoặc bằng b và a lớn hơn hoặc bằng c") ;
        }
        if((baitap.a > baitap.b) || (baitap.a > baitap.c)){
            System.out.println("a nhỏ hơn hoặc bằng b hoặc a lớn hơn hoặc bằng c") ;
        }

        System.out.println("============ Bài tập if - else =============");
        System.out.println("Kiểm tra n > number");
        baitap.kiemTra(200);
        System.out.println("=========================");
        System.out.println("Kiểm tra n = number");
        baitap.kiemTra(100);
        System.out.println("=========================");
        System.out.println("Kiểm tra n < number");
        baitap.kiemTra(10);
    }
}
