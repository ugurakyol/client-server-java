import javax.swing.*;
import java.awt.*;

public class SetConfiguration extends JFrame {

    private JButton STARTSERVERButton;
    private JTextField USERNANETextField;
    private JTextField IPADDRESSTextField;
    private JTextField PORTTextField;
    private JButton CONNECTTOSERVERButton;
    private JPanel MainPanel;
    private JPanel FormPanel;

    public SetConfiguration(){
        initComponents();
    }

    public void initComponents() {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(500, 370);
        setTitle("Message Application ~ Server-Client System");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel background = new JLabel(new ImageIcon("/home/akyol/Documents/MessageApplication/src/Images/backgroud1.jpg"));
        add(background);
        background.setLayout(new BorderLayout());
        background.add(MainPanel);
        FormPanel.setBackground(new Color(255, 255, 255,100));
        setVisible(true);
    }

}
