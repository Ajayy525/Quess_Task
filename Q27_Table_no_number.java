import java.util.Scanner;

public class Q27_Table_no_number {

    public static void Table_of_no(int n, int i) // 5 //4
    {
        if (i > 20) {
            return;
        } else {
            System.out.println(n * i);
            Table_of_no(n, i + 1);
        }
    }


    public static void main(String[] args) {

        // Function obj =new Function();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int number = sc.nextInt();
        int i = 1;
        Q27_Table_no_number object = new Q27_Table_no_number();
        System.out.println("table of " + number + " is:");
        object.Table_of_no(number, i);

    }
}