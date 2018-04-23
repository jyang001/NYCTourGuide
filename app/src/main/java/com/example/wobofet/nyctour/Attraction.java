package com.example.wobofet.nyctour;

public class Attraction {

    private static final int NOIMAGE = -1;

    private String place;
    private String address;
    private String description;
    private int resourceID = NOIMAGE;

    /**
     *
     * @param p Name of the Attraction
     * @param a Address Attraction is located at
     * @param d Small Description about Attraction
     * @param r Resource ID of image of Attraction
     */
    public Attraction(String p, String a, String d, int r) {
        place = p;
        address = a;
        description = d;
        resourceID = r;
    }

    public int getResourceID() { return resourceID; }
    public String getPlace() { return place; }
    public String getDescription() { return description; }
    public String getAddress() { return address; }

}
