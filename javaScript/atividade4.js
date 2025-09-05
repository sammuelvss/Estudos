//questão 1

/*for (let i = 1; i <= 10; i++) {
  console.log(i);
}*/

//questão 2


/*for (let i = 10; i >= 0; i--) {
  console.log(i);
}
console.log("Lançar");*/


//questão 3


/*let total = 0;
for (let i = 1; i <= 100; i++) {
  total += i;
}
console.log(total);*/


//questão 4


/*const n = 20; 
for (let i = 0; i <= n; i += 2) {
  console.log(i);
}*/

//questão 5


/*const n = 7; // Exemplo
for (let i = 1; i <= 10; i++) {
  console.log(`${n} x ${i} = ${n * i}`);
}*/


//questão 6


/*const num = [3, 9, 12, 5];
for (let i = 0; i < num.length; i++) {
  console.log(`Índice: ${i}, Valor: ${num[i]}`);
}*/


//questão 7


/*const num = [3, 9, 12, 5];
let max = num [0];

for (let i = 1; i < num.length; i++) {
  if (num[i] > max) {
    max = num[i];
  }
}
console.log(max);*/


//questão 8


/*const letras = ['a', 'b', 'a', 'c', 'a'];
let cont = 0;

for (let i = 0; i < letras.length; i++) {
  if (letras[i] === 'a') {
    cont++;
  }
}
console.log(cont);*/


//questão 9

/*const s = "javascript";
let sla = "";

for (let i = s.length - 1; i >= 0; i--) {
  sla += s[i];
}
console.log(sla);*/

//questão 10

/*const m = [
  [1, 2],
  [3, 4],
  [5, 6]
];
let totalsoma = 0;

for (let i = 0; i < m.length; i++) { 
  for (let j = 0; j < m[i].length; j++) { s
    totalsoma += m[i][j];
  }
}
console.log(totalsoma); */


//questão 11


/*const numeros = [5, 12, 8, 15, 3];
const resultado = [];

for (let i = 0; i < numeros.length; i++) {
  if (numeros[i] > 10) {
    resultado.push(numeros[i]);
  }
}
console.log(resultado);*/



//questão 12


/*const texto = "for";
for (const ch of texto) {
  console.log(ch);
}

const array = [1, 2, 3];
for (const x of array) {
  console.log(x);
}*/

//questão 13


/*const user = {
  id: 1,
  nome: 'Ana',
  ativo: true
};

for (const j in user) {
  console.log(`${j}: ${user[j]}`);
}*/


//questão 14


for (let i = 1; i <= 20; i++) {
  if (i % 2 !== 0) {
    continue;
  }
  
  if (i % 7 === 0) {
    console.log(`Múltiplo de 7: ${i}`);
    break;
  }
  console.log(i);
}