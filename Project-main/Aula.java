
import java.time.*;
import java.util.ArrayList;

public class Aula {
	private int sala;
	private LocalDateTime inicio;
	private Disciplina disc;
	private Professor prof;
	private int durHora;
	private int numAula;
	private ArrayList<Aluno> alunos=new ArrayList<>();
	
	public Aula() {
		sala=0;inicio = null;disc=null;prof=null;durHora=0;;
	}
	public Aula(int sala, LocalDateTime inicio,Disciplina disc,Professor prof,int numAula) {
		this.sala=sala;
		this.inicio=inicio;
		this.disc=disc;
		this.prof=prof;
		this.numAula=numAula;
		durHora=0;
	}
	public int getSala() {
		return sala;
	}
	public void setSala(int sala) {
		this.sala = sala;
	}
	public LocalDateTime getInicio() {
		return inicio;
	}
	public void setInicio(LocalDateTime inicio) {
		this.inicio = inicio;
	}
	
	public Disciplina getDisc() {
		return disc;
	}
	public void setDisc(Disciplina disc) {
		this.disc = disc;
	}
	public Professor getProf() {
		return prof;
	}
	public void setProf(Professor prof) {
		this.prof = prof;
	}
	public String toString() {
		return "Sala: "+sala+" Professor: "+prof+ " Disciplina: "+disc+" Inicio: "+inicio+ " Duracao " + durHora +" Numero da Aula "+numAula;		 	
	}
	public Object clone() {
		Aula copia = new Aula(this.sala,this.inicio,this.disc,this.prof,this.numAula);
		copia.durHora=this.durHora;
		return copia;		
	}
	public boolean equals(Object obj) {
		if(obj!=null && obj.getClass()==this.getClass()) {
			Aula x = new Aula();
			return this.disc.equals(x.disc) && this.durHora==x.durHora && this.inicio.equals(x.inicio) && this.prof.equals(x.prof) && this.sala==x.sala && this.numAula==x.numAula;
		}return false;
	}
	public LocalDateTime DefFim() {
		return inicio.plusHours(durHora);
	}
	public void setDurHora(int a) {
		durHora=a;
	}
	public int getDurHora() {
		return durHora;
	}	
	public void setNumAula(int a) {
		numAula=a;
	}
	public int getNumAula() {
		return numAula;
	}
	public ArrayList<Aluno> getAlunos(){
		return alunos;
	}
	public void setNumAula(ArrayList<Aluno> a) {
		alunos=a;
	}
	public void addAluno(Aluno a) {
		alunos.add(a);
	}
}
