/*Write a java program which will initializa an array to the fraction and will manipulate the array as per described into the question*/
import java.util.Scanner;
public class Fraction
{
    private final static int Array_size=10;
    public static void main(String[] args)
    {
      Scanner scanner=new Scanner(System.in);
        double[] array1=new double[Array_size];
        for(int i=0;i<Array_size;i++)
        {
            array1[i]=0;
        }
        System.out.printf("The element at %d location is %.2f\n",4,array1[4]);
        array1[9]=1.667;
        array1[6]=3.333;
        for(double d:array1)
        {
            System.out.printf("%.2f\n",d);
        }
        double sum=0.0;
        for(double e:array1)
            sum+=e;
        System.out.printf("The sum of all array element is %.2f",sum);
    }
}