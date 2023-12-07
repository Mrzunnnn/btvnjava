import java.util.Scanner;

public class baitap22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều rộng:");
        Double chieuRong = sc.nextDouble();
        System.out.println("Nhập chiều dài:");
        Double chieuDai = sc.nextDouble();
        Double chuVi = (chieuRong + chieuDai) * 2;
        Double dienTich = chieuRong * chieuDai;
        System.out.println("Chu vi là :" + chuVi);
        System.out.println("Diện tích là : " + dienTich);
    }
}
