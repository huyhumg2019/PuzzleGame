package nguyenhuuhuy;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PuzzleJFrame extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// bien button
	Button b1, b2, b3, b4, b5, b6, b7, b8, b9;

	// contructor
	public PuzzleJFrame() {
		b1 = new Button("1");// tao moi 1 button voi string 1
		b1.setBounds(50, 100, 50, 50);// tao khung cho buton voi x,y,width,height
		b2 = new Button("2");
		b2.setBounds(100, 100, 50, 50);
		b3 = new Button("3");
		b3.setBounds(150, 100, 50, 50);
		b4 = new Button("4");
		b4.setBounds(50, 150, 50, 50);
		b5 = new Button("5");
		b5.setBounds(100, 150, 50, 50);
		b6 = new Button("6");
		b6.setBounds(150, 150, 50, 50);
		b7 = new Button("7");
		b7.setBounds(50, 200, 50, 50);
		b8 = new Button(" ");
		b8.setBounds(100, 200, 50, 50);
		b9 = new Button("8");
		b9.setBounds(150, 200, 50, 50);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		add(b1);
		add(b2);
		add(b3);
		add(b4);// them button vao khung frame
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		setSize(500, 500); // tao khung jfarme
		setLayout(null); // bo vien cho khung frame
		setVisible(true); // an nen vien xung quanh button

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String check = " ";
		if (e.getSource() == b1) {
			;
			String label = b1.getLabel();// lay gia tri b1
			if (b2.getLabel().equals(check)) {
				b2.setLabel(label);
				b1.setLabel(" ");
			}
			if (b4.getLabel().equals(check)) {
				b1.setLabel(check);
				b4.setLabel(label);
			}
			;
		}
		if (e.getSource() == b2) {
			String label = b2.getLabel();// lay gia tri b1
			if (b1.getLabel().equals(check)) {
				b1.setLabel(label);
				b2.setLabel(check);
			}
			if (b3.getLabel().equals(check)) {
				b3.setLabel(label);
				b2.setLabel(check);
			}
			;
			if (b5.getLabel().equals(check)) {
				b5.setLabel(label);
				b2.setLabel(check);
			}
		}
		if (e.getSource() == b3) {
			String label = b3.getLabel();// lay gia tri b1
			if (b6.getLabel().equals(check)) {
				b6.setLabel(label);
				b3.setLabel(check);
			}
			if (b2.getLabel().equals(check)) {
				b2.setLabel(label);
				b3.setLabel(check);
			}
			
		}
		if (e.getSource() == b4) {
			String label = b4.getLabel();// lay gia tri b1
			if (b1.getLabel().equals(check)) {
				b1.setLabel(label);
				b4.setLabel(check);
			}
			if (b5.getLabel().equals(check)) {
				b5.setLabel(label);
				b4.setLabel(check);
			}
			;
			if (b7.getLabel().equals(check)) {
				b7.setLabel(label);
				b4.setLabel(check);
			}
		}
		if (e.getSource() == b5) {
			String label = b5.getLabel();// lay gia tri b1
			if (b2.getLabel().equals(check)) {
				b2.setLabel(label);
				b5.setLabel(check);
			}
			if (b6.getLabel().equals(check)) {
				b5.setLabel(check);
				b6.setLabel(label);
			}
			;
			if (b4.getLabel().equals(check)) {
				b4.setLabel(label);
				b5.setLabel(check);
			}
			if (b8.getLabel().equals(check)) {
				b8.setLabel(label);
				b5.setLabel(check);
			}
		}
		if (e.getSource() == b6) {
			String label = b6.getLabel();// lay gia tri b1
			if (b3.getLabel().equals(check)) {
				b3.setLabel(label);
				b6.setLabel(check);
			}
			if (b5.getLabel().equals(check)) {
				b5.setLabel(label);
				b6.setLabel(check);
			}
			;
			if (b9.getLabel().equals(check)) {
				b9.setLabel(label);
				b6.setLabel(check);
			}
		}
		if (e.getSource() == b7) {
			String label = b7.getLabel();// lay gia tri b1
			if (b4.getLabel().equals(check)) {
				b4.setLabel(label);
				b7.setLabel(check);
			}
			if (b8.getLabel().equals(check)) {
				b8.setLabel(label);
				b7.setLabel(check);
			}
			;
			
		}
		if (e.getSource() == b8) {
			
			String label = b8.getLabel();// lay gia tri b1
			if (b9.getLabel().equals(check)) {
				b9.setLabel(label);
				b8.setLabel(" ");
			}
			if (b7.getLabel().equals(check)) {
				b8.setLabel(check);
				b7.setLabel(label);
			}
			;
			if (b5.getLabel().equals(check)) {
				b5.setLabel(label);
				b8.setLabel(check);
			}
		}
		if (e.getSource() == b9) {
			String label = b9.getLabel();// lay gia tri b1
			if (b6.getLabel().equals(check)) {
				b6.setLabel(label);
				b9.setLabel(check);
			}
			if (b8.getLabel().equals(check)) {
				b8.setLabel(label);
				b9.setLabel(check);
			}
			;
			
		}
		if (b1.getLabel().equals("1") && b2.getLabel().equals("2") && b3.getLabel().equals("3")
				&& b4.getLabel().equals("4") && b5.getLabel().equals("5") && b6.getLabel().equals("6")
				&& b7.getLabel().equals("7") && b8.getLabel().equals("8") && b9.getLabel().equals(" ")) {
			JOptionPane.showConfirmDialog(PuzzleJFrame.this, "you win ");
		}

	}

}
