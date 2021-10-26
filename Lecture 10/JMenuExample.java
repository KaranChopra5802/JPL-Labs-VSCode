import javax.swing.*;    
import java.awt.event.*;  

public class JMenuExample implements ActionListener{

    JMenuItem jcut = new JMenuItem("CUT");
    JMenuItem jcopy = new JMenuItem("COPY");
    JMenuItem jpaste = new JMenuItem("PASTE");
    JMenuItem jselect = new JMenuItem("SELECT");   

    JMenuItem jcut1 = new JMenuItem("CUT");
    JMenuItem jcopy1 = new JMenuItem("COPY");
    JMenuItem jpaste1 = new JMenuItem("PASTE");
    JMenuItem jselect1 = new JMenuItem("SELECT"); 

    JMenuItem jcut2 = new JMenuItem("CUT");
    JMenuItem jcopy2 = new JMenuItem("COPY");
    JMenuItem jpaste2 = new JMenuItem("PASTE");
    JMenuItem jselect2= new JMenuItem("SELECT"); 

    JTextArea jTextArea = new JTextArea(); 

    JMenuExample()
    {
        JFrame f = new JFrame("Menu Bar Example");
        JMenuBar jMenuBar = new JMenuBar();
        
        jcut.addActionListener(this);    
        jcopy.addActionListener(this);    
        jpaste.addActionListener(this);    
        jselect.addActionListener(this);   
        jcut1.addActionListener(this);    
        jcopy1.addActionListener(this);    
        jpaste1.addActionListener(this);    
        jselect1.addActionListener(this); 
        jcut2.addActionListener(this);    
        jcopy2.addActionListener(this);    
        jpaste2.addActionListener(this);    
        jselect2.addActionListener(this); 

        JMenu jmenu = new JMenu("MENU 0");
        jmenu.add(jcut);
        jmenu.add(jcopy);
        jmenu.add(jpaste);
        jmenu.add(jselect);

        JMenu jmenu1 = new JMenu("MENU 1");
        jmenu1.add(jcut1);
        jmenu1.add(jcopy1);
        jmenu1.add(jpaste1);
        jmenu1.add(jselect1);

        JMenu jmenu2 = new JMenu("MENU 2");
        jmenu2.add(jcut2);
        jmenu2.add(jcopy2);
        jmenu2.add(jpaste2);
        jmenu2.add(jselect2);

        jMenuBar.add(jmenu);
        jMenuBar.add(jmenu1);
        jMenuBar.add(jmenu2);

        jTextArea.setBounds(50, 50, 200, 30);

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
            jTextArea.setText("You selected Cut in Menu 0.");
        }
        if(e.getSource()==jcopy)  
        {
            jTextArea.setText("You selected Copy in Menu 0.");
        }
        if(e.getSource()==jpaste)  
        {
            jTextArea.setText("You selected Paste in Menu 0.");
        }
        if(e.getSource()==jselect)  
        {
            jTextArea.setText("You selected Select in Menu 0.");
        }
        if(e.getSource()==jcut1)  
        {
            jTextArea.setText("You selected Cut in Menu 1.");
        }
        if(e.getSource()==jcopy1)  
        {
            jTextArea.setText("You selected Copy in Menu 1.");
        }
        if(e.getSource()==jpaste1)  
        {
            jTextArea.setText("You selected Paste in Menu 1.");
        }
        if(e.getSource()==jselect1)  
        {
            jTextArea.setText("You selected Select in Menu 1.");
        }
        if(e.getSource()==jcut2)  
        {
            jTextArea.setText("You selected Cut in Menu 2.");
        }
        if(e.getSource()==jcopy2)  
        {
            jTextArea.setText("You selected Copy in Menu 2.");
        }
        if(e.getSource()==jpaste2)  
        {
            jTextArea.setText("You selected Paste in Menu 2.");
        }
        if(e.getSource()==jselect2)  
        {
            jTextArea.setText("You selected Select in Menu 2.");
        }
    }
    
    public static void main(String args[])
    {
        new JMenuExample();
    }    

}
