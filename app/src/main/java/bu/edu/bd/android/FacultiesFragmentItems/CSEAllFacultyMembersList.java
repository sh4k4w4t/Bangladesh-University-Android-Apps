package bu.edu.bd.android.FacultiesFragmentItems;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.Objects;

import bu.edu.bd.android.DashBoard.DashBoard;
import bu.edu.bd.android.HomeFragmentItems.administration.BoardOfTrustAdapter;
import bu.edu.bd.android.HomeFragmentItems.administration.BoardOfTrustModel;
import bu.edu.bd.android.R;
import bu.edu.bd.android.databinding.ActivityCseallFacultyMembersListBinding;

public class CSEAllFacultyMembersList extends AppCompatActivity {
    ActivityCseallFacultyMembersListBinding binding;
    RecyclerView recyclerView;
    BoardOfTrustAdapter adapter;
    ArrayList<BoardOfTrustModel> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityCseallFacultyMembersListBinding.inflate(getLayoutInflater());
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(binding.getRoot());
        this.setTitle("CSE Faculty Members");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        arrayList= new ArrayList<>();
        arrayList.add(new BoardOfTrustModel(R.drawable.sadiq_another,getResources().getString(R.string.fSadiq)));
        arrayList.add(new BoardOfTrustModel(R.drawable.asraf_ali,getResources().getString(R.string.fAsraf)));
        arrayList.add(new BoardOfTrustModel(R.drawable.yeasir_sir,getResources().getString(R.string.fYasir)));
        arrayList.add(new BoardOfTrustModel(R.drawable.parvez,getResources().getString(R.string.fSahriar)));
        arrayList.add(new BoardOfTrustModel(R.drawable.ibrahim_sir,getResources().getString(R.string.fIbrahim)));
        arrayList.add(new BoardOfTrustModel(R.drawable.rokeya_khatun,getResources().getString(R.string.fRokeya)));
        arrayList.add(new BoardOfTrustModel(R.drawable.salma,getResources().getString(R.string.fSalma)));
        arrayList.add(new BoardOfTrustModel(R.drawable.arifin,getResources().getString(R.string.fArifin)));
        arrayList.add(new BoardOfTrustModel(R.drawable.anik,getString(R.string.fAnik)));
        arrayList.add(new BoardOfTrustModel(R.drawable.shampa,getResources().getString(R.string.fSadia)));
        arrayList.add(new BoardOfTrustModel(R.drawable.default_profile_pic,getResources().getString(R.string.fjakir)));
        arrayList.add(new BoardOfTrustModel(R.drawable.tarique,getResources().getString(R.string.fTarique)));
        arrayList.add(new BoardOfTrustModel(R.drawable.nayeem,getResources().getString(R.string.fSaydur)));
        arrayList.add(new BoardOfTrustModel(R.drawable.riaz_uddin,getResources().getString(R.string.fRiaz)));
        arrayList.add(new BoardOfTrustModel(R.drawable.mahfuj,getResources().getString(R.string.fMahfuz)));
        arrayList.add(new BoardOfTrustModel(R.drawable.jubayer,getResources().getString(R.string.fJubayer)));
        arrayList.add(new BoardOfTrustModel(R.drawable.shishir,getResources().getString(R.string.fSisir)));
        arrayList.add(new BoardOfTrustModel(R.drawable.tariqul,getResources().getString(R.string.fTariqul)));
        arrayList.add(new BoardOfTrustModel(R.drawable.hasib,getResources().getString(R.string.fHasib)));
        arrayList.add(new BoardOfTrustModel(R.drawable.iftekharul,getResources().getString(R.string.fIftekharul)));
        arrayList.add(new BoardOfTrustModel(R.drawable.afsana,getResources().getString(R.string.fAfsana)));
        arrayList.add(new BoardOfTrustModel(R.drawable.nazim,getResources().getString(R.string.fNazim)));
        arrayList.add(new BoardOfTrustModel(R.drawable.babu,getResources().getString(R.string.fAhammad)));
        arrayList.add(new BoardOfTrustModel(R.drawable.shakil,getResources().getString(R.string.fShakil)));
        arrayList.add(new BoardOfTrustModel(R.drawable.rahat,getResources().getString(R.string.fFazle)));
        arrayList.add(new BoardOfTrustModel(R.drawable.habib,getResources().getString(R.string.fAhsan)));
        arrayList.add(new BoardOfTrustModel(R.drawable.asraful,getResources().getString(R.string.fAnik)));
        arrayList.add(new BoardOfTrustModel(R.drawable.asib,getResources().getString(R.string.fAsib)));


        recyclerView= binding.facultyMemberssharierRecycleView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        adapter= new BoardOfTrustAdapter(getApplicationContext(),arrayList);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onBackPressed() {
        this.finish();
        startActivity(new Intent(getApplicationContext(), CSEActivity.class));
        super.onBackPressed();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
            startActivity(new Intent(getApplicationContext(), CSEActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
}