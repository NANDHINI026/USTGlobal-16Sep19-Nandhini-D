const message = new Promise(function(resolve,reject){
    if(30>20){
        resolve([
            {
                name : 'Bill Gates',
                Age : 67
            },
            {
                name : 'Nandhini',
                Age : 21
            }
        ])
    }
    else{
        reject('Failed')
    }
})
message.then(function(data){
    console.log('Success data',data)
}).catch(function(error){
    console.log('Failure data',error)
 })


 //closures
 funtion outerFunction(counter){
     function innerFunction(){
         let count;
         count = counter+10
         return count
     }
     return innerFunction
 }
 let innerFunc = outerFunction(20)
 let counter = innerFunc()
 console.log('counter value',counter)