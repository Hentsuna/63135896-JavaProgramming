import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập a, b, c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double delta = Math.pow(b, 2) - 4 * a * c;
        System.out.println("Delta: " + delta);
        if(delta >= 0) {
            System.out.println("Căn Delta: " + Math.sqrt(delta));
        }
        else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}