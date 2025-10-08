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

 
  
function atualizarDados() {
  const inputElement = document.getElementById('valores-grafico');
  const stringDeValores = inputElement.value;
  const novosDados = stringDeValores.split(',').map(Number);
  chart.data.datasets[0].data = novosDados;
  chart.update();
}