import java.util.Scanner;
public class Q18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();
        int rev=0,num,digit;
        while(n>0){
            digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        System.out.println("the reverse number is  "+rev);
    }
}
