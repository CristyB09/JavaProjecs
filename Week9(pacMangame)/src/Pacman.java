//position, animation, direction for PacMan game;

import java.awt.Color;
import java.awt.Graphics;

public class Pacman {

    private int x, y, direction, animation;

    public Pacman(int x, int y, int direction, int animation) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.animation = animation;
    }

    public void draw(Graphics g) {

        g.setColor(Color.red);
        if (animation == 360) {

            animation = 300;

        } else {

            animation = 360;

        }
        if(direction == 300){
        
        
        y+=5;
        }
        g.fillArc(x, y, 40, 40, direction, animation);
        }
    }
    
    public void changeDirection(int newDirection){
    
        direction = newDirection;
    
    }

}
