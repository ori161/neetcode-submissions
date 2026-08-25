class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if not nums:
            return 0
        hold_var = set(nums)
        count = 1
        max_count = -1
        for num in hold_var:
            if num - 1 not in hold_var:
                s = num + 1
                while s in hold_var:
                    count += 1
                    s += 1
                if count > max_count:
                    max_count = count
                count = 1
        return max_count


            