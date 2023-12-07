public class Main {
    public static void main(String[] args) {
        String saoChep = "hello";
        String ketQua = gapMuoilan(saoChep);
        System.out.println(ketQua);
    }
//    cau1
//
//    public static String gapMuoilan(String chuoi){
//        StringBuilder ketQua = new StringBuilder();
//        for (int i = 0;i<10;i++){
//            ketQua.append(chuoi);
//        }
//        return ketQua.toString();
//
//    }


//    cau2
    public static String gapMuoilan(String chuoi){
        String[] ketQua = new  String[10];
        for (int i=0;i<10;i++){
            ketQua[i] = chuoi;
        }
        return String.join("-",ketQua);
    }

}