import java.util.*;
public class Reversenumber
{
    public static void main(String args[])
    {  

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int lastdigit=0;
        int reverse=0;
        while(n>0)
        {
           lastdigit=n%10;
           reverse=(reverse*10)+lastdigit;
           n=n/10;
           

        }
        System.out.println(reverse);        
    }
}