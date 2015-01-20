import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by peter on 19/01/15.
 */
public class TaskApp {
    private JButton button1;
    private JPanel panel1;

    public TaskApp() {
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Button pushed!");
            }
        });
    }
}
