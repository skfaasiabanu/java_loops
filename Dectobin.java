public class Dectobin
{
    public static void func(int n)
    {
        StringBuilder decimal=new StringBuilder();
        int myans;
        while(n>0)
        {
           myans=n%2;
           decimal.append(myans);
           n=n/2;
        }
        decimal.reverse();
        System.out.println(decimal);
    }
    public static void main(String args[])
    {
        int n=10;
        func(n);
    }
}