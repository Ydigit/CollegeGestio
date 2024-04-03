
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class FuncCurso {
	public static void Update(ArrayList<Curso> cursos) {
		try {
			 ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("d:\\projeto\\cursos.dat"));
			 os.writeObject(cursos);
			 os.flush();	
			 } catch (IOException e) {
			 System.out.println(e.getMessage());
			 }}}	
