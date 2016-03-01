/*Write a program which will sum all the elements of an array and will show it on the screen.*/
import java.util.Scanner;
public class Sum_of_array
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int[] a={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int sum=0;
        /*Output the value on the screen and show it on the screen.*/
        System.out.printf("%s\t%s\n","Index","Value");
        for(int i=0;i<a.length;i++)
        {
            System.out.printf("%d\t%d\n",i,a[i]);
            sum+=a[i];
        }
        System.out.printf("The sum of the value is given by: %d",sum);

    }
}