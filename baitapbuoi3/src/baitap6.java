public class baitap6 {
    public static void main(String[] args) {
ketQua(16);
    }
    public static void ketQua(int n){
        for (int i =1;i<n;i++){
            if (i % 3 ==0){
                System.out.println(i+"  fizz");
            }
            if (i % 5 ==0){
                System.out.println(i+"  buzz");
            }
            if (i % 3 ==0 && i%5==0){
                System.out.println(i+"  buzz fizz");
            }
        }
    }
}
