class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dict_save_ana = {}
        names = []
        for val in strs:
            key = ''.join(sorted(val))
            if key in dict_save_ana:
                dict_save_ana[key].append(val)
            else:
                names.append(key)
                dict_save_ana[key] = [val]
        res = []

        for name in names:
            res.append(dict_save_ana[name])
        
        return res