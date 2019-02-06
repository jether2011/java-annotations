package com.jetherrodrigues;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;
/**
 * @author Jether Rois.
 */
public class ApplicationTest {

    @Test(expected = NullPointerException.class)
    public void trySerializeNullObjectAndThrowsException() throws JsonSerializeException {
        Car nullObject = null;
        new JsonSerializer().serialize(nullObject);
    }

    @Test
	public void serializeCarObjectEnsureCorrectOutputJson() throws JsonSerializeException {
		JsonSerializer serializer = new JsonSerializer();
        Car car = new Car("Chevrolet", "Cruze", "2014");
        assertThat(serializer.serialize(car), isExpectedCarJson(car));
	}
	
	private static Matcher<String> isExpectedCarJson(Car car) {
		return Matchers.isOneOf(
			"{\"manufacturer\":\"" + car.getMake() + "\",\"model\":\"" + car.getModel() + "\"}",
			"{\"model\":\"" + car.getModel() + "\",\"manufacturer\":\"" + car.getMake() + "\"}"
		);
	}
}
