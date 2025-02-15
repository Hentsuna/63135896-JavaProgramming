import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập cạnh thứ 1: ");
        int n = sc.nextInt();
        System.out.println("Nhập cạnh thứ 2: ");
        int m = sc.nextInt();

        int p = (n+m)*2;
        int s = n * m;
        System.out.println("Chu vi hình chữ nhật là: " + p);
        System.out.println("Diện tích hình chữ nhật là: "+ s);
        if (n>=m) System.out.println("Cạnh nhỏ hình chữ nhật là: "+ m);
        else System.out.println("Cạnh nhỏ hình chữ nhật là: "+ n);
    }
}