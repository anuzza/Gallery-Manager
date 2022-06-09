import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaintingTest {
    @Test
    void EmptyConstructor(){
        Painting p = new Painting();
        assertNotNull(p);

    }

    @Test
    void NonEmptyConstructor(){
        Painting p = new Painting("Amisha", "Existence", "Mandala");
        assertEquals("Amisha", p.getArtist());
        assertEquals("Existence", p.getName());
        assertEquals("Mandala", p.getStyle());

    }

    @Test
    void setArtist() {
        Painting p = new Painting();
        p.setArtist("Amisha");
        assertEquals("Amisha", p.getArtist());

    }

    @Test
    void setName() {
        Painting p = new Painting();
        p.setName("Existence");
        assertEquals("Existence", p.getName());
    }

    @Test
    void setStyle() {
        Painting p = new Painting();
        p.setStyle("Mandala");
        assertEquals("Mandala",p.getStyle() );
    }
}