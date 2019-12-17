package lab16;

import java.awt.*;
import javax.swing.*;

public class MyJFrame extends JFrame {
    private static final int F_WIDTH = 300;
    private static final int F_HEIGHT = 200;
    private static final int F_XORIGIN = 150;
    private static final int F_YORIGIN = 250;
    
    JLabel lName, lAge, lCgpa;
    private JButton cancelButton;
    private JButton okButton;
    
    public MyJFrame(){
        setTitle("My JFrame Class");
        setSize (F_WIDTH, F_HEIGHT);
        setLocation (F_XORIGIN, F_YORIGIN);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        changeBackColor();
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.setLayout(new GridLayout(4, 2));
        
        lName = new JLabel();
        lName.setText("Name: ");
        lAge = new JLabel();
        lAge.setText("Age: ");
        lCgpa = new JLabel();
        lCgpa.setText("CGPA: ");
        okButton = new JButton("OK");
        cancelButton = new JButton("Cancel");
        okButton.setSize(80, 30);
        cancelButton.setSize(80, 30);
        
        contentPane.add(lName);
        contentPane.add(lAge);
        contentPane.add(lCgpa);
        contentPane.add(okButton);
        contentPane.add(cancelButton);
    }

    private void changeBackColor() {
        Container contentPane = getContentPane();
        contentPane.setBackground(Color.WHITE);
    }

    
}
