

//questão 1

/*let idade = 25; 
if (idade < 16) {
    console.log("Não pode votar.");
} else if (idade >= 18 && idade <= 70) {
    console.log("Voto obrigatório.");
} else {
    console.log("Voto facultativo.");
}*/


//questão 2


/*let nota = 8; 
if (nota >= 7) {
    console.log("Aprovado.");
} else if (nota >= 5) {
    console.log("Recuperação.");
} else {
    console.log("Reprovado.");
}*/


//questão 3


/*let numero = 7; 
if (numero % 2 === 0) {
    console.log("O número é par.");
} else {
    console.log("O número é ímpar.");
}*/


//questão 4


/*let mes = 4; 
if (mes >= 12 || mes <= 2) {
    console.log("Verão.");
} else if (mes >= 3 && mes <= 5) {
    console.log("Outono.");
} else if (mes >= 6 && mes <= 8) {
    console.log("Inverno.");
} else {
    console.log("Primavera.");
}*/


//questão 5


/*let num2 = 5;
let num3 = 20;
if (num1 >= num2 && num1 >= num3) {
    console.log("O maior número é: " + num1);
} else if (num2 >= num1 && num2 >= num3) {
    console.log("O maior número é: " + num2);
} else {
    console.log("O maior número é: " + num3);
}*/


//questão 6


/*let usuario = "admin";
let senha = "1234";
if (usuario === "admin" && senha === "1234") {
    console.log("Login bem-sucedido.");
} else {
    console.log("Usuário ou senha inválidos.");
}*/


//questão 7


/*let valor = 350;
if (valor < 100) {
    console.log("Sem desconto, valor final: R$" + valor);
} else if (valor <= 500) {
    console.log("10% de desconto, valor final: R$" + (valor * 0.9));
} else {
    console.log("20% de desconto, valor final: R$" + (valor * 0.8));
}*/


//questão 8


/*let peso = 75;
let altura = 1.75; 
let imc = peso / (altura * altura);
console.log("Seu IMC é: " + imc.toFixed(2));
if (imc < 18.5) {
    console.log("Abaixo do peso.");
} else if (imc < 25) {
    console.log("Normal.");
} else if (imc < 30) {
    console.log("Sobrepeso.");
} else {
    console.log("Obesidade.");
}*/


//questão 9

/*let dia = 3; 
if (dia === 1) {
    console.log("Domingo.");
} else if (dia === 2) {
    console.log("Segunda-feira.");
} else if (dia === 3) {
    console.log("Terça-feira.");
} else if (dia === 4) {
    console.log("Quarta-feira.");
} else if (dia === 5) {
    console.log("Quinta-feira.");
} else if (dia === 6) {
    console.log("Sexta-feira.");
} else if (dia === 7) {
    console.log("Sábado.");
} else {
    console.log("Número inválido.");
}*/


//questão 10

const numeroSecreto = 7;
let palpite = 5; 
if (palpite < numeroSecreto) {
    console.log("Muito baixo!");
} else if (palpite > numeroSecreto) {
    console.log("Muito alto!");
} else {
    console.log("Parabéns, você acertou!");
}