

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
				FileWriter arq = new FileWriter(FILENAME);
				PrintWriter pWrite = new PrintWriter(arq);
				pWrite.append(texto + "\n");
			    pWrite.close();
			    arq.close();
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
				FileReader arq = new FileReader(FILENAME);
				BufferedReader br = new BufferedReader(arq);
				String result = "";
				String aux;
				while ((aux = br.readLine()) != null) {
					System.out.println(".");
					result += aux;
				}
				br.close();
				arq.close();
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
