package interfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.util.*;
import javafx.scene.input.KeyCode;
import javax.swing.*;
import static javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
import javax.swing.tree.DefaultTreeCellRenderer;


public class Exemple15 { 
 
  private JTextArea text, area; 
 
  public Exemple15() {     
    JFrame frame = new JFrame("exemple");     
    frame.addWindowListener(new MyWindowListener()); 
 
    text = new JTextArea();     
    text.setEditable(false); 
 
    JWindow window = new JWindow(frame);     
    JPanel panel = new JPanel(new BorderLayout());     
    panel.add(text, BorderLayout.CENTER);     
    JScrollPane scroll = new JScrollPane(panel);     
    window.getContentPane().add(scroll); 
 
    JPanel panel2 = new JPanel(new BorderLayout());     
    area = new JTextArea();     
    panel2.add(area, BorderLayout.CENTER); 
 
    JPanel panel3 = new JPanel(new BorderLayout());     
    JButton button = new JButton("Envoyer");     
    panel3.add(new JScrollPane(panel2), BorderLayout.CENTER);     
    panel3.add(button, BorderLayout.SOUTH); 
 
    button.addActionListener(new MyActionListener()); 
 
    frame.getContentPane().add(panel3);
    frame.setSize(200, 200);     
    window.setSize(200, 200);     
    frame.setLocation(0, 0);
    window.setLocation(400, 0);     
    frame.show();     
    window.show();   
  } 
  
 
  private class MyWindowListener extends WindowAdapter {     
    public void windowClosing(WindowEvent event) {       
      System.exit(0);     
    }   
  } 
 
  private class MyActionListener implements ActionListener {     
    public void actionPerformed(ActionEvent event) {       
      text.append(area.getText() + "\n");       
      area.setText("");     
    }   
  } 
 
  public static void main(String[] args) {     
      new Exemple15();   
    } 
  } 
 
 