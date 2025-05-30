import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * DistanceConverter class creates the main GUI window
 * for converting kilometers into inches, feet, or miles.
 *
 * Author: Muhammad Afiq Muhaimin Bin Mohd Zaini, FTMK
 */
public class DistanceConverter extends JFrame {

    // GUI components
    private JTextField txtDistance;
    private JRadioButton rbInches, rbFeet, rbMiles;
    private JButton btnConvert, btnClear;

    // Constructor
    public DistanceConverter() {
        setTitle("Distance Converter Application");
        setSize(500, 250);
        setLayout(new BorderLayout());

        // Add panels
        add(getUserInputPanel(), BorderLayout.NORTH);
        add(getConversionOptionPanel(), BorderLayout.CENTER);
        add(getButtonPanel(), BorderLayout.SOUTH);

        setLocationRelativeTo(null); // Center window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true); // Show window
    }

    /**
     * Creates a panel with label and input text field.
     */
    private JPanel getUserInputPanel() {
        txtDistance = new JTextField(10);
        JLabel lblDistance = new JLabel("Enter distance in kilometer:");

        JPanel panel = new JPanel();
        panel.add(lblDistance);
        panel.add(txtDistance);

        return panel;
    }

    /**
     * Creates a panel with three radio buttons for unit selection.
     */
    private JPanel getConversionOptionPanel() {
        rbInches = new JRadioButton("Convert to inches");
        rbFeet = new JRadioButton("Convert to feet");
        rbMiles = new JRadioButton("Convert to miles");

        ButtonGroup group = new ButtonGroup();
        group.add(rbInches);
        group.add(rbFeet);
        group.add(rbMiles);

        JPanel panel = new JPanel();
        panel.add(rbInches);
        panel.add(rbFeet);
        panel.add(rbMiles);

        return panel;
    }

    /**
     * Creates a panel with Convert and Clear buttons.
     */
    private JPanel getButtonPanel() {
        btnConvert = new JButton("Convert");
        btnClear = new JButton("Clear");

        // Convert button action
        btnConvert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                convertDistance();
            }
        });

        // Clear button action
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtDistance.setText("");
                rbInches.setSelected(false);
                rbFeet.setSelected(false);
                rbMiles.setSelected(false);
            }
        });

        JPanel panel = new JPanel();
        panel.add(btnConvert);
        panel.add(btnClear);

        return panel;
    }

    /**
     * Converts distance from kilometers to selected imperial unit.
     */
    private void convertDistance() {
        try {
            double km = Double.parseDouble(txtDistance.getText());
            double result = 0;
            String unit = "";

            if (rbInches.isSelected()) {
                result = km * 39370.1;
                unit = "inches";
            } else if (rbFeet.isSelected()) {
                result = km * 3280.84;
                unit = "feet";
            } else if (rbMiles.isSelected()) {
                result = km * 0.621371;
                unit = "miles";
            } else {
                JOptionPane.showMessageDialog(this, "Please select a unit to convert.");
                return;
            }

            String message = String.format("%.2f km = %.2f %s", km, result, unit);
            JOptionPane.showMessageDialog(this, message);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid number.");
        }
    }
}
