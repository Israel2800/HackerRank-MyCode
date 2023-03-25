import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'getSubstringCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int getSubstringCount(String s) {
        int count = 0;
        int previousLen = 0;
        int currentLen = 1;
        char previousChar = s.charAt(0);
        
        for (int i = 1; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if(currentChar == previousChar) {
                currentLen++;
            } else {
                count += Math.min(previousLen, currentLen);
                previousLen = currentLen;
                currentLen = 1;
                previousChar = currentChar;
            }
        }
        return count + Math.min(previousLen, currentLen);
    }    

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result.getSubstringCount(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}