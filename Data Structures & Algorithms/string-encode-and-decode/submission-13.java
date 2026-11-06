class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()){
            return null;
        }
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < strs.size(); i++){
            res.append(i == strs.size() - 1 ? strs.get(i) : strs.get(i) + "\t");
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        if(str == null){
            return new ArrayList<>();
        }
        List<String>res = new ArrayList<>();
        StringBuilder resStr = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            
            if(str.charAt(i) == '\t'){
                res.add(resStr.toString());
                resStr.setLength(0);
            }
            else{
                resStr.append(str.charAt(i));
            }
        }
        res.add(resStr.toString());
        return res;
    }
}
