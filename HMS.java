import java.io.*;
import java.util.Scanner;

class Hotel {
    public int[][] room = new int[5][4];
    public int counter;

    public void features() {
        System.out.println(
                "                                                                                   Luxury Room");
        System.out.println();
        System.out.println(
                "                                           Doubles                                                                                Single");
        System.out.println(
                "                                        King Size Bed                                                                              Diwan");
        System.out.println(
                "                                       Air Conditioned                                                                        Air Conditioned");
        System.out.println(
                "                                       Free Bar Access                                                                        Free Bar Access");
        System.out.println(
                "                                Charges for one day & night:Rs.400                                                      Charges for one day & night:Rs.300");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(
                "                                                                                   DELUXE ROOM");
        System.out.println();
        System.out.println(
                "                                           Doubles                                                                                Single");
        System.out.println(
                "                                       Queen Size Bed                                                                              Diwan");
        System.out.println(
                "                                Charges for one day & night:Rs.350                                                     Charges for one day & night:Rs.250");
    }

    public int availability(int choice) {
        int check = 0; // checking the room is available or not
        for (int i = 0; i < 5; i++)
            if (room[choice][i] == 0)
                return 0;
            else {
                check++;
                if (check == 5)
                    return 1;
            }
        return 0;
    }

    public int bookroom(int choice, int counter) { // allocating room to customer
        int i;
        for (i = 0; i < 5; i++)
            if (room[choice][i] == 0) {
                room[choice][i] = counter;
                break;
            }
        return i;
    }

    public int food(int floor, int room_no) // this method will help customer to choose food and return the total food
                                            // cost
    {
        int total_cost = 0, quantity = 0;
        char choice;
        Scanner sc = new Scanner(System.in);
        if (room[floor][room_no] != 0) {
            do {
                int food_cost = 0, y = 0, x = 0;
                System.out.println("Kindly choose what would you like to have");
                System.out.println(" 1.Starters \n 2.Salad \n 3.Sizzlers \n 4.Main Course \n 5.Drinks");
                x = sc.nextInt();
                switch (x) {
                    case 1:
                        System.out.println("Kindly choose what would you like to order");
                        System.out.println(
                                " 1.Garlic Bread     Rs.200 \n 2.Cheese ball      Rs.350 \n 3.Mexiacan Nachos  Rs.300 \n 4.Italian roll     Rs.280");
                        y = sc.nextInt();
                        System.out.println("Enter the quantity of the same");
                        quantity = sc.nextInt();
                        break;

                    case 2:
                        System.out.println("Kindly choose what would you like to order");
                        System.out.println(
                                " 5.Mustard Salad        Rs.350 \n 6.Mexican pasta Salad  Rs.500 \n 7.Arabic Fattoush      Rs.650 \n 8.Spinach Salad        Rs.250");
                        y = sc.nextInt();
                        System.out.println("Enter the quantity of the same");
                        quantity = sc.nextInt();
                        break;

                    case 3:
                        System.out.println("Kindly choose what would you like to order");
                        System.out.println(
                                "9.Mexican Veg Sizzler  Rs.350 \n10.Italian Veg Sizzler  Rs.450 \n11.Veg BBQ Sizzler      Rs.500 \n12.PNR Sizzler          Rs.500");
                        y = sc.nextInt();
                        System.out.println("Enter the quantity of the same");
                        quantity = sc.nextInt();
                        break;

                    case 4:
                        System.out.println("Kindly choose what would you like to order");
                        System.out.println(
                                " 13.Mexican Rice   Rs.299 \n 14.Spaghetti      Rs.599 \n 15.Alfredo Pasta  Rs.699 \n 16.Angel Pasta    Rs.699");
                        y = sc.nextInt();
                        System.out.println("Enter the quantity of the same");
                        quantity = sc.nextInt();
                        break;
                    case 5:
                        System.out.println("Kindly choose what would you like to order");
                        System.out.println(
                                " 17.Virgin Mojito    Rs.199 \n 18.Tonic Water      Rs.149 \n 19.Cold Coffee      Rs.299 \n 20.Fresh Lime Soda  Rs.169");
                        y = sc.nextInt();
                        System.out.println("Enter the quantity of the same");
                        quantity = sc.nextInt();
                        break;

                    default:
                        System.out.println("Inavlid Input");
                }
                switch (y) {
                    case 1:
                        food_cost = 200;
                        break;
                    case 2:
                        food_cost = 350;
                        break;
                    case 3:
                        food_cost = 300;
                        break;
                    case 4:
                        food_cost = 280;
                        break;
                    case 5:
                        food_cost = 350;
                        break;
                    case 6:
                        food_cost = 500;
                        break;
                    case 7:
                        food_cost = 650;
                        break;
                    case 8:
                        food_cost = 250;
                        break;
                    case 9:
                        food_cost = 350;
                        break;
                    case 10:
                        food_cost = 450;
                        break;
                    case 11:
                        food_cost = 500;
                        break;
                    case 12:
                        food_cost = 500;
                        break;
                    case 13:
                        food_cost = 299;
                        break;
                    case 14:
                        food_cost = 599;
                        break;
                    case 15:
                        food_cost = 699;
                        break;
                    case 16:
                        food_cost = 699;
                        break;
                    case 17:
                        food_cost = 199;
                        break;
                    case 18:
                        food_cost = 149;
                        break;
                    case 19:
                        food_cost = 299;
                        break;
                    case 20:
                        food_cost = 169;
                        break;
                    default:
                        System.out.println("Invalid Input");
                }
                food_cost = food_cost * quantity;
                total_cost = total_cost + food_cost;
                System.out.println("You order is of only Rs." + total_cost);
                System.out.println("Press Y if you want to order something else otherwise press N");
                choice = sc.next().charAt(0);
            } while (choice == 'Y' || choice == 'y');
        } else
            System.out.println("\nSorry! You have entered wrong room number");
        return total_cost;
    }

    public int bill(int floor, int food_cost, int days) {
        int amount = 0;
        if (floor == 1)
            amount = 400;
        else if (floor == 2)
            amount = 350;
        else if (floor == 3)
            amount = 300;
        else
            amount = 250;
        amount = days * amount + food_cost;
        return amount;
    }

    public void checkout(int floor, int room_no, int days, int food_cost) // deallocating room from customer
    {
        if (room[floor][room_no] != 0) {
            int amount = bill(floor, food_cost, days);
            System.out.println("\nYou have to pay " + amount + " Rupees.\n");
            room[floor][room_no] = 0;
            System.out.println("Checked Out");
        } else
            System.out.println("\nSorry! You have entered wrong room number");
    }

    public int read_counter() {
        return counter = 1;
    }

    public int customer_id(int room_no, int floor) {
        return room[floor][room_no];
    }

    public void counter_update() {
        counter++;
    }

}

class Customer {
    int customer_id;
    String name;
    String phone;
    String gender;
    String address;
    int room_number;
    int stay_days;
    int food_cost;

    public Customer() {
        food_cost = 0;
    }

    public void food_cus(int food_cost) {
        this.food_cost = food_cost;
    }

    public int read_days() {
        return stay_days;
    }

    public int read_foodcost() {
        return food_cost;
    }

    public int register(int choice, int num, int counter) // taking the customer information for doubles room
    {
        Scanner s = new Scanner(System.in);
        customer_id = counter;
        System.out.println("Enter name:");
        name = s.nextLine();
        System.out.println("Enter gender:");
        gender = s.nextLine();
        System.out.println("Enter phone number:");
        phone = s.nextLine();
        System.out.println("Enter the address:");
        address = s.nextLine();
        System.out.println("Enter days you want to stay:");
        stay_days = s.nextInt();
        room_number = choice * 100 + (num + 1);
        System.out.println("\n Room Booked\n Your room number in hotel is:" + room_number);
        return stay_days;
    }
}

// driver code
public class HMS {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int food_cost = 0, counter = 0, choice1, choice2, choice3, choice4, days = 0, flag, ID;
        char ch;
        Customer C = new Customer();
        Hotel H = new Hotel();
        do {
            System.out.println("\nEnter your choice :\n1.Checkin\n2.Order food\n3.Checkout\n4.Exit\n");
            choice1 = s.nextInt();
            switch (choice1) {
                case 1:
                    H.features();
                    System.out.println(
                            "\nChoose room type :\n1.Luxury Double Room \n2.Deluxe Double Room \n3.Luxury Single Room \n4.Deluxe Single Room\n");
                    choice2 = s.nextInt();
                    flag = H.availability(choice2);
                    if (flag == 0) // book room if room available
                    {
                        counter = H.read_counter();
                        choice3 = H.bookroom(choice2, counter);
                        days = C.register(choice2, choice3, counter);
                        H.counter_update(); // update customer ID for next future customer
                    } else
                        System.out.println("No room available.");
                    break;
                case 2:
                    System.out.println("Enter the room number\n");
                    choice2 = s.nextInt();
                    choice3 = choice2 % 10; // calculate the room number
                    choice4 = choice2 / 100; // calculate the floor number
                    ID = H.customer_id(choice3, choice4);
                    food_cost = H.food(choice3, choice4);
                    C.food_cus(food_cost);
                    break;
                case 3:
                    System.out.print("Enter the room number\n");
                    choice2 = s.nextInt();
                    choice3 = choice2 % 10; // calculate the room number
                    choice4 = choice2 / 100; // calculate the floor number
                    ID = H.customer_id(choice3, choice4);
                    food_cost = C.read_foodcost();
                    days = C.read_days();
                    if (choice3 < 6 && choice4 < 5)
                        H.checkout(choice4, choice3, days, food_cost);
                    else
                        System.out.println("Room doesn't exist");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid Input");
            }
            System.out.println("\nDo you want to go back to home page");
            System.out.println("\nEnter Y for yes and N for no:");
            ch = s.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
    }
}