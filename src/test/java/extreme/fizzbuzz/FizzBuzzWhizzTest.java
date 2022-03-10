package extreme.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FizzBuzzWhizzTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 4})
    void should_return_number_when_not_divisible_and_neither_contains_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals(String.valueOf(number), result);
    }

    @ParameterizedTest
    @ValueSource(ints = {6, 12})
    void should_Fizz_when_divisible_by_3_and_neither_contains_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("Fizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {10, 20})
    void should_Buzz_when_divisible_by_5_and_neither_contains_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("Buzz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {60, 90})
    void should_FizzBuzz_when_divisible_by_3_and_5_and_neither_contains_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("FizzBuzz", result);
    }



    @ParameterizedTest
    @ValueSource(ints = {13, 23})
    void should_Fizz_when_not_divisible_and_contain_3_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("Fizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 33})
    void should_Fizz_when_divisible_by_3_and_contain_3_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("Fizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {130})
    void should_Fizz_when_divisible_by_5_and_contain_3_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("Fizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {30})
    void should_Fizz_when_divisible_by_3_and_5_and_contain_3_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("Fizz", result);
    }



    @ParameterizedTest
    @ValueSource(ints = {52, 58})
    void should_return_number_when_not_divisible_and_contain_5_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals(String.valueOf(number), result);
    }

    @ParameterizedTest
    @ValueSource(ints = {51, 54})
    void should_return_number_when_divisible_by_3_and_contain_5_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals(String.valueOf(number), result);
    }

    @ParameterizedTest
    @ValueSource(ints = {5})
    void should_Buzz_when_divisible_by_5_and_contain_5_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("Buzz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {15})
    void should_Buzz_when_divisible_by_3_and_5_and_contain_5_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("Buzz", result);
    }




    @ParameterizedTest
    @ValueSource(ints = {53})
    void should_return_number_when_not_divisible_and_contain_3_and_5_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals(String.valueOf(number), result);
    }

    @ParameterizedTest
    @ValueSource(ints = {153})
    void should_return_number_when_divisible_by_3_and_contain_3_and_5_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals(String.valueOf(number), result);
    }

    @ParameterizedTest
    @ValueSource(ints = {235})
    void should_Buzz_when_divisible_by_5_and_contain_3_and_5_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("Buzz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {135})
    void should_Buzz_when_divisible_by_3_and_5_and_contain_3_and_5_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("Buzz", result);
    }
}