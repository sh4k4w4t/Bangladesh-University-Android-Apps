package bu.edu.bd.android.DashBoard.ui.More;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import bu.edu.bd.android.MoreFragmentItems.DeveloperInformation.DeveloperInformation;
import bu.edu.bd.android.databinding.FragmentMoreBinding;

public class MoreFragment extends Fragment {
    private FragmentMoreBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentMoreBinding.inflate(inflater, container, false);

        binding.library.setOnClickListener(view -> {
            Toast.makeText(requireActivity(), "Library Section Still Working...", Toast.LENGTH_SHORT).show();
        });
        binding.labFacilities.setOnClickListener(view -> {
            Toast.makeText(requireActivity(), "Lab Facilities Section Still Working...", Toast.LENGTH_SHORT).show();
        });
        binding.research.setOnClickListener(view -> {
            Toast.makeText(requireActivity(), "Research Section Still Working...", Toast.LENGTH_SHORT).show();
        });
        binding.digitalEducation.setOnClickListener(view -> {
            Toast.makeText(requireActivity(), "Digital Education Section Still Working...", Toast.LENGTH_SHORT).show();
        });
        binding.coCurricular.setOnClickListener(view -> {
            Toast.makeText(requireActivity(), "Co-Curricular Section Still Working...", Toast.LENGTH_SHORT).show();
        });
        binding.studentOnlinePortal.setOnClickListener(view -> {
            Toast.makeText(requireActivity(), "Student Online Portal Still Working...", Toast.LENGTH_SHORT).show();
        });
        binding.developerInformation.setOnClickListener(view -> {
            requireActivity().startActivity(new Intent(requireActivity(), DeveloperInformation.class));
        });





        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}