import java.util.Scanner;
public class Q20_Display_ArmstrngNmbr {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter the Lower value ");
        int start = Sc.nextInt();

        System.out.print("Enter the Higer value ");
        int end = Sc.nextInt();
        int i, t1, t2, remainder, n = 0, result = 0;


        for(i = start; i < end; ++i) {
            t2 = i;
            t1 = i;

            while (t1 != 0) {
                t1 /= 10;
                ++n;
            }

            while (t2 != 0) {
                remainder = t2 % 10;
                result += Math.pow(remainder, n);
                t2 /= 10;
            }

            if (result == i) {
                System.out.print(i + " ");
            }

            n = 0;
            result = 0;
        }
    }
}

