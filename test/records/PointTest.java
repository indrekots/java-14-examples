package records;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void toStringOutput() {
        var point = new Point(4, 7);
        assertEquals("Point[x=4.0, y=7.0]", point.toString());
    }

    @Test
    void accessor() {
        var point = new Point(10, 3);
        assertEquals(10, point.x());
        assertEquals(3, point.y());
    }

    @Test
    void equals() {
        var point1 = new Point(12, 5);
        var point2 = new Point(12, 5);
        assertEquals(point1, point2);
    }

    @Test
    void notEquals() {
        var point1 = new Point(12, 5);
        var point2 = new Point(1, 6);
        assertNotEquals(point1, point2);
    }

    @Test
    @DisplayName("point at (-10, 10) is not allowed")
    void invalidPoint() {
        assertThrows(IllegalArgumentException.class, () -> new Point(-10, 10));
    }

    @Test
    @DisplayName("static factory method creates a point at origin")
    void staticFactoryMethod() {
        var origin = Point.origin();
        assertEquals(origin, new Point(0, 0));
    }


    @Test
    void distanceTo() {
        var point = new Point(1, 1);
        var origin = Point.origin();

        System.out.println(point.distanceTo(origin));
    }
}
