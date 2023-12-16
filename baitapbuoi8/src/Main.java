import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Movie>movies= new ArrayList<>();
        Movie movies1 = new Movie(23,"Cô dâu 8 tuổi","Chính Kịch","abcs","20/5/2013","45p");
        Movie movies2 = new Movie(55,"Gia Đình là số 1","Hài","park","30/5/2010","30p");
        movies.add(movies1);
        movies.add(movies2);
        System.out.println(movies);

        ArrayList<Serial>serials=new ArrayList<>();
        Serial serial1 = new Serial(23,"Cô dâu 8 tuổi","Chính Kịch","abcs","20/5/2013",1400,"45p");
        Serial serial2 = new Serial(55,"Gia Đình là số 1","Hài","park","30/5/2010",50,"30p");
        serials.add(serial1);
        serials.add(serial2);
        System.out.print(serials);
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhap phim can tim theo tieu de:");
        String timPhim = sc.nextLine();
        for (int i = 0; i < serials.size() || i < serials.size(); i++) {
            if (movies.get(i).getTieuDe().equalsIgnoreCase(timPhim))
                System.out.println(movies.get(i));
            if (serials.get(i).getTieuDe().equalsIgnoreCase(timPhim))
                System.out.println(serials.get(i));
        }
    }

}