/*Write a program which will take elements and than will sum all the elements and show on the screen.*/
import java.util.Scanner;
public class Total_c
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int[] c=new int[100];
        for(int i=0;i<c.length;i++)
            c[i]=2+2*i;
        output_array(c);
        int sum=0;
        for(int i=0;i<c.length;i++)
            sum+=c[i];
        System.out.printf("Sum of the array elements is %d",sum);
    }
    public static void output_array(int[] a)
    {
        for(int i=0;i<a.length;i++)
            System.out.printf("%d\n",a[i]);
    }
}