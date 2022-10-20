package bu.edu.bd.android.DashBoard.ui.Home;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

import bu.edu.bd.android.HomeFragmentItems.AboutBU.AboutBUActivity;
import bu.edu.bd.android.HomeFragmentItems.AcademicPolicies.AcademicPolicies;
import bu.edu.bd.android.HomeFragmentItems.Admission.Admission;
import bu.edu.bd.android.HomeFragmentItems.MissionAndVision.MissionAndVision;
import bu.edu.bd.android.HomeFragmentItems.OfferedDegree.OfferedDegree;
import bu.edu.bd.android.MoreFragmentItems.DeveloperInformation.DeveloperInformation;
import bu.edu.bd.android.R;

public class ImageTitleHomeItemAdapter extends RecyclerView.Adapter<ImageTitleHomeItemAdapter.AdapterHolder>{

    Context context;
    ArrayList<HomeItemGridPojo> arrayList;

    public ImageTitleHomeItemAdapter(Context context, ArrayList<HomeItemGridPojo> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public AdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AdapterHolder(LayoutInflater.from(context).inflate(R.layout.custom_layout_for_home_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterHolder holder, int position) {
        holder.title.setText(arrayList.get(position).getTitle());
        holder.image.setImageResource(arrayList.get(position).getImage());

        holder.itemView.setOnClickListener(view -> {
            if (view.getResources().getString(R.string.info_about_bu).equals(arrayList.get(position).getTitle())) {
                view.getContext().startActivity(new Intent(context, AboutBUActivity.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
            } else if(view.getResources().getString(R.string.info_misson_vision).equals(arrayList.get(position).getTitle())){
                view.getContext().startActivity(new Intent(context, MissionAndVision.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
            } else if(view.getResources().getString(R.string.info_offered_degree).equals(arrayList.get(position).getTitle())){
                view.getContext().startActivity(new Intent(context, OfferedDegree.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
            }else if(view.getResources().getString(R.string.info_academic_policies).equals(arrayList.get(position).getTitle())){
                view.getContext().startActivity(new Intent(context, AcademicPolicies.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
            }else if(view.getResources().getString(R.string.info_admission).equals(arrayList.get(position).getTitle())){
                view.getContext().startActivity(new Intent(context, Admission.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
            }else {
                Toast.makeText(context, arrayList.get(position).getTitle() + " still Working", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class AdapterHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView image;

        public AdapterHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.itemName);
            image=itemView.findViewById(R.id.itemImage);
        }
    }
}
