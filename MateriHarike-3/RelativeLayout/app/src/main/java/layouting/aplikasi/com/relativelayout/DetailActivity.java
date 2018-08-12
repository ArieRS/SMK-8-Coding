package layouting.aplikasi.com.relativelayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    ImageView imageView;
    //todo 1 tambah teksview
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageView = findViewById(R.id.imgDetail);
        //todo 2 definisikan id teksview
        textView = findViewById(R.id.tvDetail);

        Intent intent = getIntent();
        if (intent!=null){
            Glide.with(this)
                    .asBitmap()
                    .load(intent.getStringExtra("judul"))
                    .into(imageView);

            //todo 3 setteksview
            textView.setText(intent.getStringExtra("teks"));
        }
    }
}
