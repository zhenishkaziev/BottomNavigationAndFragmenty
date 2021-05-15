package com.example.myapplication.fragmenty;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.HomeModel;
import com.example.myapplication.R;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeViewHolder> {
     private List<HomeModel> list;
     private LayoutInflater inflater;
     private Context context;

     public HomeAdapter (Context context, List<HomeModel> list){
             this.inflater = LayoutInflater.from(context);
             this.list = list;
             this.context = context;

     }

    @NonNull
    @Override
    public HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         View view = inflater.inflate(R.layout.item_home, parent, false);
        return new HomeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewHolder holder, int position) {
         holder.txtDescription.setText(list.get(position).getDescription());
         holder.imFPicture.setImageResource(list.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class HomeViewHolder extends RecyclerView.ViewHolder{

          TextView txtDescription;
          ImageView imFPicture;

        public HomeViewHolder(@NonNull View itemView) {
            super(itemView);
            txtDescription = itemView.findViewById(R.id.des_text);
            imFPicture = itemView.findViewById(R.id.new_image);


        }
    }
}
