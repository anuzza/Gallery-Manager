import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class LinkedQueueTest {

    @Test
    void enqueue() {
        LinkedQueue<Painting> l = new LinkedQueue<Painting>();
        Painting p = new Painting("Amisha", "Existence", "Mandala");
        l.enqueue(p);
        assertEquals(p,l.first());
    }

    @Test
    void dequeue() {
        LinkedQueue<Painting> l = new LinkedQueue<Painting>();
        Painting p = new Painting("Amisha", "Existence", "Mandala");
        l.enqueue(p);
        l.dequeue();
        assertEquals(null,l.first());
    }



    @Test
    void first() {
        LinkedQueue<Painting> l = new LinkedQueue<Painting>();
        Painting p = new Painting("Amisha", "Existence", "Mandala");
        Painting p1 = new Painting("Ayesha", "Enlightment", "OilPainting");
        l.enqueue(p);
        l.enqueue(p1);
        assertEquals(p,l.first());
    }


    @Test
    void isEmpty() {
        LinkedQueue<Painting> l = new LinkedQueue<Painting>();
        assertEquals(true, l.isEmpty());
    }


    @Test
    void size() {
        LinkedQueue<Painting> l = new LinkedQueue<Painting>();
        Painting p = new Painting("Amisha", "Existence", "Mandala");
        l.enqueue(p);
        assertEquals(1, l.size());
    }

    @Test
    void hasNext(){
        LinkedQueue<Painting> l = new LinkedQueue<Painting>();
        Painting p = new Painting("Amisha", "Existence", "Mandala");
        l.enqueue(p);
        Iterator<Painting> itr = l.iterator();
        assertEquals(true, itr.hasNext());
    }

    @Test
    void next(){
        LinkedQueue<Painting> l = new LinkedQueue<Painting>();
        Painting p = new Painting("Amisha", "Existence", "Mandala");
        Painting p1 = new Painting("Ayesha", "Enlightment", "OilPainting");
        l.enqueue(p);
        l.enqueue(p1);
        Iterator<Painting> itr = l.iterator();
        assertEquals(p, itr.next());
        assertEquals(p1, itr.next());
    }



}