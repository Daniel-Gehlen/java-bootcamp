// BootcampService.java
package service;

import model.Bootcamp;
import model.Dev;

public class BootcampService {

    public void inscreverDev(Dev dev, Bootcamp bootcamp) {
        bootcamp.getDevs().add(dev);
        System.out.println(dev.getName() + " inscrito com sucesso no bootcamp " + bootcamp.getName());
    }
}
