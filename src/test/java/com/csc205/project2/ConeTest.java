package com.csc205.project2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This test class was generated with AI assistance to verify the functionality of the Cone class.
 */
public class ConeTest {

    private Cone cone;

    @BeforeEach
    public void setUp() {
        cone = new Cone(3.0, 5.0); // Radius = 3.0, Height = 5.0
    }

    @Test
    public void testGetHeight() {
        assertEquals(5.0, cone.getHeight());
    }

    @Test
    public void testSetHeight() {
        cone.setHeight(6.0);
        assertEquals(6.0, cone.getHeight());
    }

    @Test
    public void testGetRadius() {
        assertEquals(3.0, cone.getRadius());
    }

    @Test
    public void testSetRadius() {
        cone.setRadius(4.0);
        assertEquals(4.0, cone.getRadius());
    }

    @Test
    public void testSurfaceArea() {
        // Expected surface area for radius 3.0 and height 5.0
        assertEquals(83.22976079115259, cone.surfaceArea(), 0.0001); // Precision up to 14 decimal places
    }


    @Test
    public void testVolume() {
        // Expected volume for radius 3.0 and height 5.0
        assertEquals(47.12388980384689, cone.volume(), 0.0001); // Precision up to 14 decimal places
    }


    @Test
    public void testToString() {
        String expected = "Cone {radius=3.0, height=5.0, surface area=83.22976079115259, volume=47.12388980384689}";
        assertEquals(expected, cone.toString());
    }
}
