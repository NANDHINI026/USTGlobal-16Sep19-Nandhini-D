const items = [{
    name : 'Earring',
    id : 1,
    price : 5000
},
{
    name : 'kajal',
    id : 2,
    price : 1000
},
{
    name : 'Trimmer',
    id : 3,
    price : 3000
},
    {
    name : 'Beardo',
    id : 4,
    price : 170
}]
const item = items.map(function(elem){
    return{
        name:elem.name,
        id:elem.id,
        price:elem.price+300,
    }
})
console.log(item);
const item1 = items.filter(function(elem){
    if(elem.price>1000)
    return true;
    else
    return false;
})
console.log(item1)
