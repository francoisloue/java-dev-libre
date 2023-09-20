package InitJava;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

public class SortCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> CapitalList = new ArrayList<>();
		HttpRequest postRequest = HttpRequest.newBuilder()
				.uri(URI.create("https://restcountries.com/v3.1/all"))
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = null;
		try {
			response = HttpClient.newHttpClient().send(postRequest, HttpResponse.BodyHandlers.ofString());
		} catch(IOException e) {
			e.printStackTrace();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(response.body());
	}
}
