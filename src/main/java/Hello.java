import javax.swing.*;
import java.awt.BorderLayout;

public class Hello extends JFrame {

    private JLabel label;

    public Hello() {
        label = new JLabel("Hello");
        label.setName("label1");
        add(label, BorderLayout.NORTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 100);
        setName("Label-Window");
        setVisible(true);
    }


}

