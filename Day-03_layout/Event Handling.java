import javax.swing.*;
import java.awt.event.*;

class EventHandling extends JFrame implements ActionListener
{
    JTextField tf;

    EventHandling()
    {
        tf = new JTextField();
        tf.setBounds(60, 50, 170, 20);

        JButton button = new JButton("Show");
        button.setBounds(90, 140, 75, 40);
        button.addActionListener(this);

        add(button);
        add(tf);

        setSize(250, 250);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        tf.setText("Hello World");
    }

    public static void main(String args[])
    {
        new EventHandling();
    }
}
