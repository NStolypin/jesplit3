package ru.esplit;

import java.util.List;

import org.springframework.stereotype.Component;

//@Component
public class RockMusic implements Music{
    List<String> listOfMusic = List.of("Wind cries Mary","Rock #5", "Rock #3");

    @Override
    public List<String> getSong() {
       return this.listOfMusic;
    }

}
