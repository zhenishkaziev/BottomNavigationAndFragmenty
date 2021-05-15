package com.example.myapplication.fragmenty;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.ListModel;
import com.example.myapplication.MoveInter;
import com.example.myapplication.R;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder> {

    private MoveInter moveInter;

     public void setMoveInter (MoveInter moveInter){
         this.moveInter = moveInter;
     }

     private List<ListModel> list;
     private LayoutInflater inflater;
     private Context context;

      public ListAdapter  (Context context,  List<ListModel> list){
          this.inflater = LayoutInflater.from(context);
          this.list = list;
          this.context = context;
      }






    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
          View view = inflater.inflate(R.layout.item_list_fragment, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
          holder.bind(list.get(position));


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ListViewHolder extends  RecyclerView.ViewHolder {

          TextView txtLanguages;
          ImageView imPicture;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            txtLanguages = itemView.findViewById(R.id.language_text);
            imPicture = itemView.findViewById(R.id.image_java);
        }
         public void bind (ListModel model){
            txtLanguages.setText(model.getTitle());
            imPicture.setImageResource(model.getImage());
             itemView.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     moveInter.MoveInter(getAdapterPosition());
                 }
             });
         }
    }
}
