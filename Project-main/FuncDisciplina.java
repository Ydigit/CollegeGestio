
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class FuncDisciplina {
	public static void Update(ArrayList<Disciplina> disciplinas) {
		try {
			 ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("d:\\projeto\\disciplinas.dat"));
			 os.writeObject(disciplinas);
			 os.flush();	
			 } catch (IOException e) {
			 System.out.println(e.getMessage());
			 }}}	
