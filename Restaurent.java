
import java.util.Scanner;

public class Restaurent {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



            boolean quit = false;
            int sum = 0;
            int tea = 10, coffe = 15, snacks = 10, idili = 8, dosha = 6;
            java.lang.String order = "";
            System.out.println("enter the name:");
            String name = input.nextLine();
            System.out.println("enter the phone no:");
            int ph = input.nextInt();

            do {
                System.out.println("ITEM");
                System.out.println("1.Tea:10");
                System.out.println("2.Coffe:15");
                System.out.println("3.Snacks:10");
                System.out.println("4.Idili:8");
                System.out.println("5.Dosha:6");
                System.out.println("6.Generate bill");
                System.out.println("7.View all transaction");
                System.out.println("8.Quit");

                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter the no.of Tea" + "\n");
                        int a = input.nextInt();
                        sum = sum + (a * tea);
                        order = order.concat("TEA:" + a + " \n");

                        break;
                    case 2:
                        System.out.println("Enter the no.of Coffee" + "\n");
                        int b = input.nextInt();
                        sum = sum + (b * coffe);
                        order = order.concat("COFFE:" + b + "\n");

                        break;
                    case 3:
                        System.out.println("Enter the no of Snacks:");
                        int c = input.nextInt();
                        sum = sum + (c * snacks);
                        order = order.concat("SNACKS:" + c + "\n");
                        break;
                    case 4:
                        System.out.println("Enter the no.of Idili:");
                        int d = input.nextInt();
                        sum = sum + (d * idili);
                        order = order.concat("IDILI:" + d + "\n");
                        break;
                    case 5:
                        System.out.println("Enter the no.of Dosha:");
                        int e = input.nextInt();
                        sum = sum + (e * dosha);
                        order = order.concat("DOSHA:" + e + "\n");
                        break;
                    case 6:
                        System.out.println("name:" + name);
                        System.out.println("phone no:" + ph);

                        System.out.println("Your total bill=" + sum);
                        break;
                    case 7:
                        System.out.println("name:" + name);
                        System.out.println("phone no:" + ph);


                        System.out.println("Your Orders are:\n" + order);
                        break;
                    case 8:

                        quit = true;

                        break;
                    default:
                        System.out.println("Wrong input");
                }

            } while (!quit);
        System.out.println("Thank you");
        }
    }




