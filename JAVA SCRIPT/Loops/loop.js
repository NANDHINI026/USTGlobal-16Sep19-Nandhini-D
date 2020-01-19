/* var brands = ["Kingfisher","Bisleri","Aqua","Kinley"]
console.log("For of loop");
for(var element of brands){
    console.log('Brand=',element);
}
console.log('===========================')
var brands = ["Kingfisher","Bisleri","Aqua","Kinley"]
console.log("For in loop");
for(var index in brands){
    console.log('Brand=',brands[index]);
}
console.log('===========================')
var brands = ["Kingfisher","Bisleri","Aqua","Kinley"]
console.log("For in loop");
for(var index in brands){
    console.log('Brand=',index);
}
console.log('===========================')
console.log('For in loop for objects');
var person = {
    name : 'Sundari',
    age : 33,
    color : 'White'
}
for(var key in person){
    console.log('value=',person[key])
} */
console.log('===========================');
console.log('For Each Method of Array');
var movies=['Sholay','Mayabazar','Jurassic park','Titanic'];
movies.forEach(function(value,index){
    console.log("movie="+value)
    console.log("index="+index)
})
console.log('===========================');
var items=[
    {
        item:'Bangels',
        id:1,
        price:100,
    },
    {
        item:'Eyeliner',
        id:2,
        price:200,
    },
    {
        item:'lipstick',
        id:3,
        price:150,
    },
    {
        item:'Bike',
        id:4,
        price:1000000,
    }
]
items.forEach(function(item,index){
    console.log("item=",item);
    console.log(" index of item=",index);
})

