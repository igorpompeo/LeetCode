class Solution {
    public int romanToInt(String s) {
        
        // Crie um mapa que mapeie cada letra romana para seu valor inteiro correspondente.
        Map<Character, Integer> romanToInteger = new HashMap<>();
        romanToInteger.put('I', 1);
        romanToInteger.put('V', 5);
        romanToInteger.put('X', 10);
        romanToInteger.put('L', 50);
        romanToInteger.put('C', 100);
        romanToInteger.put('D', 500);
        romanToInteger.put('M', 1000);

        /*Percorra a string do número romano da direita para a esquerda e compare cada letra com a próxima. Se a letra atual for menor do que a próxima, subtraia o valor da letra atual do valor total. Caso contrário, adicione o valor da letra atual ao valor total.*/
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