import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class GalleryManager {
    LinkedQueue<Painting> InventoryQueue = new LinkedQueue<Painting>();
    LinkedQueue<Painting> DisplayQueue = new LinkedQueue<Painting>();
    Iterator<Painting> itr;

    public void add(String fname) throws FileNotFoundException {
        int count = 0;
        Scanner scan = new Scanner(new File(fname));
        while (scan.hasNextLine()) {
            String[] s1 = scan.nextLine().split(",");
           // System.out.println(Arrays.toString(s1));
            Painting p = new Painting(s1[0], s1[1], s1[2]);
            if (count < 10) {
                DisplayQueue.enqueue(p);

            }else{
                InventoryQueue.enqueue(p);


            }
            count++;


        }


    }



    public void printDisplay() {
        itr = DisplayQueue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public void printInventory(){
        itr = InventoryQueue.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public void updateDisplay(){
        int c =0;
        while (c<10){
            DisplayQueue.enqueue(InventoryQueue.dequeue());
            InventoryQueue.enqueue(DisplayQueue.dequeue());
            c++;
        }



        System.out.println(" Updated! ");
    }


}








