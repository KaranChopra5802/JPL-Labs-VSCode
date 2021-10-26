import javax.swing.*;    
import java.awt.event.*;  

public class JMenuExample implements ActionListener{

    JMenuItem jnew = new JMenuItem("New");
    JMenuItem jsave = new JMenuItem("Save");
    JMenuItem jsaveAs = new JMenuItem("Save As");
    JMenuItem jclose = new JMenuItem("Close");   

    JMenuItem jresize = new JMenuItem("Resize");
    JMenuItem jrotate = new JMenuItem("Rotate");
    JMenuItem jcolour = new JMenuItem("Colour");
    JMenuItem jpaint = new JMenuItem("Paint"); 

    JMenuItem jzoomIn = new JMenuItem("Zoom In");
    JMenuItem jzoomOut = new JMenuItem("Zoom Out");
    JMenuItem jfullScreen = new JMenuItem("Full Screen");
    JMenuItem jruler= new JMenuItem("Ruler"); 

    JTextArea jTextArea = new JTextArea(); 

    JMenuExample()
    {
        JFrame f = new JFrame("Menu Bar Example");
        JMenuBar jMenuBar = new JMenuBar();
        
        jnew.addActionListener(this);    
        jsave.addActionListener(this);    
        jsaveAs.addActionListener(this);    
        jclose.addActionListener(this);   
        jresize.addActionListener(this);    
        jrotate.addActionListener(this);    
        jcolour.addActionListener(this);    
        jpaint.addActionListener(this); 
        jzoomIn.addActionListener(this);    
        jzoomOut.addActionListener(this);    
        jfullScreen.addActionListener(this);    
        jruler.addActionListener(this); 

        JMenu jmenu = new JMenu("FILE");
        jmenu.add(jnew);
        jmenu.add(jsave);
        jmenu.add(jsaveAs);
        jmenu.add(jclose);

        JMenu jmenu1 = new JMenu("HOME");
        jmenu1.add(jresize);
        jmenu1.add(jrotate);
        jmenu1.add(jcolour);
        jmenu1.add(jpaint);

        JMenu jmenu2 = new JMenu("VIEW");
        jmenu2.add(jzoomIn);
        jmenu2.add(jzoomOut);
        jmenu2.add(jfullScreen);
        jmenu2.add(jruler);

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
        if(e.getSource()==jnew)  
        {
            jTextArea.setText("You selected New.");
        }
        if(e.getSource()==jsave)  
        {
            jTextArea.setText("You selected Save.");
        }
        if(e.getSource()==jsaveAs)  
        {
            jTextArea.setText("You selected Save As.");
        }
        if(e.getSource()==jclose)  
        {
            jTextArea.setText("You selected Close.");
        }
        if(e.getSource()==jresize)  
        {
            jTextArea.setText("You selected Resize.");
        }
        if(e.getSource()==jrotate)  
        {
            jTextArea.setText("You selected Rotate.");
        }
        if(e.getSource()==jcolour)  
        {
            jTextArea.setText("You selected Colour.");
        }
        if(e.getSource()==jpaint)  
        {
            jTextArea.setText("You selected Paint.");
        }
        if(e.getSource()==jzoomIn)  
        {
            jTextArea.setText("You selected Zoom In.");
        }
        if(e.getSource()==jzoomOut)  
        {
            jTextArea.setText("You selected Zoom Out.");
        }
        if(e.getSource()==jfullScreen)  
        {
            jTextArea.setText("You selected Full Screen.");
        }
        if(e.getSource()==jruler)  
        {
            jTextArea.setText("You selected Ruler.");
        }
    }
    
    public static void main(String args[])
    {
        new JMenuExample();
    }    

}
