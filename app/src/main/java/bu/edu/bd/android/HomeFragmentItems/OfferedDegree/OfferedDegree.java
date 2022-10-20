package bu.edu.bd.android.HomeFragmentItems.OfferedDegree;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;

import java.util.Objects;

import bu.edu.bd.android.DashBoard.DashBoard;
import bu.edu.bd.android.R;
import bu.edu.bd.android.databinding.ActivityOfferedDegreeBinding;

public class OfferedDegree extends AppCompatActivity {
    ActivityOfferedDegreeBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityOfferedDegreeBinding.inflate(getLayoutInflater());
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(binding.getRoot());
        this.setTitle("Offered Degree");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        binding.mainTitle.setText(R.string.od_title);

        binding.FSET.setText(R.string.od_faculty_FSET);
        binding.FASSL.setText(R.string.od_faculty_FASSL);
        binding.FBAE.setText(R.string.od_faculty_FBAE);

        binding.facultyNameOne.setText(R.string.od_under_gra_are_option_title);
        binding.desOptions1.setText(R.string.od_under_gra_are_option);
        binding.desOptions2.setText(R.string.od_under_gra_bsc);
        binding.facOneCSE.setText(R.string.od_under_gra_cse);
        binding.facOneMath.setText(R.string.od_under_gra_math);
        binding.facOneArch.setText(R.string.od_under_gra_arch);
        binding.facOneEEE.setText(R.string.od_under_gra_eee);
        binding.facOnePhar.setText(R.string.od_under_gra_phar);

        binding.facultyNameTwo.setText(R.string.od_fassl_title);
        binding.facTwoOptions1.setText(R.string.od_under_gra_are_option);
        binding.facTwoOptions2.setText(R.string.od_fassl_title_options);
        binding.facTwoEnglish.setText(R.string.od_fassl_english);
        binding.facTwoSocioLogy.setText(R.string.od_fassl_sociology);
        binding.facTwoLLB.setText(R.string.od_fassl_llb);
        binding.facTwoGraOption1.setText(R.string.od_gra_master_prog_are);
        binding.facTwoMaLLb1.setText(R.string.od_ma_llb_1);
        binding.facTwoMaLLb2.setText(R.string.od_ma_llb_2);
        binding.facTwoMaEngOne.setText(R.string.od_ma_english_1);
        binding.facTwoMaEngTwo.setText(R.string.od_ma_english_2);

        binding.facultyNameThree.setText(R.string.od_FBAE_title);
        binding.facThreeOptions1.setText(R.string.od_under_gra_are_option);
        binding.facThreeBBATitle.setText(R.string.od_BBA_major_in);
        binding.facThreeAccount.setText(R.string.od_bba_account);
        binding.facThreeFinance.setText(R.string.od_bba_finanace);
        binding.facThreeMarket.setText(R.string.od_bba_market);
        binding.facThreeHRM.setText(R.string.od_bba_hrm);
        binding.facThreeBacholerOfEconomics.setText(R.string.od_bba_economics);
        binding.facThreeOptions2.setText(R.string.od_gra_master_prog_are);
        binding.regular.setText(R.string.od_mba_regular);
        binding.excutive.setText(R.string.od_mba_executive);
        binding.bbaHolder.setText(R.string.od_mba_bba_holder);

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