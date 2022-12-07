package bu.edu.bd.android.More;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import java.util.Objects;

import bu.edu.bd.android.Homepage.HomepageActivity;
import bu.edu.bd.android.R;
import bu.edu.bd.android.databinding.ActivityMoreMainBinding;

public class MoreMainActivity extends AppCompatActivity {
    ActivityMoreMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = ActivityMoreMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        this.setTitle("More Options");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        binding.labFacilities.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.setData(Uri.parse(getResources().getString(R.string.lab_facility_url)));
            startActivity(intent);
        });
        binding.studentOnlinePortal.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.setData(Uri.parse(getResources().getString(R.string.student_portal)));
            startActivity(intent);
        });
        binding.library.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.setData(Uri.parse(getResources().getString(R.string.library_url)));
            startActivity(intent);
        });
        binding.research.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.setData(Uri.parse(getResources().getString(R.string.research_url)));
            startActivity(intent);
        });
        binding.digitalEducation.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.setData(Uri.parse(getResources().getString(R.string.digital_education_url)));
            startActivity(intent);
        });
        binding.coCurricular.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.setData(Uri.parse(getResources().getString(R.string.co_curricular_url)));
            startActivity(intent);
        });
        binding.developerInformation.setOnClickListener(view -> startActivity(new Intent(this, DeveloperInformation.class)));
    }

    @Override
    public void onBackPressed() {
        this.finish();
        startActivity(new Intent(this, HomepageActivity.class));
        super.onBackPressed();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
            startActivity(new Intent(this, HomepageActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
}