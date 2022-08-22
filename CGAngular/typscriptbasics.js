//primitivetypes: number, string, boolean
//more complex types: arrays, objects
//Function types, parameters
var john;
john = {
    firstName: 'John',
    age: 32,
    greet: function () {
        console.log('Hello!');
    }
};
console.log(john);
console.log(john.greet());
var Instructor = /** @class */ (function () {
    function Instructor() {
    }
    Instructor.prototype.greet = function () {
        console.log('Hello!!!!!!');
    };
    return Instructor;
}());
