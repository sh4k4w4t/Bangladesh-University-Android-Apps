package bu.edu.bd.android.Faculties;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.card.MaterialCardView;

import java.util.Objects;

import bu.edu.bd.android.R;

public class EnglishActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_english);
        this.setTitle("Department of English");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ImageView headImage = findViewById(R.id.imageOfHead);
        TextView textOfHeadMessage = findViewById(R.id.messagefromHead);
        MaterialCardView aboutBtn = findViewById(R.id.aboutDepartment);
        MaterialCardView missionBtn = findViewById(R.id.missionDepartment);
        MaterialCardView syllabusBtn = findViewById(R.id.syllabusDepartment);
        MaterialCardView facultyBtn = findViewById(R.id.facultyMembersDepartment);

        TextView missionTextId = findViewById(R.id.missionTextId);
        TextView syllabusTextId = findViewById(R.id.syllabusTextId);
        missionTextId.setText("Syllabus of BA");
        syllabusTextId.setText("Syllabus of MA");

        headImage.setImageResource(R.drawable.head_english);
        textOfHeadMessage.setText(getResources().getText(R.string.messageOfEnglish));
        aboutBtn.setOnClickListener(view -> BrowserLinkSetupForMath("https://bu.edu.bd/about-department-of-english/"));
        //mission button for BA syllabus
        missionBtn.setOnClickListener(view -> BrowserLinkSetupForMath("https://bu.edu.bd/syllabus-ba-hons-for-english-dept/"));
        //mission button for MA syllabus
        syllabusBtn.setOnClickListener(view -> BrowserLinkSetupForMath("https://bu.edu.bd/faculties/faculty-of-arts-sociology-law/english/syllabus-ma-english/"));
        facultyBtn.setOnClickListener(view -> BrowserLinkSetupForMath("https://bu.edu.bd/faculties/faculty-of-arts-sociology-law/english/full-time-faculty-members-of-english-department/"));
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