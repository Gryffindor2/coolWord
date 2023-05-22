package com.example.myapplication.ui.learning;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

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
        ConstraintLayout wqp = root.findViewById(R.id.wordQuizLayout);
        FloatingActionButton fab = root.findViewById(R.id.nextFloatingActionButton);
        wdp.setVisibility(View.INVISIBLE);
        fab.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      wqp.setVisibility(View.VISIBLE);
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