public class Apple {
    private int xCoor, yCoor, width, height;
    
    public Apple(int xCoor, int yCoor, int tileSize) {
        this.xCoor = xCoor;
        this.yCoor = yCoor;
        width = tileSize;
        height = tileSize;
    }
    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(xCoor * width , yCoor * height, width, height);
    }
    
}
