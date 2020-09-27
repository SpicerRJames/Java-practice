import java.awt.Color;
import java.awt.Graphics;

public class BodyPart {

    private int xCoor, yCoor, width, height;

    //Constructor for the Body
    public BodyPart(int xCoor, int yCoor, int tileSize) {
        this.xCoor = xCoor;
        this.yCoor = yCoor;
        width = tileSize;
        height = tileSize;

    }

    public void tick(){

    }

    public void draw(Graphics g){
        g.setColor(Color.YELLOW);
        g.fillRect(xCoor * width, yCoor * height, width, height);
    }
    
}
