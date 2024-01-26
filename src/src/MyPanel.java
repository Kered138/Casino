package src;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.swing.JPanel;

@SuppressWarnings("unused")
public class MyPanel extends JPanel{
    
    @Override
    public void paint(Graphics g){
        super.paint(g);

        Graphics2D g2 = (Graphics2D) g;
        //g2.setColor(Color.BLUE);
        //g2.drawRect(0, 0, 1000, 1000);
        //g2.setColor(Color.BLUE);
       // g2.fillRect(0, 0, 1000, 1000);
        // g2.drawImage(image, 0, 0, this);
        g2.drawImage(image, 0, 0, 1280, 720, getFocusCycleRootAncestor());
        
        
    }
    private static BufferedImage image;
    public static void setBackground(){
               try {                
          image = ImageIO.read(new File("src\\src\\Sprites\\logo.png"));
          System.out.println(image);
       } catch (IOException ex) {
            // handle exception...
       }
       
    }
    public MyPanel() {
       try {                
          image = ImageIO.read(new File("src\\src\\Sprites\\logo.png"));
          System.out.println(image);
       } catch (IOException ex) {
            // handle exception...
       }
    }

}
