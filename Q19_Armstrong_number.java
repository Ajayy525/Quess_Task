import java.util.Scanner;
public class Q19_Armstrong_number {
    public static void main(String[] args) {

        System.out.print("Enter the Number to check given number is Armstrong or not: ");
        Scanner Sc = new Scanner(System.in);

        int start = Sc.nextInt();
        int t1, t2, remainder, n = 0, result = 0;

        t2 = start;
        t1 = start;

        while (t1 != 0) {
            t1 /= 10;
            ++n;
        }

        while (t2 != 0) {
            remainder = t2 % 10;
            result += Math.pow(remainder, n);
            t2 /= 10;
        }

        if (result == start) {
            System.out.print(start + " is an Armstrong number.");
        }else{
            System.out.println(start + " is not an Armstrong number.");
        }

    }
}
