// ...a의 의미: 파라미터를 배열로 받겠다는 의미
let fun = function (...a) {
  console.log(a);
};
// 인자가 들어오면 그 인자로 변수로 만든다.
fun();
fun(1);
fun(1, 2);
fun(1, 2, 3);

// 앞에거 두개는 변수로 받고 나머지는 배열로 받는다.
fun = (a, b, ...c) => {
  console.log(a);
  console.log(b);
  console.log(c);
};

fun(); // undefined undefined 빈 배열
fun(1); // 1, undefined 빈 배열
fun(1, 2); // 1, 2, 빈 배열
fun(1, 2, 3); // 1, 2, [3]

// 9가 나온다 (1 + 2) * [3, 4, 5].length(= 3) => 9
fun = (a, b, ...c) => (a + b) * c.length;
console.log(fun(1, 2, 3, 4, 5));
