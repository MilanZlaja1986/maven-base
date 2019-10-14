import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

public class FinalApi {
	
	private static String linkToApi = "https://pokeapi.co/api/v2/berry/";

	public static int numberOfBerry() throws IOException {
		int nOfBerry = 1;
		URL requestedLink = new URL(linkToApi);
		String res = IOUtils.toString(requestedLink.openStream(), "UTF-8");
		JSONObject jObj = new JSONObject(res);
		nOfBerry = jObj.getInt("count");
		return nOfBerry;

	}

	public static String nameOfBerry(int numberOfBerry) throws IOException {
		String nameOfBerry = "";
		URL requestedLink = new URL(linkToApi + numberOfBerry + "/");
		String response = IOUtils.toString(requestedLink.openStream(), "UTF-8");
		JSONObject jObject = new JSONObject(response);
		nameOfBerry = jObject.get("name").toString();
		return nameOfBerry;

	}

	public static int sizeOfBerry(int numberOfBerry) throws IOException {
		int sizeOfBerry = 1;
		URL requestedLink = new URL(linkToApi + numberOfBerry + "/");
		String res = IOUtils.toString(requestedLink.openStream(), "UTF-8");
		JSONObject jObj = new JSONObject(res);
		sizeOfBerry = Integer.valueOf(jObj.get("size").toString());
		return sizeOfBerry;

	}

	public static int growthTimeOfBerry(int numberOfBerry) throws IOException {
		int growthTimeOfBerry = 1;
		URL requestedLink = new URL(linkToApi + numberOfBerry + "/");
		String res = IOUtils.toString(requestedLink.openStream(), "UTF-8");
		JSONObject jObj = new JSONObject(res);
		growthTimeOfBerry = Integer.valueOf(jObj.get("growth_time").toString());
		return growthTimeOfBerry;

	}

}
