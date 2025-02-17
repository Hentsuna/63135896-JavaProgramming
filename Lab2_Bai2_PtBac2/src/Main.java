import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập a: ");
        int a = sc.nextInt();
        System.out.println("Nhập b: ");
        int b = sc.nextInt();
        System.out.println("Nhập c: ");
        int c = sc.nextInt();

        double delta = b*b - 4*a*c;
        double x = 0;


        if (a == 0){
            if (b == 0){
                if (c == 0){
                    System.out.println("Pt vô số nghiệm");
                }else{
                    System.out.println("Pt vô nghiệm");
                }
            }else {
                x = (double) (-c /b);
                System.out.println("Pt có nghiệm là: " + x);
            }
        }
        else{
            if (delta < 0){
                System.out.println("Pt vô nghiệm");
            } else if (delta == 0) {
                x = (double) (-b / (2*a));
                System.out.println("Pt có nghiệm là: " + x);
            }else {
                double x1 = (double) (-b + Math.sqrt(delta)) / (2*a);
                double x2 = (double) (-b - Math.sqrt(delta)) / (2*a);
                System.out.println("Pt có 2 nghiệm là x1 = " + x1 + ", x2 = " + x2);
            }
        }
    }
}