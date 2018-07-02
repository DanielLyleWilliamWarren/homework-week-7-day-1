package ThemePark.Stalls;

import ThemePark.Interfaces.ISecurity;
import ThemePark.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String ownerName, String parkingSpot, int review){
        super(name, ownerName, parkingSpot, review);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge() < 18) {
            return false;
        }else{
            return true;
        }
    }
}
