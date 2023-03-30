package domain;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class VectorTest {

    @Test
    public void testVector() {
        Vector vector= new Vector(50);
        util.Utility.fill(vector);
        vector.sort();
        System.out.println("\nSORTED VECTOR...\n"+vector.toString());
        System.out.println("The vector has "+vector.size()+" elements");
        System.out.println(vector.isEmpty()
        ?"Vector is empty":
        "Vector is not empty");

    }
}