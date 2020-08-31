import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import javax.net.ssl.HttpsURLConnection;

public class HttpURLConnectionExample {
	
	public static String function;
	public static String order;
	
	private final String USER_AGENT = "Mozilla/5.0";

	public static void main(String[] args) throws Exception {
		
		Scanner keyboard = new Scanner(System.in);
		
		HttpURLConnectionExample http = new HttpURLConnectionExample();

		/*System.out.println("Testing 1 - Send Http GET request");
		http.sendGet();*/

		System.out.println("Control Redbear duo!!");
		while(true)
		{
			
			System.out.println("Please select a action:");
			System.out.printf("1.Order the Redbear duo.\n2.Stop this program.\n");
			int ans = keyboard.nextInt();
			
			switch(ans)
			{
				case 1:
					System.out.println("Enter the function:");
					setFunction(keyboard.next());
					System.out.println("Enter the order:");
					setOrder(keyboard.next());
					http.sendPost();
					break;
				case 2:
					System.exit(0);
					break;
				default:
					System.out.println("error!!");
			}
		}
	}

	// HTTP GET request
	private void sendGet() throws Exception {

		String url = "http://www.google.com/search?q=mkyong";

		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		//add request header
		con.setRequestProperty("User-Agent", USER_AGENT);

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		//print result
		System.out.println(response.toString());

	}

	// HTTP POST request
	public void sendPost() throws Exception {

		String url = String.format("https://api.particle.io/v1/devices/58004d000a51353338363332/%s?access_token=389259dcc6efe8cbe0ab51e1b36b1cb93fac7b64",getFunction());
		URL obj = new URL(url);
		HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

		//add reuqest header
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

		String urlParameters = String.format("value=%s",getOrder());

		// Send post request
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'POST' request to URL : " + url);
		System.out.println("Post parameters : " + urlParameters);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		//print result
		System.out.println(response.toString());

	}
	
	public String getFunction()
	{
		return function;
	}
	
	public static void setFunction(String fc)
	{
		function = fc ;
	}
	
	public String getOrder()
	{
		return order;
	}
	
	public static void setOrder(String od)
	{
		order = od ;
	}
}