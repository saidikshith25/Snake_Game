import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.UIManager;

public class Home {

	private JFrame Frame1;
	private JTextField txt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
					window.Frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Frame1 = new JFrame();
		Frame1.getContentPane().setBackground(new Color(175, 238, 238));
		Frame1.setTitle("SNAKE GAME");
		Frame1.setBounds(310, 80, 600, 600);
		Frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame1.getContentPane().setLayout(null);
		
		JLabel lb = new JLabel("Enter Your Name:");
		lb.setFont(new Font("Tahoma", Font.BOLD, 17));
		lb.setBounds(115, 65, 155, 20);
		Frame1.getContentPane().add(lb);
		
		txt = new JTextField();
		txt.setFont(new Font("Tahoma", Font.BOLD, 13));
		txt.setColumns(10);
		txt.setBounds(280, 66, 151, 22);
		Frame1.getContentPane().add(txt);
		
		final JLabel lb1 = new JLabel(" ");
		 lb1.setForeground(new Color(255, 0, 0));
		 lb1.setFont(new Font("Calibri", Font.BOLD, 23));
		 lb1.setBounds(69, 245, 478, 74);
		 Frame1.getContentPane().add(lb1);
		
		JButton btn = new JButton("NEXT");
		btn.setBackground(UIManager.getColor("Button.background"));
		btn.setForeground(new Color(139, 0, 0));
		btn.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name=txt.getText();
				lb1.setText("Welcome "+name+" to  play game click on start");
			}
		});
		btn.setBounds(205, 148, 151, 42);
		Frame1.getContentPane().add(btn);
		
		JButton btn1 = new JButton("START");
		btn1.setForeground(new Color(139, 0, 0));
		btn1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn1.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		new GameFrame();
		 		Frame1.dispose();
		 	}
		 });
		btn1.setBounds(205, 364, 151, 42);
		Frame1.getContentPane().add(btn1);
		
		
	}
}
