public class baitap34 {
    public static void main(String[] args) {

        System.out.println("Tồng là : "+tong());
    }
    public static int tong(){
       int tong = 0;
        for (int i = 0; i<= 100 ; i++){
            if (i % 5 == 0){
                tong += i ;
            }
        }
        return tong;
    }
}
