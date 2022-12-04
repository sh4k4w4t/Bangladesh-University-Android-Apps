package bu.edu.bd.android.about;

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

public class AboutMainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_about_main);
        this.setTitle("About");
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

    public void missionAndVision(View view) {
        startActivity(new Intent(this,MissionAndVision.class));
    }

    public void aboutBU(View view) {
        startActivity(new Intent(this,AboutBUActivity.class));
    }
}