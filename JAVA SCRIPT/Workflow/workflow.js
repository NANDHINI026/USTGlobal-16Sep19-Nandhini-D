/* function first(){
    setTimeout(function(){
        console.log('First Function Executed')  
    },0)
    
}

function second(){
    console.log('Second Function Executed')
}

first()
second()
console.log('=============================='); */
/* function first(){
    setTimeout(function(){
        console.log('First Function Executed')  
    },0)
    console.log('Executed')
}

function second(){
    console.log('Second Function Executed')
}

first()
second()

 console.log('=============================='); */
function first(callback){
    setTimeout(function(){
        console.log('First Function Executed')
        callback();  
    },0)
    console.log('Executed')
}

function second(){
    console.log('Second Function Executed')
}

first(second)
 