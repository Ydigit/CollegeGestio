package projecto;

import java.util.ArrayList;

public class Departamento {
    private String NomeDep;
    private int NumDep;
    private String LocDep;
    private ArrayList<Curso> cursos;
    private ArrayList<Professor> professores;
    private Professor responsavel;
    

    public Departamento(String NomeDep, int NumDep, String LocDep,Professor responsavel,ArrayList<Curso> cursos,ArrayList<Professor> professores) {
        this.NomeDep = NomeDep;
        this.NumDep = NumDep;
        this.LocDep = LocDep;
        this.responsavel=responsavel;
        this.professores=professores;
        this.cursos=cursos;
    }
    public Departamento() {
    	NomeDep="";
    	NumDep=0;
    	LocDep="";
    	cursos= new ArrayList<>();
    	professores= new ArrayList<>();
    	responsavel=null;
    }

    public String getNomeDep() {
        return NomeDep;
    }

    public void setNomeDep(String NomeDep) {
        this.NomeDep = NomeDep;
    }

    public int getNumDep() {
        return NumDep;
    }

    public void setNumDep(int NumDep) {
        this.NumDep = NumDep;
    }

    public String getLocDep() {
        return LocDep;
    }

    public void setLocDep(String LocDep) {
        this.LocDep = LocDep;
    }

    public String toString() {
        return " Departamento: " + NomeDep + " Numero do Departamento: " + NumDep + " Localizacao: " + LocDep + " Responsavel " + responsavel + " Professores " + professores.toString() + " Cursos " + cursos.toString();

    }

    public boolean equals(Object obj) {
        boolean iguais = false;

        if (obj != null && this.getClass() == obj.getClass()) {
            Departamento D = (Departamento) obj;

            iguais = this.NomeDep.equals(D.NomeDep) && this.NumDep == D.NumDep && this.LocDep.equals(D.LocDep) && this.responsavel.equals(D.responsavel) && this.cursos.equals(D.cursos) && this.professores.equals(D.professores);
        }

        return iguais;
    }

    public Object Clone() {
        Departamento copia = new Departamento(this.NomeDep, this.NumDep, this.LocDep,this.responsavel,this.cursos,this.professores);
        return copia;
    }
    public void addCurso(Curso a) {
    	cursos.add(a);
    }
    public void addProfessor(Professor a) {
    	professores.add(a);
    }

	public ArrayList<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(ArrayList<Curso> cursos) {
		this.cursos = cursos;
	}

	public ArrayList<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(ArrayList<Professor> professores) {
		this.professores = professores;
	}

	public Professor getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Professor responsavel) {
		this.responsavel = responsavel;
	}
    

}
