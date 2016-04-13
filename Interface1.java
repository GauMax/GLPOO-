package Interface;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
 


@SuppressWarnings({ "serial", "unused" })
public class Interface1 extends JFrame{
	private JPanel pan = new JPanel();
	  private JButton bouton = new JButton("atq");
	  
	  public Interface1(){

		    JFrame fenetre = new JFrame();	                
		    
		    this.setTitle("GLPOO");
		    this.setSize(1200, 800);
		    this.setLocationRelativeTo(null);
		    JPanel pan = new JPanel();
		    pan.setBackground(Color.ORANGE);        
		    this.setContentPane(new Panneau());		    
		    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    this.setVisible(true);
		  }         
}

