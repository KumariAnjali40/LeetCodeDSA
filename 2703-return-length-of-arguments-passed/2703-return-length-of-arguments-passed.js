/**
 * @param {...(null|boolean|number|string|Array|Object)} args
 * @return {number}
 */
var argumentsLength = function(...args) {
    const argsLength = args;

    return argsLength.length;
};

/**
 * argumentsLength(1, 2, 3); // 3
 */