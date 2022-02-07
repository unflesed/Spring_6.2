package homework.aspects;

import homework.persistence.dao.repositories.CounterRepositoryJPA;
import homework.persistence.model.Counter;


public class Logger {
    private static int quantity;

    public void afterThrowing(Exception ex) {
        CounterRepositoryJPA crJPA = new CounterRepositoryJPA();
        quantity++;
        if (quantity == 1) {
            Counter counter = new Counter();
            counter.setQuantity(quantity);
            crJPA.add(counter);
        }else{
            Counter counter;
            counter = crJPA.getById(1);
            counter.setQuantity(quantity);
            crJPA.add(counter);
        }
    }
}
