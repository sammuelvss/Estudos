




let carro = {

marca: "Jeep",
modelo: "Renegade",
ano: 2016
};
carro.cor="vermelho";
carro.ano= 2025;
delete carro.cor;

  function ligar()  {

  console.log('o carro está ligado!');
  
}

carro.ligar = ligar();


console.log(carro);








