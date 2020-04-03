package button;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TestApp {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestApp window = new TestApp();
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
	public TestApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnBasic = new JButton("New button");
		btnBasic.setBounds(177, 48, 89, 23);
		frame.getContentPane().add(btnBasic);
		
		JButton btnTrjk = new JButton("TR\u00D3JK\u0104T");
		btnTrjk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TriangleButton trojkat = new TriangleButton("Tekst");
				trojkat.setBounds(177, 48, 89, 23);
				trojkat.setVisible(true);
				trojkat.setBackground(Color.black);
				frame.getContentPane().add(trojkat);
				
				btnBasic.setVisible(false);
			}
		});
		btnTrjk.setBounds(10, 151, 89, 23);
		frame.getContentPane().add(btnTrjk);
	}

}
