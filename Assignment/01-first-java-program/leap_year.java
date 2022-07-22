import java.util.*;
public class leap_year
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the year to be checked :");
        int year=in.nextInt();
        if(((year %4 == 0) && (year % 100!=0)) || (year%400==0))
            System.out.println("the entered year is a leap year");
        else
            System.out.println("the entered year not a leap year");

    }
}

