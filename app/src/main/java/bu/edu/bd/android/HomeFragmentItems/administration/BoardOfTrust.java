package bu.edu.bd.android.HomeFragmentItems.administration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import bu.edu.bd.android.databinding.ActivityBoardOfTrustBinding;

public class BoardOfTrust extends AppCompatActivity {
    ActivityBoardOfTrustBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityBoardOfTrustBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}