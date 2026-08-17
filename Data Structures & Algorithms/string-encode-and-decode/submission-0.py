class Solution:

    def encode(self, strs: List[str]) -> str:
        new_string = ""
        count_sum = ""
        for str1 in strs: 
            new_string += str1 
            count_sum = count_sum +"!"+ str(len(str1))
        
        res = new_string +" "+ count_sum
        return res


    def decode(self, s: str) -> List[str]:
        parts = s.split(" ")
        count_sum = parts[-1]
        new_string_all = " ".join(parts[:-1])
        
        if not count_sum:
            return []
            
        len_list = [int(x) for x in count_sum.split("!") if x != ""]
        
        new_list = []
        curr = 0
        for length in len_list:
            new_list.append(new_string_all[curr:curr+length])
            curr += length
        
        return new_list