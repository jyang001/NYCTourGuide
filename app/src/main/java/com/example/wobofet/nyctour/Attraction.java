package com.example.wobofet.nyctour;

public class Attraction {
    private static final int NOIMAGE = -1;

    private int name;
    private int address;
    private int description;
    private int resourceID = NOIMAGE;
    private int cost;

    /**
     * @param n Name of the Attraction
     * @param a Address Attraction is located at
     * @param d Small Description about Attraction
     * @param r Resource ID of image of Attraction
     * @param c Cost of entrance if any
     */
    public Attraction(int n, int a, int d, int r, int c) {
        name = n;
        address = a;
        description = d;
        resourceID = r;
        cost = c;
    }

    public int getAddress() {
        return address;
    }

    public int getDescription() {
        return description;
    }

    public int getResourceID() {
        return resourceID;
    }

    public int getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public void setDescription(int description) {
        this.description = description;
    }

    public void setResourceID(int resourceID) {
        this.resourceID = resourceID;
    }

    public void setName(int name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}


