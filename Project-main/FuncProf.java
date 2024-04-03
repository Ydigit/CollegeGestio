
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class FuncProf {
	public static void Update(ArrayList<Professor> professores) {
		try {
			 ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("d:\\projeto\\professores.dat"));
			 os.writeObject(professores);
			 os.flush();	
			 } catch (IOException e) {
			 System.out.println(e.getMessage());
			 }}}	
