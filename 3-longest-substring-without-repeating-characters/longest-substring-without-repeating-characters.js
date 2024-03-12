/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function (s) {
    let max = 0;
    let start = 0;
    let set = {};
    for (let i = 0; i < s.length; i++) {
        let char = s[i];
        if (char in set) {
            start = Math.max(start, set[char] + 1);
        }
        max = Math.max(max, i - start + 1);
        set[char] = i;
    }
    return max;
};