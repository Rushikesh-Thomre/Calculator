package Productbased;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public abstract class DemoCalculator extends JFrame implements ActionListener {

	JPanel jp1, jp2;
	JTextField jtf;
	JButton[] btns;
	String num1, num2, operator;
	int res;

	public DemoCalculator() {
		super("my Calculator");
		jp1 = new JPanel();
		jtf = new JTextField(20);
		jp1.add(jtf);
		add(jp1, BorderLayout.NORTH);

		jp2 = new JPanel();
		jp2.setLayout(new GridLayout(4, 4));
		btns = new JButton[16];

		for (int i = 0; i < 10; i++) {
			btns[i] = new JButton("" + i);
			jp2.add(btns[i]);
			btns[i].addActionListener(this);
		}
		btns[10] = new JButton("+");
		btns[11] = new JButton("-");
		btns[12] = new JButton("*");
		btns[13] = new JButton("/");
		btns[14] = new JButton("=");
		btns[15] = new JButton("c");

		for (int i = 10; i < 16; i++) {
			jp2.add(btns[i]);
			btns[i].addActionListener(this);
		}
		add(jp2);
		setLocation(100, 100);
		setSize(250, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new DemoCalculator() {
		};
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cap = e.getActionCommand();
		if (cap.equals("1"))
			jtf.setText(jtf.getText() + "1");

		else if (cap.equals("2"))
			jtf.setText(jtf.getText() + "2");

		else if (cap.equals("3"))
			jtf.setText(jtf.getText() + "3");

		else if (cap.equals("4"))
			jtf.setText(jtf.getText() + "4");

		else if (cap.equals("5"))
			jtf.setText(jtf.getText() + "5");

		else if (cap.equals("6"))
			jtf.setText(jtf.getText() + "6");

		else if (cap.equals("7"))
			jtf.setText(jtf.getText() + "7");

		else if (cap.equals("8"))
			jtf.setText(jtf.getText() + "8");

		else if (cap.equals("9"))
			jtf.setText(jtf.getText() + "9");

		else if (cap.equals("0"))
			jtf.setText(jtf.getText() + "0");

		else if (cap.equals("c"))
			jtf.setText("0");

		else if (cap.equals("+")) {
			num1 = jtf.getText();
			operator = "+";
			jtf.setText("");
		} else if (cap.equals("-")) {
			num1 = jtf.getText();
			operator = "-";
			jtf.setText("");
		} else if (cap.equals("*")) {
			num1 = jtf.getText();
			operator = "*";
			jtf.setText("");
		} else if (cap.equals("=")) {
			num2 = jtf.getText();
			// operator ="=";
		}
		if (operator.equals("+")) {
			res = Integer.parseInt(num1) + Integer.parseInt(num2);

		}
		jtf.setText("" + res);
	}

}
