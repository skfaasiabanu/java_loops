public class Bintodec
{
    public static void fun(int n)
    {
        int temp=n;
        int mynum;
        int myans=0;
        int i=0;
        while(n>0)
        {
            mynum=n%10;
            myans=myans+((int)Math.pow(2,i)*mynum);
            n=n/10;
            i++;
        }
        System.out.println(myans);
    }
    public static void main(String args[])
    {
        int n=1111;
        fun(n);
    }
}