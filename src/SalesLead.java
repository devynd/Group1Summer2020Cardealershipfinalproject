import java.util.ArrayList;

public class SalesLead {



        protected int salesLeadID;


        protected String sl_location, sl_firstName, sl_lastName, sl_phoneNumber, sl_Email, empID;
        protected Boolean salesLeadActive;
        protected String salesLeadDate;
        int cCount;


        // Constructors


        public SalesLead(int _id) {
            this.salesLeadID = _id;
        }


        public SalesLead() {
        }


        public SalesLead(int _id, String _salesLeadDate, String _sl_location, String _sl_firstName, String _sl_lastName, String _sl_phoneNumber, String _sl_Email, String _empID) {
            this.salesLeadID = _id;
            this.salesLeadDate = _salesLeadDate;
            this.sl_location = _sl_location;
            this.sl_Email = _sl_Email;
            this.sl_firstName = _sl_firstName;
            this.sl_lastName = _sl_lastName;
            this.sl_phoneNumber = _sl_phoneNumber;
            this.empID = _empID;

        }


        // add salesPeople id to know which one added a salesLead
        public SalesLead addSL(String _empID) {
            SalesLead sl = new SalesLead(cCount++);

            System.out.println("Employee ID: " + _empID);
            sl.setSL_empID(_empID);

            System.out.println("Please enter location ( 'SantaRosa' / 'Waterfall' ) ");
            sl_location = Exception.testLocation(Exception.getInput());
            sl.setSL_location(sl_location);

            System.out.println("Please enter SL first name: ");
            sl_firstName = Exception.testAlpha(Exception.getInput());
            sl.setSl_firstName(sl_firstName);

            System.out.println("Please enter SL last name: ");
            sl_lastName = Exception.testAlpha(Exception.getInput());
            sl.setSl_lastName(sl_lastName);

            System.out.println("Please enter date: ");
            salesLeadDate = Exception.testDate(Exception.getInput());
            sl.setSl_Date(salesLeadDate);

            System.out.println("Please enter SL phone number: \n Please use this format: (343) 322-1232)");
            sl_phoneNumber = Exception.testPhone(Exception.getInput());
            sl.setSl_phoneNumber(sl_phoneNumber);

            System.out.println("Please enter SL email: ");
            sl_Email = Exception.testEmail(Exception.getInput());
            sl.setSl_Email(sl_Email);

            sl.setSalesLeadID(cCount);


            return sl;
        }


        public int getSalesLeadID() {
            return salesLeadID;
        }


        public void setSalesLeadID(int _salesLeadID) {
            this.salesLeadID = _salesLeadID;
        }


        public String getSl_firstName() {
            return sl_firstName;
        }


        public void setSl_firstName(String _sl_firstName) {
            this.sl_firstName = _sl_firstName;
        }


        public String getSl_lastName() {
            return sl_lastName;
        }


        public void setSl_lastName(String _sl_lastName) {
            this.sl_lastName = _sl_lastName;
        }


        public String getSl_phoneNumber() {
            return sl_phoneNumber;
        }


        public void setSl_phoneNumber(String _sl_phoneNumber) {
            this.sl_phoneNumber = _sl_phoneNumber;
        }


        public String getSl_Email() {
            return sl_Email;
        }


        public void setSl_Email(String _sl_Email) {
            this.sl_Email = _sl_Email;
        }


        public String getSl_Date() {
            return salesLeadDate;
        }


        public void setSl_Date(String _sl_Date) {
            this.salesLeadDate = _sl_Date;
        }


        private void setSL_empID(String _empID) {
            this.empID = _empID;
        }


        private String getSL_empID() {
            return empID;
        }

        public void setSL_location(String _location) {
            this.sl_location = _location;
        }


        public String getSl_location() {
            return sl_location;
        }


        public static void printSalesLead(ArrayList<SalesLead> slList) {
            for (SalesLead sales_lead : slList) {
                System.out.printf("%-5s | %-12s | %-15s | %-15s | %-14s | %-10s\n", sales_lead.getSalesLeadID(), sales_lead.getSL_empID(), sales_lead.getSl_firstName() + " " + sales_lead.getSl_lastName(), sales_lead.getSl_phoneNumber(), sales_lead.getSl_Email(), sales_lead.getSl_Date());
                // System.out.println(sales_lead.getSalesLeadID(), sales_lead.getSl_firstName(), sales_lead.getSl_lastName());

            /* index of each object
            System.out.println("Index: " + slList.indexOf(sales_lead));
                */
            /* use this to count sales lead -
            System.out.println("Total number of Sales Lead: " + slList.size());
            */
            }
        }

        public static void printSalesLeadById(ArrayList<SalesLead> slList, int salesLeadID) {
            for (SalesLead sl : slList) {
                if (sl.salesLeadID == salesLeadID) {
                    System.out.printf("%-10s | %-12s | %-10s\n", sl.getSalesLeadID(), sl.getSl_Email(), sl.getSl_phoneNumber());
                }
            }
        }


        public static void printSalesLeadByEmpID(ArrayList<SalesLead> slList, String _empID) {
            for (SalesLead sl : slList) {

                if (sl.empID.equals(_empID)) {
                    System.out.println("Number of Sales Lead: " + slList.size());
                }
            }
        }


        public static void printSalesLeadByLocation(ArrayList<SalesLead> slList, String _location) {
            for (SalesLead sl : slList) {
                if (sl.sl_location.equals(_location)) {
                    System.out.printf("%-5s | %-12s | %-10s | %-10s | %-12s | %-10s\n", sl.getSalesLeadID(), sl.getSl_firstName(), sl.getSl_lastName(), sl.getSl_Email(), sl.getSl_phoneNumber(), sl.getSl_location(), sl.getSl_Date());
                }
            }
        }


    }


