/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    let ans = [];

    for(let i = 0; i < arr.length; i++){
        let returnedArr = fn(arr[i], i);

        if(returnedArr){
            ans.push(arr[i]);
        }
    }

    return ans;
};