import javax.swing.*;

public class Calculator {
    private JPanel Calculator;
    private JTextField textDisplay;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton a9Button;
    private JButton ACButton;
    private JButton button6;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a0Button;
    private JButton button11;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a00Button;
    private JButton xButton;
    private JButton button17;
    private JButton a6Button;
    private JButton a3Button;
    private JButton button20;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
