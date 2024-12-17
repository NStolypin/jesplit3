package ru.esplit;

import java.util.List;

import org.springframework.stereotype.Component;

//@Component
public class PopMusic implements Music{
    List<String> listOfMusic = List.of("Pop #1", "Pop #2", "Pop #3");

    @Override
    public List<String> getSong() {
        return listOfMusic;
    }

}
