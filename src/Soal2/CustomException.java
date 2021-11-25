package Soal2;


class HexadesimalException  extends Exception  
{  
	public static int HexadesimalException(String hex) {
		try {
	        return Integer.parseInt(hex, 16);
	    } catch (NumberFormatException e) {
	        return 0;
	    }
	}
}  

public class CustomException extends HexadesimalException{
	
	static void validate (String hex) throws HexadesimalException{    
		if(HexadesimalException(hex)==0){  
			// throw an object of user defined exception  
	        throw new HexadesimalException();    
	    }else{   
	        System.out.println(hex + " termasuk hexadesimal");   
	    }   
	}    
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try  
        {  
            // calling the method   
            validate("AAASD21334332AAAA");  
        }  
        catch (HexadesimalException ex)  
        {  
            System.out.println("Caught the exception");  
            System.out.println("Exception : " + ex);  
        }  
  
        System.out.println("Menghentikan mesin...");    

	}

}
