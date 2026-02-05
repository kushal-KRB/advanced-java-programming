import javax.swing.*;
import java.awt.event.*;

public class ItemListenerExample implements ItemListener {

    JFrame frame;
    JCheckBox checkBox;
    JLabel label;

    public ItemListenerExample() {

        frame = new JFrame("ItemListener Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        checkBox = new JCheckBox("Check Me");
        label = new JLabel();

        checkBox.addItemListener(this);

        JPanel panel = new JPanel();
        panel.add(checkBox);
        panel.add(label);

        frame.add(panel);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {

        if (e.getStateChange() == ItemEvent.SELECTED) {
            label.setText("Checkbox is checked");
        }
        else if (e.getStateChange() == ItemEvent.DESELECTED) {
            label.setText("Checkbox is unchecked");
        }
    }

    public static void main(String[] args) {
        new ItemListenerExample();
    }
}
