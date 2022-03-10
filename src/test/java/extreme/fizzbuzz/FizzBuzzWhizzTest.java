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
    @ValueSource(ints = {14})
    void should_Whizz_when_divisible_by_7_and_neither_contains_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("Whizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {60, 90})
    void should_FizzBuzz_when_divisible_by_3_and_5_and_neither_contains_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("FizzBuzz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {21, 42})
    void should_FizzWhizz_when_divisible_by_3_and_7_and_neither_contains_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("FizzWhizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {140, 280})
    void should_BuzzWhizz_when_divisible_by_5_and_7_and_neither_contains_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("BuzzWhizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {210, 420})
    void should_FizzBuzzWhizz_when_divisible_by_3_and_5_and_7_and_neither_contains_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("FizzBuzzWhizz", result);
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
    @ValueSource(ints = {133})
    void should_Fizz_when_divisible_by_7_and_contain_3_given_number(int number) {
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
    @ValueSource(ints = {63})
    void should_Fizz_when_divisible_by_3_and_7_and_contain_3_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("Fizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {1330})
    void should_Fizz_when_divisible_by_5_and_7_and_contain_3_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("Fizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {630})
    void should_Fizz_when_divisible_by_3_and_5_and_7_and_contain_3_given_number(int number) {
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
    @ValueSource(ints = {56})
    void should_Whizz_when_divisible_by_7_and_contain_5_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("Whizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {15})
    void should_Buzz_when_divisible_by_3_and_5_and_contain_5_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("Buzz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {252})
    void should_Whizz_when_divisible_by_3_and_7_and_contain_5_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("Whizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {245})
    void should_BuzzWhizz_when_divisible_by_5_and_7_and_contain_5_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("BuzzWhizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {105})
    void should_BuzzWhizz_when_divisible_by_3_and_5_and_7_and_contain_5_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("BuzzWhizz", result);
    }


    @ParameterizedTest
    @ValueSource(ints = {17, 47})
    void should_return_number_when_not_divisible_and_contain_7_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals(String.valueOf(number), result);
    }

    @ParameterizedTest
    @ValueSource(ints = {27})
    void should_Fizz_when_divisible_by_3_and_contain_7_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("Fizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {170})
    void should_return_number_when_divisible_by_5_and_contain_7_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals(String.valueOf(number), result);
    }

    @ParameterizedTest
    @ValueSource(ints = {7})
    void should_Whizz_when_divisible_by_7_and_contain_7_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("Whizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {270})
    void should_Fizz_when_divisible_by_3_and_5_and_contain_7_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("Fizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {147})
    void should_FizzWhizz_when_divisible_by_3_and_7_and_contain_7_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("FizzWhizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {70})
    void should_Whizz_when_divisible_by_5_and_7_and_contain_7_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("Whizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {1470})
    void should_FizzWhizz_when_divisible_by_3_and_5_and_7_and_contain_7_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("FizzWhizz", result);
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
    @ValueSource(ints = {532})
    void should_Whizz_when_divisible_by_7_and_contain_3_and_5_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("Whizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {135})
    void should_Buzz_when_divisible_by_3_and_5_and_contain_3_and_5_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("Buzz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {1533})
    void should_Whizz_when_divisible_by_3_and_7_and_contain_3_and_5_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("Whizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {35})
    void should_BuzzWhizz_when_divisible_by_5_and_7_and_contain_3_and_5_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("BuzzWhizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {315})
    void should_BuzzWhizz_when_divisible_by_3_and_5_and_7_and_contain_3_and_5_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("BuzzWhizz", result);
    }


    @ParameterizedTest
    @ValueSource(ints = {37})
    void should_Fizz_when_not_divisible_and_contain_3_and_7_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("Fizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {237})
    void should_Fizz_when_divisible_by_3_and_contain_3_and_7_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("Fizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {370})
    void should_Fizz_when_divisible_by_5_and_contain_3_and_7_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("Fizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {371})
    void should_Fizz_when_divisible_by_7_and_contain_3_and_7_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("Fizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {2370})
    void should_Fizz_when_divisible_by_3_and_5_and_contain_3_and_7_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("Fizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {378})
    void should_Fizz_when_divisible_by_3_and_7_and_contain_3_and_7_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("Fizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {3710})
    void should_Fizz_when_divisible_by_5_and_7_and_contain_3_and_7_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("Fizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {2370})
    void should_Fizz_when_divisible_by_3_and_5_and_7_and_contain_3_and_7_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("Fizz", result);
    }


    @ParameterizedTest
    @ValueSource(ints = {157})
    void should_return_number_when_not_divisible_and_contain_5_and_7_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals(String.valueOf(number), result);
    }

    @ParameterizedTest
    @ValueSource(ints = {57})
    void should_Fizz_when_divisible_by_3_and_contain_5_and_7_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("Fizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {275})
    void should_return_number__when_divisible_by_5_and_contain_5_and_7_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals(String.valueOf(number), result);
    }

    @ParameterizedTest
    @ValueSource(ints = {574})
    void should_Whizz_when_divisible_by_7_and_contain_5_and_7_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("Whizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {75})
    void should_Fizz_when_divisible_by_3_and_5_and_contain_5_and_7_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("Fizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {567})
    void should_FizzWhizz_when_divisible_by_3_and_7_and_contain_5_and_7_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("FizzWhizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {175})
    void should_Whizz_when_divisible_by_5_and_7_and_contain_5_and_7_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("Whizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {1575})
    void should_FizzWhizz_when_divisible_by_3_and_5_and_7_and_contain_5_and_7_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("FizzWhizz", result);
    }


    @ParameterizedTest
    @ValueSource(ints = {1357})
    void should_return_number_when_not_divisible_and_contain_3_and_5_and_7_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals(String.valueOf(number), result);
    }

    @ParameterizedTest
    @ValueSource(ints = {537})
    void should_Fizz_when_divisible_by_3_and_contain_3_and_5_and_7_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("Fizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {1375})
    void should_return_number__when_divisible_by_5_and_contain_3_and_5_and_7_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals(String.valueOf(number), result);
    }

    @ParameterizedTest
    @ValueSource(ints = {3157})
    void should_Whizz_when_divisible_by_7_and_contain_3_and_5_and_7_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("Whizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {375})
    void should_Fizz_when_divisible_by_3_and_5_and_contain_3_and_5_and_7_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("Fizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {357})
    void should_FizzWhizz_when_divisible_by_3_and_7_and_contain_3_and_5_and_7_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("FizzWhizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {3745})
    void should_Whizz_when_divisible_by_5_and_7_and_contain_3_and_5_and_7_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("Whizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {735})
    void should_FizzWhizz_when_divisible_by_3_and_5_and_7_and_contain_3_and_5_and_7_given_number(int number) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String result = fizzBuzzWhizz.getFizzBuzzWhizz(number);
        Assertions.assertEquals("FizzWhizz", result);
    }
}