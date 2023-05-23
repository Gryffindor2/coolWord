package com.example.myapplication.ui.learning;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentLearningBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class LearningFragment extends Fragment {

    private FragmentLearningBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        LearningViewModel learningViewModel =
                new ViewModelProvider(this).get(LearningViewModel.class);

        binding = FragmentLearningBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        FrameLayout parentPage = root.findViewById(R.id.container);
        ConstraintLayout wdp = root.findViewById(R.id.wordDetailLayout);
        ConstraintLayout wqz2ep = root.findViewById(R.id.wordQuizLayoutZhToEn);
        ConstraintLayout wqe2zp = root.findViewById(R.id.wordQuizLayoutEnToZh);
        FloatingActionButton fab = root.findViewById(R.id.nextFloatingActionButton);
        wqz2ep.setVisibility(View.INVISIBLE);
        wqe2zp.setVisibility(View.INVISIBLE);
        fab.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      wqz2ep.setVisibility(View.VISIBLE);
                                  }
                              }
        );
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}