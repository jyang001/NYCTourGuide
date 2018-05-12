package com.example.wobofet.nyctour;

public class Attraction {
    private static final int NOIMAGE = -1;

    private String address;
    private String description;
    private int resourceID = NOIMAGE;
    private String name;
    private String cost;

    /**
     *
     * @param n Name of the Attraction
     * @param a Address Attraction is located at
     * @param d Small Description about Attraction
     * @param r Resource ID of image of Attraction
     * @param c Cost of entrance if any
     */
    public Attraction(String n, String a, String d, int r, String c) {
        name = n;
        address = a;
        description = d;
        resourceID = r;
        cost = c;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setResourceID(int resourceID) {
        this.resourceID = resourceID;
    }


    public String getCost() { return cost; }
    public int getResourceID() { return resourceID; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getAddress() { return address; }
}
