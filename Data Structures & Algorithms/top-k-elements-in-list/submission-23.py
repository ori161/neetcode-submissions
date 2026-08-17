class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        if not nums:
            return []
        if len(nums) == 1:
            return nums

        buckets = [[] for _ in range(len(nums) + 1)]

        dic = {}
        for i in nums:
            dic[i] = 1 + dic.get(i, 0)

        for key, val in dic.items():
            buckets[val].append(key)

        res = []
    
        for bucket in buckets:
            sorted(bucket)
            res.extend(bucket)

        return res[-k:]
        