/**
 * @param {string} s
 * @return {number}
 */
var firstUniqChar = function (s) {
    for (let i = 0; i < s.length; i++) {
        let ch = s[i];
        if (s.indexOf(ch) === s.lastIndexOf(ch))
            return i;
    }
    return -1;
};