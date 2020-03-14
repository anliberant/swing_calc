package testgui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ButtonListener implements ActionListener {
    private JPanel panel;
    public ButtonListener(JPanel panel){
    this.panel = panel;
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof JButton){
            JButton btn = (JButton)e.getSource();
            JOptionPane.showMessageDialog(panel, "Text message from " +btn.getText());
        }
    }
    
}
