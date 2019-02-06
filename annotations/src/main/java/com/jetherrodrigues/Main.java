package com.jetherrodrigues;

/**
 * @author Jether Rois.
 *
 */
public class Main {
    private static final JsonSerializer SERIALIZER = new JsonSerializer();
    public static void main( String[] args ) throws JsonSerializeException {        
        SERIALIZER.serialize(new Car("Chevrolet", "Cruze", "2014"));        
    }
}
