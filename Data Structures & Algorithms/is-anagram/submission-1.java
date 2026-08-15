class Solution {
    public boolean isAnagram(String s, String t) {

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char c : arr1) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (char c : arr2) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        return map1.equals(map2);
    }
}