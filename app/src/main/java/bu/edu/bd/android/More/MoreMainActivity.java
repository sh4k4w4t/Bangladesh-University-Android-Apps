package bu.edu.bd.android.More;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
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
        binding=ActivityMoreMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        this.setTitle("More Options");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        binding.library.setOnClickListener(view -> Toast.makeText(this, "Library Section Still Working...", Toast.LENGTH_SHORT).show());
        binding.labFacilities.setOnClickListener(view -> Toast.makeText(this, "Lab Facilities Section Still Working...", Toast.LENGTH_SHORT).show());
        binding.research.setOnClickListener(view -> Toast.makeText(this, "Research Section Still Working...", Toast.LENGTH_SHORT).show());
        binding.digitalEducation.setOnClickListener(view -> Toast.makeText(this, "Digital Education Section Still Working...", Toast.LENGTH_SHORT).show());
        binding.coCurricular.setOnClickListener(view -> Toast.makeText(this, "Co-Curricular Section Still Working...", Toast.LENGTH_SHORT).show());
        binding.studentOnlinePortal.setOnClickListener(view -> Toast.makeText(this, "Student Online Portal Still Working...", Toast.LENGTH_SHORT).show());
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