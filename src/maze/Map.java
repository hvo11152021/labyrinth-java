/*
This class is response for getting images to make the maze from the game's
resource folder. Within class Map, Scanner is declared as m to read letters
within Map.text to load up images within the same folder. An array is made to
hold more than one varible, since 14 tiles is the limit. Image variables like
floor, exit and wall are declared, and will be set with an image value collected
from the resource folder. Then using images method to return each variable.  
The program will try to new the open Map.txt, but will displace an error message
if the file is failed to be open. To read the file, a for loop was made to loop
through every 14 characters within a row, and as value of i increases by one,
the next row is up to read, until all 14 rows are read through.
*/
package maze;

import java.awt.*;
import javax.swing.ImageIcon;

public final class Map {
    
    //new changes to load the map directly without reading the file
    private String Map[] = {
        "wwwwwwwwwwwwww",
        "wffffffffffffw",
        "wwwwwwwwwwwwfw",
        "wffffffffffwfw",
        "wfwwwwfwwwwwfw",
        "wfwffffffffffw",
        "wfwfwfwwwwwwfw",
        "wfwfwffffffwfw",
        "wfwfwwwwwwfwfw",
        "wwwfwefffwfwfw",
        "wfffwwwwfwfwfw",
        "wfwwwffwfwfwww",
        "wfffwffffffffw",
        "wwwwwwwwwwwwww"
    };
    
    private Image floor;
    private Image exit;
    private Image wall;
    
    public Map() {
        floor = loadImage("/resources/version2/floor.png", "floor");
        wall = loadImage("/resources/version2/wall.png", "wall");
        exit = loadImage("/resources/version2/exit.png", "exit");
    }
    
    private Image loadImage(String path, String name) {
        try {
            java.net.URL url = getClass().getResource(path);
            if (url == null) {
                System.err.println("Error: " + name + " image not found at " + path);
                return null; // or return a default placeholder image
            }
            return new ImageIcon(url).getImage();
        } catch (Exception e) {
            System.err.println("Error loading " + name + " image: " + e.getMessage());
            return null; // fail gracefully
        }
    }
    
    public Image makeFloor(){
        return floor;
    }
    
    public Image makeWall(){
        return wall;
    }
    
    public Image makeExit(){
        return exit;
    }
    
    public String getMap(int x, int y){
        return Map[y].substring(x, x + 1);
    }
}

