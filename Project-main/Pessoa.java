import java.time.*;
public class Pessoa implements Serializable {
private String nome, morada;
private long CC;
private LocalDate data_n;
	public Pessoa(String a,String b,long c,LocalDate d) {
		nome=a;morada=b;CC=c;data_n=d;
	}
	public Pessoa() {
		nome="";CC=0;morada="";data_n=null;
	}
	public Pessoa(Pessoa p) {

	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMorada() {
		return morada;
	}
	public void setMorada(String morada) {
		this.morada = morada;
	}
	public long getCC() {
		return CC;
	}
	public void setCC(long cC) {
		CC = cC;
	}
	public LocalDate getData_n() {
		return data_n;
	}
	public void setData_n(LocalDate data_nascimento) {
		this.data_n = data_nascimento;
	}
	public int idade() {
		int idade=0;
		int ano = data_n.getYear();
		int dia = data_n.getDayOfMonth();
		int mes = data_n.getMonthValue();
		LocalDateTime datacomputador = LocalDateTime.now();
		int difAno = datacomputador.getYear()-ano;
		int difMes = datacomputador.getMonthValue()-mes;
		int difDia = datacomputador.getDayOfMonth()-dia;
		if (difMes < 0 || (difMes == 0 && difDia < 0)) {
	        idade = difAno - 1;
	    } else {
	        idade = difAno;
	    }
		return idade;	
	}
	public String toString() {
		return "Nome: "+nome+" Cartão Cidadão: " +CC+ " Morada: " + morada + " Data de Nascimento: "+data_n; 
	}
	public Object clone () {
		Pessoa copia = new Pessoa(this.nome,this.morada,this.CC,this.data_n);
		return copia;
	}
	public boolean equals(Object obj) {
		
		if(obj!=null && obj.getClass()==this.getClass()) {
			Pessoa x = (Pessoa) obj;
			return this.CC==x.CC && this.data_n==x.data_n && this.morada.equals(x.morada) && this.nome.equals(x.nome);
		}
		return false;
	}
}
