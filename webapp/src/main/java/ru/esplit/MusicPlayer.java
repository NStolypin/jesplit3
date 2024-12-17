package ru.esplit;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class MusicPlayer {

    private String name;
    
    private int volume;
    List<Music> listOfMusic = new ArrayList<>();

    public MusicPlayer(List<Music> listOfMusic) {
        this.listOfMusic = listOfMusic;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public String playMusic() {
        Random rand = new Random();
        int randomOfNumberForGenre = rand.nextInt(listOfMusic.size());
        int randomOfNumberForTrack = rand.nextInt(3);

        return listOfMusic.get(randomOfNumberForGenre).getSong().get(randomOfNumberForTrack);
    }
}
