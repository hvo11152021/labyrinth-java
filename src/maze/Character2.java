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

public class Character2 {
    
    private int blockX2, blockY2;
    
    private Image character2;
    
    public Character2(){
        
        ImageIcon img2 = new ImageIcon(getClass().getResource("/resources/version2/orange.png"));
        character2 = img2.getImage();
        
        blockX2 = 1;
        blockY2 = 1;
    }
    
    public Image getCharacter2(){
        return character2;
    }
    
    public int getBlockX2(){
        return blockX2;
    }
    
    public int getBlockY2(){
        return blockY2;
    }
    
    public void move(int dx, int dy){
        
        blockX2 += dx;
        blockY2 += dy;  
    }
}