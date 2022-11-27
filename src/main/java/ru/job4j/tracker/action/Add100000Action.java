package ru.job4j.tracker.action;

import ru.job4j.tracker.Store;
import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.model.Item;

public class Add100000Action implements UserAction {

    @Override
    public String name() {
        return "==== Add 100000 new Items ====";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        for (int i = 0; i < 100000; i++) {
            String index = " " + i;
            Item item = new Item(index);
            tracker.add(item);
        }
        System.out.println("All items successfully added!");
        return true;
    }

}
