let a; // 일반적인 변수 선언
const b = "b"; // 상수는 선언할때 initailaize 해줘야함
var c; // deprecated. 사용 안할 것

console.log(a);
console.log(b);
console.log(c);

// for 문 안과 밖에서 스코프의 차이
// 블록 안과 밖에서 스코프 차이
let i = 10;
for (let i = 0; i < 3; i++) {
  console.log(i);
}
console.log(i);

let j = 3;
{
  let j = 13;
  {
    let j = 23;
  }
}

const x = "x";
{
  const x = "y";
  {
    const x = "z";
    console.log(x);
  }
  console.log(x);
}
console.log(x);
