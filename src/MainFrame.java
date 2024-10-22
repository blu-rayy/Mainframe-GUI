import java.awt.event.*;
import javax.swing.*;

public class MainFrame extends JFrame implements ActionListener {

    private final JMenuBar mb = new JMenuBar();

    private final JMenu file = new JMenu("File");
    private final JMenu about = new JMenu("About");
    private final JMenu extra = new JMenu("Extra");

    private final JMenuItem newItem = new JMenuItem("New File");
    private final JMenuItem exitItem = new JMenuItem("Exit");
    private final JMenuItem aboutItem = new JMenuItem("See Details");

    public MainFrame(){

        setTitle("Title of GUI");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        // if no EXIT_ON_CLOSE it will be unable to close

        mb.add(file);
        mb.add(about);

        about.add(aboutItem);
        

        file.setMnemonic('F'); // ALT + F to access F menu Item
        exitItem.setMnemonic('X');
        newItem.setMnemonic('N');

        file.add(newItem);
        file.add(extra);
        file.addSeparator(); // highlight on selecting item
        file.add(exitItem);

        setJMenuBar(mb);

        exitItem.addActionListener(this);
        newItem.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == exitItem){
            dispose(); //exits program
        }
        else if(e.getSource() == newItem){
            System.out.println("New File Opened");
            JOptionPane.showMessageDialog(this, "You have Created a New Item");
        }
    }
}

//kissy face kissy face sent through the phone