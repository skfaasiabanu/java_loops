import java.util.*;
public class Sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int evensum=0;
        int oddsum=0;
        int number;
        int choice;
        do
        {
            System.out.print("Enter the number");
            number=sc.nextInt();
            if(number%2==0)
            {
                evensum=evensum+number;
            }
            else
            {
                oddsum=oddsum+number;
            }
            System.out.println("do you want to continue press 1 or 0 for no continuation");
            choice=sc.nextInt();
        }
        while(choice==1);
        System.out.println("even sum is ="+evensum);
        System.out.println("odd sum is ="+oddsum);
    }
}