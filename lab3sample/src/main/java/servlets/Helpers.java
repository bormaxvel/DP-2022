package servlets;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import items.Gamepad;
import jakarta.servlet.http.HttpServletRequest;

public class Helpers {
	
	public static JsonElement bodyParse(HttpServletRequest request) {
		JsonElement jsonElement=null;	
		
		try {
			jsonElement = JsonParser.parseReader(request.getReader());
		} catch (JsonIOException | JsonSyntaxException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return jsonElement;
	}
	
	public static Gamepad userParse(HttpServletRequest request) {
		Gamepad user = new Gamepad();
		JsonElement jsonElement = bodyParse(request);
		user.setId(jsonElement.getAsJsonObject().get("id").getAsInt());
		user.setName(jsonElement.getAsJsonObject().get("name").getAsString());
		user.setPrice(jsonElement.getAsJsonObject().get("price").getAsInt());
		user.setDescription(jsonElement.getAsJsonObject().get("price").getAsString());
		user.setLink(jsonElement.getAsJsonObject().get("link").getAsString());
		
		return user;
	}
	
	public static int getNextId(List<Gamepad> list) {
		int maxId = 0;
		if (list == null) return 0;
		Iterator<Gamepad> iterator = list.iterator();
		while(iterator.hasNext()) {
			int currentId = iterator.next().getId();
			if(currentId>maxId) maxId=currentId;
		}
		return maxId+1;
	}
	
	public static int getIndexByUserId(int id,List<Gamepad> list) {
		int listId = id;
		
		Iterator<Gamepad> iterator = list.iterator();
		while(iterator.hasNext()) {
			Gamepad temp =iterator.next();
			if(temp.getId()==listId) { 
				listId=list.indexOf(temp);
				break;
			}
		}
		return listId;
	}
	
	

}
