import java.util.Scanner;
    public class q28 {
        public static int FUN1(int n)
        {
            if(n==0){
                return n;
            }
            return n+FUN1(n-1);

        }

        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("enter the number");
            int number=sc.nextInt();
            int sum=FUN1(number);
            System.out.println("Sum of All the number till this number is ="+sum);
        }



    }

