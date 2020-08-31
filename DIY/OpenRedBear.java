import java.io.*;
import java.net.*;

public class OpenRedBear {
    public static void main(String[] args) throws Exception {

        if (args.length != 2) {
            System.err.println("Usage:  java Reverse "
                + "https://api.particle.io/v1/devices/58004d000a51353338363332/led?access_token=389259dcc6efe8cbe0ab51e1b36b1cb93fac7b64"
                + " on");
            System.exit(1);
        }

        String stringToReverse = URLEncoder.encode("on", "UTF-8");

        URL url = new URL("https://api.particle.io/v1/devices/58004d000a51353338363332/led?access_token=389259dcc6efe8cbe0ab51e1b36b1cb93fac7b64");
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);

        OutputStreamWriter out = new OutputStreamWriter(
                                         connection.getOutputStream());
        out.write("string=" + stringToReverse);
        out.close();

        BufferedReader in = new BufferedReader(
                                    new InputStreamReader(
                                    connection.getInputStream()));
        String decodedString;
        while ((decodedString = in.readLine()) != null) {
            System.out.println(decodedString);
        }
        in.close();
    }
}