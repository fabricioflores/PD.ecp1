package visitor.figure;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class Visitor2Test {
    private Collection<Figure> coleccion = new ArrayList<Figure>();

    @Before
    public void ini() {
        coleccion.add(new Triangle("triangle", 2, 2));
        coleccion.add(new Triangle("triangle", 2, 3));
        coleccion.add(new Circle("circle", 3));
        coleccion.add(new Circle("circle", 3));
        coleccion.add(new Square("square", 2));
    }

    @Test
    public void testVisitorAs() {
        VisitorCount v2 = new VisitorCount();
        for (Figure elemento : coleccion) {
            elemento.accept(v2);
        }
        assertEquals(2, v2.getCountTriangle());
    }

    @Test
    public void testVisitorBs() {
        VisitorCount v2 = new VisitorCount();
        for (Figure elemento : coleccion) {
            elemento.accept(v2);
        }
        assertEquals(2, v2.getCountCircle());
    }
    
    @Test
    public void testVisitorSquare() {
        VisitorCount v2 = new VisitorCount();
        for (Figure elemento : coleccion) {
            elemento.accept(v2);
        }
        assertEquals(1, v2.getCountSquare());
    }

}