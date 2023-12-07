public class baitap33 {
    public static void main(String[] args) {
        String goc = "hello";
        int soLan = 6;
        String ketQua = saoChep(goc, soLan);
        System.out.println(ketQua);
    }

    public static String saoChep(String chuoi,int n){
        StringBuilder ketQua = new StringBuilder(n);
        for (int i =0;i<n;i++) {
            ketQua.append(chuoi);
            if (i < n - 1) {
                ketQua.append("-");
            }
        }
        return ketQua.toString();

    }
}
