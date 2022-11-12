package bu.edu.bd.android.HomeFragmentItems.admission;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;

import java.util.Objects;

import bu.edu.bd.android.DashBoard.DashBoard;
import bu.edu.bd.android.R;
import bu.edu.bd.android.databinding.ActivityAdmissionBinding;

public class Admission extends AppCompatActivity {
    ActivityAdmissionBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding= ActivityAdmissionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        this.setTitle("Admission Info");

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        binding.admissionStart.setText(R.string.addmission_start);
        binding.studentEnrollmentTitle.setText(R.string.student_enrollment_title);
        binding.studentEnrollmentTitleOne.setText(R.string.student_enrollment_title_one);
        binding.studentEnrollmentTitleTwo.setText(R.string.student_enrollment_title_two);
        binding.underGraduationAdmissionOne.setText(R.string.under_graduation_admission_one);
        binding.underGraduationAdmissionTwo.setText(R.string.under_graduation_admission_two);
        binding.underGraduationAdmissionThree.setText(R.string.under_graduation_admission_three);
        binding.graduationAdmissionOne.setText(R.string.graduation_admission_one);
        binding.graduationAdmissionTwo.setText(R.string.graduation_admission_two);
        binding.graduationAdmissionThree.setText(R.string.graduation_admission_three);
        binding.faOne.setText(R.string.financial_aid_one);
        binding.faTwo.setText(R.string.financial_aid_two);
        binding.faThree.setText(R.string.financial_aid_three);
        binding.faFour.setText(R.string.financial_aid_four);
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