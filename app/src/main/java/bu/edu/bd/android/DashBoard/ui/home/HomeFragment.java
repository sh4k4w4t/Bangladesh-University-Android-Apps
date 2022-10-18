package bu.edu.bd.android.DashBoard.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import bu.edu.bd.android.R;
import bu.edu.bd.android.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {
    private FragmentHomeBinding binding;
    View view;
    ArrayList<HomeItemGridPojo> arrayList;
    RecyclerView recyclerView;
    ImageTitleHomeItemAdapter adapter;
    GridLayoutManager gridLayoutManager;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        view= binding.getRoot();

        aboutSectionList();
        recyclerView= binding.aboutSectionRecycleView;
        recyclerView.setHasFixedSize(true);
        gridLayoutManager = new GridLayoutManager(requireContext().getApplicationContext(), 4);
        gridLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(gridLayoutManager);
        adapter = new ImageTitleHomeItemAdapter(requireContext().getApplicationContext(), arrayList);
        recyclerView.setAdapter(adapter);

        academicSectionList();
        recyclerView= binding.academicInfoRecycleView;
        recyclerView.setHasFixedSize(true);
        gridLayoutManager = new GridLayoutManager(requireContext().getApplicationContext(), 4);
        gridLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(gridLayoutManager);
        adapter = new ImageTitleHomeItemAdapter(requireContext().getApplicationContext(), arrayList);
        recyclerView.setAdapter(adapter);

        admissionSectionList();
        recyclerView= binding.admissionSectionRecycleView;
        recyclerView.setHasFixedSize(true);
        gridLayoutManager = new GridLayoutManager(requireContext().getApplicationContext(), 4);
        gridLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(gridLayoutManager);
        adapter = new ImageTitleHomeItemAdapter(requireContext().getApplicationContext(), arrayList);
        recyclerView.setAdapter(adapter);

        administrationSectionList();
        recyclerView= binding.administrationRecycleView;
        recyclerView.setHasFixedSize(true);
        gridLayoutManager = new GridLayoutManager(requireContext().getApplicationContext(), 4);
        gridLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(gridLayoutManager);
        adapter = new ImageTitleHomeItemAdapter(requireContext().getApplicationContext(), arrayList);
        recyclerView.setAdapter(adapter);

        officeSectionList();
        recyclerView= binding.officeSectionRecycleView;
        recyclerView.setHasFixedSize(true);
        gridLayoutManager = new GridLayoutManager(requireContext().getApplicationContext(), 4);
        gridLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(gridLayoutManager);
        adapter = new ImageTitleHomeItemAdapter(requireContext().getApplicationContext(), arrayList);
        recyclerView.setAdapter(adapter);

        collaborationSectionList();
        binding.collaborationSectionRecycleView.setHasFixedSize(true);
        gridLayoutManager = new GridLayoutManager(requireContext().getApplicationContext(), 4);
        gridLayoutManager.setOrientation(RecyclerView.VERTICAL);
        binding.collaborationSectionRecycleView.setLayoutManager(gridLayoutManager);
        adapter = new ImageTitleHomeItemAdapter(requireContext().getApplicationContext(), arrayList);
        binding.collaborationSectionRecycleView.setAdapter(adapter);

        return view;
    }

    private void aboutSectionList() {
        arrayList = new ArrayList<>();
        arrayList.add(new HomeItemGridPojo(getResources().getString(R.string.info_about_bu), R.drawable.about));
        arrayList.add(new HomeItemGridPojo(getResources().getString(R.string.info_misson_vision), R.drawable.mission));
    }
    private void academicSectionList() {
        arrayList = new ArrayList<>();
        arrayList.add(new HomeItemGridPojo(getResources().getString(R.string.info_offered_degree), R.drawable.offered_degree));
        arrayList.add(new HomeItemGridPojo(getResources().getString(R.string.info_rules_regulation), R.drawable.rules_regualtion));
        arrayList.add(new HomeItemGridPojo(getResources().getString(R.string.info_academic_policies), R.drawable.policies));
    }
    private void administrationSectionList() {
        arrayList = new ArrayList<>();
        arrayList.add(new HomeItemGridPojo(getResources().getString(R.string.info_message_from_founder), R.drawable.message));
        arrayList.add(new HomeItemGridPojo(getResources().getString(R.string.info_board_of_trust), R.drawable.board_of_trust));
        arrayList.add(new HomeItemGridPojo(getResources().getString(R.string.info_vc_office), R.drawable.vc_ofice));
    }
    private void admissionSectionList() {
        arrayList = new ArrayList<>();
        arrayList.add(new HomeItemGridPojo(getResources().getString(R.string.info_admission), R.drawable.addmision));
    }
    private void officeSectionList() {
        arrayList = new ArrayList<>();
        arrayList.add(new HomeItemGridPojo(getResources().getString(R.string.info_registrar_office), R.drawable.registrar));
        arrayList.add(new HomeItemGridPojo(getResources().getString(R.string.info_controller_office), R.drawable.coltroller));
        arrayList.add(new HomeItemGridPojo(getResources().getString(R.string.info_office_of_the_account), R.drawable.account));
        arrayList.add(new HomeItemGridPojo(getResources().getString(R.string.info_library_office), R.drawable.library));
        arrayList.add(new HomeItemGridPojo(getResources().getString(R.string.info_it_office), R.drawable.it));
    }
    private void collaborationSectionList() {
        arrayList = new ArrayList<>();
        arrayList.add(new HomeItemGridPojo(getResources().getString(R.string.info_stamford_university), R.drawable.stamford));
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}