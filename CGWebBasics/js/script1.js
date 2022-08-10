/*'use strict'
let x=10
console.log(x)*/
//Functions
/*logger();
function logger()
{
    console.log('My name is John')
}
//calling / running/ invoking function
logger();
logger();
logger();
function fruitProcessor(apples,oranges)
{
    const juice=`juice with ${apples} apples and ${oranges} oranges`
    return juice
}
const applejuice=fruitProcessor(5,0)
console.log(applejuice)
function add(num1,num2)
{
    const sum=`The addition of ${num1} and ${num2} is ${num1+num2}`
    return sum
}
console.log(add(2,3))*/

//Function Declaration vs Expression

//Function Declaration
/*function calcAge(birthYear)
{
    return 2022-birthYear
}
const age1=calcAge(1991)

//Function Expression
const calcAge2=function(birthYear)
{
    return 2022-birthYear
}
const age2=calcAge2(1992)

console.log(age1,age2)
//Arrow Function
const calcAge3 = birthYear => 2022-birthYear
const age3=calcAge3(1990)
console.log(age3)

/*const yearsUntilRetirement= (birthYear, firstName) => {
    const age=2022-birthYear
    const retirement=65-age
    return `${firstName} retires in ${retirement} years`
}

console.log(yearsUntilRetirement(1990,'Jonas'))*/

//Cretea a function for addition of two number
/*const addition=(num1,num2)=>{
    return `${num1+num2}`
}
console.log(addition(10,20))
//Functions calling other functions
const yearsUntilRetirement= (birthYear, firstName) => {
    const age=calcAge2(birthYear)
    const retirement=65-age

    if(retirement>0)
    {
        console.log(`${firstName} retires in ${retirement} years`)
        return retirement
    }
    else
    {
        console.log(`${firstName} has already retired `)
        return -1
    }
    
}

console.log(yearsUntilRetirement(1990,'Jonas'))
console.log(yearsUntilRetirement(1950,'Mike'))*/
//Functions Returning Functions
/*const greet=function(greeting)
{
    return function(name)
    {
        console.log(`${greeting} ${name}`)
    }
}

const greetHey=greet('Hey');
greetHey('Johans')
greetHey('Steven')

greet('Hello')('John')
//challenge
const greetArr = greeting => name => console.log(`${greeting} ${name}`)
greetArr('Hi')('Thomas')*/

//IIFE
/*(function()
{
    console.log('This function will never run again')
    const isPrivate=10
})();

//console.log(isPrivate)

(function()
{
    function add(a,b)
    {
        return a+b
    }
    console.log(add(10,20))

}())

const calculator=(function(){
    function add(a,b)
    {
        return a + b
    }
    function multiply(a,b)
    {
        return a * b
    }
    return {
        add:add,
        multiply:multiply
    }
})();
let result=calculator.add(5,35)
console.log(result)
console.log(calculator.multiply(5,2));

//Arrow function IIFE
(()=>console.log("This function will run once"))()*/

//Closures
const secureBooking= function()
{
    let paseengerCount=0
    return function()
    {
        paseengerCount++;
        console.log(`${paseengerCount} passengers`)
    }
}
const booker=secureBooking();
booker();
booker();
console.log(booker)

let x
const y=function()
{
    const a=23;
    x=function()
    {
        console.log(a*2)
    };
};
y()
x()
const z=function()
{
    const b=20
    x=function()
    {
        console.log(b+5)
    }
}
z()
x()

y()
x()
//console.log(x)

