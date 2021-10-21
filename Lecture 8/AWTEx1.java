import java.awt.*;
import java.awt.event.*;

class awt implements ActionListener{

    Button sub = new Button("SUBMIT");
    TextField name = new TextField();
    TextField roll = new TextField();
    TextField age = new TextField();
    TextArea add = new TextArea();
    TextArea dis = new TextArea();

    Checkbox chkmale = new Checkbox("Male");
    Checkbox chkfemale = new Checkbox("Female");
    Checkbox chkothers = new Checkbox("Others");

    Label lname = new Label("Name");
    Label lroll = new Label("Roll no.");
    Label lage = new Label("Age");
    Label lgen = new Label("Gender");
    Label ladd = new Label("Address");

    awt()
    {
        Frame f = new Frame();
        f.setTitle("Student Details");
        f.setSize(800,800);        

        lname.setBounds(20, 40, 80, 30); 
        lroll.setBounds(20, 80, 80, 30); 
        lage.setBounds(20, 120, 80, 30);
        lgen.setBounds(20, 160, 80, 30);
        ladd.setBounds(20, 200, 80, 30);

        name.setBounds(100, 40, 100, 30);
        roll.setBounds(100, 80, 80, 30);
        age.setBounds(100, 120, 50, 30);
        chkmale.setBounds(100, 150, 50, 50);
        chkfemale.setBounds(200, 150, 75, 50);
        chkothers.setBounds(300, 150, 75, 50);
        add.setBounds(100, 200, 200, 200);
        sub.setBounds(150, 420, 75, 50);
        dis.setBounds(100, 500, 200, 200);
        
        f.add(lname);
        f.add(lroll);
        f.add(lage);
        f.add(lgen);
        f.add(ladd);
        f.add(name);
        f.add(roll);
        f.add(age);
        f.add(chkmale);
        f.add(chkfemale);
        f.add(chkothers);
        f.add(add);
        f.add(sub);
        f.add(dis);

        sub.addActionListener(this);  

        f.setLayout(null);
        f.setVisible(true);
    }
     
    public void actionPerformed(ActionEvent e)
    {  
        String sName = name.getText();
        String sRoll = roll.getText();
        String sAge = age.getText();
        String sAdd = add.getText();

        dis.setText("The student details are :" + "\n" + "Name = " +sName + "\n" + "Age = "
                    + sAge + "\n" + "Roll No. = " + sRoll + "\n" + "Address = " + sAdd);
    }  
    
     
}

public class AWTEx1
{
    public static void main(String args[])
    {
        awt obj = new awt();

    }
}