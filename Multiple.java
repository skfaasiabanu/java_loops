import java.util.*;
public class Multiple
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("enter number");
            int n=sc.nextInt();
            if(n%10==0)
            {
                break;
            }
            System.out.println(n);
        }
        while(true);
        System.out.println("10 multiple");
    }
}