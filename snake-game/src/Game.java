import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Game extends JPanel implements Runnable, KeyListener {

    private static final long serialVersionUID = 1L;

    public static final int WIDTH = 500, HEIGHT = 500;

    private Thread thread;
    private boolean running;
    private BodyPart b;
    private ArrayList<BodyPart> snake;

    private int xCoor = 10, yCoor = 10, size = 5;

    public Game() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

        snake = new ArrayList<BodyPart>();

        start();
    }

    public void start() {
        running = true;
        thread = new Thread(this);
        thread.start();
    }

    public void tick() {

    }

    public void paint(Graphics g) {
        g.clearRect(0, 0, WIDTH, HEIGHT);

        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        for (int i = 0; i < WIDTH / 10; i++) {
            g.drawLine(i * 10, 0, i * 10, HEIGHT);
        }

        for (int i = 0; i < HEIGHT / 10; i++) {
            g.drawLine(i * 10, 0, i * 10, WIDTH);
        }
        for(int i = 0; i < snake.size(); i++){
            snake.get(i).draw(g);
        }
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
        while (running) {
            tick();
            repaint();

        }

    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }

}
