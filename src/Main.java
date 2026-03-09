import nonveg.ChickenBiryani;
import nonveg.MuttonBiryani;
import vegtarian.VegBiryani;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.println("Hello, Welcome to ABC Restaurant");
        System.out.print("Press 5 to Continue: ");
        Scanner getInput = new Scanner(System.in);

        int input = getInput.nextInt();
        if (input == 5) {
            System.out.println("MenuCard");
            System.out.println("1.Veg");
            System.out.println("2.Non-Veg");
            System.out.println("0.Exit");

            Scanner getMenuOption = new Scanner(System.in);
            int menuId = getMenuOption.nextInt();
            if (menuId == 1) {

                System.out.println("VEGETARIAN");
                System.out.println("1.Veg-Biryani");
                System.out.println("0.Exit");
                Scanner getVegId = new Scanner(System.in);
                int vegId = getVegId.nextInt();
                if (vegId == 1) {
                    VegBiryani vegBiryani = new VegBiryani();
                    vegBiryani.prepare();
                }

            }
            if (menuId == 2) {
                System.out.println("MenuCard");
                System.out.println("1.Chicken-Biryani");
                System.out.println("2.Mutton-Biryani");
                System.out.println("0.Exit");
                Scanner getNonVegId = new Scanner(System.in);
                int nonVegId = getNonVegId.nextInt();


                if (nonVegId == 1) {
                    ChickenBiryani chickenBiryani = new ChickenBiryani();
                    chickenBiryani.prepare();
                } else if (nonVegId == 2) {
                    MuttonBiryani muttonBiryani = new MuttonBiryani();
                    muttonBiryani.prepare();
                }

            } else if (menuId == 0) {
                System.exit(0);
            }
        } else {
            System.out.println("Invalid Input!!!");
        }


    }
}