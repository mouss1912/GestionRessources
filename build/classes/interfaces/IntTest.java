/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.TextField;
import java.awt.event.*;
import javafx.scene.input.KeyCode;
import javax.swing.*;

/**
 *
 * @author M-D
 */
public class IntTest extends JFrame {
    JScrollPane sPane;
    JPanel boutonPane;
    int i=0;

    /**
     * Creates new form Interface
     */
    public IntTest() {
        this.setTitle("CardLayout");
        this.setSize(300, 120);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        boutonPane = new JPanel();
        sPane = new JScrollPane();
        JButton bouton = new JButton("Contenu suivant");
        //Définition de l'action du bouton
        bouton.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent event){
            //Via cette instruction, on passe au prochain conteneur de la pile
            ader();
              System.out.println(".actionPerformed()");
          }
        });
        JPanel p = new JPanel();
        p.add(bouton);
        boutonPane.add(p);
        boutonPane.setLayout(new BoxLayout(boutonPane, BoxLayout.Y_AXIS));
        sPane.setViewportView(boutonPane);
        //On définit le layout

        this.getContentPane().add(sPane);
        this.setVisible(true);
    }

    public void ader(){
        TextField bouton = new TextField("Contenu suivant " + i);
        i++;
        JPanel p = new JPanel();
        p.add(bouton);
        boutonPane.add(p);
        this.setVisible(true);
    }

}
