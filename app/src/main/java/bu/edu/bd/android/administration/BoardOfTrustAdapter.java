package bu.edu.bd.android.administration;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import bu.edu.bd.android.R;

public class BoardOfTrustAdapter extends RecyclerView.Adapter<BoardOfTrustAdapter.MyViewHolder>{
    Context context;
    ArrayList<BoardOfTrustModel> arrayList;

    public BoardOfTrustAdapter(Context context, ArrayList<BoardOfTrustModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.custom_layout_for_board_of_trust,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.textView.setText(arrayList.get(position).getTitle());
        Glide.with(context).load(arrayList.get(position).getPicture()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        if (arrayList.size()==0){
            return 0;
        }else {
            return arrayList.size();
        }
    }

    public static  class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView= itemView.findViewById(R.id.imageinVC);
            textView= itemView.findViewById(R.id.textViewInVC);
        }
    }
}
