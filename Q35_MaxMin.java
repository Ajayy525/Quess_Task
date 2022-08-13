import java.util.Scanner;
public class Q35_MaxMin {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = Sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array elements: ");
        for(int i=0;i<n;++i){
            arr[i] = Sc.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for(int i=0;i<n;++i){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println("Minm: " + min);
        System.out.println("Maxm: " + max);

    }
    }

