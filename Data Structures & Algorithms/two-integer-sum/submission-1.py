class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        if not nums:
            return []
        
        hash_map = {}

        for key, val in enumerate(nums):
            res = target - val
            if res in hash_map:
                return [hash_map[res],key]
            hash_map[val] = key
