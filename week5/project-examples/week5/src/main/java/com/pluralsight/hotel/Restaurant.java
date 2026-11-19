package com.pluralsight.hotel;


import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Bookable {
    List<Table> tableList = new ArrayList<>();

    @Override
    public boolean book(String name) {
        for(Table t : tableList) {
            if(!t.isReserved()) {
                t.setReserved(true);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean cancel(String tableNr) {
        for(Table t : tableList) {
            if((t.getTableNr().equalsIgnoreCase(tableNr))) {
                t.setReserved(false);
                return true;
            }
        }
        return false;
    }
}
