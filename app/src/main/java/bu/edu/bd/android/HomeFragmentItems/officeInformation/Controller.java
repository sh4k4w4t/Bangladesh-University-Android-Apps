package bu.edu.bd.android.HomeFragmentItems.officeInformation;

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
import bu.edu.bd.android.HomeFragmentItems.administration.BoardOfTrustAdapter;
import bu.edu.bd.android.HomeFragmentItems.administration.BoardOfTrustModel;
import bu.edu.bd.android.R;
import bu.edu.bd.android.databinding.ActivityControllerBinding;

public class Controller extends AppCompatActivity {
    ActivityControllerBinding binding;
    RecyclerView recyclerView;
    BoardOfTrustAdapter adapter;
    ArrayList<BoardOfTrustModel> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityControllerBinding.inflate(getLayoutInflater());
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(binding.getRoot());
        this.setTitle("Controller");

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        arrayList= new ArrayList<>();
        arrayList.add(new BoardOfTrustModel(R.drawable.default_profile_pic,getResources().getString(R.string.ramirul)));
        arrayList.add(new BoardOfTrustModel(R.drawable.default_profile_pic,getResources().getString(R.string.rDidar)));
        arrayList.add(new BoardOfTrustModel(R.drawable.default_profile_pic,getResources().getString(R.string.rrajib)));
        arrayList.add(new BoardOfTrustModel(R.drawable.default_profile_pic,getResources().getString(R.string.rMoniruzzam)));
        arrayList.add(new BoardOfTrustModel(R.drawable.default_profile_pic,getResources().getString(R.string.rnaeem)));
        arrayList.add(new BoardOfTrustModel(R.drawable.default_profile_pic,getResources().getString(R.string.rliza)));
        arrayList.add(new BoardOfTrustModel(R.drawable.default_profile_pic,getResources().getString(R.string.rsushanto)));


        recyclerView= binding.controllerRecycleView;
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