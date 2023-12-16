import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        Product product1 = new Product(28,"Bún khô","500g",4,37000);
        Product product2 = new Product(33,"Tôm 1 nắng","200g",49,200000);
        Product product3 = new Product(92,"Dầu ăn","2l",33,94000);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập sản phẩm bạn muốn tìm : ");
        String productName = sc.nextLine();
        for (int i= 0;i<products.size();){
            if (products.get(i).getName().equalsIgnoreCase(productName)){
                System.out.print(products.get(i));
                break;
            }
            else
                System.out.println("Không hợp lệ");
            break;
        }
        for (int q = 0;q<products.size();q++){
            if (products.get(q).getQuantity()<5){
                System.out.println("Sản phẩm có số lượng dưới 5 là : " + products.get(q).getName());
            }
        }
        System.out.println("Nhập id sản phẩm muốn xóa");
        int removeId = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số lượng sản phẩm muốn xóa");
        int removeQuantity=sc.nextInt();
        for (int i = 0; i < products.size(); i++) {
            if (removeId == products.get(i).getId()) {
                while (true) {
                    if (removeQuantity>0&&removeQuantity<=products.get(i).getQuantity()) {
                        System.out.println("Số lượng sản phẩm còn lại là: "+(products.get(i).getQuantity()-removeQuantity));
                        break;
                    }else {
                        System.out.println("Lỗi! Mời nhập lại");
                        int removeQuantity1= sc.nextInt();
                        if (removeQuantity1>0&&removeQuantity1<=products.get(i).getQuantity()) {
                            System.out.println("Số lượng sản phẩm còn lại là: "+(products.get(i).getQuantity()-removeQuantity1));
                            break;
                        }
                    }
                }
            }
        }
        for (int p = 0;p<products.size();p++){
            if (products.get(p).getPrice()<50000){
                System.out.println("Sản phẩm có mức giá dưới 50000 là " +products.get(p).getName());
            }
            if (products.get(p).getPrice()>50000&&products.get(p).getPrice()<100000){
                System.out.println("Sản phẩm có mức giá từ 50k đến 100k là : "+products.get(p).getName());
            }
            if (products.get(p).getPrice()>100000){
                System.out.println("Sản phẩm có mức giá từ 100k trở lên là : " + products.get(p).getName());
            }
        }
    }
}