package extreme.fizzbuzz;

public class FizzBuzzWhizz {

    public void queuingReportNum(int n) {
        for (int i = 1; i <= n; i++) {
            String result = getFizzBuzzWhizz(i);
            System.out.println(result);
        }
    }

    public String getFizzBuzzWhizz(int number){
        String result = "";
        if( number % 3 == 0 ){
            result += "Fizz";
        }
        if( number % 5 == 0 ){
            result += "Buzz";
        }
        if( number % 7 == 0 ){
            result += "Whizz";
        }
        if (result.equals("")) {
            result = String.valueOf(number);
        }
        return result;
    }

}
