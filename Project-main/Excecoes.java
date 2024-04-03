import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Excecoes {
	public static void notInPessoas(ArrayList<Pessoa> lista,int num) throws ValorErrado{
		boolean flag = true;
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).getCC()==num) {flag=false;}
		}
		if(flag==true) {
			throw new ValorErrado("Não Existe esse id");
		}
	}
	public static void notInAlunos(ArrayList<Aluno> lista,int num) throws ValorErrado{
		boolean flag = true;
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).getNum_Aluno()==num) {flag=false;}
		}
		if(flag==true) {
			throw new ValorErrado("Não Existe esse id");
		}
	}
	public static void notInCursos(ArrayList<Curso> lista,int num) throws ValorErrado{
		boolean flag = true;
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).getNumCurso()==num) {flag=false;}
		}
		if(flag==true) {
			throw new ValorErrado("Não Existe esse id");
		}
	}
	public static void notInDepartamentos(ArrayList<Departamento> lista,int num) throws ValorErrado{
		boolean flag = true;
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).getNumDep()==num) {flag=false;}
		}
		if(flag==true) {
			throw new ValorErrado("Não Existe esse id");
		}
	}
	public static void notInDisciplinas(ArrayList<Disciplina> lista,int num) throws ValorErrado{
		boolean flag = true;
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).getNumDis()==num) {flag=false;}
		}
		if(flag==true) {
			throw new ValorErrado("Não Existe esse id");
		}
	}
	public static void notInProfessor(ArrayList<Professor> lista,int num) throws ValorErrado{
		boolean flag = true;
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).getnumdocente()==num) {flag=false;}
		}
		if(flag==true) {
			throw new ValorErrado("Não Existe esse id");
		}
	}
	public static void diasInvalidos(LocalDateTime inicio) throws ValorErrado {
		DayOfWeek semana = inicio.getDayOfWeek();
        if (semana == DayOfWeek.SATURDAY || semana== DayOfWeek.SUNDAY) {
            throw new IllegalArgumentException("Não há Aulas no fim-de-semana.");
        }
    }
	public static void InicioFim(LocalDateTime inicio,LocalDateTime fim) throws ValorErrado{
		if(inicio.isAfter(fim)) {
			throw new ValorErrado("Fim tem de ser depois do inicio");
		}
	}
	public static void Contneg(int a) throws ValorErrado{
		if(a<0){
			throw new ValorErrado("Valor introduzido negativo");
		}
	}
}
	
	

