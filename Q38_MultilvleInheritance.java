
import java.util.Scanner;
class A{
    public A(int x)
    {
        System.out.println("We are creating a number " + x);
    }
}
class B extends A{
    public B(int x){
        super(x);
        System.out.println("Your number " + x);
    }
}
class C extends B{
    public C(int x){
        super(x);
        System.out.println("done " + x);
    }
}

public class Q38_MultilvleInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int x = sc.nextInt();
        new C(x);
    }
}
