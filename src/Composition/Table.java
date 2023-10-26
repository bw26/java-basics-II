import java.util.ArrayList;

public class Table {

    private Integer width;
    private Integer length;
    private ArrayList<Leg> legs = new ArrayList<>();

    public Table(Integer numLegs) {
        this.width = 20;
        this.length = 10;
        for (int i = 0; i < numLegs; i++) {
            legs.add(new Leg(25));
        }
    }
    public Table(Integer width, Integer length, Integer numLegs) {
        this.width = width;
        this.length = length;
        for (int i = 0; i < numLegs; i++) {
            legs.add(new Leg(25));
        }
    }
}