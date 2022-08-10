
//values and variables
/* var x
console.log(x)
x=10
console.log(x)
x="vidya"
console.log(x)
x=true
console.log(x)
//variable declaration
let y
console.log(y)
//variable initialization
y=12
console.log(y)
y="john"
console.log(y)
const z=10
console.log(z)
//z="jack"
//console.log(z)
var fullname="peter parker", age=21, isMarried=false
console.log(fullname)
console.log(age)
console.log(isMarried)
var $function=27
var _firstname */
//Data Types
/*let javascriptIsEasy=true
console.log(javascriptIsEasy)
console.log(typeof javascriptIsEasy)
console.log(typeof 23)
console.log(typeof 'jonas')
let year
console.log(year)
console.log(typeof year)
year=1991
console.log(typeof year)
console.log(typeof null)*/
//Basic Operators
//Math Operators
/*const now=2037
const ageJonas=now-1991
const ageSarah=now-2018
console.log(ageJonas,ageSarah)
console.log(ageJonas*2,ageJonas/10,2 ** 3)
// 2 ** 3 means 2 to the power of 3 = 2 * 2 * 2
const firstName='Jonas'
const lastName='Thomas'
console.log(firstName+' '+lastName)
//Assignment Operators
let x=10+5
x+=10 //25
x*=4 //100
x++
x--
x--
console.log(x)
//comparision operators
// >, <, >=, <=
console.log(ageJonas>ageSarah)
console.log(ageSarah>=18)
//operator precedence
console.log(now-1991 > now-2018)
let z,y;
z = y = 25-10-5
console.log(z,y)
const aveargeAge=(ageJonas+ageSarah)/2
console.log(ageJonas,ageSarah,aveargeAge)*/
//Strings and Template Literals
/*const firstName='Jonas'
const job='teacher'
const birthYear=1991
const year=2022
const fullDetail="I'm "+ firstName + ', a '+ (year-birthYear) + ' year old ' + job + '!'
console.log(fullDetail)
const fullDetails=`I'm ${firstName}, a ${year-birthYear} year old ${job} !`
console.log(fullDetails)
console.log(`Just a regular string...`)
console.log('String with \n\ multiple \n\ lines')
console.log(`string
multiple
lines`)
let str1="This is a paragraph of text";
console.log(str1.length) //calculate the length of the string
console.log(str1.indexOf("This"))
console.log(str1.search("text"))
console.log(str1.search("Text"))
let str2="Color red looks brighter that color blue"
console.log(str2.search("color"))
//Case insensitive search using regexp
console.log(str2.search(/color/i))
//console.log(str2.replace("color","paint"))
//console.log(str2.replace(/color/i,"paint"))
console.log(str2.replace(/color/ig,"paint"))
var str3="Hello World"
console.log(str3.toUpperCase())
console.log(str3.toLowerCase())*/
//Taking Descissions: if / else statements
/*const age=15
if(age>=18)
{
console.log('sarah can start driving')
}
else
{
    const yearsLeft=18-age
    console.log(`sarah is too young. wait another ${yearsLeft} years`)
}
const birthYear=2012
let century
if(birthYear<=2000)
{
    century=20
}
else
{
    century=21
}
console.log(century)
//Ternary Operator
birthYear<2000 ? console.log(century=20) : console.log(century=21)*/
//Type Conversion and Type Coercion

/*let value1='5'
let value2=9
let sum=value1+value2
console.log(sum)
let sum1=Number(value1)+value2
console.log(sum1)

//Type Conversion
const inputYear='1991'
console.log(Number(inputYear)+18)
console.log(Number('Jonas')+2)
console.log(String(23),23)

//Type Coercion
console.log('I am ' + 23 + 'years old')
console.log('23'-'10'-3)
console.log('23'/'2')
let n='1' + 1
console.log(n)*/

//Truthy and Falsy Values
//5 falsy values : 0, ' ',undefined, null, Nan
/*console.log(Boolean(0))
console.log(Boolean(undefined))
console.log(Boolean('Jonas'))
console.log(Boolean({}))
console.log(Boolean(''))*/

/*const favourite=Number(prompt('Whats your favourite Number?'))
console.log(favourite)
console.log(typeof favourite)
if(favourite===23)
{
    console.log('cool! 23 is an amazing number')
}
else if(favourite===7)
{
    console.log('cool! 7 is an amazing number')
}
else if(favourite===9)
{
    console.log('cool!9 is an amazing number')
}
else
{
    console.log('Number is not 23 or 7 or 9')
}*/
//Logical Operators
// && || !
/*const hasDriverslicense=true //A
const hasGoodVision=true //B
console.log(hasDriverslicense && hasGoodVision)
console.log(hasDriverslicense||hasGoodVision)
console.log(!hasDriverslicense)
if(hasDriverslicense&& hasGoodVision)
{
    console.log('Sarah is able to drive....')
}
else
{
    console.log('Someone lese should drive....')
}
const isTired=false; //C
console.log(hasDriverslicense && hasGoodVision || isTired)

if(hasDriverslicense && hasGoodVision && isTired)
{
    console.log('sarah is able to drive')
}
else
{
    console.log('someone else should drive')
}

let a=20,b=30,c=12
if(a>b && a>c)
{
console.log('a value is greater')
}
else if(b>a && b>c)
{
    console.log('b value is greater')
}
else
{
    console.log('c value is greater')
}*/
//CC #2
/*const scoreDolphins= (100+112+180)/3
const scoreKoalas=(109+195+50)/3
console.log(scoreDolphins,scoreKoalas)
if(scoreDolphins>scoreKoalas && scoreDolphins >= 100)
{
    console.log('Dolphins win the Trophy')
}
else if(scoreKoalas>scoreDolphins && scoreKoalas >= 100)
{
    console.log('Koalas win the Trophy')
}
else if (scoreDolphins===scoreKoalas && scoreDolphins >= 100 && scoreKoalas >= 100)
{
    console.log('Both win the Trophy')
}
else
{
    console.log('No one wins the Trophy')
}*/
//Switch case statement
const day='Wednesday'
switch(day)
{
    case 'monday':
        console.log('Today is Monday')
        break;
    case 'tuesday':
        console.log('Today is Tuesday')
        break;
    case 'wednesday':
    case 'Wednesday':
        console.log('Today is wednesday')
        break;
    case 'thursday':
        console.log('Today is Thursday')
        break;
    case 'friday':
        console.log('Today is Friday')
        break;
    case 'saturday':
        console.log('Today is saturday')
        break;
    case 'sunday':
        console.log('Today is sunday')
        break;
    default:
        console.log('Not a valid day')
        

}



