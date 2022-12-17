package bu.edu.bd.android.Faculties;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;

import java.util.Objects;

import bu.edu.bd.android.databinding.ActivityEeeactivityBinding;

public class EEEActivity extends AppCompatActivity {
    ActivityEeeactivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEeeactivityBinding.inflate(getLayoutInflater());
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(binding.getRoot());
        this.setTitle("Department of EEE");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        binding.aboutDepartment.setOnClickListener(view -> BrowserLinkSetupForMath("https://bu.edu.bd/faculties/faculty-of-science-engineering-technology/dept-of-eee/about-dept-of-eee/"));
        binding.missionDepartment.setOnClickListener(view -> BrowserLinkSetupForMath("https://bu.edu.bd/faculties/faculty-of-science-engineering-technology/dept-of-eee/mission-vision-of-eee/"));
        binding.syllabusDepartment.setOnClickListener(view -> BrowserLinkSetupForMath("https://bu.edu.bd/faculties/faculty-of-science-engineering-technology/dept-of-eee/syllabus/"));
        binding.facultyMembersDepartment.setOnClickListener(view -> BrowserLinkSetupForMath("https://bu.edu.bd/faculties/faculty-of-science-engineering-technology/dept-of-eee/full-time-faculty-members-of-eee-department/"));
    }

    @Override
    public void onBackPressed() {
        this.finish();
        startActivity(new Intent(getApplicationContext(), FacultiesMainActivity.class));
        super.onBackPressed();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
            startActivity(new Intent(getApplicationContext(), FacultiesMainActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }

    private void BrowserLinkSetupForMath(String link) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(link));
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
    }
}