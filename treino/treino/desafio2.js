
let altura = 1.71;
let peso = 63;

function calcularimc (altura, peso) {
     let imc = peso / (altura * altura);
     console.log(`Seu IMC é ${imc.toFixed(2)}`);
}
calcularimc(altura, peso);