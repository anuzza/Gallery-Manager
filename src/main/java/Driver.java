import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) throws FileNotFoundException {
        GalleryManager g = new GalleryManager();
        g.add("Art.txt");

        String again;

        int choose;




        do {
            System.out.println("\nChoose an action: \n1. Print the current Paintings and their info in Display\n" +
                    "2. Print all the paintings and their info in the inventory queue\n" +
                    "3. Update the Queue\n" +
                    "4. Exit\n");
            Scanner scan2 = new Scanner(System.in);
            choose = scan2.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("*************************************************** Paintings in the display **************************************************");
                    g.printDisplay();
                    break;

                case 2:
                    System.out.println("**************************************************** Paintings in the Inventory **************************************************");
                    g.printInventory();
                    break;

                case 3:
                    g.updateDisplay();
                    break;
            }




        } while (choose != 4);






    }
}




