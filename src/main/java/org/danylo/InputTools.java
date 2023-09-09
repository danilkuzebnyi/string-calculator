package org.danylo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputTools {
    public static List<Integer> parseString(String line) {
        return Arrays.stream(line.split("[^\\d|\\-]+"))
                .filter(symbol -> !symbol.equals(""))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
