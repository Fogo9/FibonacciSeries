import java.util.Scanner;

public class fibonacci{

    public static void main(String[] args) {

        int a = 0, b = 1, c;

        Scanner inp = new Scanner (System.in);

        System.out.print("Enter The Number : ");

        int n = inp.nextInt();

        System.out.print(a + " " + b + " ");
        

        for (int i = 2; i <= n; i++) {

            c = b + a;

            System.out.print(c + " ");

            a = b;

            b = c;
        }
    }
}
