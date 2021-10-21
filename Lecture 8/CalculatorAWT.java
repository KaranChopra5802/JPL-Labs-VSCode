import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.*;

import javax.swing.Action;


class Calculator implements ActionListener
{
    Calculator()
    {
        Frame f = new Frame();
        f.setTitle("Calculator");
        f.setSize(800, 800);

        Button b0 = new Button("0");
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        Button b5 = new Button("5");
        Button b6 = new Button("6");
        Button b7 = new Button("7");
        Button b8 = new Button("8");
        Button b9 = new Button("9");
        Button Bequal = new Button("=");
        Button Badd = new Button("+");
        Button Bsub = new Button("-");
        Button Bmul = new Button("*");
        Button Bdiv = new Button("/");
        Button BCE = new Button("CE");
        Button Bdec = new Button(".");
        Button Bper = new Button("%");
        TextField Tresult = new TextField();

        Tresult.setBounds(40, 40, 290, 40);
        b7.setBounds(40, 180, 50, 50);
        b8.setBounds(120, 180, 50, 50);
        b9.setBounds(200, 180, 50, 50);
        b4.setBounds(40, 260, 50, 50);
        b5.setBounds(120, 260, 50, 50);
        b6.setBounds(200, 260, 50, 50);
        b1.setBounds(40, 340, 50, 50);
        b2.setBounds(120, 340, 50, 50);
        b3.setBounds(200, 340, 50, 50);
        b0.setBounds(40, 420, 50, 50);
        Badd.setBounds(280, 180, 50, 50);
        Bequal.setBounds(280, 260, 50, 130);
        Bsub.setBounds(120, 420, 50, 50);
        Bmul.setBounds(200, 420, 50, 50);
        Bdiv.setBounds(280, 420, 50, 50);
        BCE.setBounds(40, 110, 130, 50);
        Bdec.setBounds(280, 110, 50, 50);
        Bper.setBounds(200, 110, 50, 50);

        f.add(Tresult);
        f.add(b0);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(Badd);
        f.add(Bequal);
        f.add(Bsub);
        f.add(Bmul);
        f.add(Bdiv);
        f.add(Bdec);
        f.add(BCE);
        f.add(Bper);

        f.setLayout(null);
        f.setVisible(true);

        b0.addActionListener(this);
        b1.addActionListener(this); 
        b2.addActionListener(this); 
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        Bper.addActionListener(this);
        Bdec.addActionListener(this);
        Badd.addActionListener(this);
        Bsub.addActionListener(this);
        Bmul.addActionListener(this);
        Bdiv.addActionListener(this);
        Bequal.addActionListener(this);
        BCE.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        
    }

}

public class CalculatorAWT {
    public static void main(String args[])
    {
        Calculator cal = new Calculator();
    }
    
}
