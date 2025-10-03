// 01 Ordenar array de 2 números
function ordenarDoisNumeros(arr) {
    if (arr[0] > arr[1]) {
        let temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
    console.log("01. Array de 2 ordenado: " + arr);
    return arr;
}
//ordenarDoisNumeros([5, 2]);

// 02 Ordenar array de 3 números
function ordenarTresNumeros(arr) {
    if (arr[0] > arr[1]) {
        let temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
    if (arr[1] > arr[2]) {
        let temp = arr[1];
        arr[1] = arr[2];
        arr[2] = temp;
    }
    if (arr[0] > arr[1]) {
        let temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
    console.log("02. Array de 3 ordenado: " + arr);
    return arr;
}
ordenarTresNumeros([3, 1, 2]);

// 03 Ler 3 números e inverter a ordem
function inverterTresNumeros() {
    const numeros = [];
    numeros[0] = parseInt(prompt("Digite o primeiro número:"));
    numeros[1] = parseInt(prompt("Digite o segundo número:"));
    numeros[2] = parseInt(prompt("Digite o terceiro número:"));
    console.log("Array original: " + numeros);

    const invertido = [numeros[2], numeros[1], numeros[0]];
    console.log("03. Array invertido: " + invertido);
}
// inverterTresNumeros();

// 04 Ler N números e inverter a ordem
function inverterNNumeros() {
    const quantidade = parseInt(prompt(" Quantos números deseja inserir?"));
    const numeros = [];
    for (let i = 0; i < quantidade; i++) {
        numeros[i] = parseInt(prompt(" Digite o número " + (i + 1) + ":"));
    }
    console.log("Array original: " + numeros);

    const invertido = [];
    for (let i = 0; i < quantidade; i++) {
        invertido[i] = numeros[quantidade - 1 - i];
    }
    console.log(" Array invertido: " + invertido);
}
// inverterNNumeros();

// 05 Ordenar array de qualquer tamanho (Bubble Sort)
function bubbleSort(arr) {
    const n = arr.length;
    for (let i = 0; i < n - 1; i++) {
        for (let j = 0; j < n - 1 - i; j++) {
            if (arr[j] > arr[j + 1]) {
                let temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
    console.log("05. Array ordenado: " + arr);
    return arr;
}
bubbleSort([5, 3, 8, 1, 9, 2]);

// 06. Encontrar todos os índices de um número
function encontrarTodosIndices(vetor, numero) {
    const indices = [];
    for (let i = 0; i < vetor.length; i++) {
        if (vetor[i] === numero) {
            indices.push(i);
        }
    }
    console.log(" o número " + numero + " aparece nos índices: " + indices);
    return indices;
}
encontrarTodosIndices([1, 5, 2, 5, 8, 5], 5);

// 07. Sequência de Fibonacci
function sequenciaFibonacci() {
    const n = parseInt(prompt("07. Digite um inteiro positivo para Fibonacci:"));
    const fib = [];
    if (n > 0) fib[0] = 0;
    if (n > 1) fib[1] = 1;
    for (let i = 2; i < n; i++) {
        fib[i] = fib[i - 1] + fib[i - 2];
    }
    console.log("Sequência de Fibonacci: " + fib);
}
// sequenciaFibonacci();

// 08 Fatorial
function sequenciaFatorial() {
    const n = parseInt(prompt("Digite um inteiro positivo para Fatorial:"));
    const fat = [];
    fat[0] = 1; 
    for (let i = 1; i < n; i++) {
        fat[i] = (i + 1) * fat[i - 1];
    }
    console.log("Sequência Fatorial: " + fat);
}
// sequenciaFatorial();

// 09  Jogo da Velha
function jogoDaVelha() {
    const tabuleiro = [
        ['', '', ''],
        ['', '', ''],
        ['', '', '']
    ];
    let jogadorAtual = 'X'; 

    function exibirTabuleiro() {
        console.log("08 (Extra). Jogo da Velha:");
        for(let i = 0; i < 3; i++){
            console.log(tabuleiro[i].join(' | '));
        }
    }

    exibirTabuleiro();
    
    const linha = parseInt(prompt(" Jogador " + jogadorAtual + ", digite a linha (0, 1 ou 2):"));
    const coluna = parseInt(prompt(" Jogador " + jogadorAtual + ", digite a coluna (0, 1 ou 2):"));
    
    if(tabuleiro[linha][coluna] === ''){
        tabuleiro[linha][coluna] = jogadorAtual;
    } else {
        console.log("Posição já ocupada!");
    }
    
    exibirTabuleiro();
}
// jogoDaVelha();

// 10 Criar  matriz
function criarMatriz() {
    const linhas = parseInt(prompt(" Digite a quantidade de linhas:"));
    const colunas = parseInt(prompt(" Digite a quantidade de colunas:"));
    const matriz = [];
    let contador = 1; 

    for (let i = 0; i < linhas; i++) {
        matriz[i] = [];
        for (let j = 0; j < colunas; j++) {
            matriz[i][j] = contador;
            contador++;
        }
    }
   
    for(let i = 0; i < linhas; i++){
        console.log(matriz[i].join('\t'));
    }
}
// criarMatriz();