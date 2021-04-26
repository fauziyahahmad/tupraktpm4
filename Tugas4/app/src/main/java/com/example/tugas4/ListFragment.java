package com.example.tugas4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class ListFragment extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<DramaModel> listDrama = new ArrayList<>();

    public ListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recview);
        recyclerView.setHasFixedSize(true);
        listDrama.addAll(DramaData.getListData());

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        DramaAdapter dramaAdapter = new DramaAdapter(DramaData.getListData(), getContext());
        dramaAdapter.setDramaModels(listDrama);
        recyclerView.setAdapter(dramaAdapter);
    }
}