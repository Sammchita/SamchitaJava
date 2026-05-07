import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MultiplyNumbers extends JFrame implements ActionListener {

    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton btn;

    MultiplyNumbers() {

        setTitle("Multiplication Program");
        setSize(300,200);
        setLayout(new GridLayout(4,2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Enter First Number:");
        t1 = new JTextField();

        l2 = new JLabel("Enter Second Number:");
        t2 = new JTextField();

        l3 = new JLabel("Result:");
        t3 = new JTextField();
        t3.setEditable(false);

        btn = new JButton("Multiply");
        btn.addActionListener(this);

        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(btn);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        double num1 = Double.parseDouble(t1.getText());
        double num2 = Double.parseDouble(t2.getText());

        double result = num1 * num2;

        t3.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        new MultiplyNumbers();
    }
}
