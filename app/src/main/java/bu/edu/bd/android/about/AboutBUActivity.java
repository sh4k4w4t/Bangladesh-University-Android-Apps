package bu.edu.bd.android.about;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;

import java.util.Objects;

import bu.edu.bd.android.R;
import bu.edu.bd.android.databinding.ActivityAboutBuactivityBinding;

public class AboutBUActivity extends AppCompatActivity {
    ActivityAboutBuactivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAboutBuactivityBinding.inflate(getLayoutInflater());
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(binding.getRoot());
        this.setTitle("About BU");

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        binding.imageView.setImageResource(R.drawable.bu_home);
        binding.partOne.setText(R.string.about_bu_part_1);
        binding.partTwo.setText(R.string.about_bu_part_2);
        binding.partThree.setText(R.string.about_bu_part_3);
        binding.partFour.setText(R.string.about_bu_part_4);
    }

    @Override
    public void onBackPressed() {
        this.finish();
        startActivity(new Intent(getApplicationContext(), AboutMainActivity.class));
        super.onBackPressed();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
            startActivity(new Intent(getApplicationContext(), AboutMainActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }


}