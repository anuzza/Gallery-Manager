import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinearNodeTest {

    @Test
    void setNext() {
        LinearNode<Painting> node = new LinearNode<Painting>();
        LinearNode<Painting> n = new LinearNode<Painting>();
        node.setNext(n);
        assertEquals(n, node.getNext());
    }

    @Test
    void setElement() {
        LinearNode<Painting> node = new LinearNode<Painting>();
        Painting p = new Painting("Amisha", "Existence", "Mandala");
        node.setElement(p);
        assertEquals(p, node.getElement());
    }

}