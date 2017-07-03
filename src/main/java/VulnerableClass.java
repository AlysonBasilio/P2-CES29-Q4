

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.InvalidParameterException;

public class VulnerableClass {
	public void vulnerableMethod(String FILENAME, String opr, String texto){
		if(FILENAME.length()<1){
			throw new InvalidParameterException();
		}
	    if(opr.length()>1)
	    	opr= opr.charAt(0)+"";
	    if (opr.equals("W")){
			try {
				PrintWriter pWrite = new PrintWriter(new FileWriter(FILENAME));
				pWrite.append(texto + "\n");
			    pWrite.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
		else{
			System.out.println("Entrada Inválida.");
			throw new InvalidParameterException();
		}
	}
	public String vulnerableMethod(String FILENAME, String opr){
		if(FILENAME.length()<1){
			throw new InvalidParameterException();
		}
		if(opr.length()>1)
	    	opr= opr.charAt(0)+"";
		if (opr.equals("R")){
			try {
				BufferedReader br = new BufferedReader(new FileReader(FILENAME));
				String result= br.readLine();
				while (result != null) {
					result += br.readLine();
				}
				br.close();
				return result;
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
		else{
			System.out.println("Entrada Inválida.");
			throw new InvalidParameterException();
		}
	    return null;
	}
}
