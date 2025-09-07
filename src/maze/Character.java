/*
Variables like private blockX and blockY and character are declared and character
is set to the character's image brought from the resource folder. Setting both 
blockX and BlockY to 1 will ensure the position of the character tile to be on
the top left of the game. All of variables are returned. The move method allows 
the image to be move within the game.
*/
package maze;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Character {
    
    private int blockX, blockY;
    
    private Image character;
    
    public Character(){
        
        ImageIcon img = new ImageIcon(getClass().getResource("/resources/version2/none.png"));
        character = img.getImage();
        
        blockX = 1;
        blockY = 1;
    }
    
    public Image getCharacter(){
        return character;
    }
    
    public int getBlockX(){
        return blockX;
    }
    
    public int getBlockY(){
        return blockY;
    }
    
    public void move(int dx, int dy){
        
        blockX += dx;
        blockY += dy;  
    }
}
