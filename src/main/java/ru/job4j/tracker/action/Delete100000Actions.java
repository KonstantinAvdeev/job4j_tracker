package ru.job4j.tracker.action;

import ru.job4j.tracker.Store;
import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.model.Item;

import java.util.List;

public class Delete100000Actions implements UserAction {

    @Override
    public String name() {
        return "==== Delete 100000 Items ====";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        List<Item> items = tracker.findAll();
        for (Item item : items) {
            tracker.delete(item.getId());
        }
        System.out.println("All items successfully deleted!");
        return true;
    }

}
