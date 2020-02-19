package creator;

import java.util.Scanner;

public class BikeShop {

    public static void main(String[] args) {
        /*
         * Create a Bike object.
         */
        float frontWidth, backWidth, frameLength;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter front Wheel Width: ");
        frontWidth = kb.nextFloat();
        System.out.print("Enter back Wheel Width: ");
        backWidth = kb.nextFloat();
        System.out.print("Enter frame Length: ");
        frameLength = kb.nextFloat();

        Bike bike = new Bike(frontWidth, backWidth, frameLength);

        System.out.println(bike);


    }
}
