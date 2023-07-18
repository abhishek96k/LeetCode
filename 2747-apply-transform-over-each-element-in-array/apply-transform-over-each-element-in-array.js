/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    const toReturnArray = new Array(arr.length);
    for(let i = 0; i < arr.length; ++i){
        toReturnArray[i] = fn(arr[i], i);
    }
    return toReturnArray;
};