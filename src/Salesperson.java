import java.util.ArrayList;
import java.util.Scanner;

public class Salesperson {





        private double commission;
        protected String empFirstName, empLastName, phoneNumber, empEmail, location;
        public static String empID;
        Scanner userInput = new Scanner(System.in);


        // Add salesLead - new customer


        public void addSalesLead(String empID) {
            // ask for id
            String input = userInput.nextLine();
            empID = input;
            SalesLead sl = new SalesLead();
            sl.addSL(empID);

        }

        public String getEmpID() {return empID;} // get random number

        public void setEmpID(String _empID) {
            empID = _empID;}


        public String getEmpFirstName() {return empFirstName;}


        public void setEmpFirstName(String _empFirstName) {this.empFirstName = _empFirstName;}



        public String getEmpLastName() {return empLastName;}



        public void setEmpLastName(String _empLastName) {this.empLastName = _empLastName;}


        public String getPhoneNumber() {return phoneNumber;}


        public void setPhoneNumber(String _PhoneNumber) {this.phoneNumber = _PhoneNumber;}


        public String getEmpEmail() {return empEmail;}



        public void setEmpEmail(String _empEmail) {this.empEmail = _empEmail;}


        public void setLocation(String _location) {this.location = _location;}


        public String getLocation() {return location;}

        public static void printSalesperson(ArrayList<Salesperson> salespersonArrayListList, String _id) {
            for (Salesperson sp : salespersonArrayListList) {
                if (empID.equals(_id)) {
                    System.out.printf("%-10s | %-12s | %-10s \n", sp.getEmpFirstName(), sp.getEmpLastName(), sp.getEmpEmail());
                }
            }
        }
    }

