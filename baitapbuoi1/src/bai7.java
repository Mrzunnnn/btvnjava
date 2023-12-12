public class bai7 {
    public static void main(String[] args) {
        System.out.println(bmi(70,1.68));
    }
    public static double bmi(double canNang , double chieuCao){
        System.out.println("SỐ BMI của bạn là ");
        return canNang/(chieuCao*chieuCao);
    }
}
