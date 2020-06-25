import java.util.Date;

public abstract class Vehicle {

    protected String vin;


    protected int dealership_id;

    protected String name, location;



    protected Date built;


    protected double price;


    protected int dealershipID;



    protected String maker, model, color;


    protected int year;



    public double getPrice() { return price; }


    public void setPrice(double _price) { this.price = _price; }



    public String getVin() { return vin; }



    public void setVin(String _Vin) { this.vin = _Vin; }



    public void setName(String _name) {
        this.name = _name;
    }



    public String getName() {
        return name;
    }


    public Date getBuiltDate() { return built; }


    public void setBuiltDate(Date _built){
        built=_built;
    }





    public String getModel() {
        return model;
    }


    public void setModel(String _Model) {
        this.model = _Model;
    }

    public String getMaker() { return maker; }


    public void setMaker(String _Maker) {
        this.maker = _Maker;
    }


    public String getColor() {
        return color;
    }



    public void setColor(String _Color) {
        this.color = _Color;
    }



    public int getYear() { return year; }


    public void setYear(int _Year) { this.year = _Year; }

    public void setDealershipID(int _dealershipID) { this.dealershipID = _dealershipID; }



    public int getDealershipID() { return dealershipID; }



    public void setVLocation(String _location) {
        this.location = _location;
    }

    public String getVLocation() {
        return location;
    }

}
