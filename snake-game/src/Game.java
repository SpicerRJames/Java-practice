import java.awt.Dimension;

import javax.swing.JPanel;

public class Game extends JPanel implements Runnable{
    
    private static final long serialVersionUID = 1L;

    public static final int WIDTH = 500, HEIGHT = 500; 

    private Thread thread;
    private boolean running;

    public Game() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

        start();
    }

    public void start() {
        running = true;
        thread = new Thread(this);
        thread.start();
    }

    public void tick() {

    }
 
    public void stop() {
        running = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while(running) {
            tick();
            repaint();

        }

    }

}
