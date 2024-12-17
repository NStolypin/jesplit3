package ru.esplit;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musiclist = new ArrayList<>();

    private String name;
    private int volume;

    
    public MusicPlayer() {}

    //IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusic(Music music) {
        this.music = music;
    }
}
