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

public class SociologyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sociology);
        this.setTitle("Department of Sociology");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ImageView headImage = findViewById(R.id.imageOfHead);
        TextView textOfHeadMessage = findViewById(R.id.messagefromHead);
        MaterialCardView aboutBtn = findViewById(R.id.aboutDepartment);
        MaterialCardView missionBtn = findViewById(R.id.missionDepartment);
        MaterialCardView syllabusBtn = findViewById(R.id.syllabusDepartment);
        MaterialCardView facultyBtn = findViewById(R.id.facultyMembersDepartment);

        missionBtn.setVisibility(View.GONE);

        headImage.setImageResource(R.drawable.sociology_head);
        textOfHeadMessage.setText(getResources().getText(R.string.messageOfSocilogy));
        aboutBtn.setOnClickListener(view -> BrowserLinkSetupForMath("https://bu.edu.bd/faculties/faculty-of-arts-sociology-law/sociology/about-the-department-of-sociology/"));
//        missionBtn.setOnClickListener(view -> BrowserLinkSetupForMath("https://bu.edu.bd/faculties/faculty-of-science-engineering-technology/architecture/mission-vision/"));
        syllabusBtn.setOnClickListener(view -> BrowserLinkSetupForMath("https://bu.edu.bd/faculties/faculty-of-arts-sociology-law/sociology/syllabus-sociology/"));
        facultyBtn.setOnClickListener(view -> BrowserLinkSetupForMath("https://bu.edu.bd/faculties/faculty-of-arts-sociology-law/sociology/teachers-list/"));
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