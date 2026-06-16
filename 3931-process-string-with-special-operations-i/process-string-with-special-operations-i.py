class Solution:
    def processStr(self, s: str) -> str:
        result =[]
        for char in s:
            if char == "*":
                if result:
                    result.pop()
            elif char == "#":
                result.extend(result)
            elif char == "%":
                result.reverse()
            else:
                result.append(char)
        return "".join(result)