// 1. ways to print in js
// alert("me");
//  console.log("hello world")
// document.write("this is document write")


//  2. js console api

// console.log("hello world", 4 + 2, "another log ");
// console.warn("this is warning");
// console.error("this is a error");
// console.assert();

// 3. js variables
// containers to store data values

var number1 = 34;
var number2 = 56;
// console.log(number1 + number2);

// 4. data types in js
// numbers
var num1 = 455;
var num2 = 56.43;

// String
var str1 = " this s string";
var str2 = 'this is also a string';

// objects
var marks = {
    ravi: 34,
    shubj: 33,
    hrr: 0
}

// console.log(marks);
// console.log(num1);

// booleans
var a = true;
var b = false;
// console.log(a,b);


//  var und = undefined
var und;
// console.log(und);

var n = null;
// console.log(n);


// var a = 44; 
// var b = 22;
// console.log("the value of a +b", a+ b);
// console.log("the value of a -b", a- b);
// console.log("the value of a *b", a* b);
// console.log("the value of a /b", a/ b);

// js functions

function avg(a, b) {
    return (a + b) / 2;
}

c1 = avg(4, 6);
c2 = avg(44, 22);
// console.log(c1,c2);
 let arr = [2, 4, 5, 6, 7, 8];
// console.log(arr);
// for (var i=0; i<arr.length; i++){
//     console.log(arr[i])
// }

// another way to print every element of a loop
// arr.foreach(function(element) {
// console.log(element);
// })

// arr.forEach(function(element) {
//     console.log(element);
//  })

// let se variable intiate kro block level scope



// const ac = 0;
// ac= ac+1;

// let j = 0;
// while(j < arr.length){
//     console.log(arr[j])

//     j++;  
// }


// console.log(arr.length);
//   arr.pop();
// console.log(arr);
// arr.push("punn");
// console.log(arr);

let mylovestring = "puneet good boy";
// console.log(mylovestring.indexOf("puneet"))
// console.log(mylovestring.indexOf("good"))
// console.log(mylovestring.lastIndexOf("puneet"))


// console.log(mylovestring.slice(0,3));
//  d = mylovestring.replace("puneet" , "rohit");

// console.log(d)


let myDate =  new Date();
// console.log(myDate);
// console.log(myDate.getFullYear());
// console.log(myDate.getDay());
// console.log(myDate.getMinutes());


// dom - document object model

// document.getElementById('click').click()

// 1. document.getElementbyId

let elem = document.getElementById('click');
// console.log(elem);


// let elemClass = document.getElementsByClassName("container")
// console.log(elemClass);

// elemClass[0].computedStyleMap.background = "yellow";
// elemClass[0].classList.add("bg-primary");
// elemClass[0].classList.add("text-sucess");


tn = document.getElementsByName('button');
console.log(tn);

// createdElement = document.createElement('p');
// createdElement.innerText = " this is a created  para ";
//  tn[0].appendChild(createdElement);

// selecting using query

sel = document.querySelector('.container')
console.log(sel)



