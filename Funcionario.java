package exercicio2;

public class Funcionario {

	
	//atributos
	String nome;
	double salarioBruto;
	double imposto;
	
	
	//m�todo que vai subtrair o salario bruto pelo imposto
	double salarioLiquido(){
		return this.salarioBruto-this.imposto;
		
	}
	
	//m�todo que vai aumentar o salario a partir de um valor dado no outro c�digo
	void aumentarSalario(double valor){
		salarioBruto=salarioBruto+valor;
	}

}
