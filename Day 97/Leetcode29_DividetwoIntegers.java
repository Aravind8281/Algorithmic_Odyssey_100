class Solution {
    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        boolean isNegative = (dividend < 0) ^ (divisor < 0);
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);

        long result = 0;

        while (absDividend >= absDivisor) {
            long temp = absDivisor;
            long multiple = 1;

            while (absDividend >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            absDividend -= temp;
            result += multiple;
        }
        result = isNegative ? -result : result;
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return Integer.MAX_VALUE;
        }
        return (int) result;
    }
}
