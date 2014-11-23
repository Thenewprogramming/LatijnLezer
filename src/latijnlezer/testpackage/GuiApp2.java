/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latijnlezer.testpackage;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Reijer
 */
public class GuiApp2 {
    
    public static void main(String[] args) {
        
        new GuiApp2();
    }
    
    public GuiApp2(){
        JFrame guiFrame = new JFrame();
        
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setTitle("Example GUI");
        guiFrame.setSize(300,250);
        guiFrame.setLocationRelativeTo(null);
        
        JTextField wordField = new JTextField();
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
                    
                }
            }
        });
        
        JButton submitButton = new JButton("Submit");
        
        
        guiFrame.add(wordField);
        guiFrame.setVisible(true);
    }
}
