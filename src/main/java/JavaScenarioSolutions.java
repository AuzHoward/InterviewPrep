public class JavaScenarioSolutions {

    public boolean isIntegerPalindrome(int x) {
        String str = Integer.toString(x);
        int beg = 0;
        int end = str.length() - 1;

        boolean result;
        for(result = true; beg < end; --end) {
            char left = str.charAt(beg);
            char right = str.charAt(end);
            if (left != right) {
                result = false;
                break;
            }

            ++beg;
        }

        return result;
    }
}
