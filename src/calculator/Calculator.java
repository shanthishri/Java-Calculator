/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code="Calculator" width=400 height=400>
</applet>
 */
/**
 *
 * @author macintosh
 */
public class Calculator extends Applet implements ActionListener {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
    // TODO code application logic here
    TextField tf1;
    Button buttonArray[] = new Button[19];
    String labels[] = {"1","2","3","/","4","5","6","*","7","8","9","%","0","+","-","=","sqrt",".","clr"};
    int a, b, c;
    String str, s;

    public void init() {
        tf1 = new TextField(10);
        Panel p1 = new Panel(new GridLayout(5, 4));
        p1.setFont(new Font("calibri", Font.BOLD, 20));

        for (int i = 0; i < buttonArray.length; i++) {
            buttonArray[i] = new Button(labels[i]);
            p1.add(buttonArray[i]);
            
        }

        setLayout(new BorderLayout());
        add(p1, BorderLayout.CENTER);
        add(tf1, BorderLayout.NORTH);
        
        for (int i = 0; i < buttonArray.length; i++) {
            buttonArray[i].addActionListener(this);
        }

        setSize(200, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        str = ae.getActionCommand();

        try {
            if (str.equals("1") || str.equals("2") || str.equals("3") || str.equals("4") || str.equals("5") || str.equals("6") || str.equals("7") || str.equals("8") || str.equals("9") || str.equals("0")) {
                tf1.setText(tf1.getText() + str);
            }

            if (str.equals("/")) {
                a = Integer.parseInt(tf1.getText());
                s = "/";
                tf1.setText("");
            }
            if (str.equals("*")) {
                a = Integer.parseInt(tf1.getText());
                s = "*";
                tf1.setText("");
            }
            if (str.equals("%")) {
                a = Integer.parseInt(tf1.getText());
                s = "%";
                tf1.setText("");
            }
            if (str.equals("+")) {
                a = Integer.parseInt(tf1.getText());
                s = "+";
                tf1.setText("");
            }
            if (str.equals("-")) {
                a = Integer.parseInt(tf1.getText());
                s = "-";
                tf1.setText("");
            }
            if (str.equals("sqrt")) {
                a = Integer.parseInt(tf1.getText());
                double d = Math.sqrt(Double.parseDouble(tf1.getText()));
                tf1.setText(d+"");
            }

            if (str.equals("=")) {
                System.out.println(tf1.getText());
                b = Integer.parseInt(tf1.getText());
                if (s.equals("/")) {
                    c = a / b;
                }

                if (s.equals("*")) {
                    c = a * b;
                }

                if (s.equals("%")) {
                    c = a % b;
                }

                if (s.equals("+")) {
                    c = a + b;
                }

                if (s.equals("-")) {
                    c = a - b;
                }
                tf1.setText(String.valueOf(c));
            }
            if (str.equals("clr")) {
                tf1.setText("");
            }
        } catch (NumberFormatException e) {
        }
    }
}
//}
