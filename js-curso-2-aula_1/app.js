let numeroSecreto = gerarNumeroAleatorio();
let tentativas = 1;

function exibirTextoNaTela(tag, texto) {
    let campo = document.querySelector(tag);
    campo.innerHTML = texto;
}

exibirTextoNaTela('h1', 'Jogo do Número Secreto');
exibirTextoNaTela('p', 'Escolha um número entre 1 e 10');

function verificarChute() {
    let chute = parseInt(document.querySelector('input').value);
    let paragrafo = document.querySelector('.texto__paragrafo');

    if (chute === numeroSecreto) {
        paragrafo.textContent = `Você acertou o número secreto (${numeroSecreto}) em ${tentativas} tentativa(s)!`;
        document.getElementById('reiniciar').disabled = false;
    } else {
        let dica = chute > numeroSecreto ? 'menor' : 'maior';
        paragrafo.textContent = `Errou! O número secreto é ${dica}.`;
        tentativas++;
    }

    document.querySelector('input').value = '';
}

function gerarNumeroAleatorio() {
    return parseInt(Math.random() * 10 + 1);
}

function reiniciarJogo() {
    numeroSecreto = gerarNumeroAleatorio();
    tentativas = 1;
    exibirTextoNaTela('p', 'Escolha um número entre 1 e 10');
    document.querySelector('.texto__paragrafo').textContent = '';
    document.querySelector('input').value = '';
    document.getElementById('reiniciar').disabled = true;
}
