import java.util.Scanner;

public class Q24_Insurance_policy {



    public static void main(String[] args) {
//        int age;
        System.out.println("choose married for Y and  unmarried for N");
        Scanner sc= new Scanner(System.in);
        char c = sc.next().charAt(0);
        if(c=='Y'){
            System.out.println("you are alllowed to take policy");
        }
        else if(c=='N'){
            System.out.println("enter the male for m and  female for n");
            char CH = sc.next().charAt(0);
            if(CH=='m'){
                int age;
                System.out.println("Enter your age");
                Scanner pq= new Scanner(System.in);
                age=pq.nextInt();
                if(age>30) {
                    System.out.println("You are eligible to take  company policy");
                }
                else{
                    System.out.println("you are not eligible take company policy");
                }
            }
            else if(CH=='n'){
                int age;
                System.out.println("Enter your age");
                Scanner objct= new Scanner(System.in);
                age=sc.nextInt();
                if(age>25) {
                    System.out.println("You are eligible to take company policy");
                }
                else {
                    System.out.println("you are not eligible to take company policy");
                }

            }
        }
        else{
            System.out.println("invalid input");
        }
    }
}

