package testgui;

import testgui.listeners.SkinActionListener;
import com.jtattoo.plaf.aero.AeroLookAndFeel;
import com.jtattoo.plaf.smart.SmartLookAndFeel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import testgui.listeners.TextFieldListener;

public class TestGUI extends JFrame {
    public static final String INPUTNUM = "input a number";
    private JButton btnAdd;
    private JButton btnSubtract;
    private JButton btnDivide;
    private JButton btnMultiply;
    private JButton btnDefaultSkin;
    private JButton btnChangeSkin;
    
    private JLabel labelNum1;
    private JLabel labelNum2;
    private JLabel labelResult;
    
    private MyJTextField fieldNum1;
    private MyJTextField fieldNum2;
    private MyJTextField fieldResult;
    
    private MyJPanel panel1;
    private MyJPanel panel2;
    private MyJPanel panel3;
    
    private MyJframe frame;
    
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new AeroLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TestGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        JFrame.setDefaultLookAndFeelDecorated(true);

        TestGUI test = new TestGUI();
        test.createLabels();
        test.createTextFields();
        test.createButtons();
        test.createPanels();
        test.createFrame();
    }
    
    private void createLabels(){
        labelNum1 = new JLabel("Number 1");
        labelNum2 = new JLabel("Number 2");
        labelResult = new JLabel("Result");
    }
    
      private void createTextFields(){
        fieldNum1 = new MyJTextField(INPUTNUM, 10);
        fieldNum2 = new MyJTextField(INPUTNUM, 10);
        fieldResult = new MyJTextField(15, Color.RED);
        fieldResult.setEditable(false);
        fieldResult.setFocusable(false);
        addTextFieldListeners();
    }
      
    private void createButtons(){
        btnAdd = new MyJButton("Add");
        btnSubtract = new MyJButton("Subtract");
        btnDivide = new MyJButton("Divide");
        btnMultiply = new MyJButton("Multiply");
        btnDefaultSkin = new MyJButton("default skin");
        btnChangeSkin = new MyJButton("change skin");
        addButtonListeners();
    }
 
    private void createPanels(){
        panel1 = new MyJPanel("panel1", 100, 100);
        panel1.setPreferredSize(new Dimension(200, 50));
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        panel2 = new MyJPanel("panel2", 100, 100);
        panel2.setPreferredSize(new Dimension(200, 50));
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        panel3 = new MyJPanel("panel2", 100, 100);
        panel3.setPreferredSize(new Dimension(200, 50));
        panel3.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        panel1.add(labelNum1);
        panel1.add(fieldNum1);
        panel1.add(labelNum2);
        panel1.add(fieldNum2);
        
        panel2.add(btnAdd);
        panel2.add(btnSubtract);
        panel2.add(btnMultiply);
        panel2.add(btnDivide);
        
        panel3.add(labelResult);
        panel3.add(fieldResult);
        panel3.add(btnDefaultSkin);
        panel3.add(btnChangeSkin);
       
    }
    private void createFrame(){
        frame = new MyJframe("Calculator", 430, 200, new BorderLayout(2, 2));
        frame.setMinimumSize(new Dimension(430, 200));
        frame.setResizable(false);
        
        frame.getContentPane().add(panel1, BorderLayout.NORTH);
        frame.getContentPane().add(panel2, BorderLayout.CENTER);
        frame.getContentPane().add(panel3, BorderLayout.SOUTH);
        skinListener();
        frame.setVisible(true);
    }
    
    private void addButtonListeners(){
        testgui.listeners.CalcButtonActionListener btnListener = new testgui.listeners.CalcButtonActionListener(fieldNum1, fieldNum2, fieldResult);
        
        btnAdd.addActionListener(btnListener);
        btnSubtract.addActionListener(btnListener);
        btnDivide.addActionListener(btnListener);
        btnMultiply.addActionListener(btnListener);
       // skin.addActionListener(btnListener);
    }
    private void addTextFieldListeners(){
        fieldNum1.addFocusListener(new TextFieldListener(fieldNum1));
        fieldNum2.addFocusListener(new TextFieldListener(fieldNum2));
    }
    private void skinListener(){
        btnDefaultSkin.addActionListener(new SkinActionListener(new SmartLookAndFeel(), frame));
        btnChangeSkin.addActionListener(new SkinActionListener(new AeroLookAndFeel(), frame));
    }
}