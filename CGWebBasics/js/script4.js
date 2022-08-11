//Constructor Function and new operator
/* const Person=function (firstName,birthYear)
 {
    //Instance properties
    this.firstName=firstName;
    this.birthYear=birthYear;
    //Never do like this
   this.calcAge1=function()
    {
        console.log(2022-this.birthYear)
    };
 };
 //constructor function get called using new operator
 const john=new Person('John',1991);
 console.log(john)
 //john.calcAge1();
 /*
 1. New {} is created
 2.function is called, this={}
 3. {} linked to prototype
 4. function automatically return{}
 */
//prototype
/*console.log(Person.prototype)
Person.prototype.calcAge=function()
{
    console.log(2022-this.birthYear);
};
john.calcAge()*/

//ES6 Class
/*class PersonCl
{
    constructor(firstName,birthYear)
    {
        this.firstName=firstName;
        this.birthYear=birthYear;
    }
    calcAge()
    {
        console.log(2022-this.birthYear)
    }
    greet()
    {
        console.log(`Hey ${this.firstName}`)
    }
}
const jessica=new PersonCl('Jessica',1992);
console.log(jessica)
jessica.calcAge();
jessica.greet();*/
//Object.create
const PersonProto={
    calcAge()
    {
        console.log(2022-this.birthYear)
    },
    init(firstName,birthYear)
    {
        this.firstName=firstName;
        this.birthYear=birthYear;
    }
}
const harry=Object.create(PersonProto);
console.log(harry);
harry.firstName='Harry';
harry.birthYear=1990;
harry.calcAge();
console.log(harry)