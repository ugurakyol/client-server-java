import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        STARTSERVERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null,"Server is started successfully","Server status",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        CONNECTTOSERVERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                JOptionPane.showMessageDialog(null,"Client is connected to server successfully","Client status",JOptionPane.INFORMATION_MESSAGE);

            }
        });
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
