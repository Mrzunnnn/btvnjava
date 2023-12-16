import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Book books1 = new Book("23","Đắc nhân tâm","Dũng","Kim Đồng",2013,"Tài Liệu");
        Book books2 = new Book("33","Thần số học","Kiên","Kim Đồng",2023,"Tài Liệu");
        Book books3 = new Book("43","Con đường ngày mai","Khoa","Phương Nam",2016,"Tiểu thuyết");
        books.add(books1);
        books.add(books2);
        books.add(books3);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên phim cần tìm: ");
        String name = scanner.nextLine();
        for (int i = 0;i<books.size();i++ ){
            if (books.get(i).getTitle().equalsIgnoreCase(name)){
                System.out.println("Phim cần tìm là : "+books.get(i));
                break;
            }
            else{
                System.out.println("không hợp lệ");}
        }
        System.out.println("Nhập thể loại cần tìm : ");
        String theLoai = scanner.nextLine();
        for (int i = 0;i<books.size();i++ ){
            if (books.get(i).getCategory().equalsIgnoreCase(theLoai)){
                System.out.println("Phim cần tìm là : "+books.get(i));
                break;
            }
            else{
                System.out.println("không hợp lệ");}
        }
        for (int i = 0;i<books.size();i++ ){
            if (books.get(i).getYear()==2023){
                System.out.println(books.get(i));
            }
        }
    }



}
