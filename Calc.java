mport java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Calc extends Applet implements ActionListener {
    TextField t1;
    double arg = 0;
    String op = "=";
    boolean start = true;

    public void init()
    {
        setLayout(new BorderLayout());
        t1 = new TextField("0");
        add(t1, BorderLayout.NORTH);
        Panel p = new Panel();
        p.setLayout(new GridLayout(4, 4));
        String buttons = "123/456*789-0.+=";
        for (int i = 0; i < buttons.length(); i++) 
        {
            Button b = new Button(buttons.substring(i, i + 1));
            p.add(b);
            b.addActionListener(this);
        }
        add(p);
    }

    public void actionPerformed(ActionEvent ae) {
        String s = ae.getActionCommand();
        if ('0' <= s.charAt(0) && s.charAt(0) <= '9' || s.equals(".")) {
            if (start) {
                t1.setText(s);
            }
            else {
                t1.setText(t1.getText() + s);
                start = false;
            }
        } 
        else {
            calcu(Double.parseDouble(t1.getText()));

            op = s;
            start = true;
        }
    }

    public void calcu(Double n) {
        if (op.equals("+")) {
            arg += n;
        } else if (op.equals("-")) {
            arg -= n;
        } else if (op.equals("*")) {
            arg *= n;
        } else if (op.equals("/")) {
            try {
                arg /= n;
            } catch (ArithmeticException e) {
                t1.setText("ARITHMETIC EXCEPTION");
            }
        } else if (op.equals("=")) {
            arg = n;
            
        }
        t1.setText("" + arg);
    }
}


           
