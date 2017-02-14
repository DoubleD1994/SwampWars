
package swampwars;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StartUpPage extends JFrame
{
    //create buttons to allow selections of grid size
    private JButton jbtn3by3;
    private JButton jbtn4by4;
    private JLabel jlblMsg;
    
    public StartUpPage()
    {
        super("Swamp Wars");
        setLayout(new GridLayout(0,1));
        
        //placing a message on screen allowing user to know what to do
       jlblMsg = new JLabel("Welcome to SWAMP WARS!!! \nThe ogre awaits you! Select your swamp size");
       add(jlblMsg, BorderLayout.NORTH);
       
       jbtn3by3 = new JButton("3x3 Swamp");
       jbtn4by4 = new JButton("4x4 Swamp");
       
       add(jbtn3by3);
       add(jbtn4by4);
       
       HandlerClass3by3 handler3by3 = new HandlerClass3by3();
       jbtn3by3.addActionListener(handler3by3);
       
       HandlerClass4by4 handler4by4 = new HandlerClass4by4();
       jbtn4by4.addActionListener(handler4by4);
    }
    
    private class HandlerClass3by3 implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            grid3by3 small = new grid3by3();
            
            small.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            small.setExtendedState(JFrame.MAXIMIZED_BOTH);
            small.setVisible(true);
            
            
        }
    }
    
    private class HandlerClass4by4 implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            grid4by4 med = new grid4by4();
            
            med.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            med.setExtendedState(JFrame.MAXIMIZED_BOTH);
            med.setVisible(true);
            
            
        }
    }
    
}
