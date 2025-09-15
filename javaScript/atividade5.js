

//questão 1
/*{
    let nota;
    do {
        nota = parseFloat(prompt(" Digite uma nota entre zero e dez:"));
        if (nota < 0 || nota > 10) {
            alert("Valor inválido! Tente novamente.");
        }
    } while (nota < 0 || nota > 10);
    console.log("Nota válida inserida: " + nota);
}

//questão 2
{
    let usuario, senha;
    do {
        usuario = prompt(" Digite seu nome de usuário:");
        senha = prompt(" Digite sua senha:");
        if (usuario === senha) {
            alert("Erro: A senha não pode ser igual ao nome de usuário. Tente novamente.");
        }
    } while (usuario === senha);
    console.log("Usuário e senha aceitos.");
}

//questão 3
{
    let nome, idade, salario, sexo, estadoCivil;
    do {
        nome = prompt(" Digite seu nome (maior que 3 caracteres):");
    } while (nome.length <= 3);
    do {
        idade = parseInt(prompt(" Digite sua idade (entre 0 e 150):"));
    } while (idade < 0 || idade > 150);
    do {
        salario = parseFloat(prompt(" Digite seu salário (maior que zero):"));
    } while (salario <= 0);
    do {
        sexo = prompt(" Digite seu sexo ('f' ou 'm'):").toLowerCase();
    } while (sexo !== 'f' && sexo !== 'm');
    do {
        estadoCivil = prompt(" Digite seu estado civil ('s', 'c', 'v', 'd'):").toLowerCase();
    } while (estadoCivil !== 's' && estadoCivil !== 'c' && estadoCivil !== 'v' && estadoCivil !== 'd');
    console.log("Todas as informações foram validadas com sucesso!");
}

//questão 4
{
    let popA = 80000;
    let popB = 200000;
    let anos = 0;
    while (popA < popB) {
        popA += popA * 0.03;
        popB += popB * 0.015;
        anos++;
    }
    console.log("Serão necessários " + anos + " anos para a população A ultrapassar ou igualar a população B.");
}

//questão 5
{
    let repetir;
    do {
        let popA = parseInt(prompt(" Informe a população inicial do país A:"));
        let taxaA = parseFloat(prompt(" Informe a taxa de crescimento de A (ex: 3 para 3%):")) / 100;
        let popB = parseInt(prompt(" Informe a população inicial do país B:"));
        let taxaB = parseFloat(prompt(" Informe a taxa de crescimento de B (ex: 1.5 para 1.5%):")) / 100;
        if (popA > 0 && taxaA > 0 && popB > 0 && taxaB > 0) {
            let anos = 0;
            while (popA < popB) {
                popA += popA * taxaA;
                popB += popB * taxaB;
                anos++;
            }
            console.log("Serão necessários " + anos + " anos.");
        } else {
            console.log("Valores inválidos. As populações e taxas devem ser maiores que zero.");
        }
        repetir = prompt("Deseja realizar outra operação? (s/n)").toLowerCase();
    } while (repetir === 's');
}

//questão 6
{
    console.log("Números um abaixo do outro:");
    for (let i = 1; i <= 20; i++) {
        console.log(i);
    }
    let linha = "";
    for (let i = 1; i <= 20; i++) {
        linha += i + " ";
    }
    console.log("Números um ao lado do outro:");
    console.log(linha);
}

//questão 7
{
    let maior = -Infinity;
    for (let i = 1; i <= 5; i++) {
        let numero = parseFloat(prompt(" Digite o " + i + "º número:"));
        if (numero > maior) {
            maior = numero;
        }
    }
    console.log("O maior número é: " + maior);
}

//questão 8
{
    let soma = 0;
    for (let i = 1; i <= 5; i++) {
        let numero = parseFloat(prompt(" Digite o " + i + "º número:"));
        soma += numero;
    }
    let media = soma / 5;
    console.log("A soma dos números é: " + soma);
    console.log("A média dos números é: " + media);
}

//questão 9
{
    console.log("Números ímpares entre 1 e 50:");
    for (let i = 1; i <= 50; i++) {
        if (i % 2 !== 0) {
            console.log(i);
        }
    }
}

//questão 10
{
    let num1 = parseInt(prompt(" Digite o primeiro número inteiro:"));
    let num2 = parseInt(prompt(" Digite o segundo número inteiro:"));
    let menor = Math.min(num1, num2);
    let maior = Math.max(num1, num2);
    console.log("Números no intervalo entre " + menor + " e " + maior + ":");
    for (let i = menor + 1; i < maior; i++) {
        console.log(i);
    }
}

//questão 11
{
    let num1 = parseInt(prompt(" Digite o primeiro número inteiro:"));
    let num2 = parseInt(prompt(" Digite o segundo número inteiro:"));
    let menor = Math.min(num1, num2);
    let maior = Math.max(num1, num2);
    let soma = 0;
    let intervaloStr = "";
    for (let i = menor + 1; i < maior; i++) {
        intervaloStr += i + " ";
        soma += i;
    }
    console.log("Números no intervalo: " + intervaloStr);
    console.log("Soma dos números no intervalo: " + soma);
}

//questão 12
{
    let tabuada = parseInt(prompt(" Digite um número de 1 a 10 para ver a tabuada:"));
    if (tabuada >= 1 && tabuada <= 10) {
        console.log("Tabuada de " + tabuada + ":");
        for (let i = 1; i <= 10; i++) {
            console.log(tabuada + " X " + i + " = " + (tabuada * i));
        }
    } else {
        console.log("Número inválido. Por favor, insira um número entre 1 e 10.");
    }
}

//questão 13
{
    let base = parseInt(prompt(" Digite o número base:"));
    let expoente = parseInt(prompt(" Digite o expoente:"));
    let resultado = 1;
    for (let i = 0; i < expoente; i++) {
        resultado *= base;
    }
    console.log(base + " elevado a " + expoente + " é: " + resultado);
}

//questão 14
{
    let pares = 0;
    let impares = 0;
    for (let i = 1; i <= 10; i++) {
        let numero = parseInt(prompt(" Digite o " + i + "º número inteiro:"));
        if (numero % 2 === 0) {
            pares++;
        } else {
            impares++;
        }
    }
    console.log("Quantidade de números pares: " + pares);
    console.log("Quantidade de números ímpares: " + impares);
}

//questão 15
{
    let n = parseInt(prompt(" Digite o n-ésimo termo da série de Fibonacci que deseja ver:"));
    let a = 1, b = 1;
    let fibStr = "1 1";
    for (let i = 3; i <= n; i++) {
        let proximo = a + b;
        fibStr += " " + proximo;
        a = b;
        b = proximo;
    }
    console.log("Série de Fibonacci até o " + n + "º termo: " + fibStr);
}

//questão 16
{
    let a = 0, b = 1;
    let fibStr = "0 1";
    while (b <= 500) {
        let proximo = a + b;
        if (proximo > 500) break;
        fibStr += " " + proximo;
        a = b;
        b = proximo;
    }
    console.log("Série de Fibonacci até o valor ser maior que 500: " + fibStr);
}

//questão 17
{
    let numero = parseInt(prompt(" Digite um número para calcular o fatorial:"));
    let fatorial = 1;
    let fatStr = "";
    for (let i = numero; i > 0; i--) {
        fatorial *= i;
        fatStr += i + (i > 1 ? "." : "");
    }
    console.log(numero + "! = " + fatStr + " = " + fatorial);
}

//questão 18
{
    let quantidade = parseInt(prompt(" Quantos números você deseja inserir?"));
    let menor = Infinity;
    let maior = -Infinity;
    let soma = 0;
    for (let i = 0; i < quantidade; i++) {
        let numero = parseFloat(prompt("Digite o " + (i + 1) + "º número:"));
        soma += numero;
        if (numero < menor) menor = numero;
        if (numero > maior) maior = numero;
    }
    console.log("Menor valor: " + menor);
    console.log("Maior valor: " + maior);
    console.log("Soma dos valores: " + soma);
}

//questão 19
{
    let quantidade = parseInt(prompt(" Quantos números (entre 0 e 1000) você deseja inserir?"));
    let menor = Infinity;
    let maior = -Infinity;
    let soma = 0;
    for (let i = 0; i < quantidade; i++) {
        let numero;
        do {
            numero = parseFloat(prompt("Digite o " + (i + 1) + "º número (entre 0 e 1000):"));
            if (numero < 0 || numero > 1000) {
                alert("Número inválido, digite um valor entre 0 e 1000.");
            }
        } while (numero < 0 || numero > 1000);
        soma += numero;
        if (numero < menor) menor = numero;
        if (numero > maior) maior = numero;
    }
    console.log("Menor valor: " + menor);
    console.log("Maior valor: " + maior);
    console.log("Soma dos valores: " + soma);
}

//questão 20
{
    let continuar;
    do {
        let numero;
        do {
            numero = parseInt(prompt(" Digite um número inteiro positivo e menor que 16 para calcular o fatorial:"));
            if (numero < 0 || numero >= 16) {
                alert("Número inválido, deve ser positivo e menor que 16.");
            }
        } while (numero < 0 || numero >= 16);
        
        let fatorial = 1;
        for (let i = numero; i > 1; i--) {
            fatorial *= i;
        }
        console.log("O fatorial de " + numero + " é " + fatorial);
        continuar = prompt("Deseja calcular outro fatorial? s ou n").toLowerCase();
    } while (continuar === 's');
}

//questão 21
{
    let numero = parseInt(prompt("Digite um número inteiro para verificar se é primo:"));
    let primo = true;
    if (numero <= 1) {
     primo = false;
    } else {
        for (let i = 2; i < numero; i++) {
            if (numero % i === 0) {
             primo = false;
                break;
            }
        }
    }
    if (primo) {
        console.log(numero + " é um número primo.");
    } else {
        console.log(numero + " não é um número primo.");
    }
}

//questão 22
{
    let numero = parseInt(prompt(" Digite um número inteiro para verificar se é primo:"));
    let divisores = [];
    for (let i = 2; i < numero; i++) {
        if (numero % i === 0) {
            divisores.push(i);
        }
    }
    if (divisores.length === 0 && numero > 1) {
        console.log(numero + " é um número primo.");
    } else {
        console.log(numero + " não é um número primo.");
        if(divisores.length > 0) {
          console.log("Ele é divisível por: " + divisores.join(', '));
        }
    }
}

//questão 23
{
    let n = parseInt(prompt(" Digite um número n para encontrar todos os primos entre 1 e N:"));
    let primos = [];
    let divisoes = 0;
    for (let i = 2; i <= n; i++) {
        let = true;
        for (let j = 2; j < i; j++) {
            divisoes++;
            if (i % j === 0) {
             primoos = false;
                break;
            }
        }
        if(primo) {
            primos.push(i);
        }
    }
    console.log("Números primos entre 1 e " + n + ": " + primos.join(', '));
    console.log("Número total de divisões executadas: " + divisoes);
}

//questão 24
{
    let quantidade = parseInt(prompt(" Quantas notas você deseja calcular a média?"));
    let soma = 0;
    for (let i = 0; i < quantidade; i++) {
        let nota = parseFloat(prompt("Digite a " + (i + 1) + "ª nota:"));
        soma += nota;
    }
    let media = soma / quantidade;
    console.log("A média aritmética das " + quantidade + " notas é: " + media.toFixed(2));
}

//questão 25
{
    let quantidade = parseInt(prompt(" Quantas pessoas são?"));
    let somaIdades = 0;
    for (let i = 0; i < quantidade; i++) {
        let idade = parseInt(prompt("Digite a idade da " + (i + 1) + "ª pessoa:"));
        somaIdades += idade;
    }
    let mediaIdades = somaIdades / quantidade;
    console.log("A média de idade da turma é: " + mediaIdades.toFixed(2));
    if (mediaIdades >= 0 && mediaIdades <= 25) {
        console.log("A turma é jovem.");
    } else if (mediaIdades >= 26 && mediaIdades <= 60) {
        console.log("A turma é adulta.");
    } else {
        console.log("A turma é idosa.");
    }
}
{
// questão 26


let eleitores = parseInt(prompt("Digite o numero de eleitores:"));
let votoCandidato1 = 0;
let votoCandidato2 = 0;
let votoCandidato3 = 0;
let nulo = 0;
 do {
        totalEleitores = parseInt(prompt("Digite o número total de eleitores:"));
        if (isNaN(eleitores) || eleitores <= 0) {
            alert("Por favor, digite um número válido e positivo de eleitores.");
        }
    } while (isNaN(eleitores) || eleitores <= 0);
for (let i = 0; i < eleitores; i++){
    let voto = parseInt(prompt("Digite o numero de eleitores:"));
    switch(voto){
    case 1:
    votoCandidato1++;
    break;
    case 2:
    votoCandidato2++;
    break;
    case 3:
    votoCandidato3
    break;
    default:
        nulo++;
        break;
    }
}
    
    console.log("Total de Eleitores: " + eleitores);
    console.log("Votos para o candidato 1: " + votosCandidato1);
    console.log("Votos para o candidato 2: " + votosCandidato2);
    console.log("Votos para o candidato 3: " + votosCandidato3);
    console.log("Votos nulos: " + nulos);

}


Olá! Dando continuidade à nossa lista de exercícios, preparei o código para as questões de 27 a 38.

Mantive exatamente o mesmo formato que você solicitou: código limpo, com variáveis de nomes simples, isolado em blocos {} para cada questão e sem os títulos de separação no console.

Aqui estão as próximas soluções:

Código para as Questões 27 a 38
JavaScript

//questão 27
{
    let quantidadeTurmas;
    let totalAlunos = 0;

    do {
        quantidadeTurmas = parseInt(prompt("Questão 27: Digite a quantidade de turmas:"));
    } while (isNaN(quantidadeTurmas) || quantidadeTurmas <= 0);

    for (let i = 1; i <= quantidadeTurmas; i++) {
        let quantidadeAlunos;
        do {
            quantidadeAlunos = parseInt(prompt("Digite a quantidade de alunos para a turma " + i + ":"));
            if (quantidadeAlunos > 40) {
                alert("As turmas não podem ter mais de 40 alunos. Tente novamente.");
            }
        } while (isNaN(quantidadeAlunos) || quantidadeAlunos < 0 || quantidadeAlunos > 40);
        totalAlunos += quantidadeAlunos;
    }

    let media = totalAlunos / quantidadeTurmas;
    console.log("A média de alunos por turma é de: " + media.toFixed(2));
}

//questão 28
{
    let quantidadeCds;
    let valorTotal = 0;

    do {
        quantidadeCds = parseInt(prompt("Questão 28: Digite a quantidade de CDs na coleção:"));
    } while (isNaN(quantidadeCds) || quantidadeCds <= 0);

    for (let i = 1; i <= quantidadeCds; i++) {
        let valorCd;
        do {
            valorCd = parseFloat(prompt("Digite o valor pago no CD " + i + ":"));
        } while (isNaN(valorCd) || valorCd < 0);
        valorTotal += valorCd;
    }

    let valorMedio = valorTotal / quantidadeCds;
    console.log("O valor total investido na coleção foi de R$ " + valorTotal.toFixed(2));
    console.log("O valor médio gasto em cada CD foi de R$ " + valorMedio.toFixed(2));
}

//questão 29
{
    console.log("Lojas Quase Dois - Tabela de preços");
    const precoUnitario = 1.99;
    for (let i = 1; i <= 50; i++) {
        let precoTotal = i * precoUnitario;
        console.log(i + " - R$ " + precoTotal.toFixed(2));
    }
}

//questão 30
{
    let precoPao;
    do {
        precoPao = parseFloat(prompt("Questão 30: Preço do pão:"));
    } while (isNaN(precoPao) || precoPao <= 0);

    console.log("Panificadora Pão de Ontem - Tabela de preços");
    for (let i = 1; i <= 50; i++) {
        let precoTotal = i * precoPao;
        console.log(i + " - R$ " + precoTotal.toFixed(2));
    }
}

//questão 31
{
    let continuarComprando = true;
    while (continuarComprando) {
        console.log("Lojas Tabajara");
        let totalCompra = 0;
        let contadorProduto = 1;
        let precoProduto;

        do {
            precoProduto = parseFloat(prompt("Produto " + contadorProduto + ": R$ (Digite 0 para finalizar)"));
            if (!isNaN(precoProduto) && precoProduto > 0) {
                console.log("Produto " + contadorProduto + ": R$ " + precoProduto.toFixed(2));
                totalCompra += precoProduto;
                contadorProduto++;
            }
        } while (precoProduto !== 0);

        console.log("Total: R$ " + totalCompra.toFixed(2));
        let dinheiroCliente = parseFloat(prompt("Dinheiro: R$"));
        let troco = dinheiroCliente - totalCompra;
        console.log("Dinheiro: R$ " + dinheiroCliente.toFixed(2));
        console.log("Troco: R$ " + troco.toFixed(2));
        console.log("...");
        
        let novaCompra = prompt("Registrar próxima compra? (s/n)");
        if (novaCompra.toLowerCase() !== 's') {
            continuarComprando = false;
        }
    }
}

//questão 32
{
    let temperaturas = [];
    let entrada;
    while (true) {
        entrada = prompt("Questão 32: Digite uma temperatura ou 'fim' para sair:");
        if (entrada.toLowerCase() === 'fim') {
            break;
        }
        let temp = parseFloat(entrada);
        if (!isNaN(temp)) {
            temperaturas.push(temp);
        } else {
            alert("Entrada inválida.");
        }
    }

    if (temperaturas.length > 0) {
        let menor = Math.min(...temperaturas);
        let maior = Math.max(...temperaturas);
        let soma = temperaturas.reduce((acc, val) => acc + val, 0);
        let media = soma / temperaturas.length;

        console.log("Menor temperatura: " + menor.toFixed(2));
        console.log("Maior temperatura: " + maior.toFixed(2));
        console.log("Média das temperaturas: " + media.toFixed(2));
    } else {
        console.log("Nenhuma temperatura foi informada.");
    }
}

//questão 33
{
    let numero = parseInt(prompt("Questão 33: Digite um número inteiro para verificar se é primo:"));
    let isPrimo = true;
    if (numero <= 1) {
        isPrimo = false;
    } else {
        for (let i = 2; i < numero; i++) {
            if (numero % i === 0) {
                isPrimo = false;
                break;
            }
        }
    }
    if (isPrimo) {
        console.log(numero + " é um número primo.");
    } else {
        console.log(numero + " não é um número primo.");
    }
}

//questão 34
{
    let limite = parseInt(prompt("Questão 34: Gerar primos até qual número?"));
    let primos = [];
    for (let numero = 2; numero <= limite; numero++) {
        let isPrimo = true;
        for (let i = 2; i < numero; i++) {
            if (numero % i === 0) {
                isPrimo = false;
                break;
            }
        }
        if (isPrimo) {
            primos.push(numero);
        }
    }
    console.log("Números primos entre 1 e " + limite + ": " + primos.join(', '));
}

//questão 35
{
    let numero = parseInt(prompt("Montar a tabuada de:"));
    let inicio, fim;

    do {
        inicio = parseInt(prompt("Começar por:"));
        fim = parseInt(prompt("Terminar em:"));
        if (fim < inicio) {
            alert("O valor final não pode ser menor que o valor inicial.");
        }
    } while (fim < inicio);

    console.log("Vou montar a tabuada de " + numero + " começando em " + inicio + " e terminando em " + fim + ":");
    for (let i = inicio; i <= fim; i++) {
        console.log(numero + " X " + i + " = " + (numero * i));
    }
}

//questão 36
{
    let codigoAlto = 0, alturaAlta = -1;
    let codigoBaixo = 0, alturaBaixa = Infinity;
    let codigoGordo = 0, pesoGordo = -1;
    let codigoMagro = 0, pesoMagro = Infinity;
    let somaAlturas = 0, somaPesos = 0, contadorClientes = 0;

    while (true) {
        let codigo = parseInt(prompt("Digite o código do cliente (ou 0 para sair):"));
        if (codigo === 0) {
            break;
        }
        let altura = parseFloat(prompt("Digite a altura do cliente (em metros):"));
        let peso = parseFloat(prompt("Digite o peso do cliente (em kg):"));
        
        if (altura > alturaAlta) {
            alturaAlta = altura;
            codigoAlto = codigo;
        }
        if (altura < alturaBaixa) {
            alturaBaixa = altura;
            codigoBaixo = codigo;
        }
        if (peso > pesoGordo) {
            pesoGordo = peso;
            codigoGordo = codigo;
        }
        if (peso < pesoMagro) {
            pesoMagro = peso;
            codigoMagro = codigo;
        }
        
        somaAlturas += altura;
        somaPesos += peso;
        contadorClientes++;
    }

    if (contadorClientes > 0) {
        let mediaAlturas = somaAlturas / contadorClientes;
        let mediaPesos = somaPesos / contadorClientes;

        console.log("Cliente mais alto: Código " + codigoAlto + " com " + alturaAlta.toFixed(2) + "m");
        console.log("Cliente mais baixo: Código " + codigoBaixo + " com " + alturaBaixa.toFixed(2) + "m");
        console.log("Cliente mais gordo: Código " + codigoGordo + " com " + pesoGordo.toFixed(2) + "kg");
        console.log("Cliente mais magro: Código " + codigoMagro + " com " + pesoMagro.toFixed(2) + "kg");
        console.log("Média de altura dos clientes: " + mediaAlturas.toFixed(2) + "m");
        console.log("Média de peso dos clientes: " + mediaPesos.toFixed(2) + "kg");
    } else {
        console.log("Nenhum cliente foi registrado.");
    }
}

//questão 37
{
    const anoContratacao = 1995;
    const anoAtual = new Date().getFullYear(); // Pega o ano atual automaticamente
    
    let salarioInicial = parseFloat(prompt("Questão 37: Digite o salário inicial do funcionário:"));
    let salarioAtual = salarioInicial;
    let percentualAumento = 0.015;

    // Aumento de 1996
    salarioAtual += salarioInicial * percentualAumento;
    
    // Aumentos de 1997 em diante
    for (let ano = anoContratacao + 2; ano <= anoAtual; ano++) {
        percentualAumento *= 2;
        salarioAtual += salarioAtual * percentualAumento;
    }
    
    console.log("O salário atual do funcionário em " + anoAtual + " é de R$ " + salarioAtual.toFixed(2));
}

//questão 38
{
    let maiorIndice = -1, cidadeMaiorIndice = '';
    let menorIndice = Infinity, cidadeMenorIndice = '';
    let somaVeiculos = 0;
    let somaAcidentesMenos2000 = 0;
    let contadorCidadesMenos2000 = 0;
    const numeroCidades = 5;

    for (let i = 1; i <= numeroCidades; i++) {
        let codigoCidade = prompt("Digite o código da cidade " + i + ":");
        let numVeiculos = parseInt(prompt("Digite o número de veículos de passeio da cidade " + codigoCidade + ":"));
        let numAcidentes = parseInt(prompt("Digite o número de acidentes com vítimas da cidade " + codigoCidade + ":"));

        somaVeiculos += numVeiculos;
        
        let indiceAcidentes = numAcidentes / numVeiculos;
        
        if (indiceAcidentes > maiorIndice) {
            maiorIndice = indiceAcidentes;
            cidadeMaiorIndice = codigoCidade;
        }
        if (indiceAcidentes < menorIndice) {
            menorIndice = indiceAcidentes;
            cidadeMenorIndice = codigoCidade;
        }
        
        if (numVeiculos < 2000) {
            somaAcidentesMenos2000 += numAcidentes;
            contadorCidadesMenos2000++;
        }
    }
    
    let mediaVeiculos = somaVeiculos / numeroCidades;
    
    console.log("Menor índice de acidentes: " + menorIndice.toFixed(4) + " (cidade " + cidadeMenorIndice + ")");
    console.log("Maior índice de acidentes: " + maiorIndice.toFixed(4) + " (cidade " + cidadeMaiorIndice + ")");
    console.log("Média de veículos nas cinco cidades: " + mediaVeiculos.toFixed(2));
    
    if (contadorCidadesMenos2000 > 0) {
        let mediaAcidentesMenos2000 = somaAcidentesMenos2000 / contadorCidadesMenos2000;
        console.log("Média de acidentes nas cidades com menos de 2.000 veículos: " + mediaAcidentesMenos2000.toFixed(2));
    } else {
        console.log("Nenhuma cidade com menos de 2.000 veículos foi informada.");
    }
}


//questão 39
{
    let valorDivida = parseFloat(prompt("Questão 39: Digite o valor da dívida:"));

    if (isNaN(valorDivida) || valorDivida <= 0) {
        console.log("Valor inválido. Por favor, inicie novamente e digite um número positivo.");
    } else {
        console.log("Valor da Dívida | Valor Juros | Qtd Parcelas | Valor da Parcela");

        const parcelas = [1, 3, 6, 9, 12];
        const jurosTaxas = [0, 0.10, 0.15, 0.20, 0.25];

        for (let i = 0; i < parcelas.length; i++) {
            let qtdParcelas = parcelas[i];
            let taxaJuros = jurosTaxas[i];
            
            let valorJuros = valorDivida * taxaJuros;
            let dividaTotal = valorDivida + valorJuros;
            let valorParcela = dividaTotal / qtdParcelas;
            
            let linha = "R$ " + dividaTotal.toFixed(2) 
                      + " | R$ " + valorJuros.toFixed(2) 
                      + " | " + qtdParcelas 
                      + " | R$ " + valorParcela.toFixed(2);
            console.log(linha);
        }
    }
}

//questão 40
{
    let totalGeral = 0;
    
    console.log("--- Cardápio da Lanchonete ---");
    console.log("Especificação   | Código | Preço");
    console.log("Cachorro Quente | 100    | R$ 1,20");
    console.log("Bauru Simples   | 101    | R$ 1,30");
    console.log("Bauru com ovo   | 102    | R$ 1,50");
    console.log("Hambúrguer      | 103    | R$ 1,20");
    console.log("Cheeseburguer   | 104    | R$ 1,30");
    console.log("Refrigerante    | 105    | R$ 1,00");
    console.log("--------------------------------");

    while (true) {
        let codigo = parseInt(prompt("Digite o código do item (ou 0 para encerrar o pedido):"));

        if (codigo === 0) {
            break;
        }

        let quantidade = parseInt(prompt("Digite a quantidade desejada:"));
        
        if (isNaN(quantidade) || quantidade <= 0) {
            alert("Quantidade inválida. Tente adicionar o item novamente.");
            continue; // Pula para a próxima iteração do laço
        }

        let preco = 0;
        let especificacao = "";

        switch (codigo) {
            case 100:
                preco = 1.20;
                especificacao = "Cachorro Quente";
                break;
            case 101:
                preco = 1.30;
                especificacao = "Bauru Simples";
                break;
            case 102:
                preco = 1.50;
                especificacao = "Bauru com ovo";
                break;
            case 103:
                preco = 1.20;
                especificacao = "Hambúrguer";
                break;
            case 104:
                preco = 1.30;
                especificacao = "Cheeseburguer";
                break;
            case 105:
                preco = 1.00;
                especificacao = "Refrigerante";
                break;
            default:
                alert("Código de item inválido!");
                continue; // Pula para a próxima iteração
        }
        
        let valorItem = preco * quantidade;
        totalGeral += valorItem;
        
        console.log("Item: " + especificacao + " | Qtd: " + quantidade + " | Valor: R$ " + valorItem.toFixed(2));
    }
    
    console.log("--------------------------------");
    console.log("Valor total a pagar: R$ " + totalGeral.toFixed(2));
}*/







