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

class test extends JFrame{
  static test frame;
  JButton button;

  public static void main(String args[]){
    frame = new test("タイトル");
    frame.setVisible(true);
  }

  test(String title){
    setTitle(title);
    setBounds(100, 100, 300, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel p = new JPanel();

    JLabel label = new JLabel("button");
    label.addMouseListener(
      new MouseAdapter(){
        public void mouseClicked(MouseEvent  event){
          button.doClick(500);
        }
      }
    );

    button = new JButton("button");
    button.addActionListener(
      new ActionListener(){
        public void actionPerformed(ActionEvent event){
          JLabel msg = new JLabel("クリックされました");
          JOptionPane.showMessageDialog(frame, msg);
        }
      }
    );

    p.add(label);
    p.add(button);

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
  }
}