
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class FuncAula {
	public static void Update(ArrayList<Aula> aulas) {
		try {
			 ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("d:\\projeto\\aulas.dat"));
			 os.writeObject(aulas);
			 os.flush();	
			 } catch (IOException e) {
			 System.out.println(e.getMessage());
			 }}}	
