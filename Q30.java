import java.util.Scanner;
public class Q30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of the element");
        int n=sc.nextInt();
        int sum=0,avg=0;
        System.out.println("enter the element of the array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        System.out.println("the sum of all the element in the array is  "+sum);
        avg=sum/n;
        System.out.println("the average of all the element in the array is  "+avg);




    }
}
