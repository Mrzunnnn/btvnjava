import java.util.Scanner;

public class baitap35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao ban kinh");
        double banKinh = sc.nextDouble();
        System.out.println("the tich la "+theTich(banKinh));

    }
    public static double theTich(double r){
        return  (4 * Math.PI * Math.pow(r, 3)) / 3;

    }
}
