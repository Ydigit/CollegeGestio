

import java.io.Serializable;
import java.util.*;

public class Aluno extends Pessoa implements Serializable {
	private static int num_aluno_init=0;
    private int num_aluno;
    private int ano;
    private Curso curso;
    private double media;
	private ArrayList<Double> notas;
    
    public Aluno() {
    	super();
    	notas = new ArrayList<>();
    	num_aluno_init++;
    	num_aluno=num_aluno_init;
    	ano=0;
    	num_aluno=0;
    	curso=new Curso();
    	media=0;	
    }
    
    public Aluno(Pessoa p,int ano, ArrayList<Double> nt) {
    	super(p.getNome(),p.getMorada(),p.getCC(),p.getData_n());
    	notas = new ArrayList<>();
    	notas=nt;
        this.num_aluno = num_aluno_init;
        this.ano = ano;
    	curso=new Curso();
        double sum = 0;
        for(int i =0;i<nt.size();i++) {
        	sum += nt.get(i);
        }
        media = sum / nt.size();
    }
    // getter apenas subclasse

    public int getNum_Aluno() {
        return num_aluno;
    }

    public int getAnoAluno() {
        return ano;
    }

    public Curso getCursoAluno() {
        return curso;
    }

    public double getMediaAluno() {
        return media;
    }
    public ArrayList<Double> getNotas(){
    	return notas;
    }
    
    public void setAno(int ano) {
		this.ano = ano;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public void setMedia(double media) {
		this.media = media;
	}
    public void setNotas(ArrayList<Double> a) {
    	notas= a;
    }
    // public String gethorario() {return num_aluno;}

    // equals
    public boolean equals(Object obj) {
        boolean iguais = false;
        if (obj != null && this.getClass() == obj.getClass())
        {
            Aluno a1 = (Aluno) obj; // cast
            iguais = this.num_aluno == a1.num_aluno && this.ano == a1.ano && this.curso.equals(a1.curso) && this.media == a1.media && this.notas.equals(a1.notas);
        }
        return iguais;
    }

    public Aluno clone() {
	Aluno copia = new Aluno((Aluno)super.clone(),this.ano,this.notas);
	copia.num_aluno=this.num_aluno;
	copia.curso=this.curso;
	return copia;
    }
    public String toString() {
		return super.toString() + " Ano: " +ano +" Numero de Aluno "+num_aluno+ " Curso: " +curso+ " Media: "+ media + " Notas: " +notas.toString();
	}
    public void addNotas(Double a){
    	notas.add(a); 	
    }
}
