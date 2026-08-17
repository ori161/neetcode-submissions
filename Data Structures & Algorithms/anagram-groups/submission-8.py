class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = defaultdict(list)
        for s in strs:
            count_ch = [0]*26
            for ch in s:
                count_ch[ord(ch)-ord('a')] += 1
            res[tuple(count_ch)].append(s)

        return list(res.values())