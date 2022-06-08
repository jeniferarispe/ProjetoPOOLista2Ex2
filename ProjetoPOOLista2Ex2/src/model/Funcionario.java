package model;

public class Funcionario {
private String nome;
private String sobrenome;
private int horasTrabalhadas;
private float valorHora;
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getSobrenome() {
	return sobrenome;
}
public void setSobrenome(String sobrenome) {
	this.sobrenome = sobrenome;
}
public int getHorasTrabalhadas() {
	return horasTrabalhadas;
}
public void setHorasTrabalhadas(int horasTrabalhadas) {
	this.horasTrabalhadas = horasTrabalhadas;
}
public float getValorHora() {
	return valorHora;
}
public void setValorHora(float valorHora) {
	this.valorHora = valorHora;
}
public void nomeCompleto() {
System.out.println("Nome Completo: " + nome+" " +sobrenome);

	
}
public float calcularSalario() {
	
return (float) horasTrabalhadas*valorHora;	
}

public String incrementarHoras(int horas) {
	horasTrabalhadas+=horas;
	return  Integer.toString(horasTrabalhadas);
			
	
}


}
