package extreme.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzWhizzTest {

    @Test
    void should_Fizz_when_exactly_divisible_by_3_given_number() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(3);
        Assertions.assertEquals("Fizz", result);
    }

    @Test
    void should_Buzz_when_exactly_divisible_by_5_and_not_contain_3_given_number() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(5);
        Assertions.assertEquals("Buzz", result);
    }

    @Test
    void should_Whizz_when_exactly_divisible_by_7_and_not_contain_3_given_number() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(7);
        Assertions.assertEquals("Whizz", result);
    }

    @Test
    void should_FizzBuzz_when_exactly_divisible_by_3_and_5_and_not_contain_3_given_number() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(15);
        Assertions.assertEquals("FizzBuzz", result);
    }

    @Test
    void should_FizzWhizz_when_exactly_divisible_by_3_and_7_and_not_contain_3_given_number() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(21);
        Assertions.assertEquals("FizzWhizz", result);
    }

    @Test
    void should_BuzzWhizz_when_exactly_divisible_by_5_and_7_and_not_contain_3_given_number() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(70);
        Assertions.assertEquals("BuzzWhizz", result);
    }
    @Test
    void should_FizzBuzzWhizz_when_exactly_divisible_by_3_and_5_and_7_and_not_contain_3_given_number() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(105);
        Assertions.assertEquals("FizzBuzzWhizz", result);
    }

    @Test
    void should_Fizz_when_contain_3_given_number() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(315);
        Assertions.assertEquals("Fizz", result);
    }
}