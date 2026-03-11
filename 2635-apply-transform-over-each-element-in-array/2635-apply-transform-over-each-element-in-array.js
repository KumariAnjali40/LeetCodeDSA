/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    let ans = [];

    for(let i = 0; i < arr.length; i++){
        let returnedArr = fn(arr[i], i);

        ans.push(returnedArr);
    }

    return ans;
};