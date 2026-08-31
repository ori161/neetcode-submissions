class Solution:
    def isValid(self, s: str) -> bool:
        if not s:
            return False

        valid = {'}' : '{', ']' : '[', ')' : '('}
        stack = []
        for ch in s:
            if ch in valid and stack:
                if valid[ch] != stack.pop():
                    return False
            else:
                stack.append(ch)
        return not stack


        