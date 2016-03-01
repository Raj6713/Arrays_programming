/*Write a program which will show the use of the enhanced for loop */
import java.util.Scanner;
public class Enhanced_for
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int[] a={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        /*Show the array elements*/
        for(int i=0;i<a.length;i++)
        {
            System.out.printf("%d\n",a[i]);
        }
        for(int element:a)
            sum+=element;

        System.out.printf("Sum of the array is %d",sum);
    }
}