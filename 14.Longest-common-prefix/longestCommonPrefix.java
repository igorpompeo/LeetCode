/*You can use the following function in Java to find the longest common prefix string amongst an array of strings
 * The function first checks if the array is null or empty. If so, it returns an empty string.
 * Otherwise, it initializes the prefix variable to the first string in the array. It then loops through the remaining strings in the array and checks if the current prefix
 * is a prefix of each string. If it is not, the function removes the last character from prefix and repeats the process. If prefix becomes empty, it means there is no common
 * prefix, so the function returns an empty string. If all strings in the array share the same prefix, the function returns the prefix.
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        for (int i=1; i<strs.length; i++){
            while (strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() -1);
                if (prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
}