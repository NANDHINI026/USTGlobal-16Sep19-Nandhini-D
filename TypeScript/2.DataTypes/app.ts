let myName : string = "Nandhini";

console.log(myName,typeof myName);

let age = 29;

console.log(age , typeof age);

let num : number;

console.log(num , typeof num);

let address;

address = "shkjjn";

address = 1333;

console.log(address,typeof address);




let calAge = function() : void{
    console.log('MyAge=',21);
}
calAge();




class Person{
    constructor(public name:string,public age:number){

    }
}
let person1 = new Person("mikel",24);
console.log(person1);

class Student extends Person{
    constructor(name : string,age : number ,public rollno : number){
        super(name,age);
    }
}
let student1 = new Student("mikel",24,26);
console.log(student1);

