//Introduction to Arrays
/*const friend1='Michael'
const friend2='Steven'
const friend3='Peter'
const friends = ['Michael','Steven','Peter']
console.log(friends)
console.log(friends[0])
console.log(friends[1])
console.log(friends[2])
console.log(friends.length)
console.log(friends[friends.length-1])
friends[2]='Jay'
console.log(friends)
const y=new Array(1991,1994,2008,2020)
console.log(y)
console.log(y.length)
const firstName='Jonas'
const fullDetail=[firstName,'Thomas',2022-1991,'teacher',friends]
console.log(fullDetail)
console.log(fullDetail.length)*/
//Function and Array
/*const calcAge=function(birthYear)
{
    return 2022-birthYear
}
const years=[1990,1991,1967,2002,2010,2020]

const age1=calcAge(years[0])
const age2=calcAge(years[1])
const age3=calcAge(years[years.length-1])
console.log(age1,age2,age3)

const ages=[calcAge(years[0]),calcAge(years[1]),calcAge(years[2])]
console.log(ages)*/
//Basic Array Operations
/*const friends=['Micheal','Steven','Peter']

//Add elements
const newLength=friends.push('Jay')
console.log(friends)
console.log(newLength)
friends.unshift('John')
console.log(friends)

//Remove Elements
/*friends.pop() //last
const popped=friends.pop()
console.log(popped)
console.log(friends)
friends.shift() //first
console.log(friends)*/

/*console.log(friends.indexOf('Micheal'))
console.log(friends.indexOf('Jonas'))
friends.push(23)
console.log(friends)
console.log(friends.includes('Steven'))
console.log(friends.includes('Jonas'))

if(friends.includes('Steven'))
{
    console.log('You have a friend called Steven')
}
else
{
    console.log("You don't have a friend called Steven")

}*/
//Iteration : The for loop

/*for(let i=1;i<=5;i++)
{
    console.log(`${i}`)
}*/
const details=[
    'Steven',
    'Thomas',
    2022-1991,
    'teacher',
    ['Micheal','Peter','Jay'],
    true
]
//continue and break
console.log('----Only Strings----')
for(let i=0;i<details.length;i++)
{
    if(typeof details[i] !== 'string') continue
    console.log(details[i], typeof details[i])
}
console.log('---Break with Number---')
for(let i=0;i<details.length;i++)
{
    if(typeof details[i] === 'number') break
    console.log(details[i], typeof details[i])
}
/*const types=[]
for(let i=0;i<details.length;i++)
{
    //Reading from details array
    console.log(details[i],typeof details[i])

    //Filling types array
    //types[i]=typeof details[i]
    types.push(typeof details[i])
}
console.log(types)

const years=[1991,1992,2000,2010]
const ages=[]
for(let i=0;i<years.length;i++)
{
    ages.push(2022-years[i])
}
console.log(ages)*/

