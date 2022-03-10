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
        String numStr = String.valueOf(number);
        boolean contain3 = numStr.contains("3");
        boolean contain5 = numStr.contains("5");

        if( contain3 && !contain5 ){
            return "Fizz";
        }
        if( number % 3 == 0 && !contain5 ){
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
