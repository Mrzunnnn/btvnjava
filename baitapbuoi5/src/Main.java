import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
////        cau 4
//        int i = 0;
//        while (i < 4) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*"+"\t");
//            }
//            System.out.println();
//            i++;
//
//        }

//        cau 1
//        int i = 0;
//        while (i < 5) {
//            for (int j = 0; j <= 4; j++) {
//                System.out.print("*" + "\t");
//
//            }
//            System.out.println();
//            i++;
//        }

        int i = 0;
        while (i < 5) {
            for (int j = 0; j <= 3; j++) {
                System.out.print("*" + "\t");
                for (int i =1;i<4;i++){
                    for (int j=1;j<3;j++){
                        System.out.println("o" + "\t");
                    }
                }
            }

            System.out.println();
            i++;

        }
    }
    }
