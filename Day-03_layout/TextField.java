import javax.swing.*;
import java.awt.*;

public class MyTextField extends JFrame
{
    public MyTextField()
    {
        JTextField jtf = new JTextField(20);
        add(jtf);

        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new MyTextField();
    }
}
