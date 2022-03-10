package extreme.fizzbuzz;

public class FizzBuzzWhizz {

    public void queuingReportNum(int n) {
        for (int i = 1; i <= n; i++) {
            String result = getFizzBuzzWhizz(i);
            System.out.println(result);
        }
    }

    public String getFizzBuzzWhizz(int number){
        String result = String.valueOf(number);
        if( number % 3 == 0 ){
            return "Fizz";
        }
        if( number % 5 == 0 ){
            return "Buzz";
        }
        if( number % 7 == 0 ){
            return "Whizz";
        }
        return result;
    }

}