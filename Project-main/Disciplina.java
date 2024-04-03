import java.io.Serializable;
import java.util.ArrayList;

public class Disciplina implements Serializable
{
    private String NomeDis;
    private int NumDis;
    private ArrayList <Professor> Prof;

    public Disciplina(String NomeDis, int NumDis, ArrayList<Professor> Prof)
    {
        this.NomeDis = NomeDis;
        this.NumDis = NumDis;
        Prof = new ArrayList<Professor>();
    }
    public Disciplina()
    {
        NomeDis ="";
        NumDis = 0;
        Prof = new ArrayList<Professor>();
    }

    public String getNomeDis()
    {
        return NomeDis;
    }

    public void setNomeDis(String NomeDis)
    {
        this.NomeDis = NomeDis;
    }
    
    public int getNumDis()
    {
        return NumDis;
    }

    public void setNumDis(int NumDis)
    {
        this.NumDis = NumDis;
    }

    public ArrayList<Professor> getProf()
    {
        return Prof;
    }

    public void setDisc(ArrayList<Professor> Prof)
    {
        this.Prof = Prof;
    }

    public String toString()
    {
        String s = "Nome da Disciplina : " +NomeDis+ "Número da Disciplina : " +NumDis;
        s += Prof.toString();
        return s;
    }

    public boolean equals(Object obj)
    {
        boolean iguais = false;
        if(obj != null && this.getClass() == obj.getClass())
        {
            Disciplina D1 = (Disciplina) obj;
            iguais = this.NumDis == D1.NumDis && this.NomeDis.equals(D1.NomeDis) && this.Prof.equals(D1.Prof);
        }
        return iguais;
    }

    public Object clone()
    {
        Disciplina copia = new Disciplina(this.NomeDis, this.NumDis, this.Prof);

        copia.NumDis = this.NumDis;
        copia.NomeDis = this.NomeDis;
        copia.Prof = this.Prof;
        return copia;
    }

}
