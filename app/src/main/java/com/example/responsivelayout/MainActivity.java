package com.example.responsivelayout;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

/**
 * MainActivity - Demonstrates responsive UI layouts in Android
 * 
 * Part 1: LinearLayout with Weights
 * Part 2: ConstraintLayout with Weights
 */
public class MainActivity extends AppCompatActivity {

    private TextView textHeader;
    private TextView textSubheader;
    private TextView textDescription;
    private TextView textInfo;
    private Button buttonChange;
    private Button buttonCancel;
    private int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Load LinearLayout by default (Part 1)
        // To switch to ConstraintLayout (Part 2), uncomment the next line:
        // setContentView(R.layout.activity_main_constraint);
        
        setContentView(R.layout.activity_main_linear);
        
        initializeViews();
        setupButtonListeners();
    }

    /**
     * Initialize all views by finding them by ID
     */
    private void initializeViews() {
        textHeader = findViewById(R.id.text_header);
        textSubheader = findViewById(R.id.text_subheader);
        textDescription = findViewById(R.id.text_description);
        textInfo = findViewById(R.id.text_info);
        buttonChange = findViewById(R.id.button_change);
        buttonCancel = findViewById(R.id.button_cancel);
    }

    /**
     * Set up click listeners for the buttons
     */
    private void setupButtonListeners() {
        // Change button - cycles through layouts or updates text
        buttonChange.setOnClickListener(v -> {
            clickCount++;
            updateTextContent();
        });

        // Cancel button - resets the counter
        buttonCancel.setOnClickListener(v -> {
            clickCount = 0;
            resetTextContent();
        });
    }

    /**
     * Update text content based on click count
     */
    private void updateTextContent() {
        if (textHeader != null) {
            textHeader.setText("Header Updated (" + clickCount + ")");
        }
        if (textSubheader != null) {
            textSubheader.setText("Subheader Clicked: " + clickCount + " times");
        }
    }

    /**
     * Reset text content to original state
     */
    private void resetTextContent() {
        if (textHeader != null) {
            textHeader.setText(R.string.text_header);
        }
        if (textSubheader != null) {
            textSubheader.setText(R.string.text_subheader);
        }
        if (textDescription != null) {
            textDescription.setText(R.string.text_description);
        }
        if (textInfo != null) {
            textInfo.setText(R.string.text_info);
        }
    }
}
