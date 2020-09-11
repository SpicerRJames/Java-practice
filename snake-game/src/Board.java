import javax.swing.JFrame;

public class Board {

    public Board() {
        Game game = new Game();

        JFrame frame = new JFrame();
        frame.add(game);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Sanke Game");
        frame.setLocationRelativeTo(null);

        frame.pack();
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        new Board();
    }
}
