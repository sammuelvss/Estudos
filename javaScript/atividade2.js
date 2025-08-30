//questão 1

/*const numeros = [3, 8, 2, 5, 10];
const pares = numeros
  .filter(n => n % 2 === 0)   // só pares
  .reduce((acc, n) => acc + n, 0); // soma

console.log(pares); */


// questão 2

/*const nomes = ["  Ana ", "JOÃO", "  maRiA"];
const formatados = nomes.map(n => n.trim().toLowerCase());
console.log(formatados);*/


// questão 3

/*const numeros = [1, 2, 2, 3, 3, 3, 4];
const semDuplicados = [...new Set(numeros)];
console.log(semDuplicados); */


// questão 4

/*const pessoas = [
  { id: 1, nome: "Ana" },
  { id: 2, nome: "João" },
  { id: 3, nome: "Maria" }
];
function buscarPorId(arr, alvo) {
  const encontrado = arr.find(obj => obj.id === alvo);
  return encontrado ?? null; 
}
console.log(buscarPorId(pessoas, 2));*/


// questão 5

/*const lista = [
  { nome: "Maria", idade: 20 },
  { nome: "Ana", idade: 20 },
  { nome: "João", idade: 18 }
];
lista.sort((a, b) => a.idade - b.idade || a.nome.localeCompare(b.nome));
console.log(lista);*/


// questão 6

/*const produtos = [
  { nome: "Maçã", categoria: "Fruta" },
  { nome: "Banana", categoria: "Fruta" },
  { nome: "Cenoura", categoria: "Legume" }
];
const agrupado = produtos.reduce((acc, p) => {
  (acc[p.categoria] ??= []).push(p);
  return acc;
}, {});

console.log(agrupado);*/

// questão 7

/*const array = [[1, 2], [3, [4]], 5];
const soma = array.flat(Infinity) // achata todos os níveis
  .reduce((acc, n) => acc + n, 0);
console.log(soma);*/


//questão 8

function media(arr, k) {
  if (k > arr.length) return [];
  let resultado = [];
  let soma = 0;
  for (let i = 0; i < k; i++) soma += arr[i];
  resultado.push(soma / k);
  
  for (let i = k; i < arr.length; i++) {
    soma += arr[i] - arr[i - k]; 
    resultado.push(soma / k);
  }
  return resultado;
}
console.log(media([1, 2, 3, 4, 5], 3));
