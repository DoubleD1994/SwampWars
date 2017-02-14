
package swampwars;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ogre extends Actors
{
    public String diet;
        
    public Ogre()
    {

    }
    
    public void destroy()
    {
    
    }
    
    public void enterSwamp()
    {
        
    }
    
    public String getOgreDiet()
    {
        return this.diet;
    }
    
    public void setOgreDiet(int rand)
    {
        if(rand == 0)
        {
            this.diet = "Knights in Shining Armour";
        }
        else if(rand == 1)
        {
            this.diet = "Very Big Macs";
        }
        else
        {
            this.diet = "Ogre Enemies";
        }       
    }
    
    public JPanel drawOgre()
    {
        JPanel ogrePanel = new JPanel();
        
        ogrePanel.setSize(50, 50);
        ogrePanel.setBackground(Color.WHITE);
        
        return ogrePanel;
    }

}
