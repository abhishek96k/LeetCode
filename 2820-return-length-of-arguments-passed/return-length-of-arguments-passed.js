/**
 * @param {...(null|boolean|number|string|Array|Object)} args
 * @return {number}
 */
var argumentsLength = function(...args) {
       let ans = args.length;
    return ans;
};

/**
 * argumentsLength(1, 2, 3); // 3
 */