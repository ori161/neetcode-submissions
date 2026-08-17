class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        buckets = [[] for _ in range(len(nums) + 1)]

        dic = {}
        for i in nums:
            dic[i] = 1 + dic.get(i, 0)

        for key, val in dic.items():
            buckets[val].append(key)

        res = []
    
        for bucket in buckets:
            res.extend(bucket)

        return res[-k:]
        