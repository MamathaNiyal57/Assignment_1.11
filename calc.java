import java.util.*;
import java.io;

public class calc{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();

        add();
        sub();
    }

    public static int add(int num1, int num2)
    {
        int sum = num1+num2;
        return sum;
    }
}
