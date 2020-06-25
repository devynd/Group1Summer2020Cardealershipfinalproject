import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {


        public static String getInput() {
            Scanner scnr = new Scanner(System.in);
            return scnr.nextLine();
        }


        public static String testAlpha(String alphaCharacter) {
            try {

                if (alphaCharacter.matches("^[a-zA-Z]*$")) {
                    return alphaCharacter;
                } else {
                    throw new InputMismatchException("not alpha");
                }

            } catch (InputMismatchException notAnAlpha) {
                System.out.println("Invalid input. Please try again.");
                return testAlpha(getInput());

            }

        }


        public static String testEmail(String email) {
            try {

                if (email.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$")) {
                    return email;
                } else {
                    throw new InputMismatchException("invalid");
                }


            } catch (InputMismatchException notAnEmail) {
                System.out.println("Invalid input. Please try again.");
                return testEmail(getInput());

            }
        }


        public static String testPhone(String phone) {
            try {

                if (phone.matches("^[(]+[0-9]+[)]+[\\s]+[0-9]+[-]+[0-9]+$")) {
                    return phone;
                } else {
                    throw new InputMismatchException("invalid");
                }


            } catch (InputMismatchException notAnEmail) {
                System.out.println("Invalid input. Please try again. \n Please use this format: (012) 345-6789");
                return testPhone(getInput());

            }
        }

        public static String testDouble(String price) {
            try {

                if (price.matches("\\d+\\.\\d*$")) {
                    return price;
                } else {
                    throw new InputMismatchException("not price");
                }

            } catch (InputMismatchException notAnAlpha) {
                System.out.println("Invalid input. Please try again.");
                return testDouble(getInput());

            }

        }


        public static String testInt(String input) {
            try {
                if (input.matches("\\d*$")) {
                    return input;
                } else {
                    throw new NumberFormatException("not an integer");
                }
            } catch (NumberFormatException notAnInt) {
                System.out.println("Invalid input. You did not enter an integer number. Please try again. \n");
                return testInt(getInput());
            }


        }


        public static String testAlphaNumeric(String input) {
            try {
                if (input.matches("^[a-zA-Z0-9]*$")) {
                    return input;
                } else {
                    throw new NumberFormatException("not alphanumeric");
                }
            } catch (NumberFormatException notAnInt) {
                System.out.println("Invalid input. You did not enter alphanumeric characters. Please try again. \n");
                return testAlphaNumeric(getInput());
            }
        }

        public static String testDate(String date) {
            try {

                if (date.matches("[0-9]+[/]+[\\d]+[/]+[\\d]*$")) {
                    return date;
                } else {
                    throw new InputMismatchException("invalid");
                }


            } catch (InputMismatchException notAnEmail) {
                System.out.println("Invalid input. Please try again.");
                return testDate(getInput());

            }
        }

        public static String testLocation(String input) {
            try {
                if ((input.matches("SantaRosa")) || (input.matches("Waterfall"))) {
                    return input;
                } else {
                    throw new InputMismatchException("invalid");
                }
            } catch (InputMismatchException LocationNotFound) {
                System.out.println("Invalid input. Enter only either 'SantaRosa' or 'Waterfall'. Please try again. \n");
                return testLocation(getInput());
            }
        }
    }

