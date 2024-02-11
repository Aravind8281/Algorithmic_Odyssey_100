class Solution {
    public int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = romanValues.get(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int current = romanValues.get(s.charAt(i));
            int previous = romanValues.get(s.charAt(i - 1));

            if (current > previous) {
                result += current - 2 * previous;
            } else {
                result += current;
            }
        }

        return result;
    }
}
