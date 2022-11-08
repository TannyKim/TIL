let a = "a";
let b = "b";
let c = "c";

// property 이름 : 실제 값
let obj1 = { a: a, b: b, c: c };
console.log(obj1);

// es6에서는 이러한 형태로 많이 쓴다.
let obj2 = { a, b, c };
console.log(obj2);

// 이렇게도 가능하다.
let obj3 = { x: "x", y: "y", z: "z" };
let { x, y, z } = obj3;
console.log(x, y, z);

// 이건 안된다.
// 변수 선언은 프로퍼티의 이름으로 해줘야함
// 프로퍼티 이름이 아닌 i,j,k 이런걸로 하니까 안됨..
let { i, j, k } = obj3;
console.log(i, j, k);

// obj copy, 깊은 복사
// obj3 값이 바뀌어도 obj4 는 안바뀜..
let obj4 = { ...obj3 };

// 이건 얕은 복사
// let obj4 = obj3;

let obj5 = { e: "e", f: "f", g: "g" };

// 네개 가져오기
// let { e, f, g, h } = obj5;
// console.log(e, f, g, h);

// 필요한 것만 가져오기
let {e, f} = obj5;
console.log(e, f)
