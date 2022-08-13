import java.util.Scanner;
public class Q26_Electricity_bill {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the unit");
        int unit= sc.nextInt();
        double Charge =0;
        for(int i=0;i<unit;i++) {
            if(i<50){
                Charge+=0.5;
            }
            else if(i<=150){
                Charge+=0.75;
            }
            else if(i<=250){
                Charge+=1.2;
            }
            else{
                Charge+=1.5;
            }

        }
        Charge=Charge+Charge*0.2d;
        System.out.println("total Electricity bill is   " +unit+" : " +Charge);
    }

}
