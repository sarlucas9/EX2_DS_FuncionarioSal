package exercicio2;

import exercicio2.Funcionario;

public class salarioFuncionarios {

	public static void main(String[] args) {
		
		
		//crio o objeto chamado Pedro
		Funcionario Pedro=new Funcionario();
		
		
		//dou valor aos atributos de Pedro
		Pedro.nome="Pedro";
		Pedro.salarioBruto=2500;
		Pedro.imposto=15;
		
		//aqui eu aumento o sal�rio
		Pedro.aumentarSalario(300);
		
		
		//eu printo o salario com aumento e o sal�rio l�quido de pedro
		System.out.println("Sal�rio do Pedro com aumento: "+Pedro.salarioBruto);
		System.out.println("Sal�rio L�quido do Pedro: "+Pedro.salarioLiquido());
		
Funcionario Vagner=new Funcionario();
		
		Vagner.nome="Vagner";
		Vagner.salarioBruto=2500;
		Vagner.imposto=15;
		Vagner.aumentarSalario(300);
		
		System.out.println("Sal�rio do Vagner com aumento: "+Vagner.salarioBruto);
		System.out.println("Sal�rio L�quido do Vagner: "+Vagner.salarioLiquido());
		

	}

}
