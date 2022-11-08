let a = "a";
let b = "b";
let c = "c";

// 알아서 값이 들어간다.
let arr1 = [a, b, c];
console.log(arr1);

// arr의 값들을 하나씩 빼서 변수에 저장하겠다.. 될까?
// 된다!
// 새로운 변수 x, y, 가 생긴것
let [x, y, z] = arr1;
console.log(x);
console.log(y);
console.log(z);

// 앞에서 두개 가져오고 싶을때
let [i, j] = arr1;
console.log(i, j);

// 네개 가져오고 싶을때
// 마지막껀 없으므로 undefined
let [d, e, f, g] = arr1;
console.log(d, e, f, g);


// deep copy 깊은 복사
const arr2 = [...arr1];
console.log(arr2);
