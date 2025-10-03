const ctx = document.getElementById('myChart').getContext('2d'); 

 

let vendas = [12, 19, 3, 5, 2, 3, 9]; 

let dias = ['Seg', 'Ter', 'Qua', 'Qui', 'Sex', 'Sáb', 'Dom']; 

 

let chart = new Chart(ctx, { 

  type: 'doughnut', // tipos possíveis: 'line', 'bar', 'pie', 'doughnut' 

  data: { 

    labels: dias, 

    datasets: [{ 

      label: 'Vendas', 

      data: vendas, 

      backgroundColor: 'rgba(54, 162, 235, 0.6)', 

      borderColor: 'rgba(54, 162, 235, 1)', 

      borderWidth: 1 

    }] 

  }, 

  options: { 

    responsive: true, 

    scales: { 

      y: { 

        beginAtZero: true 

      } 

    } 

  } 

}); 

 

// Função para atualizar os dados aleatoriamente 

/* function atualizarDados() { 

  chart.data.datasets[0].data = vendas.map(() => Math.floor(Math.random() * 20) + 1); 

  chart.update(); 

} */


  
function atualizarDados() {

  const inputs = document.querySelectorAll('.valor-venda');
  const novosDados = [];

  for (let i = 0; i < inputs.length; i++) {
    const inputAtual = inputs[i];
    const valor = parseInt(inputAtual.value) || 0;
    novosDados.push(valor);
  }
  chart.data.datasets[0].data = novosDados;

  chart.update();
}