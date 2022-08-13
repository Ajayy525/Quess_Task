import java.util.Scanner;
public class Q36_Array_implementation {

    static void Menu(){
        System.out.println("*******************************");
        System.out.println("            MENU              ");
        System.out.println("ENTER '1' :- Menu ");
        System.out.println("ENTER '2' :- Exit ");
        System.out.println("ENTER '3' :- Insert ");
        System.out.println("ENTER '4' :- Delete ");
        System.out.println("ENTER '5' :- Search ");
        System.out.println("ENTER '6' :- Display ");

        System.out.println("********************************");

    }

    static void Exit(){
        System.out.println();
        System.out.println("********* THANK YOU *************");
    }

    static int Insert(int [] arr, int n){
        Scanner Sc = new Scanner(System.in);

        int val, pos;

        System.out.println("Enter the value you want to insert.");
        val = Sc.nextInt();

        System.out.println("Enter the Position you want to insert the '" + val + "' in. ( Note the array size is '" + (n) + "'. So, You can insert value in '1-"+ (n+1) + "'. )");
        pos = Sc.nextInt();

        if(pos<=0 || pos>n+1){
            System.out.println("Invalid Values");
        }else{
            for(int i=n-1; i>=pos-1;i--){
                arr[i+1] = arr[i];
            }
            arr[pos-1] = val;
            n++;
            Display(arr, n);
            return n;
        }
        return n;
    }

    static int Delete(int [] arr, int n){
        Scanner Sc = new Scanner(System.in);

        System.out.println("the array size is '" + (n) + "'. So, You can Delete value in '1-"+ n + "'. )");
        System.out.print("Enter the Position. Where you want to Delete the Array: "); // here
        Display(arr, n);
        int pos = Sc.nextInt();

        if(pos<=0 || pos>n){
            System.out.println("Invalid Input.");
        }else{
            for(int i = pos-1;i<n-1;++i){
                arr[i] = arr[i+1];
            }
            System.out.println("Done.");
            n--;
            Display(arr, n);
            return n;
        }
        return n;
    }

    static void Display(int [] arr, int n){
        Scanner Sc = new Scanner(System.in);

        System.out.println("Current array is: ");
        System.out.print("[");
        for(int i=0;i<n;++i){
            System.out.print(" " + arr[i]);
            if(i != n-1){
                System.out.print(",");
            }else{
                System.out.print(" ");
            }
        }
        System.out.print("]");
        System.out.println();
    }

    static void Search(int [] arr, int n){
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter values you want to search: ");
        int sea = Sc.nextInt();
        int i, flag = 0;

        for(i=0;i<n;++i){
            if(sea == arr[i]) {
                System.out.println("The Position of '" + arr[i] + "' is " + (i+1) + ".");
                flag = 1;
                //break;
            }
        }

        if(flag == 0){
            System.out.println("Not Found");
        }
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println();
        System.out.println("-------------------------------------------------------");
        System.out.println("**********************   START   **********************");
        System.out.println("-------------------------------------------------------");
        System.out.println();

        Menu();

        int num=0;
        int[] arr = new int[100];

        System.out.print("Enter the size of array: ");
        num = Sc.nextInt();

        System.out.print("Enter the value of array: ");
        for(int i=0;i<num;++i){
            arr[i] = Sc.nextInt();
        }

        System.out.print("Done.\n");
        System.out.println("Now choose the option from menu ");

        while(true){
            System.out.print("\n>> ");
            int n = Sc.nextInt();

            switch (n){
                case 1:
                    Menu();
                    break;
                case 2:
                    Exit();
                    System.exit(0);
                case 3:
                    num = Insert(arr, num);
                    break;
                case 4:
                    num = Delete(arr, num);
                    break;
                case 5:
                    Search(arr, num);
                    break;
                case 6:
                    Display(arr, num);
                    break;
                default:
                    System.out.println("Sorry 'TRY' With correct command. There is no command '" + n +  "'. \nPlease try '1' for MENU OR '2' for EXIT. ");
            }
        }
    }
}

