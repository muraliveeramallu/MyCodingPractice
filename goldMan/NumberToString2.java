package goldMan;


class NumberToString2 {

    private static final String ZERO = "zero";
    private static String[] oneToNine = {
            "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
    };

    private static String[] tenToNinteen = {
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static String[] dozens = {
            "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    public static String solution(int number) {
        if(number == 0)
            return ZERO;

        return generate(number).trim();
    }

    public static String generate(int number) {
        if(number >= 1000000000) {
            return generate(number / 1000000000) + " billion " + generate(number % 1000000000);
        }
        else if(number >= 1000000) {
            return generate(number / 1000000) + " million " + generate(number % 1000000);
        }
        else if(number >= 1000) {
            return generate(number / 1000) + " thousand " + generate(number % 1000);
        }
        else if(number >= 100) {
            return generate(number / 100) + " hundred " + generate(number % 100);
        }

        return generate1To99(number);
    }

    private static String generate1To99(int number) {
        if (number == 0)
            return "";

        if (number <= 9)
            return oneToNine[number - 1];
        else if (number <= 19)
            return tenToNinteen[number % 10];
        else {
            return dozens[number / 10 - 1] + " " + generate1To99(number % 10);
        }
    }
    
    public static void main(String a[]) {
    	System.out.println(solution(10));
    	System.out.println(solution(5));
    	System.out.println(solution(55));
    	System.out.println(solution(15));
    	System.out.println(solution(100));
    	System.out.println(solution(105));
    	System.out.println(solution(125));
    	System.out.println(solution(345));
    	System.out.println(solution(700));
    	System.out.println(solution(1000));
    	System.out.println(solution(1002));
    	System.out.println(solution(1345));
    	System.out.println(solution(1023));
    	System.out.println(solution(10000));
    	System.out.println(solution(10005));
    	System.out.println(solution(10045));
    	System.out.println(solution(10345));
    	System.out.println(solution(12000));
    	System.out.println(solution(12345));
    	System.out.println(solution(1000045));
    	
    }
}