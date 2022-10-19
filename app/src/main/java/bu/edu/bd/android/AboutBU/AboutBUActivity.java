package bu.edu.bd.android.AboutBU;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.WindowManager;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.Target;

import bu.edu.bd.android.LinkForDataCollect;
import bu.edu.bd.android.R;
import bu.edu.bd.android.databinding.ActivityAboutBuactivityBinding;

public class AboutBUActivity extends AppCompatActivity {
    ActivityAboutBuactivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAboutBuactivityBinding.inflate(getLayoutInflater());
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(binding.getRoot());


        Glide.with(AboutBUActivity.this)
                .load(LinkForDataCollect.verSityGateImage)
                .override(Target.SIZE_ORIGINAL,Target.SIZE_ORIGINAL)
                .placeholder(R.drawable.loading_image)
                .error(R.drawable.loading_image)
                .into(binding.imageView);


    }


}