import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class Converter {

    JTextField userInput = new JTextField(8);
    String userWord = "";

    JFrame frame = new JFrame();

    public Converter() {

        

        JButton button = new JButton();
        button.addActionListener( (e) -> {
            submitAction();
        });

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(userInput);
        panel.add(button);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Binary to Decimal Calculator");
        frame.pack();
        frame.setVisible(true);

    }

    private void submitAction() {
        userWord = userInput.getText();
    }

    public static void main(String[] args) {
        new Converter();
    }
}
