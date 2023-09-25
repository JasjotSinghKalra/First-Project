import java.util.*;
public class calculator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b;
        char ch;
        System.out.print("enter the first number-");
        a=sc.nextInt();
        System.out.print("enter the second number-");
        b=sc.nextInt();
        System.out.print("Enter your choice from +,-,*,/,%");
        ch=sc.next().charAt(0);
        switch(ch){
            case '+':System.out.println("sum="+(a+b));
                break;
            case '-':System.out.println("diff="+(a-b));
                break;
            case '*':System.out.println("mult="+(a*b));
                break;

       }
    }
}
