package testgui.listeners;

import calc.CalcOperations;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.management.StringValueExp;
import javax.swing.JButton;
import testgui.MyJTextField;

public class CalcButtonActionListener implements ActionListener {
    private MyJTextField fieldNum1;
    private MyJTextField fieldNum2;
    private MyJTextField fieldResult;
    
    public CalcButtonActionListener(MyJTextField fieldNum1, MyJTextField fieldNum2, MyJTextField fieldResult){
        this.fieldNum1 = fieldNum1;
        this.fieldNum2 = fieldNum2;
        this.fieldResult = fieldResult;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(!(e.getSource() instanceof JButton)){
           return;
       }
       JButton btn = (JButton)e.getSource();
       
       final double a = Double.parseDouble(fieldNum1.getText());
       final double b = Double.parseDouble(fieldNum2.getText());
       
       if(btn.getActionCommand().toLowerCase().equals("add")){
          fieldResult.setText(String.valueOf(CalcOperations.add(a, b)));
       } else if (btn.getActionCommand().toLowerCase().equals("subtract")){
           fieldResult.setText(String.valueOf(CalcOperations.subtract(a, b)));
       } else if (btn.getActionCommand().toLowerCase().equals("multiply")){
           fieldResult.setText(String.valueOf(CalcOperations.multiply(a, b)));
       } else if (btn.getActionCommand().toLowerCase().equals("divide")){
           fieldResult.setText(String.valueOf(CalcOperations.divide(a, b)));
       }
    }
    
}
