import java.util.*;



public final class Car extends Vehicle {


    public Car() { }


    public Car(String vin_) {
        super.setVin(vin_);
    }



    public Car addCar() {
        Car car = new Car();
        Scanner scnr = new Scanner(System.in);


        System.out.println("Enter Dealership ID: ");
        car.setDealershipID(scnr.nextInt());

        System.out.println("Please enter location: ");
        location = Exception.testAlpha(Exception.getInput());
        car.setVLocation(location);

        System.out.println("Please enter VIN number: ");
        vin = Exception.testAlphaNumeric(Exception.getInput());
        car.setVin(vin);

        System.out.println("Please enter car model: ");
        model = Exception.testAlpha(Exception.getInput());
        car.setModel(model);

        System.out.println("Please enter car maker: ");
        maker = Exception.testAlpha(Exception.getInput());
        car.setMaker(maker);

        System.out.println("Please enter car year: ");
        String _year = Exception.testInt(Exception.getInput());
        year = Integer.parseInt(_year);
        car.setYear(year);



        System.out.println("Please enter car color: ");
        color = Exception.testAlpha(Exception.getInput());
        car.setColor(color);

        System.out.println("Please enter car price: ");
        String _price = Exception.testDouble(Exception.getInput());
        price = Double.parseDouble(_price);
        car.setPrice(price);

        return car;
    }

    public static void printCars(ArrayList<Car> carList) {
        for (Car car : carList) {
            System.out.printf("%-10s | %-12s | %-10s | %-10s | %-12s | %-10s \n", car.getVin(), car.getModel(), car.getMaker(), car.getColor(), car.getYear(), car.getPrice());

        }
    }



    public static void printCarByColor(ArrayList<Car> carList, String _color) {
        for (Car car : carList) {

            // cannot use super.color from a non static context, so added String color to Car class

            if (car.color.equals(_color)) {
                // System.out.printf("%-10s | %-10s | %-12s | %-10s | %-10s\n", car.getVin(), car.getYear(), car.getMaker(), car.getModel(), car.getName());
                System.out.println(" Car VIN number: " + car.getVin() + " Car color: " + car.getColor() + " Car Maker: " + car.getMaker() + " Car Model: " + car.getModel());
            }
        }
    }



    public static void printCarByMaker(ArrayList<Car> carList, String _maker) {
        for (Car car : carList) {

            if (car.maker.equals(_maker)) {
                // System.out.printf("%-10s | %-10s | %-12s | %-10s | %-10s\n", car.getVin(), car.getYear(), car.getMaker(), car.getModel(), car.getName());
                System.out.println("Car VIN number:" + car.getVin() + " Car color:" + car.getColor());
            }
        }
    }



    public static void printCarByModel(ArrayList<Car> carList, String _model) {
        for (Car car : carList) {

            if (car.maker.equals(_model)) {
                // System.out.printf("%-10s | %-10s | %-12s | %-10s | %-10s\n", car.getVin(), car.getYear(), car.getMaker(), car.getModel(), car.getName());
                System.out.println("Car VIN number:" + car.getVin() + " Car color:" + car.getColor());
            }
        }
    }


    public static void sellCar(ArrayList<Car> carList, String _VIN) {

        try {
            for (Car car : carList) {

                if (car.getVin().equals(_VIN)) {

                    carList.remove(car);
                }
            }
        }
        catch (ConcurrentModificationException e) {
            System.out.println("Invalid input. Make sure you entered the correct VIN.");
            sellCar(carList, _VIN);
        }
    }


    public static void printCarByLocation(ArrayList<Car> carList, String _location) {
        for (Car car : carList) {

            // cannot use super.color from a non static context, so added String color to Car class

            if (car.location.equals(_location)) {
                System.out.printf("%-10s | %-10s | %-12s | %-10s | %-10s | %-10s \n", car.getVin(), car.getYear(), car.getMaker(), car.getModel(), car.getVLocation(), car.getPrice());
            }
        }
    }


}







