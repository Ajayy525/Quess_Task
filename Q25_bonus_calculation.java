import java.util.Scanner;

public class Q25_bonus_calculation {
    public static void main(String[] args) {
        System.out.println("enter the basic user salary");
        Scanner sc= new Scanner(System.in);
        int basic_slry= sc.nextInt();
        double TA=basic_slry*0.1,DA=basic_slry*0.15,HRA=basic_slry*0.2;
        double PF=basic_slry*0.12,bonus;
        if(basic_slry>=20000){
//            System.out.println("");
            bonus=basic_slry*0.1;
        }
        else{
            bonus=basic_slry*0.2;
        }
        double total=basic_slry+TA+DA+HRA+bonus-PF;
        System.out.println("total salary of the user after adding bonus is ");
        System.out.println(total);


    }

}
