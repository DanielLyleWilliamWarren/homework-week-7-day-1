package ThemePark;

import ThemePark.Interfaces.IReviewed;

import java.util.ArrayList;

public class ThemePark {
    protected int rating;
    public ArrayList<IReviewed> reviews;


    public ThemePark(int rating, ArrayList<IReviewed> reviews){
        this.rating = rating;
        this.reviews = new ArrayList<>();

    }

    public int getRating(){
        return this.rating;
    }

//    public void addRating(IReviewed reviewedStallOrAttraction) {
//        reviews.add();
//    }

    public ArrayList getAllReviews(){
        return this.reviews;
    }
}
