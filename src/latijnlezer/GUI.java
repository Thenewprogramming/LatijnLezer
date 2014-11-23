/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latijnlezer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Reijer
 */
public class GUI extends JFrame{
    
    public static void main(String[] args) {
        
        new GUI();
    }
    
    public GUI(){
        //JFrame guiFrame = new JFrame();
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Example GUI");
        this.setSize(350,250);
        this.setLocationRelativeTo(null);
        this.setResizable(true);
        this.setLayout(null);
        
        final JTextField wordField = new JTextField();
        wordField.setSize(300, 100);
        wordField.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_ENTER){
                    Main.HandleInput(wordField.getText());
                    System.out.println("Enter pressed!");
                }
                else if(e.getKeyCode()==KeyEvent.VK_ESCAPE){
                    System.exit(0);
                }
            }
        });
        
        JButton submitButton = new JButton("Submit");
        submitButton.setSize(300, 100);
        submitButton.setLocation(0, 100);
        submitButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               Main.HandleInput(wordField.getText());
               System.out.println("Button pressed!");
            }
        });
        
        this.add(wordField);
        this.add(submitButton);
        this.setVisible(true);
    }
}
