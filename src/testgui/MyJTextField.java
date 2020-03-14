package testgui;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

public class MyJTextField extends JTextField {
    public MyJTextField(String text, int colums){
        this(colums);
        super.setText(text);
    }
    public MyJTextField(int colums){
        super.setColumns(colums);
        Font font = new Font("Courier", Font.ITALIC, 12);
        super.setFont(font);
        super.setForeground(Color.GRAY);
    }
    public MyJTextField(int colums, Color textColor){
        super.setColumns(colums);
        Font font = new Font("Courier", Font.ITALIC, 12);
        super.setFont(font);
        super.setForeground(textColor);
    }
}
