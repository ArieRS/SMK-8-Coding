package smk8.praktek.id.retrofitsmk8;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;
import retrofit2.Call;
import retrofit2.Callback;

public class MainActivity extends AppCompatActivity {

    ActorService actorService;

    @BindView(R.id.imgCircle)
    CircleImageView imgCircle;
    @BindView(R.id.tvNama)
    TextView tvNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        actorService = ApiClient.getRetrofit().create(ActorService.class);

        Call<Response> actor = actorService.getActors();
        actor.enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                if (response.body().getActors().isEmpty() == false)
                    Log.i("response", response.body().getActors().toString());

                Response responActor = response.body();
                String actorname = responActor.getActors().get(0).getName();
                tvNama.setText(actorname);

                String actorImage = responActor.getActors().get(0).getImage();
                Glide.with(getApplicationContext())
                        .load(actorImage).into(imgCircle);
                //To Do 1 RecyclerView layout
                //To Do 2 RecyclerView, RecyclerView.Adapter, RecyclerView.Layout
                //To Do 3 Bind data into adapter
             }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {

            }
        });

    }
}
