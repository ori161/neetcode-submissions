class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()){
            return null;
        }
        StringBuilder res = new StringBuilder();
        for(String s : strs){
            res.append(s.length()).append('#').append(s);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        if(str == null){
            return new ArrayList<>();
        }
        List<String>res = new ArrayList<>();
        int i = 0;
        int j;
        while(i < str.length()){
            j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + length;
            res.add(str.substring(i, j));
            i = j;
        }
        return res;
    }
}
