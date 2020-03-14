package testgui;
import javax.swing.ImageIcon;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import javax.swing.JFrame;

public class MyJframe extends JFrame {
    private Image icon = new ImageIcon(getClass().getResource("/images/icon.png")).getImage();
    public MyJframe(String title, int width, int height){
        super(title);
        super.setSize(width, height);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(new FlowLayout());
        super.setIconImage(icon);
        
    }
    
    public MyJframe(String title, int width, int height, Component comp){
        this(title, width, height);
        super.getContentPane().add(comp);
    }
     public MyJframe(String title, int width, int height, LayoutManager layout){
        super(title);
        super.setSize(width, height);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(layout);
        super.setIconImage(icon);
 
    }
}
