/*Write a program which will take two arrays and than will copy the elements of one array into another one */
import java.util.Scanner;
public class Copy_array
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int[] a=new int[11];
        int[] b=new int[34];
        for(int i=0;i<a.length;i++)
            a[i]=2+2*i;
        /*initial array outputs*/
        output_array(a);
        System.out.println();
        output_array(b);
        System.out.println();
        for(int i=0;i<a.length;i++)
            b[i]=a[i];

        output_array(a);
        System.out.println();
        output_array(b);
        System.out.println();
    }

    public static void output_array(int[] c)
    {
        for(int i=0;i<c.length;i++)
        {
            System.out.printf("%d ",c[i]);
        }
    }
}