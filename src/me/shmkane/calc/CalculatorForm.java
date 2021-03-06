package me.shmkane.calc;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class CalculatorForm extends JFrame {
	private JLabel answerBox;
	private JButton divideButton;
	private JTextField firstNumberTest;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JButton minusButton;
	private JButton multiplyButton;
	private JButton plusButton;
	private JTextField secondNumberText;
	private JButton squareButton;
	private JButton squareRootButton;

	public CalculatorForm() {
		Image im = null;
		try {
			im = ImageIO.read(getClass().getResource("/me/shmkane/calc/favicon.png"));
		} catch (IOException localIOException) {
		}
		setIconImage(im);

		URL url = ClassLoader.getSystemResource("me/shmkane/calc/desktop.png");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.createImage(url);

		Frame[] frames = JFrame.getFrames();
		for (int i = 0; i < frames.length; i++) {
			frames[i].setIconImage(img);
		}
		initComponents();
	}

	private void initComponents() {
		this.firstNumberTest = new JTextField();
		this.jLabel1 = new JLabel();
		this.secondNumberText = new JTextField();
		this.jLabel2 = new JLabel();
		this.plusButton = new JButton();
		this.minusButton = new JButton();
		this.answerBox = new JLabel();
		this.multiplyButton = new JButton();
		this.divideButton = new JButton();
		this.jLabel3 = new JLabel();
		this.squareButton = new JButton();
		this.squareRootButton = new JButton();

		setDefaultCloseOperation(3);
		setTitle("Simple Calculator");

		this.jLabel1.setText("First Number");

		this.secondNumberText.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				CalculatorForm.this.secondNumberTextActionPerformed(evt);
			}
		});
		this.jLabel2.setText("Second Number");

		this.plusButton.addAncestorListener(new AncestorListener() {
			public void ancestorMoved(AncestorEvent evt) {
			}

			public void ancestorAdded(AncestorEvent evt) {
				CalculatorForm.this.plusButtonAncestorAdded(evt);
			}

			public void ancestorRemoved(AncestorEvent evt) {
			}
		});

		this.answerBox.setFont(new Font("Tahoma", 0, 18));
		this.answerBox.setText("The Answer is:");
		///////////////////////////////////////////////////////////////////

		/*
		 * Add
		 */
		this.plusButton.setText("+");
		this.plusButton.setToolTipText("Add");
		this.plusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				CalculatorForm.this.plusButtonActionPerformed(evt);
			}
		});
		/*
		 * Subtract
		 */
		this.minusButton.setText("-");
		this.minusButton.setToolTipText("Subtract");
		this.minusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				CalculatorForm.this.minusButtonActionPerformed(evt);
			}
		});
		/*
		 * Multiply
		 */
		this.multiplyButton.setText("x");
		this.multiplyButton.setToolTipText("Multiply");
		this.multiplyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				CalculatorForm.this.multiplyButtonActionPerformed(evt);
			}
		});
		/*
		 * Divide
		 */
		this.divideButton.setText("/");
		this.divideButton.setToolTipText("Divide");
		this.divideButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				CalculatorForm.this.divideButtonActionPerformed(evt);
			}
		});
		/*
		 * Square
		 */
		this.squareButton.setText("^2");
		this.squareButton.setToolTipText("Square");
		this.squareButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				CalculatorForm.this.squareButtonActionPerformed(evt);
			}
		});
		/*
		 * Square Root
		 */
		this.squareRootButton.setText("Sqrt");
		this.squareRootButton.setToolTipText("SquareRoot");
		this.squareRootButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				CalculatorForm.this.squareRootButtonActionPerformed(evt);
			}
		});


		this.jLabel3.setFont(new Font("Times New Roman", 1, 18));
		this.jLabel3.setText("Shmkane's Calculator");
		///////////////////////////////////////////////////////////////////


		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(77, 77, 77).addComponent(this.answerBox, -2,
								231, -2))
						.addGroup(layout.createSequentialGroup().addGap(126, 126, 126).addComponent(this.jLabel3))
						.addGroup(layout.createSequentialGroup().addGap(74, 74, 74)
								.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(this.jLabel2)
										.addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
												.addGroup(layout.createSequentialGroup()

														.addComponent(this.plusButton)
														.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)

														.addComponent(this.minusButton, -2, 35, -2)
														.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1,
																32767)
														.addComponent(this.multiplyButton)
														.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)

														.addComponent(this.squareButton)
														.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)

														.addComponent(this.squareRootButton)
														.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)

														.addComponent(this.divideButton))
												.addComponent(this.jLabel1, GroupLayout.Alignment.LEADING)

												.addComponent(this.firstNumberTest, GroupLayout.Alignment.LEADING)
												.addComponent(this.secondNumberText, GroupLayout.Alignment.LEADING)))))
				.addContainerGap(74, 32767)));

		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(21, 21, 21).addComponent(this.jLabel3)
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jLabel1)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(this.firstNumberTest, -2, -1, -2).addGap(31, 31, 31).addComponent(this.jLabel2)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(this.secondNumberText, -2, -1, -2).addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(this.plusButton).addComponent(this.minusButton)
								.addComponent(this.multiplyButton).addComponent(this.divideButton)
								.addComponent(this.squareButton).addComponent(this.squareRootButton))
						.addGap(28, 28, 28).addComponent(this.answerBox).addContainerGap(21, 32767)));

		pack();
	}

	private void plusButtonAncestorAdded(AncestorEvent evt) {
	}

	private void secondNumberTextActionPerformed(ActionEvent evt) {
	}

	private void minusButtonActionPerformed(ActionEvent evt) {
		double number1;
		double number2;
		try {
			number1 = Double.parseDouble(this.firstNumberTest.getText());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Bad First Number", "Error", 0);
			return;
		}
		try {
			number2 = Double.parseDouble(this.secondNumberText.getText());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Bad Second Number", "Error", 0);
			return;
		}
		double answer = number1 - number2;
		this.answerBox.setText("The Answer is: " + answer);
	}

	private void divideButtonActionPerformed(ActionEvent evt) {
		double number1;
		double number2;
		try {
			number1 = Double.parseDouble(this.firstNumberTest.getText());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Bad First Number", "Error", 0);
			return;
		}
		try {
			number2 = Double.parseDouble(this.secondNumberText.getText());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Bad Second Number", "Error", 0);
			return;
		}
		double answer = number1 / number2;
		this.answerBox.setText("The Answer is: " + answer);
	}

	private void plusButtonActionPerformed(ActionEvent evt) {
		double number1;
		double number2;
		try {
			number1 = Double.parseDouble(this.firstNumberTest.getText());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Bad First Number", "Error", 0);
			return;
		}
		try {
			number2 = Double.parseDouble(this.secondNumberText.getText());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Bad Second Number", "Error", 0);
			return;
		}
		double answer = number1 + number2;
		this.answerBox.setText("The Answer is: " + answer);
	}

	private void multiplyButtonActionPerformed(ActionEvent evt) {
		double number1;
		double number2;
		try {
			number1 = Double.parseDouble(this.firstNumberTest.getText());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Bad First Number", "Error", 0);
			return;
		}
		try {
			number2 = Double.parseDouble(this.secondNumberText.getText());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Bad Second Number", "Error", 0);
			return;
		}
		double answer = number1 * number2;
		this.answerBox.setText("The Answer is: " + answer);
	}

	private void squareButtonActionPerformed(ActionEvent evt) {
		double number1;
		try {
			number1 = Double.parseDouble(this.firstNumberTest.getText());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Bad First Number", "Error", 0);
			return;
		}
		double answer = number1 * number1;
		this.answerBox.setText("The Answer is: " + answer);
	}

	private void squareRootButtonActionPerformed(ActionEvent evt) {
		double number1;
		double number2;
		try {
			number1 = Double.parseDouble(this.firstNumberTest.getText());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Bad First Number", "Error", 0);
			return;
		}
		double answer = Math.sqrt(number1);
		this.answerBox.setText("The Answer is: " + answer);
	}

	public static void main(String[] args) {
		try {
			UIManager.LookAndFeelInfo[] arrayOfLookAndFeelInfo;
			int j = (arrayOfLookAndFeelInfo = UIManager.getInstalledLookAndFeels()).length;
			for (int i = 0; i < j; i++) {
				UIManager.LookAndFeelInfo info = arrayOfLookAndFeelInfo[i];
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(CalculatorForm.class.getName()).log(Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			Logger.getLogger(CalculatorForm.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			Logger.getLogger(CalculatorForm.class.getName()).log(Level.SEVERE, null, ex);
		} catch (UnsupportedLookAndFeelException ex) {
			Logger.getLogger(CalculatorForm.class.getName()).log(Level.SEVERE, null, ex);
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new CalculatorForm().setVisible(true);
			}
		});
	}
}
