package lab2;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {

    private NameService nameService;

    public InputOutputGui() {
        nameService = new NameService();
    }

    public void startConversation() throws IllegalArgumentException {

        String lastName = "";

        while (lastName.isEmpty()) {
            String fullName = JOptionPane.showInputDialog("Enter full name:");
            try {
                lastName = nameService.extractLastName(fullName);

            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "Please enter a correct name format");
            }
        }
        String msg = "Your Last name is:" + lastName;
        JOptionPane.showMessageDialog(null, msg);

    }

}
