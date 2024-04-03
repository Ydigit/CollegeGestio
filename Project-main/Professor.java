package projecto;

import java.time.LocalDate;
import java.util.ArrayList;

public class Professor extends Pessoa
{
	private static int numdoc=0;
    private int numdocente;
    private double salario;
	private String Email;
    private ArrayList <Disciplina> Disc;
    
    public Professor()
    {
    	super();
    	
    	numdoc++;
        numdocente = numdoc;
        salario=0;
        Email="";
        Disc = new ArrayList<Disciplina>();
        
    }
    
    public Professor(Pessoa p,double salario, String Email, ArrayList<Disciplina> Disc)
    {
    	super(p.getNome(),p.getMorada(),p.getCC(),p.getData_n());
    	numdoc++;
        this.numdocente = numdoc;
        this.salario = salario;
        this.Email = Email;
        Disc = new ArrayList<Disciplina>();
    }
    
    public int getnumdocente()
    {
        return numdocente;
    }

    public void setnumdocente(int numdocente)
    {
        this.numdocente = numdocente;
    }

    public Double getsalario()
    {
        return salario;
    }

    public void setnums(Double salario)
    {
        this.salario = salario;
    }

	public String getEmail()
    {
        return Email;
    }

    public void setEmail(String Email)
    {
        this.Email = Email;
    }

	public ArrayList<Disciplina> getDisc()
    {
        return Disc;
    }

    public void setDisc(ArrayList<Disciplina> Disc)
    {
        this.Disc = Disc;
    }

    public String toString()
    {
        String s = "Número de Docente: " +numdocente;
	 	s +="\nEmail :" +Email+  " Salário : " +salario;
		s += Disc.toString();

        return s;
    }

    public boolean equals(Object obj)
    {
        boolean iguais = false;
        if(obj != null && this.getClass() == obj.getClass())
        {
            Professor P1 = (Professor) obj;
            iguais = this.numdocente == P1.numdocente && this.Email.equals(P1.Email) && this.salario == P1.salario && this.Disc.equals(P1.Disc);
        }
        return iguais;
    }

    public Object clone()
    {
        Professor copia = null;
		copia = new Professor((Pessoa) super.clone(),this.salario, this.Email, this.Disc);
        copia.numdocente=this.numdocente;
        return copia;
    }
    public double addsalario(double percent)
    {
        this.salario = salario + salario*(percent/100);
        return salario;
    }
    public void addDisc(Disciplina a) {
    	Disc.add(a);
    }

}
