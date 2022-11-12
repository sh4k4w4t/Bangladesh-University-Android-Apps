package bu.edu.bd.android.FacultiesFragmentItems;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import java.util.Objects;
import bu.edu.bd.android.DashBoard.DashBoard;
import bu.edu.bd.android.databinding.ActivityCseactivityBinding;

public class CSEActivity extends AppCompatActivity {
    ActivityCseactivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityCseactivityBinding.inflate(getLayoutInflater());
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(binding.getRoot());
        this.setTitle("Department of CSE");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        binding.academicSupport.setOnClickListener(view -> BrowserLinkSetup("https://cse.bu.edu.bd/academic-support/"));
        binding.syllabus.setOnClickListener(view -> BrowserLinkSetup("https://cse.bu.edu.bd/syllabus/"));
        binding.website.setOnClickListener(view -> BrowserLinkSetup("https://cse.bu.edu.bd/"));
        binding.allMembers.setOnClickListener(view -> startActivity(new Intent(CSEActivity.this,CSEAllFacultyMembersList.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)));
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

    private void BrowserLinkSetup(String link){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(link));
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
    }
}