/*Write a program which will roll a dice by 60000 times and than will show the frequency plot on the screen.*/
import java.util.Scanner;
import java.security.SecureRandom;
public class Frequency_counter
{
    public static void main(String[] args)
    {
        SecureRandom random1=new SecureRandom();
        int[] frequency=new int[7];
        for(int i=1;i<=60000;i++)
        {
            ++frequency[1+random1.nextInt(6)];
        }
        System.out.printf("%s\t%s\n","Face","Frequency");
        for(int face=1;face<frequency.length;face++)
        {
            System.out.printf("%d\t%d\n",face,frequency[face]);
        }
    }
}