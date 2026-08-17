class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        if not nums:
            return []
        if len(nums) == 1:
            return nums

        buckets = [[] for _ in range(len(nums) + 1)]
        
        dic = {}
        for i in nums:
            if i in dic:
                dic[i] = dic.get(i, 0) + 1
            else:
                dic[i] = 1

        for key in dic:
            buckets[dic[key]].append(key)

        res = []
    
        for bucket in buckets:
            sorted(bucket)
            res.extend(bucket)

        return res[-k:]
        