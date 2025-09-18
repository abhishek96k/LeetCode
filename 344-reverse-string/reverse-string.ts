/**
 Do not return anything, modify s in-place instead.
 */
function reverseString(s: string[]): void {
    let len = s.length;
    for (let i = 0; i < Math.floor(len / 2); i++) {
        let temp = s[i];
        s[i] = s[len - 1 - i];
        s[len - 1 - i] = temp;
    }
};