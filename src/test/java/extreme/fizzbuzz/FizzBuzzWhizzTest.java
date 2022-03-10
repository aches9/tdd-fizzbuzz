package extreme.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzWhizzTest {

    @Test
    void should_Fizz_when_exactly_divisble_by_3_given_number() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(3);
        Assertions.assertEquals("Fizz", result);
    }

    @Test
    void should_Fizz_when_exactly_divisble_by_5_given_number() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(5);
        Assertions.assertEquals("Buzz", result);
    }

    @Test
    void should_Fizz_when_exactly_divisble_by_7_given_number() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(7);
        Assertions.assertEquals("Whizz", result);
    }

}