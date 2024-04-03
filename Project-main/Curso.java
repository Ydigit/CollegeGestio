import java.util.ArrayList;

public class Curso {

    private String NomeCurso;
    private int NumCurso;
    private ArrayList<Disciplina> Disc;

    public Curso() {
    	NomeCurso = "";
        NumCurso = 0;
    	Disc = new ArrayList<Disciplina>();
    }

    public Curso(String NomeCurso, int NumCurso) {
        this.NomeCurso = NomeCurso;
        this.NumCurso = NumCurso;
        Disc = new ArrayList<Disciplina>();
    }

    public String getNomeCurso() {
        return NomeCurso;
    }

    public void setNomeCurso(String NomeCurso) {
        this.NomeCurso = NomeCurso;
    }

    public int getNumCurso() {
        return NumCurso;
    }

    public void setNumCurso(int NumCurso) {
        this.NumCurso = NumCurso;
    }

    public ArrayList<Disciplina> getDisc() {
        return Disc;
    }

    public void setDisc(ArrayList<Disciplina> Disc) {
        this.Disc = Disc;
    }

    public String toString() {
        String s = "Nome do Curso: " + NomeCurso;
        s += "\nNúmero do Curso: " + NumCurso;
        s += Disc.toString();

        return s;
    }

    public boolean equals(Object obj) {
        boolean iguais = false;

        if (obj != null && this.getClass() == obj.getClass()) {
            Curso C = (Curso) obj;

            iguais = this.NomeCurso.equals(C.NomeCurso) && this.NumCurso == C.NumCurso && this.Disc.equals(C.Disc);
        }
        return iguais;
    }

    public Object Clone() {
        Curso copia = new Curso(this.NomeCurso, this.NumCurso);
        copia.Disc = this.Disc;

        return copia;
    }
    public void addDisc(Disciplina a) {
    	Disc.add(a);
    }   
}
