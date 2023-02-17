package Week6;

import java.util.Scanner;

public class ShippingStatus {

    public static void main(String[] args) {

       /* Scanner keysIn = new Scanner(System.in);
        System.out.println("Enter the shipment status:");
        int status = keysIn.nextInt();*/

      /*  String action = "";
        switch (status) {
            case 1:
                action = "Phone vendor and request delivery.";
                break;
            case 2:
                action = "Phone customer and warn of late shipment.";
                break;
            case 3:
                action = "Prepare shipping labels.";
                break;
            case 4:
                action = "Order additional product from vendor.";
                break;
            default: */


                Scanner input = new Scanner(System.in);
                System.out.println("Enter the day:");
                int numberOfDays = input.nextInt();

                String days = "";
                switch (numberOfDays) {
                    case 1:
                        days = "Sunday";
                        break;
                    case 2:
                        days = "Monday";
                        break;
                    case 3:
                        days = "Tuesday";
                        break;
                    case 4:
                        days = "Wednesday";
                        break;
                    case 5:
                        days = "Thursday";
                        break;
                    case 6:
                        days = "Friday";
                        break;
                    case 7:
                        days = "Saturday";
                        break;
                    default:
                        System.out.println(numberOfDays);

                }
        }
    }

