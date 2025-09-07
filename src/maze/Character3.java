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

public class Character3 {
    
    private int blockX3, blockY3;
    
    private Image character3;
    
    public Character3(){
        
        ImageIcon img3 = new ImageIcon(getClass().getResource("/resources/version2/blue.png"));
        character3 = img3.getImage();
        
        blockX3 = 1;
        blockY3 = 1;
    }
    
    public Image getCharacter3(){
        return character3;
    }
    
    public int getBlockX3(){
        return blockX3;
    }
    
    public int getBlockY3(){
        return blockY3;
    }
    
    public void move(int dx, int dy){
        
        blockX3 += dx;
        blockY3 += dy;  
    }
}