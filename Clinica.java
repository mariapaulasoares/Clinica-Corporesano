


import java.util.Scanner;

public class Clinica {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Colaborador colab = new Colaborador();
		VerificadorCasos verif = new VerificadorCasos();
		Follow_Cadastro follow = new Follow_Cadastro();
		
			
		System.out.println("Codigo do Colaborador: ");
		colab.CodColaborador = scanner.nextLine();
		
		do{
			System.out.println("NOME: ");
			colab.nome = scanner.nextLine();
			//System.out.println(colab.nome.length());
		}while(verif.VerificaNome(colab.nome) == false);

		do{
			System.out.println("CPF: ");
			colab.cpf = scanner.nextLine();
		}while(verif.VerificaCpf(colab.cpf) == false);
						
		System.out.println("ENDERECO: ");
		colab.endereco = scanner.nextLine();
		
		do{
			System.out.println("TELEFONE: ");
			colab.telefone = scanner.nextLine();
		}while(verif.VerificaTel(colab.telefone) == false);
		
		do{
			System.out.println("E-MAIL: ");
			colab.email = scanner.nextLine();
		}while(verif.VerificaEmail(colab.email) == false);
		
		//System.out.println(scanner.hasNext());
		
		do{
			System.out.println("DATA NASCIMENTO: ");
			colab.datanasc = scanner.nextLine();
		}while(verif.VerificaData(colab.datanasc) == false);
		
		do{
			System.out.println("ESPECIALIDADE: ");
			colab.especialidade = scanner.nextLine();
		}while(verif.VerificaEspec(colab.especialidade) == false);
		
		follow.FollowCadastra();
		
		//System.out.println(colab.CodColaborador+" "+colab.nome+" "+colab.cpf+" "+colab.endereco+" "+colab.telefone+" "+colab.telefone+" "+colab.email+" "+colab.datanasc+" "+colab.especialidade);
		

	}

}
