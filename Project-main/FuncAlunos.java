

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class FuncAlunos {
	public static void Update(ArrayList<Aluno> alunos) {
		try {
			 ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("d:\\projeto\\alunos.dat"));
			 os.writeObject(alunos);
			 os.flush();	
			 } catch (IOException e) {
			 System.out.println(e.getMessage());
			 }}}	
