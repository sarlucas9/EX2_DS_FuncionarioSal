package exercicio2;

public class Funcionario {

	
	//atributos
	String nome;
	double salarioBruto;
	double imposto;
	
	
	//método que vai subtrair o salario bruto pelo imposto
	double salarioLiquido(){
		return this.salarioBruto-this.imposto;
		
	}
	
	//método que vai aumentar o salario a partir de um valor dado no outro código
	void aumentarSalario(double valor){
		salarioBruto=salarioBruto+valor;
	}

}
