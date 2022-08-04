const calculator ={
    add: function(a, b){
        console.log(a + b)
    },
    multiply: function(a, b){
        return(a * b)
    },
    minus: function(a, b){
        return(a - b)
    },
    divide: function(a, b){
        return(a / b)
    },
    power: function(a, b){
        return(a**b)
    }
};

const plusResult = calculator. add(2, 3);
console.log(plusResult);

// const plusResult = calculator.add(3, 2);
// const multiplyResult = calculator.multiply(plusResult, 2);
// const minusResult = calculator. minus(multiplyResult, 2);
// const divideResult = calculator. divide(minusResult, 2);
// const powerResult = calculator. power(divideResult, 2);
// console.log(powerResult);