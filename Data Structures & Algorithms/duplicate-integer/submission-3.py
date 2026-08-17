class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        hash1 = {}
        sorted_nums = sorted(nums)
        for key, val in enumerate(sorted_nums):
            if val in hash1.values():
                return True
            else:
                hash1[key] = val
        
        return False
