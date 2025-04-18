package org.javatips.jackson.annotation.bidirection;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

public class UserWithIgnore {
    public int id;
    public String name;

    @JsonIgnore
    public List<ItemWithIgnore> userItems;

    public UserWithIgnore() {
        super();
    }

    public UserWithIgnore(final int id, final String name) {
        this.id = id;
        this.name = name;
        userItems = new ArrayList<ItemWithIgnore>();
    }

    public void addItem(final ItemWithIgnore item) {
        userItems.add(item);
    }
}
