package com.example.examassignment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FirstFragment extends Fragment {

    private EditText emailEditText, passwordEditText;
    private TextView fragmentTextView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_fragment, container, false);

        emailEditText = view.findViewById(R.id.email);
        passwordEditText = view.findViewById(R.id.password);
        fragmentTextView = view.findViewById(R.id.fragmentTextView);

        Button loginButton = view.findViewById(R.id.loginButton);
        loginButton.setOnClickListener(v -> {
            String email = emailEditText.getText().toString();
            String password = passwordEditText.getText().toString();

            if (getActivity() != null) {
                TextView activityTextView = getActivity().findViewById(R.id.textView);
                if (activityTextView != null) {
                    String loginText = getString(R.string.login_text_format, email, password);
                    activityTextView.setText(loginText);
                }
            }
        });

        return view;
    }

    public void updateTextView(String data) {
        if (fragmentTextView != null) {
            fragmentTextView.setVisibility(View.VISIBLE);
            fragmentTextView.setText(data);
        }
    }
}
