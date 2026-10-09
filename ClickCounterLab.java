import java.awt.*;
import javax.swing.*; 

public class ClickCounterLab { 
 
    public static void main(String[] args) { 
        SwingUtilities.invokeLater(ClickCounterLab::createAndShowGUI);
    } 
 
    private static void createAndShowGUI() { 
        JFrame frame = new JFrame("Click Counter Lab"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setSize(420, 320);
        frame.setLayout(new BorderLayout(10, 10)); 
 
        JLabel countLabel = new JLabel("Clicks: 0", SwingConstants.CENTER); 
        countLabel.setFont(new Font("SansSerif", Font.BOLD, 28)); 
 
        JButton clickButton = new JButton("Click Me"); 
        JButton resetButton = new JButton("Reset"); 
 
        JPanel buttonPanel = new JPanel(new FlowLayout()); 
        buttonPanel.add(clickButton); 
        buttonPanel.add(resetButton); 
 
        JTextField nameField = new JTextField(15); 
        JLabel greetingLabel = new JLabel("Type your name and press Enter.", SwingConstants.CENTER); 
        JPanel namePanel = new JPanel(new FlowLayout()); 
        namePanel.add(new JLabel("Name:")); 
        namePanel.add(nameField); 
 
        JPanel hoverPanel = new JPanel(); 
        hoverPanel.setBackground(Color.LIGHT_GRAY); 
        hoverPanel.add(new JLabel("Hover over this panel")); 
 
        JPanel top = new JPanel(new GridLayout(2, 1)); 
        top.add(countLabel); 
        top.add(buttonPanel); 
 
        JPanel bottom = new JPanel(new GridLayout(2, 1)); 
        bottom.add(namePanel); 
        bottom.add(greetingLabel); 
 
        frame.add(top, BorderLayout.NORTH); 
        frame.add(hoverPanel, BorderLayout.CENTER); 
        frame.add(bottom, BorderLayout.SOUTH);
        frame.setLocationRelativeTo(null); 
        frame.setVisible(true); 
    } 
}