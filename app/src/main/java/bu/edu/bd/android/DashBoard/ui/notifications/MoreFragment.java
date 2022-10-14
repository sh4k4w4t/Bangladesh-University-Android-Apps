package bu.edu.bd.android.DashBoard.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import bu.edu.bd.android.databinding.FragmentMoreBinding;

public class MoreFragment extends Fragment {
    private FragmentMoreBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentMoreBinding.inflate(inflater, container, false);






        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}