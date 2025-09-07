
package maze;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Character4 {
    
    private int blockX4, blockY4;
    
    private Image character4;
    
    public Character4(){
        
        ImageIcon img4 = new ImageIcon(getClass().getResource("/resources/version2/green.png"));
        character4 = img4.getImage();
        
        blockX4 = 1;
        blockY4 = 1;
    }
    
    public Image getCharacter4(){
        return character4;
    }
    
    public int getBlockX4(){
        return blockX4;
    }
    
    public int getBlockY4(){
        return blockY4;
    }
    
    public void move(int dx, int dy){
        
        blockX4 += dx;
        blockY4 += dy;  
    }
}