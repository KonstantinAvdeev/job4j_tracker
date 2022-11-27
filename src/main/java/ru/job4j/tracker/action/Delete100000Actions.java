package ru.job4j.tracker.action;

import ru.job4j.tracker.Store;
import ru.job4j.tracker.input.Input;

public class Delete100000Actions implements UserAction {

    @Override
    public String name() {
        return "==== Delete last 100000 Items ====";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        for (int i = tracker.findAll().size() - 1, j = i - 100000; i > j; i--) {
            tracker.delete(i);
        }
        System.out.println("All items successfully deleted!");
        return true;
    }

}
