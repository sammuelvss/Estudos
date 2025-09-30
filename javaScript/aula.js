



/*const t1 = false
const t2 = false



let compraTV50 = t1 && t2;
console.log('vamos comprar a TV 50:',compraTV50);

let compraTV32 = t1 !== t2;
console.log('vamos comprar uma TV 32:',compraTV32);

let tomarSorvete = t1 || t2;
console.log('vamos comprar um sorvete:',tomarSorvete);

let ficarEmCasa = !tomarSorvete;
console.log("vamos ficar em casa:",ficarEmCasa);*/



/*function mFuncao1() {
    let muda = true;
    let x = document.getElementById("paragrafo");
    while (muda) {
        x.innerHTML = "Hello";

    }
    function mFuncao2() {

        let y = document.getElementById("paragrafo2");
        y.innerHTML = "Olá";

    }
}*/



/*var texto = window.confirm("escolha uma");
window.alert("você selecionou: " + texto);


carros = new Array();
carros[0] = "volvo";
carros[5] = "BMW";
carros[7] = "volkswagen";*/


/*'function adicionar1(pessoa){
switch (pessoa){
   
case 1:
     let agenda = [];
let nome = prompt("digite o nome:");
let telefone = prompt("digite o telefone:");
let matricula = prompt("digite sua matricula");

agenda.push(nome);
agenda.push(telefone);
agenda.push(matricula);


let remover1 = prompt("você deseja remover1? digite 1 para nome, 2 para telefone, 3 para matricula. 0 para parar");
if (remover1 == 1){
    agenda.splice(0,1);
    console.log(agenda);
} else if (remover1 == 2){
    agenda.splice(1,1);
    console.log(agenda);
} else if (remover1 == 3){
    agenda.splice(2,1);
    console.log(agenda);
} else {
    alert("numero invalido");
}

let adicionar1 = prompt("você deseja adicionar1 um dado? digite 1 para nome, 2 para telefone, 3 para matricula.");
if (adicionar1 == 1){
     nome = prompt("digite o nome:")
    agenda.splice(0,0, nome);
} else if (adicionar1 == 2){
    telefone = prompt("digite seu telefone:");
    agenda.splice(1,0, telefone);
} else if (adicionar1 == 3){
    matricula = prompt("digite sua matricula:");
    agenda.splice(2,0, matricula);
} else {
    alert("numero invalido.");
}
console.log(agenda);
break;

case 2:
     
let nome2 = prompt("digite o nome2:");
let telefone2 = prompt("digite o telefone2:");
let matricula2 = prompt("digite sua matricula2");

agenda.push(nome2);
agenda.push(telefone2);
agenda.push(matricula2);


let remover2 = prompt("você deseja remover? digite 1 para nome2, 2 para telefone2, 3 para matricula2. 0 para parar");
if (remover2 == 1){
    agenda.splice(0,1);
    console.log(agenda);
} else if (remover2 == 2){
    agenda.splice(1,1);
    console.log(agenda);
} else if (remover2 == 3){
    agenda.splice(2,1);
    console.log(agenda);
} else {
    alert("numero invalido");
}

let adicionar2 = prompt("você deseja adicionar um dado? digite 1 para nome2, 2 para telefone2, 3 para matricula2.");
if (adicionar2 == 1){
     nome2 = prompt("digite o nome2:")
    agenda.splice(0,0, nome2);
} else if (adicionar2 == 2){
    telefone2 = prompt("digite seu telefone2:");
    agenda.splice(1,0, telefone2);
} else if (adicionar2 == 3){
    matricula2 = prompt("digite sua matricula2:");
    agenda.splice(2,0, matricula2);
} else {
    alert("numero invalido.");
}
console.log(agenda);
break;
    }
}

adicionar1(1);
adicionar2(2);*/






//------------------------------------------------------------





/*class contaBancaria{


    constructor(saldoInicial) {
        this.saldo = saldoInicial || 0;
    }

    depositar(valor) {
        this.saldo += valor;
        console.log("deposito de R$" + valor + "realizado. Saldo atual = " + this.saldo);
    }

    sacar(valor) {
        if (valor > this.saldo) {
            console.log("saldo insuficiente.");
            return;
        }
        this.saldo -= valor;
        console.log("Saque de R$" + valor + " realizado. Saldo atual = " + this.saldo);

    }

    extrato() {
        console.log("Saldo atual: R$" + this.saldo);
    }
}


const minhaconta = new contaBancaria(1000);
minhaconta.depositar(500);
minhaconta.sacar(200);
minhaconta.extrato();*/


let matriz = [[1,2,3],
              [4,5,6],  
              [7,8,9]];

    let somad2 = 0;
    let somad = 0;
    let somal = [];
    let somac = [];        
    let retorno = 1;
    
    for (let i = 0; i < matriz.length; i++) {
        somad += matriz[i][i];
        somal[i] = 0;
        somac[i] = 0;
        for (let j = 0; j < matriz[i].length; j++) {
            somalinha += matriz[i][j];
            somacoluna += matriz[j][i];
            console.log(matriz[i][j]);
        }
    }

    if(somal[i] !== somac[i]){
        retorno = 0;
    }
    console.log("soma diagonal: " + somad);
    console.log("soma linha: " + somal);
    console.log("soma coluna: " + somac);
    console.log("retorno: " + retorno);

    for(let i = matriz.length -1, j = 0; i >= j; i--, j++){
        somad2 += matriz[i][j];
    }

    console.log("soma diagonal: " + somad);
    console.log("soma diagonal 2: " + somad2);
   

    if(somal[0] !== somad || somad !== somad2){
        retorno = 0;

    }

    if(retorno){
        console.log("é um quadrado magico");
        return true;
    } else {
        console.log("não é um quadrado magico");
        return false;
    }











    















