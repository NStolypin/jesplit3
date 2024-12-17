package ru.esplit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
            SpringConfig.class);

        // Music rockMusic = context.getBean("musicBeanRock", Music.class);
        // MusicPlayer rockMusicPlayer = new MusicPlayer(rockMusic);
        // rockMusicPlayer.playMusic();

        // Music classicalMusic = context.getBean("musicBeanClassical", Music.class);
        // MusicPlayer classicalMusicPlayer = new MusicPlayer(classicalMusic);
        // classicalMusicPlayer.playMusic();

        // MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        // musicPlayer.playMusic();
        // System.out.println(musicPlayer.getName());
        // System.out.println(musicPlayer.getVolume());

        // ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        //ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);

        // System.out.println(classicalMusic1 == classicalMusic2);

         Computer computer = context.getBean("computer", Computer.class);
         System.out.println(computer);

        context.close();
    }
}
