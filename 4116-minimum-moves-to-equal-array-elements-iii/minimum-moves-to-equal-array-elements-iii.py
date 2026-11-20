class Solution:
    def minMoves(self, a: List[int]) -> int:
        return sum(map(sub,repeat(max(a)),a))