package src;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class MusicPlayer {

    // public static void playMusic() {
    //     String filePath = "src\\src\\Music\\2021-07-07_-_Smooth_Rumble_-_www.FesliyanStudios.com.mp3";
    //     try{
    //         while(true){
    //             File audioFile = new File(filePath);
    //             AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
    //             Clip clip = AudioSystem.getClip();
    //             clip.open(audioStream);

    //             System.out.println("Playing");
    //             clip.start();
    //             clip.drain();
    //             clip.stop();
    //             clip.close();

    //         }
    //     }catch (UnsupportedAudioFileException | IOException | LineUnavailableException e){
    //         e.printStackTrace();
    //     }
    // }
}
