/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function(strs) {
    const ht = {};
    for(let str of strs) {
        const sorted = str.split('').sort().join('');
        if (ht[sorted]) ht[sorted].push(str);
        else ht[sorted] = [str];
    }
    return Object.values(ht);
};