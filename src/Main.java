
import java.util.*;


public class Main {

    public static void main(String[] args) {

        ArrayList<Customers> cList = new ArrayList<>();

        Customers cust = new Customers();


        //Dealerships


        Dealership dealer1 = new Dealership();
        dealer1.setDealershipID(1);
        dealer1.setName("Car Dealership SantaRosa");
        dealer1.setAddress("60 Beach Street, NeportBeach CA");
        dealer1.setPhoneNumber("2343533");

        Dealership dealer2 = new Dealership();
        dealer2.setDealershipID(2);
        dealer2.setName("Car Dealership Waterfall");
        dealer2.setAddress(" 321 Ocean View Drive, FL 34675");
        dealer2.setPhoneNumber("3643353");

        ArrayList<Dealership> dealerList = new ArrayList<>();
        dealerList.add(dealer1);
        dealerList.add(dealer2);


        ArrayList<SalesLead> slList = new ArrayList<>();
        ArrayList<SalesLead> slList2 = new ArrayList<>();

        ArrayList<Car> carList = new ArrayList<>();
        ArrayList<Car> carList2 = new ArrayList<>();


        ArrayList<Parts> partsList = new ArrayList<>();

        ArrayList<Transaction> transList = new ArrayList<>();

        // objects for each class for adding them to arrayLists

        Car car = new Car();
        Inventory inv = new Inventory();

        Parts parts = new Parts();
        Transaction tran = new Transaction();
        Dealership deal = new Dealership();
        Salesperson sp = new Salesperson();
        SalesLead sl = new SalesLead();

        //SalesLead


        SalesLead sl1 = new SalesLead(1, "03/06/1997", "SantaRosa", "Bob@gmail.com", "Bob", "Smith", "(864)-239-8768", "SRBLVD");
        SalesLead sl2 = new SalesLead(2, "10/18/2011", "Waterfall", "Bill@gmail.com", "Bill", "Presson", "(785)-183-2975", "WTRS");

        //SalesPeople

        Salesperson sp1 = new Salesperson();
        sp1.setEmpID("WTR");
        sp1.setEmpEmail("poolguy33@gmail.com");
        sp1.setEmpFirstName("MAx");
        sp1.setEmpLastName("Labadie");
        sp1.setPhoneNumber("217-333-9878");
        sp1.setLocation("Waterfall");

        Salesperson sp2 = new Salesperson();
        sp2.setEmpID("OCEAN");
        sp2.setEmpEmail("NapelsFl@gmail.com");
        sp2.setEmpFirstName("Carley");
        sp2.setEmpLastName("James");
        sp2.setPhoneNumber("275-986-5434");
        sp2.setLocation("SanaRosa");

        Salesperson sp3 = new Salesperson();
        sp3.setEmpID("BESC");
        sp3.setEmpEmail("Surfergrl@gmail.com");
        sp3.setEmpFirstName("Angie");
        sp3.setEmpLastName("Price");
        sp3.setPhoneNumber("264-871-3454");
        sp3.setLocation("SantaRosa");


        // Cars


        Car car1 = new Car("12345a");
        carList.add(car1);
        car1.setColor("Orange");
        car1.setYear(2012);
        car1.setModel("SUV");
        car1.setMaker("Toyota");
        car1.setName("Name");
        car1.setVLocation("SantaRosa");

        car1.setPrice(17000);

        Car car2 = new Car("12345b");
        carList.add(car2);
        car2.setColor("Red");
        car2.setYear(2020);
        car2.setModel("Sedan");
        car2.setMaker("BMW");
        car2.setName("Name2");

        car2.setVLocation("Waterfall");
        car2.setPrice(45000);

        Car car3 = new Car("1245c");
        carList.add(car3);
        car3.setColor("Black");
        car3.setYear(2010);
        car3.setModel("Convert");
        car3.setMaker("Chevy");
        car3.setName("Name3");

        car3.setVLocation("SantaRosa");
        car3.setPrice(21000);

        Car car4 = new Car("12345d");
        carList.add(car4);
        car4.setColor("White");
        car4.setYear(2003);
        car4.setModel("hatchback");
        car4.setMaker("Jeep");
        car4.setName("Name");
        car4.setVLocation("Waterfall");

        car4.setPrice(10000);

        Car car5 = new Car("12345e");
        carList.add(car5);
        car5.setColor("Silver");
        car5.setYear(2016);
        car5.setModel("Sedan");
        car5.setMaker("Mazda");
        car5.setName("Name");
        car5.setVLocation("Waterfall");


        //Parts

        Parts p1 = new Parts();
        partsList.add(p1);
        p1.setPartName("GPS NAV");
        p1.setPartID(1234);
        p1.setCategory(PartsCategory.electronic);
        p1.setPrice(13.50);
        p1.setLocation("Waterfall");

        Parts p2 = new Parts();
        partsList.add(p2);
        p2.setPartName("Ball Barings");
        p2.setPartID(4328);
        p2.setCategory(PartsCategory.engine);
        p2.setPrice(80.98);
        p2.setLocation("SantaRosa");

        Parts p3 = new Parts();
        partsList.add(p3);
        p3.setPartName("Seat covering");
        p3.setPartID(3949);
        p3.setCategory(PartsCategory.interior);
        p3.setPrice(22.98);
        p3.setLocation("Waterfall");

        Parts p4 = new Parts();
        partsList.add(p4);
        p4.setPartName("Breaklight");
        p4.setPartID(2345);
        p4.setCategory(PartsCategory.exterior);
        p4.setPrice(66.40);
        p4.setLocation("SantaRosa");

        Parts p5 = new Parts();
        partsList.add(p5);
        p5.setPartName("Power Steer");
        p5.setPartID(6875);
        p5.setCategory(PartsCategory.control);
        p5.setPrice(1000);
        p5.setLocation("Santarosa");


        //Inventory

        Inventory in1 = new Inventory();
        Inventory in2 = new Inventory();
        Inventory in3 = new Inventory();
        Inventory in4 = new Inventory();
        Inventory in5 = new Inventory();


        //Customer's information

        Customers cust1 = new Customers();
        Customers cust2 = new Customers();
        Customers cust3 = new Customers();
        Customers cust4 = new Customers();
        Customers cust5 = new Customers();

        cust1.setFirstName("Billy");
        cust1.setLastName("Smith");
        cust1.setGroupID("BS");
        cust1.setCustID(0434531);
        cust1.setGroupID("A");
        cust1.setPhoneNumber("(234)-645-6556");
        cust1.setCustEmail("BS@gmail.com");
        cList.add(cust1);

        cust2.setFirstName("Devyn");
        cust2.setLastName("Dougherty");
        cust2.setCustID(32434);
        cust2.setGroupID("DD");
        cust2.setPhoneNumber("(813)-343-4333");
        cust2.setCustEmail("DD@gmail.com");
        cList.add(cust2);

        cust3.setFirstName("Jordan");
        cust3.setLastName("Grham ");
        cust3.setCustID(3242);
        cust3.setGroupID("JG");
        cust3.setPhoneNumber("(453)534-3333");
        cust3.setCustEmail("JG@gmail.com");
        cList.add(cust3);

        cust4.setFirstName("Mail ");
        cust4.setLastName("MAN ");
        cust4.setCustID(534535);
        cust4.setGroupID("MM");
        cust4.setPhoneNumber("(132)323-2323");
        cust4.setCustEmail("MM@GMAIL.COM");
        cList.add(cust4);

        cust5.setFirstName("Hannah");
        cust5.setLastName("PRESSON ");
        cust5.setCustID(53433);
        cust5.setGroupID("HP");
        cust5.setPhoneNumber("(456)876-2234");
        cust5.setCustEmail("HP@GMAIL.COM ");
        cList.add(cust5);


        Transaction tran1 = new Transaction();
        tran1.setTransactionId(1);
        tran1.setSubTotal(30233);
        tran1.setTotalPrice(223221);
        tran1.setPaymentType(PaymentType.cash);
        tran1.setCommission(500.00);
        tran1.setCommissionID("DD");
        transList.add(tran1);

        Transaction tran2 = new Transaction();
        tran2.setTransactionId(2);
        tran2.setSubTotal(60000);
        tran2.setTotalPrice(90.00);
        tran2.setPaymentType(PaymentType.credit);
        tran2.setCommission(28000);
        tran2.setCommissionID("JO");
        transList.add(tran2);

        Transaction tran3 = new Transaction();
        tran3.setTransactionId(63534);
        tran3.setSubTotal(12000);
        tran3.setTotalPrice(27000);
        tran3.setPaymentType(PaymentType.credit);
        tran3.setCommissionID("JG");
        tran3.setCommission(9000);
        transList.add(tran3);

        //SalesLead - add information (name, phone number, email, salespeople id)


        SalesLead s1 = new SalesLead();
        s1.setSalesLeadID(0);

        SalesLead s2 = new SalesLead();
        s2.setSalesLeadID(1);

        SalesLead s3 = new SalesLead();
        s3.setSalesLeadID(2);

        SalesLead s4 = new SalesLead();
        s4.setSalesLeadID(3);

        SalesLead s5 = new SalesLead();
        s5.setSalesLeadID(4);


        // Menu options

        final char CUST_CODE = '1';
        final char CUST_PRNT = '2';
        final char SL_PRNT = '3';
        final char SL_CODE = '4';
        final char INV_CODE = '5';
        final char ADD_VEHICLE = '6';
        final char ADD_PARTS = '7';
        final char SELL_CODE = '8';
        final char TRAN_CODE = '9';
        final char TRANLIST_CODE = '0';

        // list dealerships
        final char DEAL_CODE = 'D';

        final char SEARCH_CODE = 'S';

        final char HELP_CODE = '?';

        final char EXIT_CODE = '!';


        char userAction;

        final String PROMPT_ACTION = "\n 1 - Add Customer\n 2 - Print List of Customers\n 3 - Print Sales Lead List \n 4 - Add Sales Lead\n 5 - List Inventory\n 6 - Add a Vehicle\n 7 - Add Parts\n 8 - Sell a Vehicle\n 9 - Add a Transaction\n 0 - Print List of Transactions\n S - Search Vehicle and Parts\n D - List Dealerships\n ? - Help\n ! - Quit\n ";


        // prompt user

        System.out.println("DEALERSHIP MAIN MENU");
        userAction = getAction(PROMPT_ACTION);

        while (userAction != EXIT_CODE) {
            Scanner input = new Scanner(System.in);
            switch (userAction) {
                case CUST_CODE:

                    cList.add(cust.addCustomer());
                    //cust.printCustomerById(cList, 1);


                    break;
                case CUST_PRNT:
                    System.out.println("1 - Car Dealership SantaRosa \n2 - Car Dealership Waterfall");
                    int dealership = input.nextInt();

                    switch (dealership) {
                        case 1:
                            System.out.printf("%-10s | %-12s |  %-12s | %-12s | %-10s \n", "ID", "First Name", "Last Name", "Email", "Phone Number");
                            Customers.printCustByDealershipID(cList, 1);
                            break;
                        case 2:
                            System.out.printf("%-10s | %-12s |  %-12s | %-12s | %-10s \n", "ID", "First Name", "Last Name", "Email", "Phone Number");
                            Customers.printCustByDealershipID(cList, 2);
                            break;
                    }

                    break;

                case SL_PRNT:

                    System.out.println("\n 1 - Print Sales Lead list \n 2 - Print Sales Lead by Employee ID \n 3 - Print Sales Lead Information by ID \n 4 - Print Sales Lead list by location");
                    int print = input.nextInt();

                    // to do - print salesperson id as well
                    switch (print) {
                        case 1:
                            System.out.printf("%-5s | %-12s | %-15s | %-15s | %-14s | %-10s\n", "ID", "Employee ID", "Name", "Phone Number", "Email", "Date Added");
                            SalesLead.printSalesLead(slList);
                            break;
                        case 2:
                            System.out.println("Enter Sales Lead ID: ");
                            int _SL_ID = input.nextInt();
                            System.out.printf("%-5s | %-12s | %-15s | %-15s | %-14s | %-10s\n", "ID", "Employee ID", "Name", "Phone Number", "Email", "Date Added");
                            SalesLead.printSalesLeadById(slList, _SL_ID);
                            break;
                        case 3:
                            System.out.println("Enter employee id: ");
                            String _empID = input.next();
                            SalesLead.printSalesLeadByEmpID(slList, _empID);
                            break;
                        case 4:
                            System.out.println("Enter Location \n 1 - SantaRosa \n 2 - Waterfall ");
                            int location = input.nextInt();
                            System.out.printf("%-5s | %-12s | %-10s | %-10s | %-12s | %-10s | %-10s\n", "ID", "First Name", "Last Name", "Email", "Phone Number", "Location", "Date Added");
                            if (location == 1) {
                                SalesLead.printSalesLeadByLocation(slList, "SantaRosa");
                            } else if (location == 2) {
                                SalesLead.printSalesLeadByLocation(slList, "Waterfall");
                            }
                            break;

                    }
                    break;

                case SELL_CODE:

                    System.out.println("Enter Type ('car'/'truck'/'parts'): ");
                    String invType = input.nextLine().toLowerCase();

                    switch (invType) {
                        case "car":
                            System.out.println("Enter VIN:");
                            String vinNum = input.nextLine();
                            Car.sellCar(carList, vinNum);

                            break;

                        case "parts":
                            System.out.println("Enter Item ID:");
                            int partID = input.nextInt();
                            Parts.sellParts(partsList, partID);

                            break;
                    }

                    break;


                case SL_CODE:
                    System.out.println("Enter your employee id: ");
                    String emp_id = input.next();
                    slList.add(sl.addSL(emp_id));

                    break;

                case INV_CODE:
                    String inv_type = getType();
                    System.out.println("\n Enter location \n 'SantaRosa' \n 'Waterfall':");
                    String _location = input.nextLine();
                    switch (inv_type) {
                        case "car":
                            Car.printCarByLocation(carList, _location);

                            break;
                        case "parts":
                            Parts.printPartsByLocation(partsList, _location);

                            break;
                    }
                    break;


                case SEARCH_CODE:
                    inv_type = getType();
                    switch (inv_type) {
                        case "car":
                            System.out.println("Enter Type ('color'/'model'/'maker'/'location'): ");
                            String searchType = input.nextLine().toLowerCase();
                            Scanner scnr = new Scanner(System.in);

                            switch (searchType) {
                                case "color":

                                    System.out.println("Please enter color: ");
                                    String input_ = scnr.nextLine();

                                    Car.printCarByColor(carList, input_);


                                    break;
                                case "maker":

                                    System.out.println("Please enter maker: ");
                                    input_ = scnr.nextLine();

                                    Car.printCarByColor(carList, input_);

                                    break;
                                case "model":

                                    System.out.println("Please enter model: ");
                                    input_ = scnr.nextLine();

                                    Car.printCarByModel(carList, input_);

                                    break;
                                case "VIN":
                                    System.out.println("Please enter location ('SantaRosa'/'Waterfall'): ");

                                    input_ = Exception.testLocation(Exception.getInput());

                                    Car.printCarByLocation(carList, input_);

                                    break;
                            }
                        case "parts":
                            System.out.println("Enter Category (): ");
                            Scanner category = new Scanner(System.in);
                            PartsCategory parts_category = PartsCategory.valueOf(category.next().toLowerCase());
                            Parts.printPartsByCategory(partsList, parts_category);
                    }


                    break;


                case ADD_PARTS:
                    partsList.add(parts.addParts());

                    break;

                case ADD_VEHICLE:

                    System.out.println("Enter Vehicle Type ('car'/'truck':): ");
                    inv_type = input.nextLine().toLowerCase();

                    switch (inv_type) {
                        case "car":
                            carList.add(car.addCar());

                            break;
                    }

                    break;

                case TRAN_CODE:
                    transList.add(tran.addTransaction());

                    break;

                case TRANLIST_CODE:
                    Transaction.listTransactions(transList);

                    break;


                case HELP_CODE:
                    break;

                case DEAL_CODE:
                    deal.listDealerships(dealerList);

                    break;
            }

            userAction = getAction(PROMPT_ACTION);
        }
    }


    public static char getAction(String prompt) {

        Scanner scnr = new Scanner(System.in);
        String answer = "";
        System.out.println(prompt);
        answer = scnr.nextLine().toUpperCase() + " ";
        char firstChar = answer.charAt(0);
        return firstChar;
    }

    public static String getType() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter Vehicle Type ('car'/'truck'/'parts'): ");
        String type = scnr.nextLine().toLowerCase();
        return type;
    }
}

