package com.example.wobofet.nyctour;

/**
 * represents an Attraction
 */
public class Attraction {

    /**
     * static variable for value of no image
     */
    private static final int NOIMAGE = -1;

    /**
     * The name of the Attraction
     */
    private int name;

    /**
     * The address of the Attraction
     */
    private int address;

    /**
     * Small description of the Attraction
     */
    private int description;

    /**
     * resourceID number for the image, currently set to value for no image
     */
    private int resourceID = NOIMAGE;

    /**
     * The relative cost of the attraction
     */
    private int cost;

    /**
     * default constructor
     */
    public Attraction() {
    }

    /**
     * Constructor for Attraction object
     * @param name: name of Attraction
     * @param address: address of Attraction
     * @param description: small description of Attraction
     * @param resourceID: resourceID for image
     * @param cost: relative cost
     */
    public Attraction(int name, int address, int description, int resourceID, int cost) {
        this.name = name;
        this.address = address;
        this.description = description;
        this.resourceID = resourceID;
        this.cost = cost;
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


