package ru.esplit;

import java.util.List;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class ClassicalMusic implements Music{
    List<String> listOfMusic = List.of("Hungarian Rapsody","Bah #5", "Mozart #3");

    @Override
    public List<String> getSong() {
        return listOfMusic;
    }

    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }
}
