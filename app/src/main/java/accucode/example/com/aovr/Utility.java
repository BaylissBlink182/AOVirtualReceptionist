package accucode.example.com.aovr;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;



import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;


public abstract class Utility
{
    public static String httpPost(String postUrl, String postData)
    {
        return putPost(postUrl.replace(" ", "%20"), postData, "POST");
    }
    public static String httpPut(String postUrl, String postData)
    {
        return putPost(postUrl.replace(" ", "%20"), postData, "PUT");
    }
    public static String httpGet(String getUrl)
    {
        return get(getUrl.replace(" ", "%20"));
    }

    private static String putPost(String postUrl, String postData, String httpMethod)
    {
        try
        {
            URL url = new URL(postUrl);

            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

            urlConnection.setRequestMethod(httpMethod);

            urlConnection.setRequestProperty("Accept", "application/json, text/plain, */*");
            urlConnection.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
            urlConnection.setRequestProperty("Accept-Language", "en-US,en;q=0.8");

            urlConnection.setDoOutput(true);

            urlConnection.setChunkedStreamingMode(0);

            OutputStream outputStream = new BufferedOutputStream(urlConnection.getOutputStream());
            outputStream.write(postData.getBytes("UTF-8"));
            outputStream.close();

            InputStream inputStream = new BufferedInputStream(urlConnection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));

            String serverResponse = "";
            String readLine;

            while((readLine = bufferedReader.readLine()) != null)
            {
                serverResponse += readLine;
            }

            bufferedReader.close();
            inputStream.close();
            urlConnection.disconnect();

            return serverResponse;
        }
        catch(Exception e)
        {
            return "{\"message\":\"badrequest\"}";
        }
    }

    private static String get(String getUrl)
    {
        try
        {
            URL url = new URL(getUrl);

            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

            urlConnection.setRequestMethod("GET");

            urlConnection.setRequestProperty("Accept", "application/json, text/plain, */*");
            urlConnection.setRequestProperty("Accept-Language", "en-US,en;q=0.8");

            InputStream inputStream = new BufferedInputStream(urlConnection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));

            String serverResponse = "";
            String readLine;

            while((readLine = bufferedReader.readLine()) != null)
            {
                serverResponse += readLine;
            }

            bufferedReader.close();
            inputStream.close();
            urlConnection.disconnect();

            return serverResponse;
        }
        catch(Exception e)
        {
            return "{\"message\":\"badrequest\"}";
        }
    }
}
