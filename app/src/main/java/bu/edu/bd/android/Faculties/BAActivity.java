package bu.edu.bd.android.Faculties;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.card.MaterialCardView;

import org.w3c.dom.Text;

import java.util.Objects;

import bu.edu.bd.android.R;

public class BAActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_baactivity);
        this.setTitle("Department of BA");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ImageView headImage = findViewById(R.id.imageOfHead);
        TextView textOfHeadMessage = findViewById(R.id.messagefromHead);
        MaterialCardView aboutBtn = findViewById(R.id.aboutDepartment);
        MaterialCardView missionBtn = findViewById(R.id.missionDepartment);
        MaterialCardView syllabusBtn = findViewById(R.id.syllabusDepartment);
        MaterialCardView facultyBtn = findViewById(R.id.facultyMembersDepartment);

        TextView missionTextId = findViewById(R.id.missionTextId);
        TextView syllabusTextId= findViewById(R.id.syllabusTextId);
        missionTextId.setText("BBA Program Syllabus");
        syllabusTextId.setText("MBA Program Syllabus");

        headImage.setImageResource(R.drawable.default_profile_pic);
        textOfHeadMessage.setText(getResources().getText(R.string.messageOfBA));
        aboutBtn.setOnClickListener(view -> BrowserLinkSetupForMath("https://bu.edu.bd/faculties/faculty-of-business-economics/about-business-adminstration/"));
        //BBA outline
        missionBtn.setOnClickListener(view -> BrowserLinkSetupForMath("https://bu.edu.bd/faculties/faculty-of-business-economics/department-of-business-administration/bba-syllabus-new-curriculum/"));
        //mba outline
        syllabusBtn.setOnClickListener(view -> BrowserLinkSetupForMath("https://bu.edu.bd/faculties/faculty-of-business-economics/department-of-business-administration/mba-syllabus-new-curriculum/"));
        facultyBtn.setOnClickListener(view -> BrowserLinkSetupForMath("https://bu.edu.bd/faculties/faculty-of-business-economics/department-of-business-administration/teacher-list/"));
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