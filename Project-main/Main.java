import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import myinputs.Ler;


public class MainProj {
	private static ArrayList<Curso> cursos = new ArrayList<>();
	private static ArrayList<Professor> professores= new ArrayList<>();
	private static ArrayList<Aluno> alunos= new ArrayList<>();
	private static ArrayList<Pessoa> pessoas= new ArrayList<>();
	private static ArrayList<Disciplina> disciplinas= new ArrayList<>();
	private static ArrayList<Departamento> departamentos= new ArrayList<>();
	private static ArrayList<Aula> aulas= new ArrayList<>();
  	
	public static int MenuGeral(){
        System.out.println("Aluno");
        System.out.println("Professor");
        System.out.println("Curso");
        System.out.println("Departamento");
        System.out.println("Cadeiras");
        System.out.println("Aulas");
        System.out.println("Terminar");

    return (Ler.umInt());
    }
    public static int MenuAluno() {
        System.out.println("1-Introduzir Aluno");
        System.out.println("2-Remover Aluno");
        System.out.println("3-Modificar Aluno");
        System.out.println("4-Consultar horário");
        System.out.println("5-Adicionar notas de uma cadeira");
        System.out.println("6-Mostrar Aluno");
        System.out.println("7-Definir o curso");
        System.out.println("8-Retornar");
        System.out.println("9-Terminar");
        return (Ler.umInt());
    }
    public static int MenuProfessor() {
        System.out.println("1-Introduzir Professor");
        System.out.println("2-Remover Professor");
        System.out.println("3-Modificar Professor");
        System.out.println("4-Cadeiras que leciona");
        System.out.println("5-Mostrar Professor");
        System.out.println("6-Adicionar disciplinas que o professor leciona");
        System.out.println("7-Retornar");
        System.out.println("8-Terminar");
        return (Ler.umInt());
    }
        public static int MenuCurso() {
        System.out.println("1-Introduzir Curso");
        System.out.println("2-Remover Curso");
        System.out.println("3-Modificar Curso");
        System.out.println("4-Consultar Disciplinas do Curso)");
        System.out.println("5-Adicionar Disciplina em Curso"); 
        System.out.println("Retornar");
        System.out.println("Terminar");
        return (Ler.umInt());
    }
        public static int MenuDepartamento() {
        System.out.println("1-Introduzir Departamento");
        System.out.println("2-Remover Departamento");
        System.out.println("3-Modificar Departamento");
        System.out.println("4-Consultar Cursos do Departamento)");
        System.out.println("5-Adicionar Curso em Departamento"); 
        System.out.println("6-Consulta do Departamento com mais Cursos");
        System.out.println("7-Retornar");
        System.out.println("8-Terminar");
        return (Ler.umInt());
    }
        public static int MenuDisciplinas() {
            System.out.println("1-Introduzir Cadeira");
            System.out.println("2-Remover Cadeira");
            System.out.println("3-Modificar Cadeira");
            System.out.println("4-Consultar Cadeiras)");
            System.out.println("5-Professores que lecionam a cadeira"); 
            System.out.println("6-Curso da cadeira");
            System.out.println("7-Definir os professores que lecionam a disciplina");
            System.out.println("8-Retornar");
            System.out.println("9-Terminar");
            return (Ler.umInt());
        }
        public static int MenuAulas() {
            System.out.println("1-Introduzir Aula");
            System.out.println("2-Remover Aula");
            System.out.println("3-Modificar Aula");
            System.out.println("4-Consultar Aula");
            System.out.println("5-Professores que leciona a aula"); 
            System.out.println("6-Alunos da aula");
            System.out.println("7-Adicionar disciplina");
            System.out.println("8-Adicionar professor");
            System.out.println("9-Adicionar alunos");
            System.out.println("10-Inicio e fim da aula");
            System.out.println("11-Retornar");
            System.out.println("12-Terminar");
            return (Ler.umInt());
        } 


    public static void main(String[] args) {
    	 try {
    		 ObjectInputStream curso = new ObjectInputStream( new FileInputStream("‪C:\\Users\\gl449\\OneDrive\\Ambiente de Trabalho\\POO\\cursos.dat"));
    		 cursos = (ArrayList<Curso>) curso.readObject();
    		 ObjectInputStream prof = new ObjectInputStream( new FileInputStream("‪C:\\Users\\gl449\\OneDrive\\Ambiente de Trabalho\\POO\\professores.dat"));
    		 professores = (ArrayList<Professor>) prof.readObject();
    		 ObjectInputStream aluno = new ObjectInputStream( new FileInputStream("‪C:\\Users\\gl449\\OneDrive\\Ambiente de Trabalho\\POO\\alunos.dat"));
    		 alunos = (ArrayList<Aluno>) aluno.readObject();
    		 ObjectInputStream aula = new ObjectInputStream( new FileInputStream("‪C:\\Users\\gl449\\OneDrive\\Ambiente de Trabalho\\POO\\aulas.dat"));
    		 aulas = (ArrayList<Aula>) aula.readObject();
    		 ObjectInputStream pessoa = new ObjectInputStream( new FileInputStream("‪C:\\Users\\gl449\\OneDrive\\Ambiente de Trabalho\\POO\\pessoas.dat"));
    		 pessoas = (ArrayList<Pessoa>) pessoa.readObject();
    		 ObjectInputStream departamento = new ObjectInputStream( new FileInputStream("‪C:\\Users\\gl449\\OneDrive\\Ambiente de Trabalho\\POO\\departamentos.dat"));
    		 departamentos = (ArrayList<Departamento>) departamento.readObject();
    		 ObjectInputStream disciplina = new ObjectInputStream( new FileInputStream("‪C:\\Users\\gl449\\OneDrive\\Ambiente de Trabalho\\POO\\disciplinas.dat"));
    		 disciplinas = (ArrayList<Disciplina>) disciplina.readObject();
    		 }
    		 catch (IOException e){
    		 System.out.println(e.getMessage());
    		 }
    		 catch ( ClassNotFoundException e) {
    		 System.out.println(e.getMessage());
    		 }  	
    	
    	
    	
    	
    	
    	
    	while(true){
    	int val1= MenuGeral();
    	switch (val1) {
    	case 1 :
    		int val2=MenuAluno();
    		switch (val2) {
    		case 1:
    			ArrayList<Double> notas = new ArrayList<>();
    			System.out.println("Introduza o nome, morada, numero de carta de cidado e idade.");
    			String nome=Ler.umaString();
    			String morada = Ler.umaString();
    			long cc= Ler.umLong();
    			System.out.print("Dia/Mes/Ano: ");
    			int dia = Ler.umInt();
    			int mes=Ler.umInt();
    			int ano = Ler.umInt();
    			LocalDate data_n=LocalDate.of(ano, mes, dia);
    			Pessoa pess = new Pessoa(nome,morada,cc,data_n);
    			pessoas.add(pess);
    			FuncPessoa.Update(pessoas);
    			System.out.println("Introduza o ano e as notas do aluno.");
    			int anocurs= Ler.umInt();
    			System.out.println("Quantas notas pretende adicionar?");
    			int num_notas= Ler.umInt();
    			for(int j =0;j<num_notas;j++) {
    				notas.add(Ler.umDouble());
    			}
    			Aluno aluno = new Aluno(pess, anocurs,notas);
    			alunos.add(aluno);
    			FuncAlunos.Update(alunos);    			
    		break;
    		case 2:
    			System.out.println("Introduza o cc do aluno que deseja remover.");
    			int n_aluno=Ler.umInt();
    			for(int i=0;i<alunos.size();i++) {
    				if(alunos.get(i).getCC()==n_aluno) {
    					alunos.remove(i);    				}
    			}
    			FuncAlunos.Update(alunos);
    		break;
    		case 3:
    			ArrayList<Double> notas2 = new ArrayList<>();
    			System.out.println("Qual o numero do aluno que deseja modificar?");
    			int num_alu = Ler.umInt();
    			System.out.println("Introduza os novos dados");
    			System.out.println("Ano");
    			int ano_esc = Ler.umInt();
    			System.out.println("Quantas notas pretende adicionar?");
    			int n =Ler.umInt();
    			System.out.println("Insira as notas:");
    			for(int i=0;i<n;i++) {
    				notas2.add(Ler.umDouble());
    			}
    			System.out.println("Introduza o numero do novo curso:");
    			Curso curso2=new Curso();
    			int n_curso2=Ler.umInt();
    			for (int k=0;k<cursos.size();k++) {
    				if(cursos.get(k).getNumCurso()==n_curso2) {
    					curso2=cursos.get(k);
    					break;
    				}
    			}			
    			for (int j=0;j<alunos.size();j++) {
    				if(alunos.get(j).getNum_Aluno()==num_alu) {
    					alunos.get(j).setAno(ano_esc);
    					alunos.get(j).setCurso(curso2);
    					alunos.get(j).setNotas(notas2);
    				break;	
    				}
    			}
    			FuncAlunos.Update(alunos);	
    		break;
    		case 4:
    			ArrayList<Aula> horario= new ArrayList<Aula>();
    			Aluno al=new  Aluno();
    			System.out.println("Introduza o numero do aluno que deseja consultar o horário");
    			int consul_hor= Ler.umInt();
    			for(int i =0;i<alunos.size();i++) {
    				if(alunos.get(i).getNum_Aluno()==consul_hor) {
    					al=alunos.get(i);
    					break;
    				}
    			}
    			
    			for(int j=0;j<aulas.size();j++) {
    				for(int k=0;k<aulas.get(j).getAlunos().size();k++)
    					if(aulas.get(j).getAlunos().get(k).getNum_Aluno()==al.getNum_Aluno()) { 
    						horario.add(aulas.get(j));
    				}
    			}
    			System.out.println(horario.toString());
    			break;
    		case 5:
    			System.out.println("Introduza o numero do aluno a que deseja adicionar as notas");
    			int num_aluno= Ler.umInt();
    			System.out.println("Introduza o numero de notas que deseja adicionar");
    			int n_notas = Ler.umInt();
    			for(int j=0;j<alunos.size();j++) {
    				if(alunos.get(j).getNum_Aluno()==num_aluno) {
    					for(int i =0;i<n_notas;i++) {
    					alunos.get(i).addNotas(Ler.umDouble());
    					}
    					break;
    			}
    			}
    			FuncAlunos.Update(alunos);
    		break;
    		case 6:
    			System.out.println("Introduza o numero do aluno a que deseja consultar");
    			int num_aluno6= Ler.umInt();
    			for(int i =0;i<alunos.size();i++) {
    				if(alunos.get(i).getNum_Aluno()==num_aluno6) {
    				System.out.println(alunos.get(i).toString());
    				break;
    				}
    			}
    		break;
    		case 7:
    			Curso cur= new Curso();
    			Aluno alu=new Aluno();
    			System.out.println("Introduza o numero do aluno");
    			int nu_aluno=Ler.umInt();
    			for(int j =0;j<alunos.size();j++) {
    				if(alunos.get(j).getNum_Aluno()==nu_aluno) {
    					alu=alunos.get(j);
    					break;
    				}		
    			}
    			System.out.println("Introduza o numero do curso do aluno");
    			int nu_curso=Ler.umInt();
    			for(int i =0;i<cursos.size();i++) {
    				if(cursos.get(i).getNumCurso()==nu_curso) {
    					cur=cursos.get(i);
    					break;
    				}
    			}
    			alu.setCurso(cur);
    			FuncAlunos.Update(alunos);
    			break;
    		case 8:	//fazer retornar
    		continue;
    		case 9: //fazer terminar
    		break;
    		}
    		break;
    		//Termina menu aluno
    	case 2:
    		int val3=MenuProfessor();
    		switch (val3) {
    		case 1:
    			System.out.println("Introduza o nome, morada, numero de carta de cidado e idade.");
    			String nome=Ler.umaString();
    			String morada = Ler.umaString();
    			long cc= Ler.umLong();
    			System.out.print("Dia/Mes/Ano: ");
    			int dia = Ler.umInt();
    			int mes=Ler.umInt();
    			int ano = Ler.umInt();
    			LocalDate data_n=LocalDate.of(ano, mes, dia);
    			Pessoa pess = new Pessoa(nome,morada,cc,data_n);
    			pessoas.add(pess);
    			FuncPessoa.Update(pessoas);
    			System.out.println("Introduza o salario e email.");	
    			double salario= Ler.umDouble();
    			String email= Ler.umaString();
    			
    			Professor prof = new Professor(pess,salario,email);
    			professores.add(prof);
    			FuncProf.Update(professores);
    			break;
    		case 2:	
    			System.out.println("Introduza o numero de cartao de cidadao do professor que deseja remover.");
    			int n_prof=Ler.umInt();
    			for(int i=0;i<pessoas.size();i++) {
    				if(pessoas.get(i).getCC()==n_prof) {
    					pessoas.remove(i);    	
    					break;
    					}
    			}
    			FuncPessoa.Update(pessoas);
    			FuncProf.Update(professores); 
    			break;
    		case 3:	
    			ArrayList<Disciplina> new_disc = new ArrayList<>();
    			System.out.println("Introduza o numero do professor que deseja alterar.");
    			int num_alt = Ler.umInt();
    			System.out.println("Salario:");
    			double new_sal=Ler.umDouble();
    			System.out.println("Email:");
    			String new_email=Ler.umaString();
    			System.out.println("Introduza o numero de disciplinas:");
    			int n = Ler.umInt();
    			System.out.println("Introduza o numero das disciplinas:");
    			for(int i=0;i<n;i++) {
    				for(int j=0;j<disciplinas.size();j++) {
    					if(disciplinas.get(j).getNumDis()==n) {
    						new_disc.add(disciplinas.get(j));
    						break;
    					}
    				}
    			}
    			for (int k=0;k<professores.size();k++) {
    				if(professores.get(k).getnumdocente()==num_alt) {
    					professores.get(k).setDisc(new_disc);
    					professores.get(k).setEmail(new_email);
    					professores.get(k).setnums(new_sal);
    				break;	
    				}
    			}
    			FuncProf.Update(professores);
    			break;
    		case 4:
    			System.out.println("Introduza o numero do professor que deseja consultar.");
    			int n_cad=Ler.umInt();
    			for(int i =0;i<professores.size();i++) {
    				if(professores.get(i).getnumdocente()==n_cad) {
    				System.out.println(professores.get(i).getDisc().toString());
    				break;
    				}
    			}
    			break;
    		case 5:
    			System.out.println("Introduza o numero do professor que deseja consultar.");
    			int nprof=Ler.umInt();
    			for(int i =0;i<professores.size();i++) {
    				if(professores.get(i).getnumdocente()==nprof) {
    				System.out.println(professores.get(i).toString());
    				break;
    				}
    			}
    			break;
    		case 6:
    			Professor prof_consul = new Professor();
    			System.out.println("Introduza o numero do professor");
    			int n_profconsul= Ler.umInt();
    			for(int i =0;i<professores.size();i++) {
    				if(professores.get(i).getnumdocente()==n_profconsul) {
    				prof_consul=professores.get(i);
    				break;
    			}
    			}    			
    			System.out.println("Introduza o numero de Disciplinas que o professor leciona");
    			int n_disc=Ler.umInt();
    			System.out.println("Introduza o numero das disciplinas:");
    			for(int i=0;i<n_disc;i++) {
    				int num_discler=Ler.umInt();
    				for(int j=0;j<disciplinas.size();j++) {
    					if(disciplinas.get(j).getNumDis()==num_discler) {
    						prof_consul.addDisc(disciplinas.get(j));
    						break;
    					}
    				}
    			}
    			FuncProf.Update(professores);
    			break;
    		case 7://fazer retornar
    			continue;
    		case 8://fazer terminar
    			break;
    		}
    		//termina prof
    		break;
    	case 3:	
    		int val4=MenuCurso();
    		switch(val4) {
    		case 1:
    			System.out.println("Introduza os atributos do curso");
    			System.out.println("Numero:");
    			int numcur=Ler.umInt();
    			System.out.println("Nome:");
    			String nomecur=Ler.umaString();
    			Curso curso = new Curso(nomecur, numcur);
    			cursos.add(curso);
    			FuncCurso.Update(cursos);
    			break;
    		case 2:
    			System.out.println("Introduza o numero do curso que deseja remover.");
    			int num_rem = Ler.umInt();
    			for(int i =0;i<cursos.size();i++) {
    				if(cursos.get(i).getNumCurso()==num_rem) {
    					cursos.remove(i);
    					break;
    				}
    			}
    			FuncCurso.Update(cursos);
    			
    			break;
    		case 3:
    			ArrayList<Disciplina> new_disc_curs = new ArrayList<>();
    			System.out.println("Introduza o numero do curso que deseja modificar.");
    			int num_alt = Ler.umInt();
    			System.out.println("Introduza o novo nome:");
    			String new_nome=Ler.umaString();
    			System.out.println("Introduza o numero de disciplinas que deseja:");
    			int tot_disc = Ler.umInt();
    			System.out.println("Introduza o numero das disciplinas que deseja:");
    			for(int i=0;i<tot_disc;i++) {
    				int num_ddisc=Ler.umInt();
    				for(int j=0;j<disciplinas.size();j++) {
    					if(disciplinas.get(j).getNumDis()==num_ddisc) {
    					new_disc_curs.add(disciplinas.get(j));
    					break;
    					}
    				}
    			}
    			for(int k=0;k<cursos.size();k++) {
    				if(cursos.get(k).getNumCurso()==num_alt) {
    					cursos.get(k).setDisc(new_disc_curs);
    					cursos.get(k).setNomeCurso(new_nome);
    				}
    			}
    			FuncCurso.Update(cursos);
    			break;
    		case 4:
    			System.out.println("Introduza o numero do curso que deseja consultar as disciplinas.");
    			int num_consul = Ler.umInt();
    			for(int i=0;i<cursos.size();i++) {
    				if(cursos.get(i).getNumCurso()==num_consul) {
    					System.out.println(cursos.get(i).getDisc().toString());
    					break;
    				}
    			}
    			break;
    		case 5:
    			Curso curso_list=new Curso();
    			System.out.println("Introduza o numero do curso que deseja adicionar disciplinas.");
    			int num_addisc = Ler.umInt();
    			for(int k=0;k<cursos.size();k++) {
    				if(cursos.get(k).getNumCurso()==num_addisc) {
    					curso_list=cursos.get(k);
    					break;
    				}
    			}
    			System.out.println("Quantas disciplinas deseja adicionar");
    			int tot_addisc=Ler.umInt();    			
    			System.out.print("Introduza o numero da disciplina que deseja adicionar");    	
    			for(int j=0;j<tot_addisc;j++) {
    				int new_disc=Ler.umInt();
    			for(int i =0;i<disciplinas.size();i++) {
    				if(disciplinas.get(i).getNumDis()==new_disc){
    					curso_list.addDisc(disciplinas.get(i));
    					break;
    				}
    			}
    			}
    			FuncCurso.Update(cursos);    			
    			break;
    		case 6://retornar
    			continue;
    		case 7://terminar
    			break;
    			
    		}
    		break;
                case 4:
                int val5=MenuDepartamento();
                switch(val5) {
    		        case 1:
                        ArrayList<Curso> Curset = new ArrayList<>();
                        Professor resp= new Professor();
                        ArrayList<Professor> Prof = new ArrayList<>();
                        System.out.println("Introduza os atributos do Departamento :");
    			        System.out.println("Numero do Departamento:");
    			        int numdep=Ler.umInt();
    			        System.out.println("Nome do Departamento:");
    			        String nomedep=Ler.umaString();
    			        System.out.println("Local do Departamento:");
    			        String local=Ler.umaString();
    			        System.out.println("Quantos cursos tem um Departamento :");
    			        int numercur = Ler.umInt();
    			        System.out.println("Introduza o numero dos cursos do Departamento:");
    			            for(int i = 0;i<numercur;i++)
                            {
    				            int numdepler=Ler.umInt();
    				            for(int k=0;k<cursos.size();k++)
                                {
    					            if(cursos.get(k).getNumCurso()==numdepler)
                                    {
    						        Curset.add(cursos.get(k));
    						break;
    					}}}
                        System.out.println("Quantos Professores tem o Departamento :");
                        int numerprof2 = Ler.umInt();
                        System.out.println("Introduza o número dos professores do Departamento");
                        for(int n = 0;n < numerprof2 ; n++) {
    				            int numprof2 = Ler.umInt();
    				            for(int j=0;j<professores.size();j++)
                                {
    					            if(professores.get(j).getnumdocente()==numprof2){
    						        Prof.add(professores.get(j));
    						        break;
    					}
    				}
    			    }
                    System.out.println("Introduza o numero do professor responsavel:");
                    int numresp = Ler.umInt();
                    for(int m=0;m<professores.size();m++) {
                    	if(professores.get(m).getnumdocente()==numresp) {
                    		resp = professores.get(m);
                    	}
                    }
    			    Departamento D1 = new Departamento(nomedep ,numdep,local, resp ,Curset,Prof);
    			    departamentos.add(D1);
    			    FuncDep.Update(departamentos);
    			    break;

                    case 2:
                    System.out.println("Introduza o numero do departamento que deseja remover.");
    			    int num_dep = Ler.umInt();
    			    for(int i =0;i<departamentos.size();i++) {
    				    if(departamentos.get(i).getNumDep()==num_dep) {
    					    departamentos.remove(i);
    					    break;
    				}
    			    }
    			    break;

                    case 3:
                    ArrayList<Professor> profs= new ArrayList<>();
                    ArrayList<Curso> curs_lista= new ArrayList<>();
                    Professor resp1 = new Professor();
                    System.out.println("Introduza o numero do departamento que deseja modificar");
                    int num_alt=Ler.umInt();
                    System.out.println("Introduza o nome e a localizacao do departamento");
                    String nom=Ler.umaString();
                    String loc=Ler.umaString();
                    System.out.println("Introduza o numero de professores que pertencem a esta departamento ");
    				int num_profs = Ler.umInt();
    				System.out.println("Introduza o numero dos professores");
    				for(int j=0;j<num_profs;j++) {
    					int num_idp= Ler.umInt();
    				for(int i=0;i<professores.size();i++) {
    					if(professores.get(i).getnumdocente()==num_idp);{
    						profs.add(profs.get(i));
    						break;
    					}
    					}
    				}
    				System.out.println("Introduza o numero de cursos que pertencem a esta departamento ");
    				int num_curs = Ler.umInt();
    				System.out.println("Introduza o numero dos cursos");
    				for(int k=0;k<num_curs;k++) {
    					int num_idc= Ler.umInt();
    				for(int m=0;m<professores.size();m++) {
    					if(cursos.get(m).getNumCurso()==num_idc);{
    						curs_lista.add(curs_lista.get(m));
    						break;
    					}
    					}
    				}
    				System.out.println("Introduza o numero do professor responsavel");
    				int resp_n=Ler.umInt();
    				for(int p=0;p<professores.size();p++) {
    					if(professores.get(p).getnumdocente()==resp_n) {
    						resp1=professores.get(p);
    					}
    				}
    				for(int n=0;n<departamentos.size();n++) {
    					if(departamentos.get(n).getNumDep()==num_alt) {
    						departamentos.get(n).setCursos(curs_lista);
    						departamentos.get(n).setLocDep(loc);
    						departamentos.get(n).setNomeDep(nom);
    						departamentos.get(n).setProfessores(profs);
    						departamentos.get(n).setResponsavel(resp1);
    						
    					}
    					
    				}
    				
                    break; 

                    case 4:
                    System.out.println("Introduza o numero de Departamento a que deseja consultar os cursos.");
    			    int num_depconsul = Ler.umInt();
    			    for(int i=0;i<departamentos.size();i++) 
                    {
    				    if(departamentos.get(i).getNumDep()==num_depconsul) {
    					System.out.println(departamentos.get(i).toString());
    					break;
    				}
    			    }
    			    break;

                    case 5:
                    Departamento dep = new Departamento();	
                    System.out.println("Introduza o numero do departamento que deseja adicionar cursos :");
    			    int numdep1 = Ler.umInt();
    			    for(int k=0;k<departamentos.size();k++) {
    			    	if(departamentos.get(k).getNumDep()==numdep1) {
    			    		dep=departamentos.get(k);
    			    	}
    			    } 
    			    System.out.println("Quantos cursos deseja adicionar");
    			    int numdecursos=Ler.umInt();    			
    			    System.out.print("Introduza o numero do curso que deseja adicionar");    	
    			        for(int j=0;j<numdecursos;j++){
    				        int novo_curso=Ler.umInt();
    			                for(int i =0;i<cursos.size();i++) 
                                {
    				                if(cursos.get(i).getNumCurso()==novo_curso){
    					            	dep.addCurso(cursos.get(i));
    					            	break;
    				                }
    			                }
                        }
                    case 6:
					int nmaiorcursos = 0;
					String nomeDep = "";
					for(int i = 0; i < departamentos.size(); i++)
					{
						int Numcursos = 0;
						ArrayList<Curso> curs = departamentos.get(i).getCursos();
						for(int j = 0; j < curs.size(); j++)
						{
							Numcursos++;
						}

						if(Numcursos > nmaiorcursos)
						{
							nmaiorcursos = Numcursos;
							nomeDep = departamentos.get(i).getNomeDep();
						}
					}
					System.out.println("O Departamento com mais cursos é :" +nomeDep);
					break;
					case 7:
					continue;
					case 8:
					break;
                	}
					break;
    

    	case 5:
    		int val6=MenuDisciplinas();
            switch(val6) {
            case 1:
            	System.out.println("Introduza o nome da cadeira:");
            	String nome = Ler.umaString();
            	System.out.println("Introduza o numero da cadeira:");
            	int numdisc= Ler.umInt();
            	Disciplina disc = new Disciplina(nome,numdisc);
            	disciplinas.add(disc);
            	FuncDisciplina.Update(disciplinas);
            	break;
            case 2:
            	System.out.println("Introduza o numero da cadeira que deseja remover.");
    			int num_rem = Ler.umInt();
    			for(int i =0;i<disciplinas.size();i++) {
    				if(disciplinas.get(i).getNumDis()==num_rem) {
    					disciplinas.remove(i);
    					break;
    				}
    			}
    			FuncDisciplina.Update(disciplinas);
    			break;
            case 3:
            	ArrayList<Professor> new_profs= new ArrayList<Professor>();
    			System.out.println("Introduza o numero da cadeira que deseja modificar.");
    			int num_alt = Ler.umInt();
    			System.out.println("Introduza o novo nome:");
    			String new_nome=Ler.umaString();
    			System.out.println("Introduza o numero de professores que deseja:");
    			int tot_profs = Ler.umInt();
    			System.out.println("Introduza o numero dos professores que deseja:");
    			for(int i=0;i<tot_profs;i++) {
    				int num_profs=Ler.umInt();
    				for(int j=0;j<professores.size();j++) {
    					if(professores.get(j).getnumdocente()==num_profs) {
    					new_profs.add(professores.get(j));
    					break;
    					}
    				}
    			}
    			for(int k=0;k<disciplinas.size();k++) {
    				if(disciplinas.get(k).getNumDis()==num_alt) {
    					disciplinas.get(k).setNomeDis(new_nome);
    					disciplinas.get(k).setDisc(new_profs);
    				}
    			}
    			FuncDisciplina.Update(disciplinas);
    			break;
            case 4:	
            	System.out.println("Introduza o numero da cadeira que deseja consultar.");
    			int num_consul = Ler.umInt();
    			for(int i=0;i<disciplinas.size();i++) {
    				if(disciplinas.get(i).getNumDis()==num_consul) {
    					System.out.println(disciplinas.get(i).toString());
    					break;
    				}
    			}
    			break;
            case 5:
            	System.out.println("Introduza o numero da cadeira que deseja consultar os professores.");
    			int num_consulprofs = Ler.umInt();
    			for(int i=0;i<disciplinas.size();i++) {
    				if(disciplinas.get(i).getNumDis()==num_consulprofs) {
    					System.out.println(disciplinas.get(i).getProf().toString());
    					break;
    				}
    			}
            	break;
            case 6:	
            	System.out.println("Introduza o numero da cadeira que deseja consultar o curso.");
    			int num_consulcurso = Ler.umInt();
    			for(int i=0;i<cursos.size();i++) {
    				if(cursos.get(i).getDisc().get(i).getNumDis()==num_consulcurso){
    					System.out.println(cursos.get(i).toString());
    					break;
    				}
    			}
    		break;	
            case 7:
            	Professor Prof=new Professor();
    			System.out.println("Introduza o numero da disciplina que deseja adicionar professores.");
    			int num_addisc = Ler.umInt();
    			for(int k=0;k<professores.size();k++) {
    				if(professores.get(k).getnumdocente()==num_addisc) {
    					Prof=professores.get(k);
    					break;
    				}
    			}
    			System.out.println("Quantos professores deseja adicionar");
    			int tot_addisc=Ler.umInt();    			
    			System.out.print("Introduza o numero do professor que deseja adicionar");    	
    			for(int j=0;j<tot_addisc;j++) {
    				int new_prof=Ler.umInt();
    			for(int i =0;i<disciplinas.size();i++) {
    				if(disciplinas.get(i).getNumDis()==new_prof){
    					disciplinas.get(i).addProf(Prof);
    					break;
    				}
    			}
    			}
    			FuncDisciplina.Update(disciplinas);
            	break;
            case 8://fazer retornar 
            	continue;
            case 9://fazer terminar
            	break;
            }
            break;
            
    	case 6:
    		int val7=MenuAulas();
    		switch (val7) {
    		case 1:
    			System.out.println("Introduza o numero da Aula");
    			int n_aula= Ler.umInt();
    			System.out.println("Introduza o numero da sala");
    			int n_sala= Ler.umInt();
    			System.out.println("Introduza o inicio da aula:");
    			System.out.println("Introudza a data(dia/mes/ano)");
    			int dia=Ler.umInt();
    			int mes = Ler.umInt();
    			int ano = Ler.umInt();
    			System.out.println("Introduza as horas(horas/minutos)");
    			int horas=Ler.umInt();
    			int minutos = Ler.umInt();
    			LocalDateTime inicio = LocalDateTime.of(mes, ano,dia, horas, minutos);
    			System.out.println("Introduza a duracao entre 1 e 4 horas.");
    			int dur=Ler.umInt();
    			Aula aula= new Aula(n_sala,inicio,n_aula);
    			aulas.add(aula);
    			FuncAula.Update(aulas);
    			break;
    		case 2:	
    			System.out.println("Introduza o numero da aula que deseja remover.");
    			int num_rem = Ler.umInt();
    			for(int i =0;i<aulas.size();i++) {
    				if(aulas.get(i).getNumAula()==num_rem) {
    					aulas.remove(i);
    					break;
    				}
    			}	
    			FuncAula.Update(aulas);
    			break;
    		case 3://Fazer o Modificar
    			ArrayList<Aluno> alunos2= new ArrayList<>();
    			Professor prof=new Professor();
    			Disciplina disci=new Disciplina();
    			System.out.println("Introduza o numero da aula que deseja modificar.");
    			int n_aulmod=Ler.umInt();
    			System.out.println("Introduza a sala, a duracao");
    			int sala_mod= Ler.umInt();
    			int dur_mod = Ler.umInt();
    			System.out.println("Introduza a data de inicio");
    			System.out.println("Dia/mes/ano");
    			int diamod=Ler.umInt();
    			int mesmod = Ler.umInt();
    			int anomod=Ler.umInt();
    			System.out.println("hora/minutos");
    			int horamod=Ler.umInt();
    			int minmod = Ler.umInt();
    			LocalDateTime new_init= LocalDateTime.of(anomod, mesmod, diamod, horamod, minmod);
    			System.out.println("Introduza os numeros da disciplina e do professor");
    			int discmod = Ler.umInt();
    			int profmod=Ler.umInt();
    			for(int i =0;i<disciplinas.size();i++) {
    				if(disciplinas.get(i).getNumDis()==discmod) {
    					disci=disciplinas.get(i);
    					break;
    				}
    			}
    			for(int j =0;j<professores.size();j++) {
    				if(professores.get(j).getnumdocente()==profmod) {
    					prof=professores.get(j);
    					break;
    				}
    			}
    			System.out.println("Introduza o numero de alunos que pretende adicionar");
    			int alu_add= Ler.umInt();
    			System.out.println("Introduza o numero do aluno");

    			for(int k=0;k<alu_add;k++) {
        			int n_alu_add=Ler.umInt();
        			for(int m=0;m<alunos.size();m++) {
        				if(alunos.get(m).getNum_Aluno()==n_alu_add) {
        					alunos2.add(alunos.get(m));
        				}
        			}
    			}
    			for(int n=0;n<aulas.size();n++) {
    				if(aulas.get(n).getNumAula()==n_aulmod) {
    					aulas.get(n).setDisc(disci);
    					aulas.get(n).setDurHora(dur_mod);
    					aulas.get(n).setInicio(new_init);
    					aulas.get(n).setProf(prof);
    					aulas.get(n).setAlunos(alunos2);
    					aulas.get(n).setSala(sala_mod);
    					break;
    				}
    			}
    			FuncAula.Update(aulas);
    			break;
    		
    		case 4:	
    			System.out.println("Introduza o numero da aula que deseja consultar");
    			int num_aula_consul = Ler.umInt();
    			for(int i =0;i<aulas.size();i++) {
    				if(num_aula_consul==aulas.get(i).getNumAula()) {
    					System.out.println(aulas.get(i).toString());
    					break;
    				}
    			}
    			break;
    		case 5:	
    			System.out.println("Introduza o numero da aula que deseja consultar o professor");
    			int num_aula_consul_prof = Ler.umInt();
    			for(int i =0;i<aulas.size();i++) {
    				if(num_aula_consul_prof==aulas.get(i).getNumAula()) {
    					System.out.println(aulas.get(i).getProf().toString());
    					break;
    				}
    			}
    			break;
    		case 6:
    			System.out.println("Introduza o numero da aula que deseja consultar os alunos");
    			int num_aula_consul_alunos = Ler.umInt();
    			for(int i=0;i<aulas.size();i++) {
    				if(aulas.get(i).getNumAula()== num_aula_consul_alunos) {
    					System.out.println(aulas.get(i).getAlunos().toString());
    					break;
    				}
    			}
    			break;
    		case 7:
    			Disciplina discp=new Disciplina();
    			System.out.println("Introduza o numero da aula que deseja adicionar a disciplina");
    			int n_aula1=Ler.umInt();
    			System.out.println("Introduza o numero da disciplina da aula");
    			int n_disc=Ler.umInt();
    			for(int i = 0;i<disciplinas.size();i++) {
    				if(disciplinas.get(i).getNumDis()==n_disc) {
    					discp=disciplinas.get(i);
    					break;
    				}
    			}
    			for(int j=0;j<aulas.size();j++) {
    				if(aulas.get(j).getNumAula()==n_aula1) {
    					aulas.get(j).setDisc(discp);
    					break;
    				}
    			}
    			FuncAula.Update(aulas);
    			break;
    		case 8:
    			Professor prof3=new Professor();
    			System.out.println("Introduza o numero da aula que deseja adicionar o professor");
    			int n_aula2=Ler.umInt();
    			System.out.println("Introduza o numero do professor da aula");
    			int n_prof=Ler.umInt();
    			for(int i = 0;i<professores.size();i++) {
    				if(professores.get(i).getnumdocente()==n_prof) {
    					prof3=professores.get(i);
    					break;
    				}
    			}
    			for(int j=0;j<aulas.size();j++) {
    				if(aulas.get(j).getNumAula()==n_aula2) {
    					aulas.get(j).setProf(prof3);
    					break;
    				}
    			}
    			FuncAula.Update(aulas);
    			break;
    		case 9:	
    			ArrayList<Aluno> alu_add1=new ArrayList<>(); 
    			System.out.println("Introduza o numero da aula");
    			int n_aula3 = Ler.umInt();
    			System.out.println("Quantos alunos pretende adicionar?");
    			int addnumalu= Ler.umInt();
    			System.out.println("Introduza o numero do aluno");
    			for(int k=0;k<addnumalu;k++) {
    			int n_aluno = Ler.umInt();
    			for(int i = 0;i<alunos.size();i++) {
    				if(alunos.get(i).getNum_Aluno()==n_aluno) {
    					alu_add1.add(alunos.get(i));
    					break;
    				}
    			}
    			}
    			    			
    			for(int j=0;j<aulas.size();j++) {
    				if(aulas.get(j).getNumAula()==n_aula3) {
    					aulas.get(j).setAlunos(alu_add1);
    					break;
    				}
    			}
    			FuncAula.Update(aulas);
    			break;
    		case 10:
    			System.out.println("Introduza o numero da aula que pretende ver a hora de entrada e de saida");
    			int n_aula4=Ler.umInt();
    			for(int i =0;i<aulas.size();i++) {
    				if(aulas.get(i).getNumAula()==n_aula4) {
    					System.out.println("A aula inicia a "+aulas.get(i).getInicio()+ " e termina a "+aulas.get(i).getInicio().plusHours(aulas.get(i).getDurHora()));
    					break;
    				}
    			}
    			break;
    		case 11://retornar
    			continue;
    		case 12://terminar
    			break;
    		}
    		
    		break;	
    		}
    		
    	}
    
	}
}
