//Browser APIs/ Web APIs

/*function printMe()
{
    console.log('print me')
}
function f2()
{
    console.log('f2')
}
function test()
{
    console.log('test')
    setTimeout(printMe,0)
    f2()
}
test()*/
//Promise
/*const promise=new Promise((resolve,reject)=>
resolve('I am a resolve promise'));

promise.then(result=>console.log(result))*/

/*function f1()
{
    console.log('f1')
}
function f2()
{
    console.log('f2')
}
function main()
{
    console.log('main')
    setTimeout(f1,0);  //callback Queue
    new Promise((resolve,reject)=>   //Job queue
    resolve('I am a promise'))
    .then(resolve=>console.log(resolve));
    f2();

}
main();

const fetchPromise=fetch('');
fetchPromise.then((resolve)=>{
    console.log(`${resolve.status}`)
})*/

/*function f1()
{
    console.log('f1');
}
function f2()
{
    console.log('f2')
}
function f3()
{
    console.log('f3');
}
function main()
{
    console.log('main');
    setTimeout(f1,50);
    setTimeout(f3,30);
    new Promise((resolve,reject)=>
    resolve('I am a promise right after f1 and f3'))
    .then(resolve=>console.log(resolve));
    new Promise((resolve,reject)=>
    resolve('I am a promise after promise'))
    .then(resolve=>console.log(resolve));
    f2();
}
main();*/
const fethUserDetails=async (userId)=>{
    //pretend we make some asynchronous call
    //and return the user details
    console.log('4')
    return {'name':'Jay','hobbies':['reading','playing','traveling']};
}
//console.log(fethUserDetails())
async function caller()
{
    console.log('2')
    const user=await fethUserDetails();
    console.log(user)
    console.log('3')
}
console.log('1')
caller()
console.log('5')


