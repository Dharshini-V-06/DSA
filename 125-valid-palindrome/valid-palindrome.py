class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = s.lower()
        str = ""
        for ch in s:
            if ch.isalnum():
                str+=ch;
        return str == str[::-1]