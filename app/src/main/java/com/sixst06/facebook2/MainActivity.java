package com.sixst06.facebook2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.sixst06.facebook2.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private List<Publicacion> publicacionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        publicacionList = new ArrayList<>();
        publicacionList.add(new Publicacion("", "Toby", "10:00", "Smile", "", "20", "0 shares","Like", "Comment", "Share"));
        publicacionList.add(new Publicacion("", "Boby", "01:00", "Still Smiling", "", "2", "5 shares","Like", "Comment", "Share"));
        publicacionList.add(new Publicacion("", "Foby", "03:00", "And still Smiling", "", "5", "15 shares","Like", "Comment", "Share"));
        binding.rclvPublicacion.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.rclvPublicacion.setLayoutManager(layoutManager);
        FacebookAdapter adapter = new FacebookAdapter(publicacionList);
        binding.rclvPublicacion.setAdapter(adapter);

    }
}