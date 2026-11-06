class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()){
            return null;
        }
        String res = "";
        for(int i = 0; i < strs.size(); i++){
            res += i == strs.size() - 1 ? strs.get(i) : strs.get(i) + "\t";
        }
        return res;
    }

    public List<String> decode(String str) {
        if(str == null){
            return new ArrayList<>();
        }
        List<String>res = new ArrayList<>();
        String resStr = "";
        for(int i = 0; i < str.length(); i++){
            
            if(str.charAt(i) == '\t'){
                res.add(resStr);
                resStr = "";
            }
            else{
                resStr += str.charAt(i);
            }
        }
        res.add(resStr);
        return res;
    }
}
