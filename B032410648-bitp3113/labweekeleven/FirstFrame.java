import javax.swing.*;

/**
 * This class is used to develop a java window frame
 *
 * @author Muhammad Afiq Muhaimin Bin Mohd Zaini, FTMK
 */

public class FirstFrame extends JFrame {
    //Create a constructor
    public FirstFrame(){
        //call method
        setWindowProperties();
    }
/**
 * This private method sets all the properties of the window
 */
private void setWindowProperties(){
    // Set the title of the window
     super.setTitle("My First Java GUI");

    // Set the size of the window: width = 400, Height = 300
     super.setSize(400, 300);

    // Set the default close operation
     super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Center the window on the screen
     super.setLocationRelativeTo(null);

    // Make the window visible
    super.setVisible(true);

    }
}
