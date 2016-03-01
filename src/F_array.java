/*Write a program which will show the elements of an array and will show the value at the location 6*/
import java.util.Scanner;
public class F_array
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int[] a=new int[100];
        for(int i=0;i<a.length;i++)
        a[i]=2+2*i;
        /*Show the element at the location 6*/
        System.out.printf("Value at %d is %d",6,a[6]);
    }
}