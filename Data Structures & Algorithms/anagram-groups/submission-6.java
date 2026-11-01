class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<Integer>> map = new LinkedHashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            if (map.containsKey(new String(temp))) {
                List<Integer> list = map.get(new String(temp));
                list.add(i);
                map.put(new String(temp), list);
            } else {
                List<Integer> count = new ArrayList<>();
                count.add(i);
                map.put(new String(temp), count);
            }
        }

        Collection<List<Integer>> values = map.values();
        List<List<String>> list = new ArrayList<>();
        for (List<Integer> value : values) {
            List<String> subList = new ArrayList<>();
            List<Integer> innerVal = value;
            for (int j = 0; j < innerVal.size(); j++) {
                subList.add(strs[innerVal.get(j)]);
            }
            list.add(subList);
        }
        return list;
    }
}
