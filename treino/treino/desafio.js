// 01 Criar uma função que exibe "Olá, mundo!" no console.

/*function olamundo() {
    console.log('Olá, mundo!');
}
olamundo();*/

// 02 Criar uma função que recebe um nome como parâmetro e exibe "Olá, [nome]!" no console

/*function saudacao(nome) {
    console.log(`Olá, ${nome}!`);
}
saudacao('João');*/

// 03 Criar uma função que recebe um número como parâmetro e retorna o dobro desse número.

/*function dobro(numero) {
    let resultado = numero * 2;
    console.log(resultado);
}
dobro(5);*/

// 04 Criar uma função que recebe três números como parâmetros e retorna a média deles.

/*function media(num1, num2, num3) {
    let resultado = (num1 + num2 + num3) / 3;
    console.log(resultado);
}
media(10, 20, 30);*/

// 05 Criar uma função que recebe dois números como parâmetros e retorna o maior deles.

/*function maiorNum( num1, num2) {
        if (num1 > num2 ) {
            console.log(`O maior número é: ${num1}`);
        } else {
            console.log(`O maior número é: ${num2}`);
        }
}
maiorNum(10, 20);*/

// 06 Criar uma função que recebe um número como parâmetro e retorna o resultado da multiplicação desse número por ele mesmo

/*function multiplicacao (num) {
	let multi = num * num;
	console.log (multi)
}
multiplicacao (5);*/



// DESAFIO 2


// 01 Crie uma função que calcule o índice de massa corporal (IMC) de uma pessoa, a partir de sua altura, em metros, e peso, em quilogramas, que serão recebidos como parâmetro.

/*function calcularimc (altura, peso) {
     let imc = peso / (altura * altura);
     console.log('Seu IMC é: ' + imc.toFixed(2));
}
calcularimc(1.71, 63);*/

// 02 Crie uma função que calcule o valor do fatorial de um número passado como parâmetro.

/*function calcularFatorial(numero) {
  if (numero == 0 || numero == 1) {
    return 1;
  }

  let fatorial = 1;
  for (let i = 2; i <= numero; i++) {
    fatorial *= i;
  }

  return fatorial;
}

let numero = 0;
let resultado = calcularFatorial(numero);
console.log(`O fatorial de ${numero} é ${resultado}`);*/

// 03
