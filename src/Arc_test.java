/*Write a program which will test the working of the Arc class and will show it on the screen.*/
import javax.swing.JFrame;
public class Arc_test
{
    public static void main(String[] args)
    {
        Arc arc1=new Arc();
        JFrame application=new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(arc1);
        application.setSize(400,400);
        application.setVisible(true);
    }
}