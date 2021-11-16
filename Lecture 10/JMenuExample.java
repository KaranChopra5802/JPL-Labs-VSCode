import javax.swing.*;    
import java.awt.event.*;  

public class JMenuExample implements ActionListener{

    JMenuItem jnew = new JMenuItem("New");
    JMenuItem jsave = new JMenuItem("Save");
    JMenuItem jopen = new JMenuItem("Open");
    JMenuItem jclose = new JMenuItem("Close");   

    JMenuItem jcut = new JMenuItem("Cut");
    JMenuItem jcopy = new JMenuItem("Copy");
    JMenuItem jpaste = new JMenuItem("Paste");
    JMenuItem jselectAll = new JMenuItem("Select All"); 

    JMenuItem jtables = new JMenuItem("Tables");
    JMenuItem jpictures = new JMenuItem("Pictures");

    JMenuItem jaboutUs = new JMenuItem("About Us");

    JTextArea jTextArea = new JTextArea(); 

    JMenuExample()
    {
        JFrame f = new JFrame("Menu Bar Example");
        JMenuBar jMenuBar = new JMenuBar();
        
        jnew.addActionListener(this);    
        jsave.addActionListener(this);    
        jopen.addActionListener(this);    
        jclose.addActionListener(this);   
        jcut.addActionListener(this);    
        jcopy.addActionListener(this);    
        jpaste.addActionListener(this);    
        jselectAll.addActionListener(this); 
        jtables.addActionListener(this);    
        jpictures.addActionListener(this);    
        jaboutUs.addActionListener(this);

        JMenu jmenu = new JMenu("FILE");
        jmenu.add(jnew);
        jmenu.add(jsave);
        jmenu.add(jopen);
        jmenu.add(jclose);

        JMenu jmenu1 = new JMenu("EDIT");
        jmenu1.add(jcut);
        jmenu1.add(jcopy);
        jmenu1.add(jpaste);
        jmenu1.add(jselectAll);

        JMenu jmenu2 = new JMenu("INSERT");
        jmenu2.add(jtables);
        jmenu2.add(jpictures);

        JMenu jmenu3 = new JMenu("HELP");
        jmenu3.add(jaboutUs);

        jMenuBar.add(jmenu);
        jMenuBar.add(jmenu1);
        jMenuBar.add(jmenu2);
        jMenuBar.add(jmenu3);

        jTextArea.setBounds(50, 50, 200, 30);

        f.setJMenuBar(jMenuBar);  
        f.add(jTextArea);
        f.setLayout(null);    
        f.setSize(400,400);    
        f.setVisible(true); 
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==jnew)  
        {
            jTextArea.setText("You selected New.");
        }
        if(e.getSource()==jsave)  
        {
            jTextArea.setText("You selected Save.");
        }
        if(e.getSource()==jopen)  
        {
            jTextArea.setText("You selected Open.");
        }
        if(e.getSource()==jclose)  
        {
            jTextArea.setText("You selected Close.");
        }
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
        if(e.getSource()==jselectAll)  
        {
            jTextArea.setText("You selected Select All.");
        }
        if(e.getSource()==jtables)  
        {
            jTextArea.setText("You selected Tables.");
        }
        if(e.getSource()==jpictures)  
        {
            jTextArea.setText("You selected Pictures.");
        }
        if(e.getSource()==jaboutUs)  
        {
            jTextArea.setText("You selected About Us.");
        }
    }
    
    public static void main(String args[])
    {
        new JMenuExample();
    }    

}
