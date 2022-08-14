import java.util.Scanner;
public class Q21_ternary_operator {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter the 1st Number: ");
        int n1 = Sc.nextInt();

        System.out.print("Enter the 2nd Number: ");
        int n2 = Sc.nextInt();

        System.out.print("Enter the 3rd Number: ");
        int n3 = Sc.nextInt();

        System.out.print("Enter the 4th Number: ");
        int n4 = Sc.nextInt();

        int maxNum = ((n1 > n2 ? n1 : n2) > (n3 > n4 ? n3 : n4) ? (n1 > n2 ? n1 : n2) : (n3 > n4 ? n3 : n4));

        System.out.println("\nThe largest number among " + n1 + ", " + n2 + ", " + n3 + ", " + n4 + " is " + maxNum);
    }
}
