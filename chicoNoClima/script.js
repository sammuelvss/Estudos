


/*function  criarBotao(params) {
    var btn = document.createElement('BUTTON');
    var lbl = document.createTextNode('Clica aqui!');
    btn.appendChild(lbl);

    btn.onclick = function () {
        console.log('esse botão foi criado com java script.');
    }

    //document.body.appendChild(btn);

}

criarBotao();*/


document.getElementById("meuBotao").addEventListener("click", () => {
    window.print();
    }
)
