




let carro = {

marca: "Jeep",
modelo: "Renegade",
ano: 2016
};
carro.cor="vermelho";
carro.ano= 2025;
delete carro.cor;

  carro.ligar = function() {
  console.log('o carro está ligado!');
};
carro.ligar();

console.log(carro);

for (let propiedades in carro) {
  console.log(propiedades + ": " + carro[propiedades]);
}

let pessoa = {
  nome: "sammuel",
  endereco: {
  rua: "rua popular",
  cidade: "Recife"
  }
};
console.log(pessoa);

console.log(Object.keys(carro));
console.log(Object.values(carro));

function Animal(nome, tipo) {
  this.nome = nome;
  this.tipo = tipo;
}
let Galo = new Animal("Garnize", "Galo");

let vaca = new Animal("Mimosa", "Vaca");

console.log(Galo);
console.log(vaca);