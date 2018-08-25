package smk8.praktek.id.retrofitsmk8;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Response{

	@SerializedName("actors")
	private List<ActorsItem> actors;

	public void setActors(List<ActorsItem> actors){
		this.actors = actors;
	}

	public List<ActorsItem> getActors(){
		return actors;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"actors = '" + actors + '\'' + 
			"}";
		}
}