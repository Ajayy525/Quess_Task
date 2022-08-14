import java.util.Scanner;
public class Q6_ReplaceDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the digits : ");
        String s = sc.nextLine();

        String result = "";

        for(int i=0;i<s.length();i++){
            int a = s.charAt(i);
            if(a<53){
                result=result + "0";
            }
            if(a>=53){
                result=result + "1";
            }
        }
        System.out.print("\n the String is : " + result);
    }
}

