package layouting.aplikasi.com.relativelayout;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    ArrayList<String> listImageData = new ArrayList<>();
    ArrayList<String> listName = new ArrayList<>();
    Context context;

    public RecyclerAdapter(MainActivity activity,
                           ArrayList<String> listImage,
                           ArrayList<String> listName) {
        listImageData = listImage;
        this.listName = listName;
        context = activity;

    }

    // ini adalah fungsi yang digunakan untuk memasukkan layout
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent,
                                         int viewType) {
        View view = LayoutInflater
                .from(context)
                .inflate(R.layout.latihan_cardview, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder
            (
                    //namanya holder boleh beda
                    @NonNull ViewHolder holder,
                    //ini position namanya boleh beda juga
                    final int position
            ) {
        Glide.with(context)
                .asBitmap()
                .load(listImageData.get(position))
                .into(holder.imageView);

        holder.textView.setText(listName.get(position));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,DetailActivity.class);
                intent.putExtra("judul",listImageData.get(position));
                intent.putExtra("teks", listName.get(position));
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        //kalian samakan ya :)
        return listImageData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imgWisata);
            textView = itemView.findViewById(R.id.tvWisata);
        }
    }
}
