package src;

        import src.constants.WindowConstants;
        
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

            public static MyPanel mainPanel = new MyPanel();
            //public static String hero = "src\\src\\Sprites\\pixil-frame-0 (4).png";
            public static BufferedImage image;
            public static Container c;
            public static JLabel l;
            public static JLabel slot1;
            public static JLabel slot2;
            public static JLabel slot3;
            public static JFrame f;
            public static int StartingMoney;
            public static int Money;
            
        
            public static void main(String[] args) {
                Draw();
                windowCreator();   
                
                
                StartingMoney = (int) (Math.random() * 5) + 1;
                switch (StartingMoney) {
                  case 1:
                    Money = 100;
                    break;
                  case 2:
                    Money = 1000;
                    break;
                  case 3:
                    Money = 10000;
                    break;
                  case 4:
                    Money = 100000;
                    break;
                  case 5:
                    Money = 0;
                    break;
                
                  default:
                    break;
                }
                System.out.println(StartingMoney);
                mainPanel.add(l);
                l.setText("Money: " + Money);
                Slots();

                sleep(100);
                Slots();
                
                   
        
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
                window.add(mainPanel);
                window.setVisible(true);
                window.setLayout(null);
                window.setLayout(null);
                mainPanel.setLayout(null);
                l = new JLabel("The Casino");
                mainPanel.add(l);
                l.setBounds(500, 0,500,100);
                l.setFont(new Font("Arial", Font.PLAIN, 30));
                mainPanel.setBackground(Color.red); 
                slot1 = new JLabel("panel label"); 
                slot2 = new JLabel("panel label");
                slot3 = new JLabel("panel label"); 
                slot1.setFont(new Font("Arial", Font.BOLD, 70));
                slot2.setFont(new Font("Arial", Font.BOLD, 70));
                slot3.setFont(new Font("Arial", Font.BOLD, 70));
                slot1.setBounds(500,100,100,100);
                slot2.setBounds(600,100,100,100);
                slot3.setBounds(700,100,100,100);
                mainPanel.add(slot1);
                mainPanel.add(slot2);
                mainPanel.add(slot3);
                
                
                
                
                

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
                System.out.println("W Pressed");
            }
        }
        else if (key == 2) {
            //mainPanel.setLocation(mainPanel.getX() - 10, mainPanel.getY());
            Slots();
            if (printKeyPresses) {
                System.out.println("A Pressed");
            }
        }
        else if (key == 3) {
            //mainPanel.setLocation(mainPanel.getX(), (mainPanel.getY() + 10));
            if (printKeyPresses) {
                System.out.println("S Pressed");
            }
        }
        else if (key == 4) {
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
      for(int i = 0;i<50;i++){
        
        slot1.setText((int) ((Math.random()*10) +1)+"");
        slot2.setText((int) ((Math.random()*10) +1)+"");
        slot3.setText((int) ((Math.random()*10) +1)+"");
        sleep(10);
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
       
       
    }


