package bu.edu.bd.android.HomeFragmentItems.AcademicPolicies;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;

import java.util.Objects;

import bu.edu.bd.android.DashBoard.DashBoard;
import bu.edu.bd.android.R;
import bu.edu.bd.android.databinding.ActivityAcademicPoliciesBinding;

public class AcademicPolicies extends AppCompatActivity {
    ActivityAcademicPoliciesBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityAcademicPoliciesBinding.inflate(getLayoutInflater());
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(binding.getRoot());
        this.setTitle("Academic Policies");

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        binding.apOne.setText(R.string.ap_one);
        binding.lessonPlanOne.setText(R.string.lessonPlan_one);
        binding.lessonPlanTwo.setText(R.string.lessonPlan_two);
        binding.attendenceOne.setText(R.string.attendence_one);
        binding.attendenceTwo.setText(R.string.attendence_two);
        binding.codingSystemInFinalExaminationOne.setText(R.string.Coding_system_in_Final_Examination_one);
        binding.codingSystemInFinalExaminationTwo.setText(R.string.Coding_system_in_Final_Examination_two);
        binding.creditHoursSystemOne.setText(R.string.Credit_Hours_System_one);
        binding.creditHoursSystemTwo.setText(R.string.Credit_Hours_System_two);
        binding.midTermAndFinalExaminationsOne.setText(R.string.Mid_term_and_Final_Examinations_one);
        binding.midTermAndFinalExaminationsTwo.setText(R.string.Mid_term_and_Final_Examinations_two);
        binding.makeupMissedFailedExaminationsOne.setText(R.string.Makeup_Missed_Failed_Examinations_one);
        binding.makeupMissedFailedExaminationsTwo.setText(R.string.Makeup_Missed_Failed_Examinations_two);
        binding.improvementExaminationOne.setText(R.string.Improvement_Examination_one);
        binding.improvementExaminationTwo.setText(R.string.Improvement_Examination_two);
        binding.dropoutCourseDueToDisciplinaryActionRecourseExaminationsOne.setText(R.string.Dropout_Course_due_to_disciplinary_action_Recourse_Examinations_one);
        binding.dropoutCourseDueToDisciplinaryActionRecourseExaminationsTwo.setText(R.string.Dropout_Course_due_to_disciplinary_action_Recourse_Examinations_two);

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