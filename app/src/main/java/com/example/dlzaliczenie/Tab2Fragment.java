package com.example.dlzaliczenie;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class Tab2Fragment extends Fragment {

    private static final String TAG = "fragment tab1";

    private Button btnSubmit;
    private EditText milageText, fuelText;
    private TextView textMpG;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);

        milageText = (EditText) view.findViewById(R.id.editMilage);
        fuelText = (EditText) view.findViewById(R.id.editFuel);
        textMpG = (TextView) view.findViewById(R.id.textMpG);
        btnSubmit = (Button) view.findViewById(R.id.buttonCount);


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (milageText.getText().toString().isEmpty()
                        || fuelText.getText().toString().isEmpty() ){
                    textMpG.setText(R.string.textMissingInfo);
                } else
                    textMpG.setText(String.valueOf(mpgCount(milageText,fuelText)));
            }
        });

        return view;
    }
    /**
     * Take EditText objects A and B and count their (A/B)*100 value
     *
     * @param fuel  A
     * @param milage  B
     * @return double (A/B)*100
     */
    public double mpgCount (EditText fuel, EditText milage) {
        Double m = Double.valueOf(milage.getText().toString());
        Double f = Double.valueOf(fuel.getText().toString());
        if(m>=0 && f>0)
            return (m/f)*100;
        else
            return 0;
    }
}