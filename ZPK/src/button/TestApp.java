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
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Font;

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
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(139, 5, 151, 95);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnBasic = new JButton("");
		btnBasic.setBounds(6, 16, 139, 72);
		panel.add(btnBasic);
		
		btnBasic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
			
		});
		
		JButton btnCircle = new JButton("CIRCLE");
		btnCircle.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnCircle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnBasic.setBorderPainted(false); 
				btnBasic.setContentAreaFilled(false); 
				btnBasic.setOpaque(false);

				
			    btnBasic.setIcon(new ImageIcon(getCircle()));

				
			}
		});
		
		btnCircle.setBounds(10, 151, 89, 23);
		frame.getContentPane().add(btnCircle);
		
		JButton btnTriangle = new JButton("TRIANGLE");
		btnTriangle.setForeground(Color.BLACK);
		btnTriangle.setBackground(Color.RED);
		btnTriangle.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnTriangle.setOpaque(false);
		btnTriangle.setContentAreaFilled(false); 
		btnTriangle.setBounds(109, 151, 89, 23);
		frame.getContentPane().add(btnTriangle);
		
		JButton btnSquare = new JButton("SQUARE");
		btnSquare.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnSquare.setBounds(109, 185, 89, 23);
		frame.getContentPane().add(btnSquare);
		
		JButton btnRectangle = new JButton("RECTANGLE");
		btnRectangle.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnRectangle.setBounds(10, 185, 89, 23);
		frame.getContentPane().add(btnRectangle);
	}
}
