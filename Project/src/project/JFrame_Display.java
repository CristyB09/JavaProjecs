
package project;

import java.awt.Button;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class JFrame_Display extends JFrame {
    
    public JFrame_Display()
    {
        this.setSize(new Dimension(600,600));
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("NoIdeaWhatIAmDoingHere");
        JTextField tf1=new JTextField();
        tf1.setBounds(10, 10, 150, 20);
        this.add(tf1);
        Button b1=new Button();
        b1.setBounds(20,20,150,20);
        this.add(b1);
        
        
        
        
        this.setVisible(true);
        
    }
    
}
