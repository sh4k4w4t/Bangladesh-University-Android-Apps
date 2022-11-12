package bu.edu.bd.android.HomeFragmentItems.administration;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.Objects;

import bu.edu.bd.android.DashBoard.DashBoard;
import bu.edu.bd.android.R;
import bu.edu.bd.android.databinding.ActivityBoardOfTrustBinding;

public class BoardOfTrust extends AppCompatActivity {
    ActivityBoardOfTrustBinding  binding;
    RecyclerView recyclerView;
    BoardOfTrustAdapter adapter;
    ArrayList<BoardOfTrustModel> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityBoardOfTrustBinding.inflate(getLayoutInflater());
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(binding.getRoot());
        this.setTitle("Board Of Trust");

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        arrayList= new ArrayList<>();
        arrayList.add(new BoardOfTrustModel(R.drawable.jamil_azher,getResources().getString(R.string.bot_jamil)));
        arrayList.add(new BoardOfTrustModel(R.drawable.ghulam_dastagir,getResources().getString(R.string.bot_Ghulam)));
        arrayList.add(new BoardOfTrustModel(R.drawable.t_p_biswas,getResources().getString(R.string.bot_tarapada)));
        arrayList.add(new BoardOfTrustModel(R.drawable.masih_ur_rahman_1,getResources().getString(R.string.bot_masih)));
        arrayList.add(new BoardOfTrustModel(R.drawable.mozahaer_ali,getResources().getString(R.string.bot_mozahar)));
        arrayList.add(new BoardOfTrustModel(R.drawable.wahiuddin_mahmood,getResources().getString(R.string.bot_wahiuddin)));
        arrayList.add(new BoardOfTrustModel(R.drawable.dr_shagufta_mahmood,getResources().getString(R.string.bot_shagufta)));
        arrayList.add(new BoardOfTrustModel(R.drawable.shahnila_azher,getResources().getString(R.string.bot_shahlina)));
        arrayList.add(new BoardOfTrustModel(R.drawable.shihab_azhar,getResources().getString(R.string.bot_ansari)));
        arrayList.add(new BoardOfTrustModel(R.drawable.mushfiqur_rahman,getResources().getString(R.string.bot_musfiqur)));
        arrayList.add(new BoardOfTrustModel(R.drawable.sadia_malik,getResources().getString(R.string.bot_sadia)));
        arrayList.add(new BoardOfTrustModel(R.drawable.iqbal_habib,getResources().getString(R.string.bot_iqbal)));
        arrayList.add(new BoardOfTrustModel(R.drawable.sarmin_ahmed_mozumder,getResources().getString(R.string.bot_sharmin)));

        recyclerView= binding.recycleviewBroadOfTrust;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        adapter= new BoardOfTrustAdapter(getApplicationContext(),arrayList);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public void onBackPressed() {
        this.finish();
        startActivity(new Intent(getApplicationContext(), DashBoard.class));
        super.onBackPressed();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
            startActivity(new Intent(getApplicationContext(), DashBoard.class));
        }
        return super.onOptionsItemSelected(item);
    }


}