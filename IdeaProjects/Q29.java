import java.util.Scanner;
public class Q29 {
    public static void main(String[] args) {
        System.out.println("enter the lines");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                System.out.print((char)(j+64));
            }
            System.out.println("");
        }
    }

}

