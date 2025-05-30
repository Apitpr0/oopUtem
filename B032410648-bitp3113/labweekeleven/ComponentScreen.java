

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 * BITP 3113 Object Oriented Programming
 * 
 * This class loads common GUI components used in Java desktop application.
 * 
 * @author Emaliana Kasmuri, FTMK UTeM
 * 
 */
public class ComponentScreen extends JFrame {

	// Private GUI components declaration
	private JTextField txtName;
	private JButton btnSave;
	private JPasswordField txtPassword;
	private JCheckBox cbSalad, cbWhippedPotato, cbColeslaw;
	private JRadioButton rbRibEye, rbTBone, rbSirloin, rbTomahawk; 
	private JComboBox<String> cbGravy;
	private JList<String> lstDoneness;
	
	public ComponentScreen () {

		// Set frame title
		this.setTitle("Understanding Common Java Components");

		// Set frame dimension
		this.setSize(800, 400);

		//This is the code to display the app in the center of the screen
		this.setLocationRelativeTo(null);

		// This frame will close when user click on X from the frame
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		// Override the default layout, from BorderLayout to GridLayout
		this.setLayout(new GridLayout(9, 1));

		// Load Java GUI components
		loadComponentPanels();

		// Set frame visibility on screen
		this.setVisible(true);

	}
	
	/**
	 * This method loads component panels
	 */
	private void loadComponentPanels() {

		// Load label panel
		JPanel labelPanel = loadLabelPanel();
		this.add(labelPanel);


		// Load text field panel
		JPanel textFieldPanel = loadTextFieldPanel ();
		this.add(textFieldPanel);

		// Load JPasswordField
		JPanel passwordFieldPanel = loadPasswordField();
		this.add(passwordFieldPanel);

		// Load button panel
		JPanel buttonPanel = loadButtonPanel();
		this.add(buttonPanel);
		
		// Load check boxes panel
		JPanel chexkboxesPanel = loadCheckboxesPanel();
		this.add(chexkboxesPanel);
		
		// Load radio buttons panel
		JPanel radioButtonsPanel = loadRadioButtons();
		this.add(radioButtonsPanel);
		
		// Load combo box panel
		JPanel comboBoxPanel = loadComboBox();
		this.add(comboBoxPanel);
		
		// Load list box panel
		JPanel listBoxPanel = loadListBox();
		this.add(listBoxPanel);
		
	}
	
	private JPanel loadListBox () {
		
		// Define list box data
		String doneness[] = {"Very Rare", "Rare", "Medium Rare", "Medium", 
			"Medium Well", "Well Done"};
		
		// Create list box and load data
		lstDoneness = new JList<String>(doneness);
		
		// Set default selection
		lstDoneness.setVisibleRowCount(3);
		
		// Add scroller
		JScrollPane listScroller = new JScrollPane(lstDoneness);
		listScroller.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		// Create a label object
		String text = "List -> ";
		JLabel label = new JLabel(text);
		
		
		// Add to panel
		JPanel panel = new JPanel();
		panel.add(label);
		panel.add(listScroller);

		return panel;
		
		
	}
	
	/**
	 * This method creates a combo box and place it in a panel
	 * @return
	 */
	private JPanel loadComboBox() {
		
		// Define combo box data
		String gravy[] = {"Black Pepper", "Barbeque", "Mushroom"};
		
		// Create combo box object and load data
		cbGravy = new JComboBox<String>(gravy);
		
		// Set default selection
		cbGravy.setSelectedIndex(gravy.length - 1);
		
		// Create a label object
		String text = "Combo box -> ";
		JLabel label = new JLabel(text);

		// Add to panel
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel.add(label);
		panel.add(cbGravy);
		
		return panel;
	}
	
	/**
	 * This method display a group of radio buttons in a panel.
	 * 
	 * @return
	 */
	private JPanel loadRadioButtons() {
		
		// Create a label object
		String text = "Inline radio buttons -> ";
		JLabel label = new JLabel(text);
		
		// Create radio buttons
		rbRibEye = new JRadioButton("Rib Eye");
		rbTBone = new JRadioButton("T-Bone");
		rbSirloin = new JRadioButton("Sirloin");
		rbTomahawk = new JRadioButton("Tomahawk");
		
		// Group the radio buttons to allow only one option to be selected
		ButtonGroup group = new ButtonGroup();
		group.add(rbRibEye);
		group.add(rbSirloin);
		group.add(rbTomahawk);
		group.add(rbTBone);
		
		// Add radio buttons to panel - override alignment
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel.add(label);
		panel.add(rbRibEye);
		panel.add(rbTBone);
		panel.add(rbSirloin);
		panel.add(rbTomahawk);
		
		return panel;
		
	}
	
	/**
	 * This method creates and places a label and three check boxes in a panel.
	 * 
	 * @return
	 */
	private JPanel loadCheckboxesPanel () {
		
		// Create a label object
		String text = "Inline Checkboxes -> ";
		JLabel label = new JLabel(text);
		label.setOpaque(true);
		label.setBackground(Color.WHITE);
		label.setForeground(Color.DARK_GRAY);
		
		// Create check box objects
		cbSalad = new JCheckBox("Salad");
		cbWhippedPotato = new JCheckBox("Whipped Potato");
		cbColeslaw = new JCheckBox("Coleslaw");
		
		// Override text color
		cbSalad.setForeground(Color.GREEN);
		cbWhippedPotato.setForeground(Color.YELLOW);
		cbColeslaw.setForeground(Color.MAGENTA);
		
		// Add to panel
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel.add(label);
		panel.add(cbSalad);
		panel.add(cbWhippedPotato);
		panel.add(cbColeslaw);
		
		// Override panel color - using Java defined color
		panel.setBackground(Color.BLACK);
		
		return panel;
	}
	
	/**
	 * This method creates a panel with a label and a password field
	 * @return
	 */
	private JPanel loadPasswordField() {

		// Create a label object
		String text = "Password field  -> ";
		JLabel label = new JLabel(text);
		
		// Create password field object
		txtPassword = new JPasswordField(20);
		
		// Add to panel object
		JPanel panel = new JPanel();
		panel.add(label);
		panel.add(txtPassword);

		return panel;
	}

	/**
	 * This method creates a panel with a label and a button
	 */
	private JPanel loadButtonPanel () {

		// Create a label object
		String text = "Button -> ";
		JLabel label = new JLabel(text);

		// Create a button object
		btnSave = new JButton("Save");

		// Add to panel object - using default alignment
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel.add(label);
		panel.add(btnSave);

		//add button color
		btnSave.setBackground(new Color(0,150,136));
		btnSave.setForeground(Color.WHITE);

		return panel;

	}


	/**
	 * This method creates a panel with a label and text field
	 */
	private JPanel loadTextFieldPanel () {

		// Create a label object
		String text = "TextField ->";
		JLabel label = new JLabel(text);

		// Create a text field to accept text
		txtName = new JTextField(20);

		// Add to panel, override alignment
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panel.add(label);
		panel.add(txtName);
		
		// Override default color using system defined color
		panel.setBackground(Color.WHITE);

		return panel;

	}

	/**
	 * This method a panel with a label
	 */
	private JPanel loadLabelPanel () {

		// Create a label object
		String text = "This is a label, to display a text.";
		JLabel label = new JLabel(text);

		// Add to panel
		JPanel panel = new JPanel();
		panel.add(label);

		return panel;

	}


}






