class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        sort_to_buckets = {}
        for num in nums:
            if num in sort_to_buckets:
                sort_to_buckets[num] += 1
            else:
                sort_to_buckets[num] = 1
        buckets = [[] for i in range(len(nums))]
        for n, v in sort_to_buckets.items():
            buckets[v - 1].append(n)
        i = 0
        res = []
        for b in range(len(buckets) - 1, -1, -1):
            if i < k:
                if buckets[b]:
                    i+= len(buckets[b])
                    res += buckets[b]
        return res

        


            
