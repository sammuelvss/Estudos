



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

function adicionar(pessoa){
switch (pessoa){
case 1:
const agenda  = [];

let nome = prompt("digite o nome:");
let telefone = prompt("digite o telefone:");
let matricula = prompt("digite sua matricula");

agenda.push(nome);
agenda.push(telefone);
agenda.push(matricula);


let remover = prompt("você deseja remover? digite 1 para nome, 2 para telefone, 3 para matricula. 0 para parar");
if (remover == 1){
    agenda.splice(0,1);
    console.log(agenda);
} else if (remover == 2){
    agenda.splice(1,1);
    console.log(agenda);
} else if (remover == 3){
    agenda.splice(2,1);
    console.log(agenda);
} else {
    alert("numero invalido");
}

let adicionar = prompt("você deseja adicionar um dado? digite 1 para nome, 2 para telefone, 3 para matricula.");
if (adicionar == 1){
     nome = prompt("digite o nome:")
    agenda.splice(0,0, nome);
} else if (adicionar == 2){
    telefone = prompt("digite seu telefone:");
    agenda.splice(1,0, telefone);
} else if (adicionar == 3){
    matricula = prompt("digite sua matricula:");
    agenda.splice(2,0, matricula);
} else {
    alert("numero invalido.");
}
console.log(agenda);

    }
}

adicionar(1);






    
















