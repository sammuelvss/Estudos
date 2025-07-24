let titulo = document.querySelector('h1');
titulo.innerHTML = 'Hora do Desafio';

function consol() {
    console.log('O botão foi clicado');
}
function aler() {
    alert('EU amo Js ');
}
function promp() {
    let cidade = prompt('digite o nome de uma cidade do Brasil: ');
    alert('Estive em ' + cidade + ' e lembrei de você');
}
function som() {
    let num1 = parseInt(prompt('digite um numero:'));
    let num2 = parseInt(prompt('digite um numero:'));
    let soma = num1 + num2;
    alert('o resultado da soma é ' + soma);

}