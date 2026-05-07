import javax.swing.*;
import java.awt.*;
public class StudentForm extends JFrame {

    private JTextField firstNameField, lastNameField, ageField;
    private JRadioButton maleRadio, femaleRadio;
    private JComboBox<String> facultyCombo, semesterCombo;
    private JTextArea remarksArea;
    private JButton submitButton;

    public StudentForm() {
        // Frame Setup
        setTitle("Amrit Science Campus - Student Registration");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center on screen

        // Use GridBagLayout for a structured form
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Spacing
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // --- Form Components ---

        // a) First Name
        addComponent(new JLabel("First Name:"), 0, 0, gbc);
        firstNameField = new JTextField(15);
        addComponent(firstNameField, 0, 1, gbc);

        // b) Last Name
        addComponent(new JLabel("Last Name:"), 1, 0, gbc);
        lastNameField = new JTextField(15);
        addComponent(lastNameField, 1, 1, gbc);

        // c) Age
        addComponent(new JLabel("Age:"), 2, 0, gbc);
        ageField = new JTextField(15);
        addComponent(ageField, 2, 1, gbc);

        // d) Gender (Radio Buttons)
        addComponent(new JLabel("Gender:"), 3, 0, gbc);
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        maleRadio = new JRadioButton("Male");
        femaleRadio = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);
        genderPanel.add(maleRadio);
        genderPanel.add(femaleRadio);
        addComponent(genderPanel, 3, 1, gbc);

        // e) Faculty
        addComponent(new JLabel("Faculty:"), 4, 0, gbc);
        String[] faculties = {"Computer Science and Information Technology", "B.Sc", "BIT"};
        facultyCombo = new JComboBox<>(faculties);
        addComponent(facultyCombo, 4, 1, gbc);

        // f) Semester
        addComponent(new JLabel("Semester:"), 8, 0, gbc);
        String[] semesters = {"Semester 1", "Semester 2", "Semester 3", "Semester 4", "Semester 5", "Semester 6", "Semester 7", "Semester 8"};
        semesterCombo = new JComboBox<>(semesters);
        addComponent(semesterCombo, 5, 1, gbc);

        // g) Remarks
        addComponent(new JLabel("Remarks:"), 6, 0, gbc);
        remarksArea = new JTextArea(4, 15);
        remarksArea.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        JScrollPane scrollPane = new JScrollPane(remarksArea);
        addComponent(scrollPane, 6, 1, gbc);

        // Submit Button
        submitButton = new JButton("Submit");
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 2; // Span across two columns
        add(submitButton, gbc);

        // Basic Action Listener
        submitButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Record Submitted Successfully!");
        });
    }

    // Helper method to add components to GridBagLayout
    private void addComponent(Component component, int row, int col, GridBagConstraints gbc) {
        gbc.gridx = col;
        gbc.gridy = row;
        add(component, gbc);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new StudentForm().setVisible(true);
        });
    }
}