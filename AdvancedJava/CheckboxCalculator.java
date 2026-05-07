import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckboxCalculator extends JFrame implements ActionListener {

    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JCheckBox add, sub, mul;
    JButton btn;

    CheckboxCalculator() {

        setTitle("Calculator Form");
        setSize(350,300);
        setLayout(new GridLayout(8,1)); // changed layout
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        l1 = new JLabel("Enter First Value:");
        t1 = new JTextField(10);

        l2 = new JLabel("Enter Second Value:");
        t2 = new JTextField(10);

        l3 = new JLabel("Result:");
        t3 = new JTextField(10);
        t3.setEditable(false);

        add = new JCheckBox("Add");
        sub = new JCheckBox("Subtract");
        mul = new JCheckBox("Multiply");

        btn = new JButton("Calculate");
        btn.addActionListener(this);

        add(l1); add(t1);
        add(l2); add(t2);
        add(add); add(sub); add(mul);
        add(btn);
        add(l3); add(t3);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        double num1 = Double.parseDouble(t1.getText());
        double num2 = Double.parseDouble(t2.getText());
        double result = 0;

        if(add.isSelected())
            result = num1 + num2;

        if(sub.isSelected())
            result = num1 - num2;
        
        if(mul.isSelected())
            result = num1 * num2;

        t3.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        new CheckboxCalculator();
    }
}
