

//import java.sql.Date;
/**#CLASSE COLABORADOR#
 	DECLARA AS VARIAVEIS DE DADOS E SEUS METODOS DE GET E SET*/
public class Colaborador {

	String nome;
	String CodColaborador;
	String endereco;
	String telefone;
	String email;
	String cpf;
	String datanasc;
	String especialidade;
	
	/*public Colaborador(){
		this.nome=nome;
		this.CodColaborador=CodColaborador;
		this.endereco=endereco;
		this.telefone=telefone;
		this.email=email;
		this.cpf=cpf;
		this.datanasc=datanasc;
		this.especialidade=especialidade;
	A
	
}*/
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodColaborador() {
		return CodColaborador;
	}
	public void setCodColaborador(String CodColaborador) {
		this.CodColaborador = CodColaborador;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDatanasc() {
		return datanasc;
	}
	public void setDatanasc(String datanasc) {
		this.datanasc = datanasc;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
}