
package swampwars;

import javax.swing.JFrame;


public class SwampWars 
{

    
    public static void main(String[] args) 
    {
        StartUpPage sup = new StartUpPage();
        
        sup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sup.setExtendedState(JFrame.MAXIMIZED_BOTH);
        sup.setVisible(true);
    }
    
}
