package bu.edu.bd.android.Faculties;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Toast;

import java.util.Objects;

import bu.edu.bd.android.Homepage.HomepageActivity;
import bu.edu.bd.android.R;
import bu.edu.bd.android.databinding.ActivityFacultiesMainBinding;

public class FacultiesMainActivity extends AppCompatActivity {
    ActivityFacultiesMainBinding binding;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = ActivityFacultiesMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        this.setTitle("Faculties");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        binding.setDeptTitle.setText("Science, Engineering and Technology");
        binding.aslDeptTitle.setText("Arts, Social Science and Law");
        binding.baeDeptTitle.setText("Business Administration and Economics");

        binding.cse.setText("Computer Science and Engineering");
        binding.math.setText("Mathematics");
        binding.pharmachy.setText("Pharmacy");
        binding.eee.setText("Electrical and Electronics Engineering (EEE)");
        binding.arch.setText("Architecture");

        binding.english.setText("English");
        binding.sociology.setText("Sociology");
        binding.law.setText("Law");

        binding.businessAddministration.setText("Business Administration");
        binding.economics.setText("Economics");

        binding.cse.setOnClickListener(view -> startActivity(new Intent(this, CSEActivity.class)));
        binding.math.setOnClickListener(view -> startActivity(new Intent(this, MathActivity.class)));
        binding.pharmachy.setOnClickListener(view -> startActivity(new Intent(this, PharmacyActivity.class)));
        binding.eee.setOnClickListener(view -> startActivity(new Intent(this, EEEActivity.class)));
        binding.arch.setOnClickListener(view -> startActivity(new Intent(this, ArchActivity.class)));

        binding.english.setOnClickListener(view -> startActivity(new Intent(this, EnglishActivity.class)));
        binding.sociology.setOnClickListener(view -> startActivity(new Intent(this, SociologyActivity.class)));
//        binding.law.setOnClickListener(view -> startActivity(new Intent(this, ArchActivity.class)));

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