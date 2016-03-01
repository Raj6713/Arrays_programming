/*Write a program which will create a gradebook.*/
public class Gradebook
{
    private String CourseName;
    private int[] grades;
    public Gradebook(String coursename,int[] grade)
    {
        this.CourseName=coursename;
        this.grades=grade;
    }

    public void setCourseName(String name_course)
    {
        this.CourseName=name_course;
    }
    public String getCourseName()
    {
        return CourseName;
    }
    public void gradeprocess()
    {
        outputgrades();
        System.out.printf("The average of class is %f\n",average());

        System.out.printf("Minimum of class is %d\n",minimum());
        System.out.printf("Maximum of class is %d\n",maximum());
        outputbarchart();
    }
    public void outputgrades()
    {
        System.out.println("The grades of the student are: \n");
        for(int i=0;i<grades.length;i++)
        {
            System.out.printf("%d\t%d\n",i,grades[i]);
        }
    }

    public double average()
    {
        double sum=0.0;
        for(int value:grades)
            sum+=value;
        sum=sum/grades.length;
        return sum;
    }

    public int maximum()
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<grades.length;i++)
        {
            if(grades[i]>max)
                max=grades[i];
        }
        return max;
    }

    public int minimum()
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<grades.length;i++)
        {
            if(grades[i]>min)
                min=grades[i];
        }
        return min;
    }

    public void outputbarchart()
    {
        System.out.println("Grade Distribution");
        int[] frequency=new int[11];
        for(int grade:grades)
            ++frequency[grade/10];

        for(int count=0;count<frequency.length;count++)
        {
            if(count==10)
                System.out.printf("%5d",100);
            else
            {
                System.out.printf("%02d-%02d",10*count,10*count+9);
            }
            for(int stars=0;stars<frequency[count];stars++)
                System.out.print("*");
            System.out.println();

        }

    }


}