/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function (s) {
    let max = 0;
    let start = 0;
    const obj = {};
    for (let i = 0; i < s.length; i++) {
        const char = s[i];
        if (char in obj) {
            start = Math.max(start, obj[char] + 1);
        }
        max = Math.max(max, i - start + 1);
        obj[char] = i;
    }
    return max;
};