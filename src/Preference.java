
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Preference {
	static JButton button = new JButton();
	static JPanel p = new JPanel();
	
	public static void main(String args[]){
		JFrame frame = new JFrame("Snake");
		frame.setSize(800,600);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
//		JLabel label = new JLabel("button");
//		label.addMouseListener(
//				new MouseAdapter(){
//					public void mouseClicked(MouseEvent event){
//						button.doClick(500);
//					}
//				}
//			);
		
		button = new JButton("button");	
		button.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent event){
					JLabel msg = new JLabel("ƒNƒŠƒbƒN");
					JOptionPane.showMessageDialog(frame, msg);
				}
			}
		);
			


//	p.add(label);
	p.add(button);
	
	Container contentPane = frame.getContentPane();
	contentPane.add(p, BorderLayout.EAST);
	
	}
	private static Container getContentPane() {
		// TODO Auto-generated method stub
		return p;
	}

	
}
