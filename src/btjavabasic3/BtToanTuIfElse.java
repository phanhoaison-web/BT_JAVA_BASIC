package btjavabasic3;

public class BtToanTuIfElse {
    static int a = 100;
    static int b = 20;
    static int c = 20;

    int number = 100;

    public static void soSanhLonHon(){
        if( a > b){
            System.out.println("a lớn hơn b") ;
        }
    }

    public static void soSanhNhoHon(){
        if(b < a ){
            System.out.println("b nhỏ hơn a") ;
        }
    }

    public static void soSanhBang(){
        if(b == c ){
            System.out.println("b bằng c") ;
        }
    }

    public static void toanTuVa(){
        if((a > b) && (b == c)) {
            System.out.println("a lớn b và b bằng c");
        }
    }
    public static void toanTuHoac(){
        if((b > a) || (b == c)) {
            System.out.println("a nhỏ hơn b hoặc b bằng c");
        }
    }

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
        BtToanTuIfElse baitap = new BtToanTuIfElse();
        System.out.println("============ Bài tập toán tử quan hệ =============");
        soSanhLonHon();
        soSanhNhoHon();
        soSanhBang();
        System.out.println("============ Bài tập toán tử logic =============");
        toanTuVa();
        toanTuHoac();
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
