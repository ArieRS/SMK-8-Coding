package layouting.aplikasi.com.relativelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> listImage = new ArrayList<>();
    ArrayList<String> listName = new ArrayList<>();
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerview_main);

        dummyData();
        recyclerView = findViewById(R.id.recycler_view);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerAdapter(this, listImage, listName);
        recyclerView.setAdapter(adapter);

    }

    private void dummyData() {
        listImage.add("http://cdn2.tstatic.net/jatim/foto/bank/images/poster-film-arini-dan-the-secret-suster-ngesot-urban-legend_20180402_194824.jpg");
        listName.add("Arini");

        listImage.add("https://www.anekawisata.com/wp-content/uploads/2016/06/Tempat-Wisata-Baru-Di-Malang.jpg");
        listName.add("Mata Air Sumber Sirah");

        listImage.add("https://www.bioskoptoday.com/wp-content/uploads/2018/01/poster-the-killing-of-a-sacred-deer-200x300.jpg");
        listName.add("THE Killing");

        listImage.add("https://www.bioskoptoday.com/wp-content/uploads/2018/01/poster-the-jungle-bunch-200x300.jpg");
        listName.add("The Junggle Ban");

        listImage.add("https://www.bioskoptoday.com/wp-content/uploads/2018/01/poster-along-with-the-gods-200x300.jpg");
        listName.add("Along Gods");

        listImage.add("https://www.bioskoptoday.com/wp-content/uploads/2018/01/poster-film-stars-200x300.jpg");
        listName.add("Film Stars Don't Die in Liverpool");

        listImage.add("https://www.bioskoptoday.com/wp-content/uploads/2016/12/poster-insidious-200x300.jpg");
        listName.add("Insidious: The Last Key");

        listImage.add("https://www.bioskoptoday.com/wp-content/uploads/2016/12/poster-insidious-200x300.jpg");
        listName.add("Insidious: The Last Key");

        listImage.add("https://www.bioskoptoday.com/wp-content/uploads/2016/12/poster-insidious-200x300.jpg");
        listName.add("Insidious: The Last Key");

        listImage.add("https://www.anekawisata.com/wp-content/uploads/2016/06/Tempat-Wisata-Baru-Di-Malang.jpg");
        listName.add("Mata Air Sumber Sirah");

        listImage.add("https://www.bioskoptoday.com/wp-content/uploads/2018/01/poster-the-killing-of-a-sacred-deer-200x300.jpg");
        listName.add("THE Killing");

        listImage.add("https://www.bioskoptoday.com/wp-content/uploads/2018/01/poster-the-jungle-bunch-200x300.jpg");
        listName.add("The Junggle Ban");

        listImage.add("https://www.bioskoptoday.com/wp-content/uploads/2018/01/poster-along-with-the-gods-200x300.jpg");
        listName.add("Along Gods");


    }
}
