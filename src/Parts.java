import java.util.ArrayList;
import java.util.Scanner;



    public class Parts {

        private int partID;


        private String name, location;

        private double price;


        private PartsCategory partCategory;


        int cCount = 00001;



        public Parts() {

        }


        public Parts(int _partsID) {

        }


        public Parts(int _partID, PartsCategory _partCategory, String _name) {
            this.name = _name;
            this.partCategory = _partCategory;
            this.partID = _partID;

        }


        public Parts addParts() {
            Parts parts = new Parts(cCount++);
            Scanner scnr = new Scanner(System.in);
            System.out.println("Please enter part name: ");
            name = Exception.testAlpha(Exception.getInput());
            parts.setPartName(name);

            parts.setCategory();

            System.out.println("Please enter part price: ");
            price = Double.parseDouble(Exception.getInput());
            parts.setPrice(price);

            System.out.println("Please enter location: ");
            location = Exception.testAlpha(Exception.getInput());
            parts.setLocation(location);

            parts.setPartID(cCount);

            return parts;
        }



        public int getPartID() {
            return partID;
        }


        public void setPartID(int randomID) {
            this.partID = randomID;
        }


        public PartsCategory getPartCategory() {
            return partCategory;
        }

        public void setLocation(String _location) {
            this.location = _location;
        }

        public String getLocation() {
            return location;
        }


        public String getPartName() {
            return name;
        }



        public void setPartName(String anyName) {
            this.name = anyName;
        }


        public double getPrice() { return price; }


        public void setPrice(double _price) { this.price = _price; }


        public void setCategory(PartsCategory _category) { this.partCategory = _category; }

        public PartsCategory getCategory() { return partCategory; }


        public PartsCategory setCategory() {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Parts Type ('electronic', 'engine', 'interior', 'exterior', 'control'): ");
            partCategory = PartsCategory.valueOf(input.next().toLowerCase());
            return partCategory;
        }


        public static void printParts(ArrayList<Parts> PartsArrayList) {
            for (Parts parts : PartsArrayList) {
                System.out.printf("%-10s | %-10s | %-12s | %-10s | %-10s | %-12s\n", parts.getPartName());

            }
        }


        public static void printPartsByCategory(ArrayList<Parts> partsList, PartsCategory _category) {
            for (Parts parts : partsList) {
                if (parts.getPartName().equals(_category)) {
                    System.out.printf("%-10s | %-10s \n", parts.getPartName(), parts.getPartCategory());
                }
            }
        }


        public static void printPartsByLocation(ArrayList<Parts> partsList, String _location) {
            for (Parts parts : partsList) {
                if (parts.location.equals(_location)) {
                    System.out.printf("%-10s | %-10s | %-10s | %-10s | %-10s \n", parts.getPartID(), parts.getPartName(), parts.getPrice(), parts.getPartCategory(), parts.getLocation());
                }
            }
        }

        public static void sellParts(ArrayList<Parts> partsList, int _partID) {
            for (Parts parts : partsList) {
                if (parts.getPartID() == _partID) {
                    partsList.remove(parts);
                }
            }
        }
    }





