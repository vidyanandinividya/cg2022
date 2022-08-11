/*const details=[
    'Steven',
    'Thomas',
    2022-1991,
    'teacher',
    ['Micheal','Peter','Jonas']
]
//Literal Syntax
const fullDetail={
    firstName:'Steven',
    lastName:'Thomas',
    birthYear:1991,
    job:'teacher',
    friends:['Micheal','Peter','Jonas'],
    //object methods
    calcAge: function()
    {
    this.age=2022-this.birthYear;
    return this.age;
    },
    getSummary: function()
    {
        return `${this.firstName} is a ${this.calcAge()} - years old`
    }
};
console.log(fullDetail)
console.log(fullDetail.firstName)
console.log(fullDetail['lastName'])
console.log(fullDetail['job'])
fullDetail.location='Portugal'
console.log(fullDetail)
fullDetail['twitter']='@steventhomas'
console.log(fullDetail)
console.log(fullDetail.friends[0])

console.log(fullDetail.calcAge())
console.log(fullDetail.age)

console.log(fullDetail.getSummary());*/
//For and ForEach Method
const movements=[100,200,-100,300,-50]

//for(const mov of movements)
/*for(const[i,mov] of movements.entries())
{
    if(mov > 0)
    {
        console.log(`Movement ${i+1}:you deposited ${mov}`)
    }
    else
    {
        console.log(`Movement ${i+1}:you withdraw ${Math.abs(mov)}`)
    }
}
console.log('---For Each---')
movements.forEach(function(mov,i,arr){
    if(mov > 0)
    {
        console.log(`Movement ${i+1}: you deposited ${mov}`)
    }
    else
    {
        console.log(`Movement ${i+1}: you withdraw ${Math.abs(mov)}`)
    }
});
//0: function(200)
//1: function(450)*/
//Map Method
const inrToUsd=1.1
const movementsUSD=movements.map(function(mov){
    return mov*inrToUsd
})
//console.log(movements)
//console.log(movementsUSD)
//Filter Method
const deposits=movements.filter(function(mov){
    return mov>0
})
//console.log(movements)
//console.log(deposits)
//Reduce Method
const balance=movements.reduce(function(acc,cur,i,arr){
    console.log(`Iteration ${i}:${acc}`)
    return acc+cur
})
//console.log(movements)
//console.log(balance)
//acc-> accumulator
//cur-> current element of the array
//i-> current index
//Chaining Method
console.log(movements)
//Pipeline
const totalDepositsUSD=movements
    .filter(mov=>mov>0)
    .map((mov,i,arr)=>{
        //console.log(arr)
        return mov * inrToUsd;
    }).reduce((acc,mov)=>acc+mov,0)
console.log(totalDepositsUSD)