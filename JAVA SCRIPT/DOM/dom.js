/* let h1Element = document.getElementById('demo')
console.log('Element=',h1Element);
console.log('Element Text =',h1Element.textContent)
h1Element.textContent = 'Good Evening'
let buttonElement = document.createElement('button');
buttonElement.textContent = 'Click Me!!!'
console.log('Butto Element=',buttonElement);
document.body.appendChild(buttonElement);

let ulElement = document.createElement('ul')
let li1Element = document.createElement('li')
let li2Element = document.createElement('li')
let li3Element = document.createElement('li')

li1Element.textContent = 'JAVA'
li2Element.textContent = 'SQL'
li3Element.textContent = 'JAVASCRIPT'

ulElement.appendChild(li1Element)
ulElement.appendChild(li2Element)
ulElement.appendChild(li3Element)
document.body.appendChild(ulElement)

h1Element.style.color = 'blue'
h1Element.style.fontSize = '50px'


 */
function showMessage(){
    alert('Hi Hello Welcome!!!!!')
}
 function changeColor(){
    let pElement = document.getElementById('mover')
    pElement.style.color = 'green'
}
function removeColor(){
    let pElement = document.getElementById('mover')
    pElement.style.color = 'black'
}
function printHello(){
    //console.log('HEllO');
    let userName = document.getElementById('username').value
    document.getElementById('showusername').textContent = userName;
}
/* let name = 'Nandhini'
let age = 21
let phoneno = 7418677492
console.log('Name is'+name+'Age is'+age+'phone no is'+phoneno);
console.log('Name is', ${name} ,'Age is ',${age} ,'phone no is ',${phoneno})
console.log(`2+2 = ${2+2}`) */