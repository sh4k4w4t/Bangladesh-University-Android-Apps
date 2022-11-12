package bu.edu.bd.android.HomeFragmentItems.administration;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;

import java.util.Objects;

import bu.edu.bd.android.DashBoard.DashBoard;
import bu.edu.bd.android.R;
import bu.edu.bd.android.databinding.ActivityVcofficeBinding;

public class VCOffice extends AppCompatActivity {
    ActivityVcofficeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityVcofficeBinding.inflate(getLayoutInflater());
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(binding.getRoot());
        this.setTitle("VC Office");

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        binding.vcMezba.setText(R.string.vc_mezba);
        binding.vcTaif.setText(R.string.vc_taif);
        binding.vcShamima.setText(R.string.vc_shamima);
        binding.mezbaImage.setImageResource(R.drawable.vc_mezba);
        binding.taifImage.setImageResource(R.drawable.vc_taif);
        binding.shamimaImage.setImageResource(R.drawable.vc_shamima);
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