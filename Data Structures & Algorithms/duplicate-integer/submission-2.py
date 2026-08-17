class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        hash1 = {}
        for key, val in enumerate(nums):
            if val in hash1.values():
                return True
            else:
                hash1[key] = val
        
        return False
