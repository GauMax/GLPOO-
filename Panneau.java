package Interface;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
 
@SuppressWarnings("serial")
public class Panneau extends JPanel {
  @SuppressWarnings("unused")
public void paintComponent(Graphics g){
    try {
      Image img = ImageIO.read(new File("fond.png"));
      Image cadre = ImageIO.read(new File("cadre.png"));
      Image cadre2 = ImageIO.read(new File("cadre.png"));
      Image pokeGauche = ImageIO.read(new File("pika.png"));
      Image pokeDroite = ImageIO.read(new File("cara.png"));
      Image atq1 = ImageIO.read(new File("atq1.png"));
      Image atq2 = ImageIO.read(new File("atq2.png"));
      Image atq3 = ImageIO.read(new File("atq3.png"));
      Image atq4 = ImageIO.read(new File("atq4.png"));
      Image atq5 = ImageIO.read(new File("atq5.png"));
      Image attaquer = ImageIO.read(new File("attaquer.png"));
      //Position des images
      g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
      g.drawImage(cadre, 200, 200, this);
      g.drawImage(cadre2, 750, 200, this);
      g.drawImage(pokeDroite, 750, 200, this);
      g.drawImage(pokeGauche, 200, 200, this);
      g.drawImage(atq1, 10, 650, this);
      g.drawImage(atq2, 250, 650, this);
      g.drawImage(atq3, 490, 650, this);
      g.drawImage(atq4, 730, 650, this);
      g.drawImage(atq5, 970, 650, this);
      g.drawImage(attaquer, 400, 450, this);
    } catch (IOException e) {
      e.printStackTrace();
    }                
  }               
}