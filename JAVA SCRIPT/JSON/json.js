const person = {
    name : 'Sundara',
    age  : 100,
    color : 'White',
    address : {
            city : 'Bijapur',
            state : 'Karnataka',
            pincone : 59115
    },
    hobbies : ['coding','Bird watching','Singing']
}
console.log('javascript person object',person)
const jsonObject = JSON.stringify(person)
console.log('JSON person object',jsonObject)
const javaScriptPersonObject = JSON.parse(jsonObject)
console.log('JSON person object',javaScriptPersonObject)

localStorage.setItem('email','dvsnandhini8698@gmail.com')
const emailID = localStorage.getItem('email')
console.log('Email Id',emailID);
localStorage.clear();