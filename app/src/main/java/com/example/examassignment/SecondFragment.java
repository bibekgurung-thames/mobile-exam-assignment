package com.example.examassignment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SecondFragment extends Fragment {
    private TextView fragmentTextView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.second_fragment, container, false);

        fragmentTextView = view.findViewById(R.id.fragmentTextView);

        return view;
    }

    public void updateTextView(String data) {
        if (fragmentTextView != null) {
            fragmentTextView.setVisibility(View.VISIBLE);
            fragmentTextView.setText(data);
        }
    }
}

