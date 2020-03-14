package testgui;

import java.awt.Component;
import java.awt.LayoutManager;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class MyJPanel extends JPanel{
     public MyJPanel(String name, int width, int height){
         super.setName(name);
         super.setSize(width, height);
         super.setBorder(BorderFactory.createEtchedBorder());
     }
     public MyJPanel(String name, int width, int height, Component comp){
         this(name, width, height);
         super.add(comp);
     }
     public MyJPanel(String name, int width, int height, LayoutManager layout){
         this(name, width, height);
         super.setLayout(layout);
     }
     public MyJPanel(String name, int width, int height, Component comp, LayoutManager layout){
         this(name, width, height);
         super.add(comp);
         super.setLayout(layout);
     }
}
