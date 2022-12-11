package bu.edu.bd.android.academicInformation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;

import java.util.Objects;

import bu.edu.bd.android.Homepage.HomepageActivity;
import bu.edu.bd.android.R;

public class AcademicInfoMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_academic_info_main);
        this.setTitle("Academic Information");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
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

    public void offered_degree(View view) {
        startActivity(new Intent(this,OfferedDegree.class));
    }

    public void RulesAndRegulation(View view) {
        startActivity(new Intent(this,RulesAndRegulationActivity.class));
    }

    public void academicPolicies(View view) {
        startActivity(new Intent(this,AcademicPolicies.class));
    }
}