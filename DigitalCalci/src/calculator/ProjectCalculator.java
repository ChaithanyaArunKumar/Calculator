
	package calculator;

	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.swing.JTextField;
	import javax.swing.UIManager;
	import java.awt.Color;
	import javax.swing.JButton;
	import java.awt.Font;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;

	public class ProjectCalculator {

		private JFrame frame;
		private JTextField textField;
		double n1,n2,res;
		String operation,ans;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						ProjectCalculator window = new ProjectCalculator();
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
		public ProjectCalculator() {
			initialize();
		}
		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			frame = new JFrame();
			frame.setForeground(new Color(0, 0, 0));
			frame.setBackground(new Color(192, 192, 192));
			frame.setBounds(100, 100, 331, 367);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			textField = new JTextField();
			textField.setFont(new Font("Cambria", Font.BOLD, 21));
			textField.setBounds(10, 11, 295, 72);
			frame.getContentPane().add(textField);
			textField.setColumns(10);
			
			JButton btn = new JButton(".");
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText()+btn.getText());
				}
			});
			btn.setBackground(new Color(240, 230, 140));
			btn.setFont(new Font("Cambria", Font.BOLD, 20));
			btn.setBounds(10, 271, 73, 44);
			frame.getContentPane().add(btn);
			
			JButton btn1 = new JButton("1");
			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText()+btn1.getText());
				}
			});
			btn1.setFont(new Font("Cambria", Font.BOLD, 20));
			btn1.setBackground(new Color(240, 230, 140));
			btn1.setBounds(10, 226, 73, 44);
			frame.getContentPane().add(btn1);
			
			JButton btnC = new JButton("C");
			btnC.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText(null);
				}
			});
			btnC.setFont(new Font("Cambria", Font.BOLD, 20));
			btnC.setBackground(new Color(240, 230, 140));
			btnC.setBounds(10, 94, 73, 44);
			frame.getContentPane().add(btnC);
			
			JButton btn4 = new JButton("4");
			btn4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText()+btn4.getText());
				}
			});
			btn4.setFont(new Font("Cambria", Font.BOLD, 20));
			btn4.setBackground(new Color(240, 230, 140));
			btn4.setBounds(10, 182, 73, 44);
			frame.getContentPane().add(btn4);
			
			JButton btn7 = new JButton("7");
			btn7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText()+btn7.getText());
				}
			});
			btn7.setFont(new Font("Cambria", Font.BOLD, 20));
			btn7.setBackground(new Color(240, 230, 140));
			btn7.setBounds(10, 138, 73, 44);
			frame.getContentPane().add(btn7);
			
			JButton btn0 = new JButton("0");
			btn0.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText()+btn0.getText());
				}
			});
			btn0.setFont(new Font("Cambria", Font.BOLD, 20));
			btn0.setBackground(new Color(240, 230, 140));
			btn0.setBounds(84, 271, 73, 44);
			frame.getContentPane().add(btn0);
			
			JButton btn2 = new JButton("2");
			btn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText()+btn2.getText());
				}
			});
			btn2.setFont(new Font("Cambria", Font.BOLD, 20));
			btn2.setBackground(new Color(240, 230, 140));
			btn2.setBounds(84, 226, 73, 44);
			frame.getContentPane().add(btn2);
			
			JButton btn5 = new JButton("5");
			btn5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText()+btn5.getText());
				}
			});
			btn5.setFont(new Font("Cambria", Font.BOLD, 20));
			btn5.setBackground(new Color(240, 230, 140));
			btn5.setBounds(84, 182, 73, 44);
			frame.getContentPane().add(btn5);
			
			JButton btn8 = new JButton("8");
			btn8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText()+btn8.getText());
				}
			});
			btn8.setFont(new Font("Cambria", Font.BOLD, 20));
			btn8.setBackground(new Color(240, 230, 140));
			btn8.setBounds(84, 138, 73, 44);
			frame.getContentPane().add(btn8);
			
			JButton btn_back = new JButton("\uF0E7");
			btn_back.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(textField.getText().length()>0)
					{
						String str=textField.getText();
						textField.setText(str.substring(0,str.length()-1));
					}
				}
			});
			btn_back.setFont(new Font("wingdings", Font.BOLD, 20));
			btn_back.setBackground(new Color(240, 230, 140));
			btn_back.setBounds(84, 94, 73, 44);
			frame.getContentPane().add(btn_back);
			
			JButton btn00 = new JButton("00");
			btn00.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText()+btn00.getText());
				}
			});
			btn00.setFont(new Font("Cambria", Font.BOLD, 20));
			btn00.setBackground(new Color(240, 230, 140));
			btn00.setBounds(158, 271, 73, 44);
			frame.getContentPane().add(btn00);
			
			JButton btn3 = new JButton("3");
			btn3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText()+btn3.getText());
				}
			});
			btn3.setFont(new Font("Cambria", Font.BOLD, 20));
			btn3.setBackground(new Color(240, 230, 140));
			btn3.setBounds(158, 226, 73, 44);
			frame.getContentPane().add(btn3);
			
			JButton btn6 = new JButton("6");
			btn6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText()+btn6.getText());
				}
			});
			btn6.setFont(new Font("Cambria", Font.BOLD, 20));
			btn6.setBackground(new Color(240, 230, 140));
			btn6.setBounds(158, 182, 73, 44);
			frame.getContentPane().add(btn6);
			
			JButton btn9 = new JButton("9");
			btn9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText()+btn9.getText());
				}
			});
			btn9.setFont(new Font("Cambria", Font.BOLD, 20));
			btn9.setBackground(new Color(240, 230, 140));
			btn9.setBounds(158, 138, 73, 44);
			frame.getContentPane().add(btn9);
			
			JButton btn_perc = new JButton("%");
			btn_perc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					n1=Double.parseDouble(textField.getText());
					textField.setText("");
					operation="%";
				}
			});
			btn_perc.setFont(new Font("Cambria", Font.BOLD, 20));
			btn_perc.setBackground(new Color(240, 230, 140));
			btn_perc.setBounds(158, 94, 73, 44);
			frame.getContentPane().add(btn_perc);
			
			JButton btn_equal = new JButton("=");
			btn_equal.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String ans="";
					n2=Double.parseDouble(textField.getText());
					switch(operation) {
					case "+":ans=String.format("%.2f", n1+n2);
							break;
					case "-":ans=String.format("%.2f", n1-n2);
							break;
					case "*":ans=String.format("%.2f", n1*n2);
							break;
					case "/":ans=String.format("%.2f", n1/n2);
							break;
					case "%":ans=String.format("%.2f", n1%n2);
							break;
					}
					textField.setText(ans);
				}
			});
			btn_equal.setFont(new Font("Cambria", Font.BOLD, 20));
			btn_equal.setBackground(new Color(240, 230, 140));
			btn_equal.setBounds(233, 271, 73, 44);
			frame.getContentPane().add(btn_equal);
			
			JButton btn_divide = new JButton("/");
			btn_divide.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					n1=Double.parseDouble(textField.getText());
					textField.setText("");
					operation="/";
				}
			});
			btn_divide.setFont(new Font("Cambria", Font.BOLD, 20));
			btn_divide.setBackground(new Color(240, 230, 140));
			btn_divide.setBounds(233, 226, 73, 44);
			frame.getContentPane().add(btn_divide);
			
			JButton btn_product = new JButton("X");
			btn_product.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					n1=Double.parseDouble(textField.getText());
					textField.setText("");
					operation="*";
				}
			});
			btn_product.setFont(new Font("Cambria", Font.BOLD, 20));
			btn_product.setBackground(new Color(240, 230, 140));
			btn_product.setBounds(233, 182, 73, 44);
			frame.getContentPane().add(btn_product);
			
			JButton btn_minus = new JButton("-");
			btn_minus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					n1=Double.parseDouble(textField.getText());
					textField.setText("");
					operation="";
				}
			});
			btn_minus.setFont(new Font("Cambria", Font.BOLD, 20));
			btn_minus.setBackground(new Color(240, 230, 140));
			btn_minus.setBounds(233, 138, 73, 44);
			frame.getContentPane().add(btn_minus);
			
			JButton btn_plus = new JButton("+");
			btn_plus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					n1=Double.parseDouble(textField.getText());
					textField.setText("");
					operation="+";
				}
			});
			btn_plus.setFont(new Font("Cambria", Font.BOLD, 20));
			btn_plus.setBackground(new Color(240, 230, 140));
			btn_plus.setBounds(233, 94, 73, 44);
			frame.getContentPane().add(btn_plus);
		}
	}

		
		
			