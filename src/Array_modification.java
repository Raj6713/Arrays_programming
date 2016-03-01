/*Write a program which will modify array pass methods*/
import java.util.Scanner;
public class Array_modification
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int[] a={2,5,7,9,10,12};
        /*print the array elements*/
        for(int value: a)
            System.out.printf("%d\n",value);
        System.out.println("End of initial array declaration");
        /*Pass the array to modify the array and than print again*/
        modifyarray(a);
        for(int value:a)
            System.out.printf("%d\n",value);
        System.out.println("End of the first part");
        /*Change a array element and show it on screen.*/
        modifyelement(a[2]);
        for(int value:a)
            System.out.printf("%d\n",value);
        System.out.println("End of the element modification");

    }
    public static void modifyarray(int[] dummy)
    {
        for(int i=0;i<dummy.length;i++)
            dummy[i]=2*dummy[i];

    }
    public static void modifyelement(int a)
    {
        a=2+3*a;
    }
}