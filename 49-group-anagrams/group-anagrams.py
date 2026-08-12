class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        ana=defaultdict(list)
        for word in strs:
            sortedm=''.join(sorted(word))
            ana[sortedm].append(word)

        return list(ana.values())