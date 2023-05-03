/* Para resolver esse problema em Java, podemos usar uma abordagem baseada em dois ponteiros. Primeiro, ordenamos o array para que possamos percorrê-lo em ordem crescente e procurar por três números que somam zero. Em seguida, usamos dois ponteiros para percorrer o array em busca de uma combinação de três números que soma zero.
Se a soma dos três números for menor que zero, incrementamos o ponteiro esquerdo. Se a soma for maior que zero, decrementamos o ponteiro direito. Se a soma for igual a zero, adicionamos o triplo ao conjunto de soluções e incrementamos o ponteiro esquerdo e decrementamos o ponteiro direito. Este processo continua até que todos os pares de ponteiros se encontrem. 
*/
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i=0;i<nums.length-2;i++){
            if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
                int left = i + 1, right = nums.length - 1, sum = 0 - nums[i];
                while (left < right){
                    if (nums[left] + nums[right] == sum) {
                        res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left+1]) left++;
                        while (left < right && nums[right] == nums[right-1]) right--;
                        left++;
                        right--;
                    } else if (nums[left] + nums[right] < sum){
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return res;
    }
}