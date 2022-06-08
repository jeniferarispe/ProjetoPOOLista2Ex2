package classeExecutavel;

import model.Funcionario;

public class classeExecutavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setNome("Jenifer");
		funcionario1.setSobrenome("Arispe");
		funcionario1.setHorasTrabalhadas(20);
		funcionario1.setValorHora(20);
		funcionario1.nomeCompleto();
		System.out.println("Salario: " + funcionario1.calcularSalario());
		System.out.println("Incremento de Horas: " + funcionario1.incrementarHoras(12));
	
		
		
	
	}

}
