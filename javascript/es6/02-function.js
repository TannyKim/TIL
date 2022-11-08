// 유효하고 충분히 쓸 수 있다.
function a() {
  console.log("a");
}
a();

// 변수에 함수를 담을 수 있다.
// 보통 const를 쓴다.
const b = function () {
  console.log("function b");
};
console.log(b);
b();

// 호출할때 매개변수 넣기
// 매개변수 안넣고 호출하면 매개변수는 undefined
const c = function (i) {
  console.log(i);
  i = "c"; // 매개변수 = let
  console.log(i);
};
c();

// 매개변수의 default값 설정 가능
// 호출할때 매개변수 안넣고 호출하면 default값으로 호출
const d = function (i = "d") {
  // this
  console.log(i);
};
d();

// 화살표 함수
// 화살표 함수를 쓰는 이유
// 1. function 키워드 쓰기 불편해서
// 2. function 키워드 쓸 때와 화살표 함수 쓸 때가 this가 다르다.
const e = (d) => {
  // this
  console.log(d);
};

// 더하기 함수 만들기
// 여러줄 쓸 때는 블록으로 처리 해야함.
const add1 = (a, b) => {
  return a + b;
};

// 위의 함수와 같은 의미
// 한줄이면서 리턴 하나만 있을때만 사용 가능
const add2 = (a, b = 2) => a + b;

const add3 = (a = 1, b = 2) => a + b;

console.log(`add1 : ${add1(1, 2)}`);
// 자동으로 default 없는 거에 들어가고 default 있는 매개변수는 default로 처리해서 연산함.
console.log(`add2 : ${add2(1)}`);
console.log(`add3 : ${add3()}`);

// 변수에 함수 담기.
const obj = {
  x: "x",
  a: function () {
    console.log(this.x)
    console.log("obj.a() is called.");
  },
  // 위를 줄여서 쓰기
  // 이와 같은 형태를 많이 쓰게 될 것
  // this의 의미를 살려야하기 때문...
  b() {
    console.log("obj.b() is called.");
    let a = () => {
      console.log(this.x);
      console.log("a");
    }
  },
  // 애로우 함수
  // 간단한거 할 때는 쓰게 될 것
  c: () => {
    console.log(this.x)
    console.log("obj.c() is called.");
  },
};

obj.a();
obj.b();
obj.c();
