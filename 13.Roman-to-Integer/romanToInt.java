class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanToInteger = new HashMap<>();
        romanToInteger.put('I', 1);
        romanToInteger.put('V', 5);
        romanToInteger.put('X', 10);
        romanToInteger.put('L', 50);
        romanToInteger.put('C', 100);
        romanToInteger.put('D', 500);
        romanToInteger.put('M', 1000);
        int res = 0;
        for (int i = s.length()-1; i >= 0; i--){
            char c = s.charAt(i);
            int val = romanToInteger.get(c);
            if (i < s.length() -1 && romanToInteger.get(s.charAt(i+1)) > val){
                res -= val;
            } else {
                res += val;
            }
        }
        return res;
    }
}