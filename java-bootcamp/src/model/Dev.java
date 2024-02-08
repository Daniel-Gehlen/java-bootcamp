// Dev.java
package model;

import java.util.ArrayList;
import java.util.List;

public class Dev {
    private String name;
    private int age;
    private String mainLanguage;
    private List<Mentorship> mentorships; // Adicionando a lista de mentorias associadas ao Dev

    public Dev(String name, int age, String mainLanguage) {
        this.name = name;
        this.age = age;
        this.mainLanguage = mainLanguage;
        this.mentorships = new ArrayList<>(); // Inicializando a lista de mentorias
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMainLanguage() {
        return mainLanguage;
    }

    // Método para obter as mentorias associadas ao Dev
    public List<Mentorship> getMentorships() {
        return mentorships;
    }
}
