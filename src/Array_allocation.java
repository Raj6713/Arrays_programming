/*Write a program which will allocate values to the array using the scheme and than show elements in a tabular form.*/
import java.util.Scanner;
public class Array_allocation
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int[] a=new int[10];
        /*Element allocation*/
        for(int i=0;i<a.length;i++)
        {
            a[i]=2+2*i;
        }
        /*Show the output of the value on the screen.*/
        System.out.printf("%s\t%s\n","Index","Value");
        for(int i=0;i<a.length;i++)
        {
            System.out.printf("%d\t%d\n",i,a[i]);
        }
    }
}