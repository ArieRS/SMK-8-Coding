package smk8.praktek.id.retrofitsmk8;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ActorService {

    @GET("JSONParsingTutorial/jsonActors")
    Call<Response> getActors();

}
