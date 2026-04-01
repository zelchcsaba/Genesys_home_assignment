package assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;

public class DigitMappingValidation {

    private final Solver solver = new Solver();

    @Test
    public void testDigitMappingWithValidInput() {
        String digits = "2";
        List<String> result = solver.mapping(digits);
        List<String> expected = List.of("a","b","c");
        assertEquals(expected, result);
    }

    @Test
    public void testDigitMapping() {
        String digits = "23";
        List<String> result = solver.mapping(digits);
        List<String> expected = List.of("ad","ae","af","bd","be","bf","cd","ce","cf");
        assertEquals(expected, result);
    }

    @Test
    public void testDigitMappingWithInvalidInput() {
        String digits = "1a";
        List<String> result = solver.mapping(digits);
        List<String> expected = List.of();
        assertEquals(expected, result);
    }

    @Test
    public void testDigitMappingWithEmptyInput() {
        String digits = "";
        List<String> result = solver.mapping(digits);
        List<String> expected = List.of();
        assertEquals(expected, result);
    }

    @Test
    public void testDigitMappingWithNullInput() {
        String digits = null;
        List<String> result = solver.mapping(digits);
        List<String> expected = List.of();
        assertEquals(expected, result);
    }

    @Test
    public void testDigitMappingWithTooLongInput() {
        String digits = "23456";
        List<String> result = solver.mapping(digits);
        List<String> expected = List.of();
        assertEquals(expected, result);
    }

    @Test
    void testMaxLengthValid() {
        List<String> result = solver.mapping("2345");
        assertFalse(result.isEmpty());
    }
}
