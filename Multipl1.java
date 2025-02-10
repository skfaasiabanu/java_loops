import java.util.*;
public class Multipl1
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("enter number");
            int n=sc.nextInt();
            if(n%10==0)
            {
                continue;//for next iteration we are skipping the 10 multiple
            }
            System.out.println(n);
        }
        while(true);
    
    }
}