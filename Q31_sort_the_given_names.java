import java.util.Scanner;
public class Q31_sort_the_given_names {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of the string");
        int n = sc.nextInt();

        System.out.println("enter the names");
        String[] name_array = new String[n];

        Scanner sc2 = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            name_array[i] = sc2.nextLine();
        }

        String temp;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (name_array[i].compareTo(name_array[j]) > 0) {
                    temp = name_array[i];
                    name_array[i] = name_array[j];
                    name_array[j] = temp;

//                    System.out.println(name_array[j]);
                }
            }

        }
        for(int i=0;i<n;i++){
            System.out.println(name_array[i]+" ");
        }
    }
}
