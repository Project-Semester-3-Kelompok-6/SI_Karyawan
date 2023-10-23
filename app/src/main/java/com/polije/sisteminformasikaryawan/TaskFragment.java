package com.polije.sisteminformasikaryawan;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class TaskFragment extends Fragment {
    FloatingActionButton fab;
    private ListView listView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_task, container, false);
        // Inisialisasi ListView
        listView = view.findViewById(R.id.listview_task);

        // Buat data dummy
        String[] dummyData = {
                "Koki Memasak",
                "Marketing Membuat Banner",
                "Koki Menyiapkan Menu Mingguan",
                "Kurir Mengantarkan Barang",
                "Marketing membuat feed instagram",
                "Koki Memasak",
                "Marketing Membuat Banner",
                "Koki Menyiapkan Menu Mingguan",
                "Kurir Mengantarkan Barang",
                "Marketing membuat feed instagram",
                "Koki Memasak",
                "Marketing Membuat Banner",
                "Koki Menyiapkan Menu Mingguan",
                "Kurir Mengantarkan Barang",
                "Marketing membuat feed instagram",
                "Koki Memasak",
                "Marketing Membuat Banner",
                "Koki Menyiapkan Menu Mingguan",
                "Kurir Mengantarkan Barang",
                "Marketing membuat feed instagram",
                "Koki Memasak",
                "Marketing Membuat Banner",
                "Koki Menyiapkan Menu Mingguan",
                "Kurir Mengantarkan Barang",
                "Marketing membuat feed instagram",
                "Koki Memasak",
                "Marketing Membuat Banner",
                "Koki Menyiapkan Menu Mingguan",
                "Kurir Mengantarkan Barang",
                "Marketing membuat feed instagram"
        };

        // Buat adapter dan sambungkan dengan ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, dummyData);
        listView.setAdapter(adapter);

//        fab = view.findViewById(R.id.btn_task_plus);
//
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getActivity(), "You have clicked on the floating button", Toast.LENGTH_SHORT).show();
//            }
//        });
//
        return view;


    }

}