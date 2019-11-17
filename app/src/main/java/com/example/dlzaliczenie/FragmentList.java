package com.example.dlzaliczenie;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

public class FragmentList extends ListFragment {

    Vehicle [] vehicles_db = {new Vehicle("Dacia"), new Vehicle(), new Vehicle("BMW"), new Vehicle("Renault")};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.vehicle_list_fragment,container,false);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ArrayAdapter<Vehicle> adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1,vehicles_db);

        setListAdapter(adapter);
    }
}
