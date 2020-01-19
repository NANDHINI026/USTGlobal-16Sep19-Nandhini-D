//Named Fuctions
function add(num1,num2)
{
    console.log('sum=',num1+num2);
}
add(10,20)
//Function Expression(Anonymous)
var sub = function(num1,num2)
{
    return num1-num2;
}
var value=sub(20,10);
console.log('value=',value);
console.log('=====================');
var div1 = num1 => {
    console.log('value=',num1);
}
div1(10);
console.log('=====================');
greeting('Dingi');
function greeting(msg)
{
    console.log('hi',msg);
}
console.log('=====================');
greet('Dinga');
var greet = function(msg)
{
    console.log('hi',msg);
}
console.log('=====================');
greets('Dingi');
var greets = (msg) =>
{
    console.log('hi',msg);
}
