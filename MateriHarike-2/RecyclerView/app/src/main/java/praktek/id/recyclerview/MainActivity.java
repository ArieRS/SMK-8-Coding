package praktek.id.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<String> mName = new ArrayList<String>();
    ArrayList<String> mImage = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        insertDummyData();

        mRecyclerView = findViewById(R.id.recyler_view);
        layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);
        mAdapter = new RecyclerViewAdapter(this, mName, mImage );
        mRecyclerView.setAdapter(mAdapter);
    }

    private void insertDummyData() {
        mName.add("Jatim Park");
        mImage.add("https://explorewisata.com/wp-content/uploads/2017/12/13.-jatim-park-3.jpg");

        mName.add("Selecta");
        mImage.add("https://wisatalengkap.com/wp-content/uploads/2017/04/Taman-Selecta.jpg");

        mName.add("Museum Angkut");
        mImage.add("https://wisatalengkap.com/wp-content/uploads/2017/04/16584913_1866018637013918_2293578919078526976_n.jpg");

        mName.add("Paralayang Batu");
        mImage.add("https://wisatalengkap.com/wp-content/uploads/2017/04/16122802_1743993559248647_3884969653499330560_n.jpg");

        mName.add("Wisata Pujon Kidul");
        mImage.add("https://wisatalengkap.com/wp-content/uploads/2017/04/16124104_1884209701862426_5533916901056446464_n.jpg");

        mName.add("Kusuma Agrowisata");
        mImage.add("https://wisatalengkap.com/wp-content/uploads/2017/04/16790109_1887954724782426_7371878473830236160_n.jpg");

        mName.add("Labirin Coban Rondo");
        mImage.add("https://wisatalengkap.com/wp-content/uploads/2017/04/17125529_377595489292257_411793011844841472_n.jpg");




    }
}
