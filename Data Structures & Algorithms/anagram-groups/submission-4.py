class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = []
        c = {}
        for s in strs:
            count_ch = [0]*26
            for ch in s:
                count_ch[ord(ch)-ord('a')+1] += 1
            if tuple(count_ch) in c:
                c[tuple(count_ch)].append(s)
            else:
                c[tuple(count_ch)] = [s]
        
        for i in c:
            res.append(c[i])

        return res