import javax.swing.*;
import java.awt.event.*;

public class Calculator {
    public static double num, ans;
    public static int calculation = 5;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");

        JTextField text1 = new JTextField("");
        text1.setFont(new java.awt.Font("Tahoma", 1, 40));
        text1.setBounds(32, 25, 400, 70);
        frame.add(text1);
        JTextField text2 = new JTextField("");
        text2.setFont(new java.awt.Font("Tahoma", 1, 40));
        text2.setBounds(32, 115, 400, 70);
        frame.add(text2);
        JTextField text3 = new JTextField("0");
        text3.setFont(new java.awt.Font("Tahoma", 1, 40));
        text3.setBounds(32, 205, 400, 70);
        frame.add(text3);

        JButton seven = new JButton("7");
        seven.setFont(new java.awt.Font("Tahoma", 1, 45));
        seven.setBounds(32, 295, 85, 65);
        seven.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text1.setText(text1.getText() + "7");
            }
        });
        JButton eight = new JButton("8");
        eight.setFont(new java.awt.Font("Tahoma", 1, 45));
        eight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text1.setText(text1.getText() + "8");
            }
        });
        eight.setBounds(137, 295, 85, 65);
        JButton nine = new JButton("9");
        nine.setFont(new java.awt.Font("Tahoma", 1, 45));
        nine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text1.setText(text1.getText() + "9");
            }
        });
        nine.setBounds(242, 295, 85, 65);
        JButton add = new JButton("+");
        add.setFont(new java.awt.Font("Tahoma", 1, 45));
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ans = Double.parseDouble(text3.getText());
                num = Double.parseDouble(text1.getText());
                if (calculation == 5) {
                    text2.setText(text1.getText());
                    text3.setText(text1.getText());
                } else if (calculation == 1) {
                    ans = ans + num;
                    text2.setText(text2.getText() + "+" + text1.getText());
                    text3.setText(Double.toString(ans));
                } else if (calculation == 2) {
                    ans = ans - num;
                    text2.setText(text2.getText() + "-" + text1.getText());
                    text3.setText(Double.toString(ans));
                } else if (calculation == 3) {
                    ans = ans * num;
                    text2.setText(text2.getText() + "*" + text1.getText());
                    text3.setText(Double.toString(ans));
                } else if (calculation == 4) {
                    ans = ans / num;
                    text2.setText(text2.getText() + "/" + text1.getText());
                    text3.setText(Double.toString(ans));
                }
                text1.setText("");
                calculation = 1;
            }
        });
        add.setBounds(347, 295, 85, 65);

        JButton four = new JButton("4");
        four.setFont(new java.awt.Font("Tahoma", 1, 45));
        four.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                text1.setText(text1.getText() + "4");
            }
        });
        four.setBounds(32, 380, 85, 65);
        JButton five = new JButton("5");
        five.setFont(new java.awt.Font("Tahoma", 1, 45));
        five.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text1.setText(text1.getText() + "5");
            }
        });
        five.setBounds(137, 380, 85, 65);
        JButton six = new JButton("6");
        six.setFont(new java.awt.Font("Tahoma", 1, 45));
        six.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text1.setText(text1.getText() + "6");
            }
        });
        six.setBounds(242, 380, 85, 65);
        JButton sub = new JButton("-");
        sub.setFont(new java.awt.Font("Tahoma", 1, 45));
        sub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ans = Double.parseDouble(text3.getText());
                num = Double.parseDouble(text1.getText());
                if (calculation == 5) {
                    text2.setText(text1.getText());
                    text3.setText(text1.getText());
                } else if (calculation == 1) {
                    ans = ans + num;
                    text2.setText(text2.getText() + "+" + text1.getText());
                    text3.setText(Double.toString(ans));
                } else if (calculation == 2) {
                    ans = ans - num;
                    text2.setText(text2.getText() + "-" + text1.getText());
                    text3.setText(Double.toString(ans));
                } else if (calculation == 3) {
                    ans = ans * num;
                    text2.setText(text2.getText() + "*" + text1.getText());
                    text3.setText(Double.toString(ans));
                } else if (calculation == 4) {
                    ans = ans / num;
                    text2.setText(text2.getText() + "/" + text1.getText());
                    text3.setText(Double.toString(ans));
                }
                text1.setText("");
                calculation = 2;
            }
        });
        sub.setBounds(347, 380, 85, 65);

        JButton one = new JButton("1");
        one.setFont(new java.awt.Font("Tahoma", 1, 45));
        one.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text1.setText(text1.getText() + "1");
            }
        });
        one.setBounds(32, 465, 85, 65);
        JButton two = new JButton("2");
        two.setFont(new java.awt.Font("Tahoma", 1, 45));
        two.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text1.setText(text1.getText() + "2");
            }
        });
        two.setBounds(137, 465, 85, 65);
        JButton three = new JButton("3");
        three.setFont(new java.awt.Font("Tahoma", 1, 45));
        three.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text1.setText(text1.getText() + "3");
            }
        });
        three.setBounds(242, 465, 85, 65);
        JButton mul = new JButton("*");
        mul.setFont(new java.awt.Font("Tahoma", 1, 45));
        mul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ans = Double.parseDouble(text3.getText());
                num = Double.parseDouble(text1.getText());
                if (calculation == 5) {
                    text2.setText(text1.getText());
                    text3.setText(text1.getText());
                } else if (calculation == 1) {
                    ans = ans + num;
                    text2.setText(text2.getText() + "+" + text1.getText());
                    text3.setText(Double.toString(ans));
                } else if (calculation == 2) {
                    ans = ans - num;
                    text2.setText(text2.getText() + "-" + text1.getText());
                    text3.setText(Double.toString(ans));
                } else if (calculation == 3) {
                    ans = ans * num;
                    text2.setText(text2.getText() + "*" + text1.getText());
                    text3.setText(Double.toString(ans));
                } else if (calculation == 4) {
                    ans = ans / num;
                    text2.setText(text2.getText() + "/" + text1.getText());
                    text3.setText(Double.toString(ans));
                }
                text1.setText("");
                calculation = 3;
            }
        });
        mul.setBounds(347, 465, 85, 65);

        JButton zero = new JButton("0");
        zero.setFont(new java.awt.Font("Tahoma", 1, 45));
        zero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text1.setText(text1.getText() + "0");
            }
        });
        zero.setBounds(32, 550, 85, 65);
        JButton div = new JButton("/");
        div.setFont(new java.awt.Font("Tahoma", 1, 45));
        div.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ans = Double.parseDouble(text3.getText());
                num = Double.parseDouble(text1.getText());
                if (calculation == 5) {
                    text2.setText(text1.getText());
                    text3.setText(text1.getText());
                } else if (calculation == 1) {
                    ans = ans + num;
                    text2.setText(text2.getText() + "+" + text1.getText());
                    text3.setText(Double.toString(ans));
                } else if (calculation == 2) {
                    ans = ans - num;
                    text2.setText(text2.getText() + "-" + text1.getText());
                    text3.setText(Double.toString(ans));
                } else if (calculation == 3) {
                    ans = ans * num;
                    text2.setText(text2.getText() + "*" + text1.getText());
                    text3.setText(Double.toString(ans));
                } else if (calculation == 4) {
                    ans = ans / num;
                    text2.setText(text2.getText() + "/" + text1.getText());
                    text3.setText(Double.toString(ans));
                }
                text1.setText("");
                calculation = 4;
            }
        });
        div.setBounds(137, 550, 85, 65);
        JButton mod = new JButton(".");
        mod.setFont(new java.awt.Font("Tahoma", 1, 45));
        mod.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text1.setText(text1.getText() + ".");
            }
        });
        mod.setBounds(242, 550, 85, 65);
        JButton equal = new JButton("=");
        equal.setFont(new java.awt.Font("Tahoma", 1, 45));
        equal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ans = Double.parseDouble(text3.getText());
                num = Double.parseDouble(text1.getText());
                if (calculation == 5) {
                    text2.setText(text1.getText());
                    text3.setText(text1.getText());
                } else if (calculation == 1) {
                    ans = ans + num;
                    text2.setText(text2.getText() + "+" + text1.getText());
                    text3.setText(Double.toString(ans));
                } else if (calculation == 2) {
                    ans = ans - num;
                    text2.setText(text2.getText() + "-" + text1.getText());
                    text3.setText(Double.toString(ans));
                } else if (calculation == 3) {
                    ans = ans * num;
                    text2.setText(text2.getText() + "*" + text1.getText());
                    text3.setText(Double.toString(ans));
                } else if (calculation == 4) {
                    ans = ans / num;
                    text2.setText(text2.getText() + "/" + text1.getText());
                    text3.setText(Double.toString(ans));
                }
                text1.setText("");
                text2.setText("");
                calculation = 5;
            }
        });
        equal.setBounds(347, 550, 85, 65);
        frame.add(seven);
        frame.add(eight);
        frame.add(nine);
        frame.add(add);
        frame.add(four);
        frame.add(five);
        frame.add(six);
        frame.add(sub);
        frame.add(one);
        frame.add(two);
        frame.add(three);
        frame.add(mul);
        frame.add(zero);
        frame.add(div);
        frame.add(mod);
        frame.add(equal);
        frame.setLayout(null);
        frame.setSize(480, 680);
        frame.setVisible(true);
    }
}
