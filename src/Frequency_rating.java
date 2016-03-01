/*Write a program which will take rating of 20 person on the scale of 1-5 and than will show the output in a frequency table*/
import java.util.Scanner;
public class Frequency_rating
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int[] responses={1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5};
        int[] frequency=new int[6];
        for(int i=0;i<responses.length;i++)
        {
            ++frequency[responses[i]];
        }
        /*Systematic output */
        System.out.println("The value of responses is ");
        for(int i=1;i<frequency.length;i++)
        {
            System.out.printf("%d\t%d\n",i,frequency[i]);
        }
    }
}