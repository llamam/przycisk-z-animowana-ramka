package button;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

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

	public static BufferedImage getCircle() {
		

	    BufferedImage circleImage = new BufferedImage(60, 60, BufferedImage.TYPE_INT_ARGB);

	    Graphics2D g = (Graphics2D) circleImage.getGraphics();
	    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	    g.setColor(Color.PINK);
	    g.fillOval(5, 5, 50, 50);
	    g.drawOval(5, 5, 50, 50);
	    return circleImage;
	    
		}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnBasic = new JButton("");
		btnBasic.setBounds(145, 21, 139, 72);
		frame.getContentPane().add(btnBasic);
		
		JButton btnTrjk = new JButton("TR\u00D3JK\u0104T");
		btnTrjk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnBasic.setBorderPainted(false); 
				btnBasic.setContentAreaFilled(false); 
				btnBasic.setOpaque(false);

				
			    btnBasic.setIcon(new ImageIcon(getCircle()));

				
			}
		});
		
		btnTrjk.setBounds(10, 151, 89, 23);
		frame.getContentPane().add(btnTrjk);
		
		btnBasic.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				btnTrjk.setLabel("Dziala");
				
			}
			
		});
	}

}
