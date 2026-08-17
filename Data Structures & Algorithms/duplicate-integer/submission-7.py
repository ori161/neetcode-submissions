class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        check_dups = set()
        for num in nums:
            if num in check_dups:
                return True
            check_dups.add(num)
        return False 