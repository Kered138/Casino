package src;

        import src.constants.WindowConstants;
        import src.MusicPlayer;
        
        import javax.imageio.ImageIO;
        import javax.swing.*;
        
        import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
        import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.*;
        import java.awt.image.BufferedImage;
        import java.io.File;
        import java.io.IOException;
        import java.lang.reflect.Field;
        import java.nio.Buffer;
import java.util.Random;
import java.io.*;
        
        import javax.sound.sampled.*;


        
        
        @SuppressWarnings("unused")
        class Main {
            public static final boolean printKeyPresses = true;
            public static JFrame window = new JFrame("Game");
            public static JLabel textOut = new JLabel("Null");
            public static JLayeredPane pane = new JLayeredPane();
            public static JLayeredPane pane2 = new JLayeredPane();
            public static MyPanel mainPanel = new MyPanel();
            //public static String hero = "src\\src\\Sprites\\pixil-frame-0 (4).png";
            public static BufferedImage image;
            public static Container c;
            public static JLabel l;
            public static JLabel slot1;
            public static JLabel slot2;
            public static JLabel slot3;
            public static JLabel instr;
            public static JFrame f;
            public static int StartingMoney;
            public static int Money;
            public static int currentBetAmount = 100;
            public static Timer slotTimer;
            
        
            public static void main(String[] args) {
                String filePath = "src\\src\\Music\\2021-07-07_-_Smooth_Rumble_-_www.FesliyanStudios.com.wav";
                
                windowCreator();   
                Draw();
                MoneySet();
                
                
                
                StartingMoney = (int) (Math.random() * 5) + 1;
                switch (StartingMoney) {
                  case 1:
                    Money = 1000;
                    break;
                  case 2:
                    Money = 1000;
                    break;
                  case 3:
                    Money = 10000;
                    break;
                  case 4:
                    Money = 1000;
                    break;
                  case 5:
                    Money = 1000;
                    break;
                
                  default:
                    break;
                }
                System.out.println(StartingMoney);
                
                MoneySet();
                playMusic(filePath);
                

                
                   
        
            }
        
            public static void windowCreator() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                        | UnsupportedLookAndFeelException e) {
                    e.printStackTrace();
                }
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.setSize(WindowConstants.windowWidth, WindowConstants.windowHeight);
                window.addKeyListener(new KeyAdapter() {
                    public void keyPressed(KeyEvent e) {
                        int keyCode = e.getKeyCode();
                        switch (keyCode) {
                            case 87:
                                keyPress(1);
                                break;
                            case 65:
                                keyPress(2);
                                break;
                            case 83:
                                keyPress(3);
                                break;
                            case 68:
                                keyPress(4);
                                break;
                            case 10:
                              keyPress(5);
                              break;
                            default:
                                break;
                        }
                    }
                });
                window.add(pane);
                pane.add(mainPanel,1);
                //slotsPanel.setVisible(false);
                window.setVisible(true);
                window.setLayout(null);
                window.setLayout(null);
                mainPanel.setLayout(null);
                
                //mainPanel.setBackground(Color.red); 

                slot1 = new JLabel("panel label"); 
                slot2 = new JLabel("panel label");
                slot3 = new JLabel("panel label"); 
                slot1.setFont(new Font("Arial", Font.BOLD, 70));
                slot2.setFont(new Font("Arial", Font.BOLD, 70));
                slot3.setFont(new Font("Arial", Font.BOLD, 70));
                slot1.setBounds(500,100,100,100);
                slot2.setBounds(600,100,100,100);
                slot3.setBounds(700,100,100,100);
                instr = new JLabel("Welcome!");
                instr.setBounds(0, 0,100,100);
                instr.setFont(new Font("Arial", Font.PLAIN, 30));
                pane.add(instr,3);
                pane.add(slot1,3);
                pane.add(slot2,3);
                pane.add(slot3,3);
    
                l = new JLabel("Welcome!");
                l.setBounds(500, 0,700,100);
                l.setFont(new Font("Arial", Font.PLAIN, 30));
                pane.add(l,3);

                instr.setText("WELCOME");

                
                
                
                
                
                

            }
        public static void Draw() {
            c = window.getContentPane();
            //  set the LayoutManager
            c.setLayout(new BorderLayout());
            mainPanel = new MyPanel();
            
            // add MyPanel object into container
            c.add(mainPanel);
            
            

            // sets close behavior; EXIT_ON_CLOSE invokes System.exit(0) on closing the
       }
       public static void keyPress(int key) {
      
        if (key == 1) {
            //mainPanel.setLocation(mainPanel.getX(), (mainPanel.getY() - 10));
         
            
            if (printKeyPresses) {
                currentBetAmount += 10000000;
                MoneySet();
                System.out.println("W Pressed");
            }
        }
        else if (key == 2) {
            //mainPanel.setLocation(mainPanel.getX() - 10, mainPanel.getY());
            if(Money>0){
              Slots();
            }
          
            if (printKeyPresses) {
                System.out.println("A Pressed");
            }
        }
        else if (key == 3) {
            if(currentBetAmount > 0){
              currentBetAmount -=100;
            }
            
            MoneySet();
            //mainPanel.setLocation(mainPanel.getX(), (mainPanel.getY() + 10));
            if (printKeyPresses) {
                System.out.println("S Pressed");
            }
        }
        else if (key == 4) {
            currentBetAmount += 100;
            MoneySet();
            //mainPanel.setLocation(mainPanel.getX() + 10, (mainPanel.getY()));
            if (printKeyPresses) {
                System.out.println("D Pressed");
            }
        }
        else if (key == 5){
          

          if(printKeyPresses){
            System.out.println("Enter Pressed");
          }
        }
        else {
            System.out.println("Something broke with keypresses!");
            System.exit(0);
        }

    }
 

    public static void Slots(){
      
      //slot1.setText("t ");
      //  sleep(100);
      ActionListener slotAction = new ActionListener() {
        int count = 0;

        @Override
        public void actionPerformed(ActionEvent e){
          slot1.setText((int) ((Math.random()*9) +1)+"");
          slot2.setText((int) ((Math.random()*9) +1)+"");
          slot3.setText((int) ((Math.random()*9) +1)+"");
          
          count++;
          if(count == 50){
            slotTimer.stop();
            int num1 = (int) ((Math.random()*9) +1);
            int num2 = (int) ((Math.random()*9) +1);
            int num3 = (int) ((Math.random()*9) +1);
            String str1 = num1+"";
            String str2 = num2+"";
            String str3 = num3+"";
      
            slot1.setText(null);
            slot2.setText(null);
            slot3.setText(null);
            System.out.println(str1);
            System.out.println(str2);
            System.out.println(str3);
            slot1.setText(str1);
            slot2.setText(str2);
            slot3.setText(str3);
            //System.out.println(slot1.getText());
            //System.out.println(slot2.getText());
            //System.out.println(slot3.getText());
      
            
            if(num1 == num2 && num2 == num3){
              Money+= 100 * currentBetAmount;
              System.out.println("Jackpot");
            }
            else if(num1 == num2 || num1 == num3 || num2 == num3){
              Money+= 15 * currentBetAmount;
              System.out.println("You Win");
            }
            else{
              Money-= currentBetAmount;
            }
            MoneySet();
            slot1.setText(str1);
            slot2.setText(str2);
            slot3.setText(str3);
          }
        }
        
      };
      slotTimer = new Timer(10,slotAction);
      slotTimer.start();
     
      

      
    }
    public static void MoneySet(){
      if(Money > 0){
        l.setText("Money: " + Money + " Current Bet:" + currentBetAmount);
      }
      else{
        l.setText("You Lose");
      }
      
    }
    public static void sleep(double Mseconds) {
      int miliseconds = (int) (Mseconds);
      try {
          Thread.sleep(miliseconds);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
  }
       
       
  public static void playMusic(String filePath) {
    System.out.println("hi");
    try{
        //while(true){
            
            File audioFile = new File(filePath);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            System.out.println("Playing");
            clip.start();
            clip.drain();
            clip.stop();
             
            clip.close();


       // }
    }catch (UnsupportedAudioFileException | IOException | LineUnavailableException e){
        e.printStackTrace();
    }
}
    }


