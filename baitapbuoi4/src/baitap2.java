import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng n=: ");
        int n=sc.nextInt();
        int[] soNguyen =new int [n];
        for (int i = 0; i <n; i++){
            System.out.println("Phần tử thứ " +i+ " vừa nhập là:");
            soNguyen[i]= sc.nextInt();
        }
        System.out.println("Mảng vừa nhập ban đầu:");
        for (int i = 0; i < n; i++) {
            System.out.print(soNguyen[i]+"\t");
        }
        System.out.println("\nMảng sau khi tăng số chẵn:");
        for( int i=0; i<n; i++){
            if (soNguyen[i]%2==0){
                soNguyen[i]++;
                System.out.print(+ soNguyen[i]+"\t");
            }
            else System.out.print(+ soNguyen[i]+"\t");


        }



    }

}
