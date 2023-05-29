package by.teachmeskills.homeworks.hw_100323.part1_task3_strings;

public class StringUtils {
    private StringUtils() {
    }

    public static void main(String[] args) {
        stringLastSymbol();
        System.out.println("*************************************");

        endString();
        System.out.println("*************************************");

        startWithSubstring();
        System.out.println("*************************************");

        containsSubstring("Счастливые часов не наблюдают", "час");
        System.out.println("*************************************");

        toLowerToUpperCase();
        System.out.println("*************************************");

        StringBuilder strb1 = arithmeticExpressions(3, 56);
        System.out.println(strb1);
        System.out.println("*************************************");

        StringBuilder strb2 = changeString(new StringBuilder("3 + 2 = 5"));
        System.out.println(strb2);
        System.out.println("*************************************");

        returnTwoMiddleSymbols("good", "days");
        System.out.println("*************************************");

        String s = "Око за око зуб за зуб";
        String[] words = s.split(" ");
        for (String word : words) {
            if (findPalindrome(word)) {
                System.out.println(word);
            }
        }
        System.out.println("*************************************");

        String spl = splitString("Your time is limited, so don’t waste it living someone else’s life");
        String[] parts = spl.split(" ");
        for (String f : parts) {
            System.out.println(f);
        }
        System.out.println("******************************************");

    }

    private static void stringLastSymbol() {
        String str1 = "Hello world";
        System.out.println(str1.charAt(10));
    }

    private static void endString() {
        String str2 = "Hello world!!";
        boolean end = str2.endsWith("!!!");
        System.out.println(end);
    }

    private static void startWithSubstring() {
        String str3 = "Сиреневенький синхрофазатрон очень красивый";
        boolean start = str3.startsWith("Сиреневенький синхрофазатрон");
        System.out.println(start);
    }

    private static void containsSubstring(String st, String sub) {
        boolean result = st.contains(sub);
        System.out.println(result);
    }

    private static void toLowerToUpperCase() {
        String str5 = "А РоЗа УпАла На ЛаПу АзОрА";
        System.out.println(str5.toLowerCase());
        System.out.println(str5.toUpperCase());
    }

    private static StringBuilder arithmeticExpressions(int a, int b) {
        StringBuilder sum = new StringBuilder();
        sum.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n")
                .append(a).append(" - ").append(b).append(" = ").append(a - b).append("\n")
                .append(a).append(" * ").append(b).append(" = ").append(a * b);
        return sum;

    }

    private static StringBuilder changeString(StringBuilder arithmeticExpression) {
        int a = arithmeticExpression.indexOf("=");
        arithmeticExpression.deleteCharAt(a);
        arithmeticExpression.insert(a, " равно ");
        return arithmeticExpression;

    }

    private static void returnTwoMiddleSymbols(String g, String d) {
        String mergedWords = g.concat(d);
        String substr = mergedWords.substring(3, 5);
        System.out.println(substr);

    }

    public static boolean findPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder sbReverse = sb.reverse();
        return s.equalsIgnoreCase(String.valueOf(sbReverse));
    }

    private static String splitString(String spl) {
        return spl;

    }

}

