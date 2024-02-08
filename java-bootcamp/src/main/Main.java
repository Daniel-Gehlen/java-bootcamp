/// Main.java
package main;

import java.time.LocalDateTime;
import model.Bootcamp;
import model.Dev;
import model.Mentorship;
import service.BootcampService;

public class Main {
    public static void main(String[] args) {
        // Criar uma instância de Bootcamp
        Bootcamp bootcamp = new Bootcamp("Java Bootcamp");

        // Criar alguns desenvolvedores
        Dev dev1 = new Dev("Alice", 25, "Java");
        Dev dev2 = new Dev("Bob", 30, "Python");

     // Criar algumas mentorias
        Mentorship mentorship1 = new Mentorship("Mentoria de Java para Iniciantes", "Aprenda os fundamentos do Java", LocalDateTime.now().withNano(0).plusDays(7));
        Mentorship mentorship2 = new Mentorship("Mentoria Avançada de Python", "Aprofunde seus conhecimentos em Python", LocalDateTime.now().withNano(0).plusDays(10));


        // Inscrever os desenvolvedores nas mentorias
        dev1.getMentorships().add(mentorship1);
        dev2.getMentorships().add(mentorship2);

        // Inscrever os desenvolvedores no bootcamp
        BootcampService bootcampService = new BootcampService();
        bootcampService.inscreverDev(dev1, bootcamp);
        bootcampService.inscreverDev(dev2, bootcamp);

        // Listar os desenvolvedores inscritos e suas mentorias
        System.out.println("Desenvolvedores inscritos no bootcamp:");
        for (Dev dev : bootcamp.getDevs()) {
            System.out.println("Nome: " + dev.getName() + ", Idade: " + dev.getAge() + ", Linguagem Principal: " + dev.getMainLanguage());
            System.out.println("Mentorias:");
            for (Mentorship mentorship : dev.getMentorships()) {
                System.out.println("- " + mentorship.getDescription() + ", Horário: " + mentorship.getSchedule());
            }
        }
    }
}
