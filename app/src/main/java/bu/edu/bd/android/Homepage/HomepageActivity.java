package bu.edu.bd.android.Homepage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import bu.edu.bd.android.Faculties.FacultiesMainActivity;
import bu.edu.bd.android.More.MoreMainActivity;
import bu.edu.bd.android.R;
import bu.edu.bd.android.about.AboutMainActivity;
import bu.edu.bd.android.academicInformation.AcademicInfoMainActivity;
import bu.edu.bd.android.administration.AdministrationMainActivity;
import bu.edu.bd.android.admission.Admission;
import bu.edu.bd.android.officeInformation.OfficeMainActivity;

public class HomepageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_homepage);
    }

    public void aboutSectionClick(View view) {
        startActivity(new Intent(this, AboutMainActivity.class));
    }

    public void academicInfo(View view) {
        startActivity(new Intent(this, AcademicInfoMainActivity.class));
    }

    public void fecultiesInfo(View view) {
        startActivity(new Intent(this, FacultiesMainActivity.class));
    }

    public void administrationClick(View view) {
        startActivity(new Intent(this, AdministrationMainActivity.class));
    }

    public void admissionClick(View view) {
        startActivity(new Intent(this, Admission.class));
    }

    public void collaboration(View view) {
        Toast.makeText(this, "Under Construction...", Toast.LENGTH_SHORT).show();
    }

    public void officeInfo(View view) {
        startActivity(new Intent(this, OfficeMainActivity.class));
    }

    public void moreClick(View view) {
        startActivity(new Intent(this, MoreMainActivity.class));
    }

    @Override
    public void onBackPressed() {
        this.finish();
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}