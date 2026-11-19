package com.pluralsight.hotel;

public class Table {
    private String tableNr;
    private boolean reserved;

    public String getTableNr() {
        return tableNr;
    }

    public void setTableNr(String tableNr) {
        this.tableNr = tableNr;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }
}
