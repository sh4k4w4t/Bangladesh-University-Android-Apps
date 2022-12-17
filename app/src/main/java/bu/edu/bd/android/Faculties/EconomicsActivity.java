package bu.edu.bd.android.Faculties;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.card.MaterialCardView;

import java.util.Objects;

import bu.edu.bd.android.R;

public class EconomicsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_economics);
        this.setTitle("Department of Economics");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ImageView headImage = findViewById(R.id.imageOfHead);
        TextView textOfHeadMessage = findViewById(R.id.messagefromHead);
        MaterialCardView aboutBtn = findViewById(R.id.aboutDepartment);
        MaterialCardView missionBtn = findViewById(R.id.missionDepartment);
        MaterialCardView syllabusBtn = findViewById(R.id.syllabusDepartment);
        MaterialCardView facultyBtn = findViewById(R.id.facultyMembersDepartment);

        aboutBtn.setVisibility(View.GONE);
        missionBtn.setVisibility(View.GONE);

        headImage.setImageResource(R.drawable.economics_head);
        textOfHeadMessage.setText(getResources().getText(R.string.messageOfEconomics));
//        aboutBtn.setOnClickListener(view -> BrowserLinkSetupForMath("https://bu.edu.bd/faculties/faculty-of-arts-sociology-law/department-of-law/about-the-department-of-law-bangladesh-university"));
//        missionBtn.setOnClickListener(view -> BrowserLinkSetupForMath("https://bu.edu.bd/mission-and-vision-of-law-department/"));
        syllabusBtn.setOnClickListener(view -> BrowserLinkSetupForMath("https://bu.edu.bd/faculties/faculty-of-business-economics/department-of-business-administration/bba-syllabus-new-curriculum/"));
        facultyBtn.setOnClickListener(view -> BrowserLinkSetupForMath("https://bu.edu.bd/faculty-of-economics/"));
    }
    @Override
    public void onBackPressed() {
        this.finish();
        startActivity(new Intent(getApplicationContext(), FacultiesMainActivity.class));
        super.onBackPressed();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
            startActivity(new Intent(getApplicationContext(), FacultiesMainActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }

    private void BrowserLinkSetupForMath(String link) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(link));
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
    }
}