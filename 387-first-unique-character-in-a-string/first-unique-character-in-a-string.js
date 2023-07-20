/**
 * @param {string} s
 * @return {number}
 */
var firstUniqChar = function(s) {
    // Create a hash table to store the characters and their count. 
    const hashTable = {};

    // Iterate through the entire string to store the characters and their counts in the hash table.
    for(let char of s) {
        if(hashTable[char])
            hashTable[char]++;
        else
            hashTable[char] = 1;
    }
// Check if there is any unique character and return its index.
for(let i = 0; i < s.length; i++) {
    const char = s[i];
    if(hashTable[char] == 1)
        return i;
}
// If there is no unique character, return -1.
return -1;
};