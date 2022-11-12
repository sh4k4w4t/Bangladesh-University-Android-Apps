package bu.edu.bd.android.MoreFragmentItems;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;

import java.util.Objects;

import bu.edu.bd.android.DashBoard.DashBoard;
import bu.edu.bd.android.databinding.ActivityDeveloperInforamtionBinding;

public class DeveloperInformation extends AppCompatActivity {
    ActivityDeveloperInforamtionBinding binding;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityDeveloperInforamtionBinding.inflate(getLayoutInflater());
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(binding.getRoot());
        this.setTitle("Developer Information");

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        binding.developerName.setText("Md Shakawat Hossain");
        binding.developerTitle.setText("Android & Web Application Developer");
        binding.developerUniversity.setText("Student Of Bangladesh University");
        binding.developerBatch.setText("Batch: 55th");
        binding.developerShift.setText("Department: CSE (Evening)");
        binding.developerGithub.setText("Github:  github.com/sh4k4w4t");
        binding.developerlinkedin.setText("Linkedin:  linkedin.com/in/sh4k4w4t");
        binding.developerEmail.setText("Email:  md.shakawat.hossain@yandex.com");

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