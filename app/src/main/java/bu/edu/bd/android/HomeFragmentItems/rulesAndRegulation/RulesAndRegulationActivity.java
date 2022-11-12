package bu.edu.bd.android.HomeFragmentItems.rulesAndRegulation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;

import java.util.Objects;

import bu.edu.bd.android.DashBoard.DashBoard;
import bu.edu.bd.android.R;
import bu.edu.bd.android.databinding.ActivityRulesAndRegulationBinding;

public class RulesAndRegulationActivity extends AppCompatActivity {
    ActivityRulesAndRegulationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityRulesAndRegulationBinding.inflate(getLayoutInflater());
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(binding.getRoot());
        this.setTitle("Rules And Regulations");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        binding.academicConsisit.setText(R.string.academicConsist1);
        binding.forTri.setText(R.string.forTrisemster);
        binding.forBi.setText(R.string.forBiSemester);
        binding.registraton1.setText(R.string.registraton1);
        binding.regis2.setText(R.string.regis2);
        binding.regis3.setText(R.string.regis3);
        binding.general1.setText(R.string.general1);
        binding.general2.setText(R.string.general2);
        binding.readmission1.setText(R.string.readmission1);
        binding.readmission2.setText(R.string.readmission2);
        binding.internship1.setText(R.string.internship1);
        binding.internship2.setText(R.string.internship2);
        binding.oriantation1.setText(R.string.oriantation1);
        binding.oriantation2.setText(R.string.oriantation2);
        binding.studentIdentifiaction1.setText(R.string.studentIdentifiaction1);
        binding.studentIdentifiaction2.setText(R.string.studentIdentifiaction2);
        binding.degreeCom1.setText(R.string.degreeCom1);
        binding.degreeCom2.setText(R.string.degreeCom2);
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