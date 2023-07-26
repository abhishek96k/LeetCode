/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {
    return {
        notToBe : (val2) => {
            if(val === val2) throw new Error("Equal");
            else
            return true;
        },
        toBe : (val2) => {
            if(val !== val2) throw new Error("Not Equal");
            else
            return true;
        }
    }
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */