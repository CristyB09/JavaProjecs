package javaapplication1;

import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;

public class Display extends JFrame implements ActionListener{
    
    PacMan pman;
    Timer timer;
    
    byte [][] board = {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, 
                       {1,0,0,0,0,0,0,0,0,0,0,0,0,0,1}, 
                       {1,0,1,1,1,1,0,1,1,1,1,1,1,0,1}, 
                       {1,0,1,1,1,1,0,1,1,1,1,1,1,0,1}, 
                       {1,0,1,1,1,1,0,1,1,1,1,1,1,0,1}, 
                       {1,0,1,1,1,0,0,0,0,0,1,1,1,0,1}, 
                       {1,0,1,1,1,0,0,0,0,0,1,1,1,0,1}, 
                       {1,0,1,1,1,0,0,0,0,0,1,1,1,0,1}, 
                       {1,0,1,1,1,0,0,0,0,0,1,1,1,0,1}, 
                       {1,0,1,1,1,0,0,0,0,0,1,1,1,0,1}, 
                       {1,0,1,1,1,0,0,0,0,0,1,1,1,0,1}, 
                       {1,0,1,1,1,1,1,1,1,1,1,1,1,0,1}, 
                       {1,0,1,1,1,1,1,1,1,1,1,1,1,0,1}, 
                       {1,0,0,0,0,0,0,0,0,0,0,0,0,0,1}, 
                       {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, 
    
    };
    
    public Display(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(new Dimension (600, 600));
        pman = new PacMan(300, 300, 210, 360);
        //300 - facing down
        //120 - up
        //390 - right
        //210 - left
        this.setVisible(true);
        timer = new Timer(300, this);
        timer.start();
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed (KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_UP){
                    pman.changeDirection(120);
                }
                else if (e.getKeyCode() == KeyEvent.VK_DOWN){
                    pman.changeDirection(300);
                }
                else if (e.getKeyCode() == KeyEvent.VK_LEFT){
                    pman.changeDirection(210);
                }
                else if (e.getKeyCode() == KeyEvent.VK_RIGHT){
                    pman.changeDirection(30);
                }
            }

            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
        
    }
    
    public void paint(Graphics g){
        this.paintComponents(g);
        g.setColor(Color.black);
        
        int dx = 0;
        int dy = 0;
        
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                
               if (board[row][col] == 1)
                g.fillRect(dx, dy, 40, 40);
               
               dx+=40;
                
                
            }
            dy+=40;
            dx = 0;
            
        }
        
        pman.draw(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
    
    
    
}
