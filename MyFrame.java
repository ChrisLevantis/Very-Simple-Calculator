import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    float num1;
    float num2;
    float sum;

    JButton butt1;
    JButton butt2;
    JButton butt3;
    JButton butt4;

    TextField field1;
    TextField field2;
    MyFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.setLayout(new FlowLayout());

        field1 = new TextField();
        field1.setPreferredSize(new Dimension(100, 20));
        field2 = new TextField();
        field2.setPreferredSize(new Dimension(100, 20));

        butt1 = new JButton("+");
        butt1.setFocusable(false);
        butt2 = new JButton("-");
        butt2.setFocusable(false);
        butt3 = new JButton("*");
        butt3.setFocusable(false);
        butt4 = new JButton("/");
        butt4.setFocusable(false);

        butt1.addActionListener(this);
        butt2.addActionListener(this);
        butt3.addActionListener(this);
        butt4.addActionListener(this);

        this.add(field1);
        this.add(butt1);
        this.add(butt2);
        this.add(butt3);
        this.add(butt4);
        this.add(field2);
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try
        {
            num1 = Integer.valueOf(field1.getText());
        }
        catch (NumberFormatException x)
        {
            System.out.println("--CANNOT CONVERT NUM1--");
            return;
        }

        try
        {
            num2 = Integer.valueOf(field2.getText());
        }
        catch (NumberFormatException x)
        {
            System.out.println("--CANNOT CONVERT NUM2--");
            return;
        }

        if (e.getSource() == butt1)
        {
            sum = num1 + num2;
            JOptionPane.showMessageDialog(null, num1 + "+" + num2 + "=" + sum);
        }
        else if (e.getSource() == butt2)
        {
            sum = num1 - num2;
            JOptionPane.showMessageDialog(null, num1 + "-" + num2 + "=" + sum);
        }
        else if (e.getSource() == butt3)
        {
            sum = num1 * num2;
            JOptionPane.showMessageDialog(null, num1 + "*" + num2 + "=" + sum);
        }
        else if (e.getSource() == butt4)
        {
            sum = num1 / num2;
            JOptionPane.showMessageDialog(null, num1 + "/" + num2 + "=" + sum);
        }
    }
}
