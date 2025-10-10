package bt_java_basic_2;

public class Calculator {
    public int tinhTong(int a, int b){
        return a+b; //phép cộng
    }

    public double tinhTich(double a,double b ){
        return a*b; //phép nhân
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator(); //khai báo object
        System.out.println("kết quả tính tổng a+b = " +cal.tinhTong(1,2));
        System.out.printf("kết quả tính tích a*b = %.2f%n",cal.tinhTich(10.0d,5.01d) );
    }
}
