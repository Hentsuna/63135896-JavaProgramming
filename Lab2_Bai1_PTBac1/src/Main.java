import javax.swing.text.html.parser.Parser;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập a: ");
        int a = sc.nextInt();
        System.out.println("Nhập b: ");
        int b = sc.nextInt();

        if (a == 0){
            if (b == 0){
                System.out.println("Pt vô số nghiệm");
            }else{
                System.out.println("Pt vô nghiệm");
            }
        }
        else{
            double x = (double) -b /a;
            System.out.println("Pt có nghiệm là: " + x);
        }
    }
}