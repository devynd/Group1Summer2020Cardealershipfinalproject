
import java.util.ArrayList;
import java.util.Scanner;


public class Customers {


    private int custID, dealershipID;


    private String firstName, lastName, phoneNumber, custEmail, groupID;


    int cCount = 00001;


    Customers(int custID) {
    }


    Customers() {
    }

    public Customers addCustomer() {
        Customers cust = new Customers (cCount++);
        Scanner scnr = new Scanner (System.in);

        System.out.println ("Enter Dealership ID: \n 1 - SantaRosa \n 2 - Waterfall ");
        int dealershipID = scnr.nextInt ();
        cust.setDealershipID (dealershipID);

        System.out.println ("Please enter customer first name: ");
        firstName = Exception.testAlpha (Exception.getInput ());
        cust.setFirstName (firstName);

        System.out.println ("Please enter customer last name: ");
        lastName = Exception.testAlpha (Exception.getInput ());
        cust.setLastName (lastName);

        System.out.println ("Please enter customer phone number:  \nPlease use this format: (012) 345-6789 ");
        phoneNumber = Exception.testPhone (Exception.getInput ());
        cust.setPhoneNumber (phoneNumber);

        System.out.println ("Please enter customer email: ");
        custEmail = Exception.testEmail (Exception.getInput ());
        cust.setCustEmail (custEmail);

        cust.setCustID (cCount);

        return cust;
    }




    public String getGroupID() {
        return groupID;
    }


    public void setGroupID(String _GroupID) {
        this.groupID = _GroupID;
    }


    public int getCustID() {
        return custID;
    }


    public void setCustID(int _CustID) {
        this.custID = _CustID;
    }



    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String _FirstName) {
        this.firstName = _FirstName;
    }


    public String getLastName() {
        return lastName;
    }



    public void setLastName(String _LastName) {
        this.lastName = _LastName;
    }



    public String getPhoneNumber() {
        return phoneNumber;
    }



    public void setPhoneNumber(String _PhoneNumber) {
        this.phoneNumber = _PhoneNumber;
    }


    public String getcustEmail() {
        return custEmail;
    }



    public void setCustEmail(String _email) {
        this.custEmail = _email;
    }



    public static void printCustomer(ArrayList<Customers> cList) {
        for (Customers cust : cList) {
            //System.out.println("Customer Id: " + cust.getCustomerId());
            System.out.printf ("%-10s | %-12s |  %-12s | %-12s | %-10s \n", cust.getCustID (), cust.getFirstName (), cust.getLastName (), cust.getcustEmail (), cust.getPhoneNumber ());

        }
    }

    public static void printCustByDealershipID(ArrayList<Customers> cList, int _id) {
        for (Customers cust : cList) {
            if (cust.dealershipID == _id) {
                System.out.printf ("%-10s | %-12s |  %-12s | %-12s | %-10s \n", cust.getCustID (), cust.getFirstName (), cust.getLastName (), cust.getcustEmail (), cust.getPhoneNumber ());
            }

        }
    }


    public static void printCustomerById(ArrayList<Customers> cList, int custId) {
        for (Customers cust : cList) {
            if (cust.custID == custId) {
                System.out.printf ("%-10s | %-12s | %-10s\n", cust.getCustID (), cust.getcustEmail (), cust.getPhoneNumber ());
            }
        }
    }



    public static void countCustomers(ArrayList<Customers> cList) {
        System.out.println ("Customers Total: " + cList.size ());
    }


    private void setDealershipID(int _dealershipID) {
        this.dealershipID = _dealershipID;
    }


    private int getDealershipID() {
        return dealershipID;
    }
}

