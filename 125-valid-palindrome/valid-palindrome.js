/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    const str = s.replace(/[\W_]/g, '').toLowerCase();
    let p1 = 0;
    let p2 = str.length - 1;
    while(p1 < p2) {
        if(str[p1] !== str[p2]) return false;
        p1++;
        p2--;
    }
    return true;
};