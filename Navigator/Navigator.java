/*
 * Navigator
 * 
 * Dawid Ambroziak , 2015
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Navigator extends JFrame {
    private JLabel centerLabel;
    private JButton leftButton;
    private JButton rightButton;
    private JButton upButton;
    private JButton downButton;
    public Navigator() {
        // creates the JFrame
        super("Navigator");
        
        // get the container object
        Container con = getContentPane();
        
        // set the layout of the container object
        con.setLayout(new BorderLayout());
        
        // now add the buttons
        centerLabel = new JLabel("center"); 
        add(centerLabel, BorderLayout.CENTER);
        
   
        leftButton = new JButton("Left");
        add(leftButton, BorderLayout.WEST);
        leftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            centerLabel.setText("Going Left!");
            
        
            }
        });
        
        upButton = new JButton("Up");
        add(upButton, BorderLayout.NORTH);
        upButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            centerLabel.setText("Going Up!");
            
        
            }
        });
        
        downButton = new JButton("Down");
        add(downButton, BorderLayout.SOUTH);
        downButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            centerLabel.setText("Going Down!");
            
        
            }
        });
        
        rightButton = new JButton("Right");
        add(rightButton, BorderLayout.EAST);
        rightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            centerLabel.setText("Going Right!");
            
        
            }
        });

        
        // pressing the close button should exit the application
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Causes this Window to be sized to fit the preferred size
        // and layouts of its subcomponents
        con.setPreferredSize(new Dimension(400, 400));
        con.setMinimumSize(new Dimension(400, 400));
        pack();
        
        // shows the window
        setVisible(true);
    }
  
    public static void main(String args[]){
        Navigator navigator = new Navigator();
    }
}