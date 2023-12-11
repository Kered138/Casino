package src;

        import src.constants.WindowConstants;
        
        import javax.imageio.ImageIO;
        import javax.swing.*;
        
        import java.awt.BorderLayout;
        import java.awt.Container;
        import java.awt.Graphics;
        import java.awt.Image;
        import java.awt.event.*;
        import java.awt.image.BufferedImage;
        import java.io.File;
        import java.io.IOException;
        import java.lang.reflect.Field;
        import java.nio.Buffer;
        import java.io.*;
        
        import javax.sound.sampled.*;


        
        
        @SuppressWarnings("unused")
        class Main {
            public static final boolean printKeyPresses = true;
            public static JFrame window = new JFrame("Game");
            public static JLabel textOut = new JLabel("Null");

            public static MyPanel mainPanel = new MyPanel();
            // public static String hero = "src\\Sprites\\Hero.png";
            public static BufferedImage image;
            public static Container c;
            
        
            public static void main(String[] args) {
                Draw();
                windowCreator();        
        
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
              //  window.addKeyListener(new KeyAdapter() {
                //    public void keyPressed(KeyEvent e) {
                  //      int keyCode = e.getKeyCode();
                    //    switch (keyCode) {
                      //      case 87:
                        //        keyPress(1);
                          //      break;
                            //case 65:
                              //  keyPress(2);
                                //break;
                            //case 83:
                              //  keyPress(3);
                                //break;
                            //case 68:
                              //  keyPress(4);
                               // break;
                            //default:
                              //  break;
                       // }
                    //}
                //});
                window.add(mainPanel);
                window.setVisible(true);
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
       
    }


