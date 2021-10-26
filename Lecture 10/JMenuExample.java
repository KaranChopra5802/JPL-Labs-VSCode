import javax.swing.*;    
import java.awt.event.*;  

public class JMenuExample implements ActionListener{

    JMenuItem jcut = new JMenuItem("CUT");
    JMenuItem jcopy = new JMenuItem("COPY");
    JMenuItem jpaste = new JMenuItem("PASTE");
    JMenuItem jselect = new JMenuItem("SELECT");   
    JTextArea jTextArea = new JTextArea(); 

    JMenuExample()
    {
        JFrame f = new JFrame("Menu Bar Example");
        JMenuBar jMenuBar = new JMenuBar();
        
        jcut.addActionListener(this);    
        jcopy.addActionListener(this);    
        jpaste.addActionListener(this);    
        jselect.addActionListener(this);   

        JMenu jmenu = new JMenu("MENU");
        jmenu.add(jcut);
        jmenu.add(jcopy);
        jmenu.add(jpaste);
        jmenu.add(jselect);

        jMenuBar.add(jmenu);

        jTextArea.setBounds(50, 50, 150, 50);

        f.setJMenuBar(jMenuBar);  
        f.add(jTextArea);
        f.setLayout(null);    
        f.setSize(400,400);    
        f.setVisible(true); 
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==jcut)  
        {
            jTextArea.setText("You selected Cut.");
        }
        if(e.getSource()==jcopy)  
        {
            jTextArea.setText("You selected Copy.");
        }
        if(e.getSource()==jpaste)  
        {
            jTextArea.setText("You selected Paste.");
        }
        if(e.getSource()==jselect)  
        {
            jTextArea.setText("You selected Select.");
        }
    }
    
    public static void main(String args[])
    {
        new JMenuExample();
    }    

}
