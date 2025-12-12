package basesNumericas;

public class Result {
	public static String decimalToBase(int n, int x) {
	    if (n == 0) return "0";
	        StringBuilder resultado = new StringBuilder();
	        char[] hexChars = {'0','1','2','3','4','5','6','7','8','9',
	                           'A','B','C','D','E','F'};
	        
	        while (n > 0){
	            int residuo = n % x;
	            resultado.append(hexChars[residuo]);
	            n = n / x;
	        }
	        return resultado.reverse().toString();
	    }
}
