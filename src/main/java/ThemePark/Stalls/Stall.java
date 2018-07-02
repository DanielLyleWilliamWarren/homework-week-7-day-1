package ThemePark.Stalls;

import ThemePark.Interfaces.IReviewed;

import java.util.ArrayList;

public abstract class Stall implements IReviewed {

    protected String name;
    protected String ownerName;
    protected String parkingSpot;
    protected int review;

    public Stall(String name, String ownerName, String parkingSpot, int review){
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.review = review;

    }

    public String getName() {
        return this.name;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public String getParkingSpot() {
        return this.parkingSpot;
    }

    public int getRating(){
        return this.review;
    }
}

