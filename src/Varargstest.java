/*Write a program which will show the working of he variable argument list and will show the work on the command screen.*/
import java.util.Scanner;
public class Varargstest
{
    public static void main(String[] args)
    {
     Scanner scanner=new Scanner(System.in);
        System.out.println("Enter fiven numbers");
        System.out.println("First number: ");
        double num1=scanner.nextDouble();
        System.out.println("Second number: ");
        double num2=scanner.nextDouble();
        System.out.println("Third number: ");
        double num3=scanner.nextDouble();
        System.out.println("Fourth number: ");
        double num4=scanner.nextDouble();
        System.out.println("Fifth number: ");
        double num5=scanner.nextDouble();
        System.out.printf("Average of %.2f and %.2f is %.2f\n",num1,num2,variable_avg(num1,num2));
        System.out.printf("Average of %.2f,%.2f and %.2f is %.2f\n",num1,num2,num3,variable_avg(num1,num2,num3));
        System.out.printf("Average of %.2f,%.2f,%.2f and %.2f is %.2f\n",num1,num2,num3,num4,variable_avg(num1,num2,num3,num4));
        System.out.printf("Average of %.2f,%.2f,%.2f,%.2f and %.2f is %.2f\n",num1,num2,num3,num4,num5,variable_avg(num1,num2,num3,num4,num5));


    }
    public static double variable_avg(double...numbers)
    {
     int counter=0;
     double sum=0.0;
        for(double d:numbers)
        {
            sum+=d;
            counter+=1;
        }
      return(sum/(double)counter);
    }
}