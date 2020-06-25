
import java.util.*;

public class Inventory {

    protected ArrayList carsList;
    protected ArrayList partsList;
    protected ArrayList transList;

    public Inventory() {
        carsList = new ArrayList<Car>();
        partsList = new ArrayList<Parts>();
        transList = new ArrayList<Transaction>();
    }


}
