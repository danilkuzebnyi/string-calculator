package org.danylo;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InputToolsTest {

    @Test
    void parseString_WithCommaDelimiter() {
        List<Integer> actual = InputTools.parseString("1,2,3");
        assertEquals(Arrays.asList(1, 2, 3), actual);
    }

    @Test
    void parseString_WithPointDelimiter() {
        List<Integer> actual = InputTools.parseString("1.2.3");
        assertEquals(Arrays.asList(1, 2, 3), actual);
    }

    @Test
    void parseString_WithSpaceDelimiter() {
        List<Integer> actual = InputTools.parseString("1 2 3");
        assertEquals(Arrays.asList(1, 2, 3), actual);
    }

    @Test
    void parseString_WithTwoSpacesDelimiter() {
        List<Integer> actual = InputTools.parseString("1  2  3");
        assertEquals(Arrays.asList(1, 2, 3), actual);
    }

    @Test
    void parseString_WithSemicolonDelimiter() {
        List<Integer> actual = InputTools.parseString("1;2;3");
        assertEquals(Arrays.asList(1, 2, 3), actual);
    }

    @Test
    void parseString_WithColonDelimiter() {
        List<Integer> actual = InputTools.parseString("1:2:3");
        assertEquals(Arrays.asList(1, 2, 3), actual);
    }

    @Test
    void parseString_WithDifferentDelimitersTogether() {
        List<Integer> actual = InputTools.parseString("1;. 2;. 3;.");
        assertEquals(Arrays.asList(1, 2, 3), actual);
    }

    @Test
    void parseString_WithDelimiterInTheStartOfTheLine() {
        List<Integer> actual = InputTools.parseString(" ,1, 2, 3,");
        assertEquals(Arrays.asList(1, 2, 3), actual);
    }
}