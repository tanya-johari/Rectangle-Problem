package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    void testRectangleArea() {
        int length = 5;
        int breadth = 4;
        int actualArea = 20;

        Rectangle rectangleInst = new Rectangle(length, breadth);
        int expectedArea = rectangleInst.calculateArea();

        assertThat(expectedArea, equalTo(actualArea));
    }

}