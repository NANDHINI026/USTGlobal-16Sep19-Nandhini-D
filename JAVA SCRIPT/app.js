var todayDate = new Date();
console.log('Todays Date',todayDate)
console.log('Day',todayDate.getDay());
console.log('Year',todayDate.getFullYear());
console.log('Month',todayDate.getMonth());
console.log('Date',todayDate.getDate());
var constMilli = new Date(0);
console.log('Date',constMilli);
var constString = new Date('jun 8');
console.log('Date string Constructor',constString);
var constYear = new Date(1998,06);
console.log('Date Year Construtor',constYear);