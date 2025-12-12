package basesNumericas;
import java.io.*;

public class Solution {
	
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // Where x = 2 || x =8 || x = 16

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int x = Integer.parseInt(bufferedReader.readLine().trim());

        String resultado = Result.decimalToBase(n, x);

        bufferedWriter.write(resultado);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}