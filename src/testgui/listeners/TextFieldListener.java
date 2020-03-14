package testgui.listeners;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import testgui.MyJTextField;
import testgui.TestGUI;

public class TextFieldListener implements FocusListener {
    private MyJTextField field;
    
    public TextFieldListener(MyJTextField field){
        this.field = field;
    }

    @Override
    public void focusGained(FocusEvent e) {
        if(field.getText().equals(TestGUI.INPUTNUM)){
            field.setText("");
            field.setForeground(Color.BLACK);
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if(field.getText().equals("")){
            field.setText(TestGUI.INPUTNUM);
            field.setForeground(Color.gray);
        }
    }
    
}
