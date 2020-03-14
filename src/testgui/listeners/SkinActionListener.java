package testgui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class SkinActionListener implements ActionListener {
    private LookAndFeel laf;
    private JFrame frame;
    
    public SkinActionListener(LookAndFeel laf, JFrame frame){
        this.laf = laf;
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            UIManager.setLookAndFeel(laf);
        } catch (UnsupportedLookAndFeelException ex){
            ex.printStackTrace();
        }
        SwingUtilities.updateComponentTreeUI(frame);
    }
    
    
    
}
