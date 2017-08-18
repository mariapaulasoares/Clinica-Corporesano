
/**ESTA CLASSE VERIFICA TODAS AS ENTRADAS DE DADOS DO COLABORADOR, CASO ELAS NAO SEJAM VALIDAS, ELA RETORNA FALSE, FAZENDO COM QUE UM LOOP DO WHILE FACA COM QUE O USUARIO DIGITE DADOS VALIDOS*/
public class VerificadorCasos {
	

	public boolean ChaveVerificadora = true;
	Colaborador colab = new Colaborador();
	
	/*public VerificadorCasos(){
		this.ChaveVerificadora;
	}*/
	
	
	
	public boolean VerificaNome(String nome){//RETORNA FALSO CASO O TAMANHO DA STRING SEJA MAIOR QUE 50
		
		if(nome.length() > 50){
			
			ChaveVerificadora = false;
		}
		
		return ChaveVerificadora;
	}
	
	public boolean VerificaCpf(String cpf){//RETORNA FALSO CASO O TAMANHO DO CPF SEJA MAIOR QUE 11
		
		if(cpf.length() > 11){	
			
			ChaveVerificadora = false;
			
		}
		
		return ChaveVerificadora;
	}
	
	public boolean VerificaTel(String telefone){//RETORNA FALSO CASO O TAMANHO DO TELEFONE SEJA MAIOR QUE 11
		
		if(telefone.length() > 11){
			
			ChaveVerificadora = false;
			
		}
		
		return ChaveVerificadora;
	}
	
	public boolean VerificaEmail(String email){//RETORNA FALSO CASO O E MAIL NAO POSSUA '@'
		
		int tam = email.length();
		
		ChaveVerificadora = false;
		
		for(int i=0; i<tam; i++){
			if(email.charAt(i) == '@'){
				ChaveVerificadora = true;
				break;
			}
		}
		
		return ChaveVerificadora;
	}
	
	public boolean VerificaData(String data){ //RETORNA FALSO CASO A DATA SEJA MAIOR QUE 8 DIGITOS
		
		if(data.length() > 8){
			
			ChaveVerificadora = false;
		}
		
		return ChaveVerificadora;
	}
	
	public boolean VerificaEspec(String especialidade){//RETORNA FALSO CASO O TAMANHO STRING DA ESPECIALIDADE SEJA MAIOR QUE 50
		
		if(especialidade.length() > 50){
			
			ChaveVerificadora = false;
			
		}
		
		return ChaveVerificadora;
	}
}
