package homework.aspects;

import homework.persistence.dao.repositories.CounterRepositoryJPA;
import homework.persistence.model.Counter;


public class Logger {

    public void afterThrowing(Exception ex) {
        CounterRepositoryJPA crJPA = new CounterRepositoryJPA();
        for (StackTraceElement ste : ex.getStackTrace()) {
            if (ste.getClassName().equals("homework.controllers.CounterController")) {
                Counter counter;
                counter = crJPA.getById(1);
                counter.setQuantity(counter.getQuantity() + 1);
                crJPA.add(counter);
            }
        }
    }
}

