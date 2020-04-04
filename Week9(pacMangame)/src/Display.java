
import java.awt.Color;
import javax.swing.JFrame;//no scanner
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Display extends JFrame implements ActionListener {

    Timer timer;

    Pacman pman;

    public Display() {

        this.setSize(new Dimension(600, 600));

        pman = new Pacman(300, 300, 390, 360);
        this.setVisible(true);
        timer = new Timer(200, this);
        this.setBackground(Color.black);
        
        timer.start();
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e){
                
                
                
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
              if(e.getKeyCode() == KeyEvent.VK_UP)
            }{

pman.channgeDirection(120);
}
            else if(e.getKeyCode()== KeyEvent.VK_DOWN)
            {
            
            pman.changeDirection(300);
            
            }
else if(e.getKeyCode() == KeyEvent.VK_LEFT)
{
    pman.changeDirection(210);
}

else if(e.getKeyCode() == HKeyEvent.VK_RIGHT)
            

            @Override
            public void keyReleased(KeyEvent e) {
               
            }
        });
    }

    public void paint(Graphics g) {

        this.paintComponents(g);
        pman.draw(g);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

}
//control + F an type 0