package bu.edu.bd.android.DashBoard.ui.Feculties;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import bu.edu.bd.android.databinding.FragmentFacultiesBinding;

public class FacultiesFragment extends Fragment {
    private FragmentFacultiesBinding binding;

    @SuppressLint("SetTextI18n")
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentFacultiesBinding.inflate(inflater, container, false);

        binding.setDeptTitle.setText("Science, Engineering and Technology");
        binding.aslDeptTitle.setText("Arts, Social Science and Law");
        binding.baeDeptTitle.setText("Business Administration and Economics");

        binding.cse.setText("Computer Science and Engineering");
        binding.math.setText("Mathematics");
        binding.pharmachy.setText("Pharmacy");
        binding.eee.setText("Electrical and Electronics Engineering (EEE)");
        binding.arch.setText("Architecture");

        binding.english.setText("English");
        binding.sociology.setText("Sociology");
        binding.law.setText("Law");

        binding.businessAddministration.setText("Business Administration");
        binding.economics.setText("Economics");



        return binding.getRoot();
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}