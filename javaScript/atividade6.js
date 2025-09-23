


//q1----------------


/*function celsiusParaFahrenheit(celsius) {
    return (celsius * 9 / 5) + 32;
}

function fahrenheitParaCelsius(fahrenheit) {
    return (fahrenheit - 32) * 5 / 9;
}

function menuConversor() {
    let escolha;
    while (escolha !== '3') {
        escolha = prompt("Menu:\n1. Celsius para Fahrenheit\n2. Fahrenheit para Celsius\n3. Sair");
        if (escolha === '1') {
            let temp = parseFloat(prompt("Digite a temperatura em Celsius:"));
            console.log("Resultado: " + celsiusParaFahrenheit(temp) + " °F");
        } else if (escolha === '2') {
            let temp = parseFloat(prompt("Digite a temperatura em Fahrenheit:"));
            console.log("Resultado: " + fahrenheitParaCelsius(temp) + " °C");
        } else if (escolha === '3') {
            console.log("Saindo...");
        } else {
            console.log("Opção inválida.");
        }
    }
}

menuConversor();*/



//q2-----------------


/*function soma(a, b, c) {
    return a + b + c;
}

function media(a, b, c) {
    return soma(a, b, c) / 3;
}

let n1 = parseFloat(prompt("Digite o primeiro número:"));
let n2 = parseFloat(prompt("Digite o segundo número:"));
let n3 = parseFloat(prompt("Digite o terceiro número:"));

console.log("A soma é: " + soma(n1, n2, n3));
console.log("A média é: " + media(n1, n2, n3));*/



//q3--------------------


/*function encontrarMaior(a, b, c) {
    return Math.max(a, b, c);
}

function encontrarMenor(a, b, c) {
    return Math.min(a, b, c);
}

let num1 = parseFloat(prompt("Digite o primeiro número:"));
let num2 = parseFloat(prompt("Digite o segundo número:"));
let num3 = parseFloat(prompt("Digite o terceiro número:"));

console.log("O maior número é: " + encontrarMaior(num1, num2, num3));
console.log("O menor número é: " + encontrarMenor(num1, num2, num3));*/



//q4--------------------------



/*function simularLancamentos() {
    const frequencia = { 1: 0, 2: 0, 3: 0, 4: 0, 5: 0, 6: 0 };
    const totalLancamentos = 1000000;

    for (let i = 0; i < totalLancamentos; i++) {
        const resultado = Math.floor(Math.random() * 6) + 1;
        frequencia[resultado]++;
    }

    for (const face in frequencia) {
        console.log("Face " + face + ": " + frequencia[face] + " vezes");
    }
}

simularLancamentos();*/




//q5----------------------



/*function ehPrimo(numero) {
    if (numero <= 1) return false;
    for (let i = 2; i <= Math.sqrt(numero); i++) {
        if (numero % i === 0) return false;
    }
    return true;
}

function mostrarPrimosAteN(n) {
    console.log("Números primos de 1 até " + n + ":");
    for (let i = 1; i <= n; i++) {
        if (ehPrimo(i)) {
            console.log(i);
        }
    }
}

let n = parseInt(prompt("Digite um número inteiro:"));
mostrarPrimosAteN(n);*/




//q6--------------------

/*function ehPerfeito(numero) {
    if (numero < 1) return false;
    let somaDivisores = 0;
    for (let i = 1; i <= numero / 2; i++) {
        if (numero % i === 0) {
            somaDivisores += i;
        }
    }
    return somaDivisores === numero;
}

function mostrarPerfeitosAteN(n) {
    console.log("Números perfeitos até " + n + ":");
    for (let i = 1; i <= n; i++) {
        if (ehPerfeito(i)) {
            console.log(i);
        }
    }
}

let limite = parseInt(prompt("Digite um número inteiro limite:"));
mostrarPerfeitosAteN(limite);*/

//q7-----------------------------

/*function imprimirPadrao1(n) {
    for (let i = 1; i <= n; i++) {
        let linha = '';
        for (let j = 0; j < i; j++) {
            linha += i + ' ';
        }
        console.log(linha);
    }
}

let valorN1 = parseInt(prompt("Digite um número N:"));
imprimirPadrao1(valorN1);*/

//q8-------------------------------

/*function imprimirPadrao2(n) {
    for (let i = 1; i <= n; i++) {
        let linha = '';
        for (let j = 1; j <= i; j++) {
            linha += j + ' ';
        }
        console.log(linha);
    }
}

let valorN2 = parseInt(prompt("Digite um número N:"));
imprimirPadrao2(valorN2);*/


//q9---------------------------------

/*function verificaSinal(numero) {
    return numero > 0 ? 'P' : 'N';
}

let arg = parseFloat(prompt("Digite um número:"));
console.log(verificaSinal(arg));


//q10
function somaImposto(taxaImposto, custo) {
    const novoCusto = custo * (1 + taxaImposto / 100);
    return novoCusto;
}

let custoItem = parseFloat(prompt("Digite o custo do item:"));
let taxa = parseFloat(prompt("Digite a taxa de imposto (%):"));

console.log("Custo com imposto: " + somaImposto(taxa, custoItem));*/



//q11---------------------------------

/*function converterHorario(hora, minuto) {
    let periodo = 'A.M.';
    let horaConvertida = hora;

    if (hora === 0) {
        horaConvertida = 12;
    } else if (hora === 12) {
        periodo = 'P.M.';
    } else if (hora > 12) {
        horaConvertida = hora - 12;
        periodo = 'P.M.';
    }

    let minutoFormatado = minuto < 10 ? '0' + minuto : minuto;
    console.log("Horário convertido: " + horaConvertida + ":" + minutoFormatado + " " + periodo);
}

function iniciarConversorHorario() {
    let continuar = 's';
    while (continuar.toLowerCase() === 's') {
        let hora = parseInt(prompt("Digite a hora (0-23):"));
        let minuto = parseInt(prompt("Digite o minuto (0-59):"));
        converterHorario(hora, minuto);
        continuar = prompt("Deseja converter outro horário? (s/n)");
    }
}

iniciarConversorHorario();*/


//q12--------------------------

function contarDigitos(numero) {
    const numeroComoString = String(Math.abs(numero));
    return numeroComoString.length;
}

let numeroParaContar = parseInt(prompt("Digite um número inteiro:"));
console.log("Quantidade de dígitos: " + contarDigitos(numeroParaContar));








