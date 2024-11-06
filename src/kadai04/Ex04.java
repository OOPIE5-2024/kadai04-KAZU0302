package kadai04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Ex04 {

  private JFrame frame;
  private JPanel panel_1;
  private JButton btnNewButton_3;
  private JButton btnNewButton_4;
  private JButton btnNewButton_5;
  private JButton btnNewButton_6;
  private JButton btnNewButton_7;
  private JButton btnNewButton_8;
//  private CurrentColor crrntBckColor = new CurrentColor();
  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Ex04 window = new Ex04();
          window.frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public Ex04() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 450, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JPanel panel = new JPanel();
    CurrentColor crnntBckColor = new CurrentColor();
    frame.getContentPane().add(panel, BorderLayout.NORTH);
    
    
   
    btnNewButton_6 = new JButton("Red");
    btnNewButton_6.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Color a = crnntBckColor.changeRed();
        panel_1.setBackground(a);
      }
    });
    panel.add(btnNewButton_6);
    
    
    btnNewButton_7 = new JButton("Blue");
    btnNewButton_7.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Color b = crnntBckColor.changeBlue();
        panel_1.setBackground(b);
      }
    });
    
    panel.add(btnNewButton_7);
    
    btnNewButton_8 = new JButton("Green");
    btnNewButton_8.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Color c = crnntBckColor.changeGreen();
        panel_1.setBackground(c);
      }
    });
    panel.add(btnNewButton_8);
    
    panel_1 = new JPanel();
    frame.getContentPane().add(panel_1, BorderLayout.CENTER);
  }

}
