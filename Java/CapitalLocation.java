// This program will return the capital of the entered Country using JSON method.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.stream.Collectors;

public class Solution {
    static String getCapitalCity(String country) {
        try {
            String encodedCountry = URLEncoder.encode(country, "UTF-8");
            URL url = new URL("https://jsonmock.hackerrank.com/api/countries?name=" + encodedCountry);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setReadTimeout(10000);
            connection.setConnectTimeout(10000);
            connection.setDoOutput(true);
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String response = reader.lines().collect(Collectors.joining());
            reader.close();
            connection.disconnect();
            String capital = response.contains("\"capital\":\"") ? response.split("\"capital\":\"")[1].split("\"")[0] : "-1";
            return capital;
        } catch (Exception e) {
            return "-1";
        }
    }

    public static void main(String[] args) {
        String country = "United States of America";
        String capital = getCapitalCity(country);
        System.out.println(capital);
    }
}
