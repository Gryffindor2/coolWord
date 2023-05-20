package com.example.myapplication.ui.learning;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LearningViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public LearningViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is learning fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}