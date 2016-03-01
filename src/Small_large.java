/*Write a program which will display the largest and the smallest element among all the elements and will show on the screen.*/
public class Small_large
{
    public static void main(String[] args)
    {
        double[] a=new double[99];
        for(int i=0;i<a.length;i++)
        {
            a[i]=i*i-i+2;
        }
        System.out.printf("The largest value is %f\n",max(a));
        System.out.printf("The smallest value is %f\n",min(a));
    }
    public static double max(double[] a)
    {
        double max=Double.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
                max=a[i];

        }
        return max;
    }
    public static double min(double[] a)
    {
        double min=Double.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)
                min=a[i];
        }
        return min;
    }
}