package bu.edu.bd.android.officeInformation;

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

import bu.edu.bd.android.administration.BoardOfTrustAdapter;
import bu.edu.bd.android.administration.BoardOfTrustModel;
import bu.edu.bd.android.R;
import bu.edu.bd.android.databinding.ActivityTechBinding;

public class Tech extends AppCompatActivity {
    ActivityTechBinding binding;
    RecyclerView recyclerView;
    BoardOfTrustAdapter adapter;
    ArrayList<BoardOfTrustModel> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityTechBinding.inflate(getLayoutInflater());
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(binding.getRoot());
        this.setTitle("Controller");

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        arrayList= new ArrayList<>();
        arrayList.add(new BoardOfTrustModel(R.drawable.default_profile_pic,getResources().getString(R.string.ikhabir)));
        arrayList.add(new BoardOfTrustModel(R.drawable.default_profile_pic,getResources().getString(R.string.iataur)));
        arrayList.add(new BoardOfTrustModel(R.drawable.default_profile_pic,getResources().getString(R.string.imehedi)));
        arrayList.add(new BoardOfTrustModel(R.drawable.default_profile_pic,getResources().getString(R.string.iprovakor)));
        arrayList.add(new BoardOfTrustModel(R.drawable.default_profile_pic,getResources().getString(R.string.inigram)));

        recyclerView= binding.techRecycleView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        adapter= new BoardOfTrustAdapter(getApplicationContext(),arrayList);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public void onBackPressed() {
        this.finish();
        startActivity(new Intent(getApplicationContext(), OfficeMainActivity.class));
        super.onBackPressed();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
            startActivity(new Intent(getApplicationContext(), OfficeMainActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }

}