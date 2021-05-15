package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.myapplication.fragmenty.HomeFragment;
import com.example.myapplication.fragmenty.ListFragment;
import com.example.myapplication.fragmenty.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

     private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

          bottomNavigationView = findViewById(R.id.bottom_navigation);
          bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
              @Override
              public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                  FragmentManager manager = getSupportFragmentManager();
                  switch (item.getItemId()){
                      case R.id.navigation_home:
                          manager.beginTransaction().replace(R.id.container_main, HomeFragment.newInstance("", "")).commit();
                          item.setChecked(true);
                          break;
                      case R.id.navigation_list:
                          manager.beginTransaction().replace(R.id.container_main, ListFragment.newInstance("", "")).commit();
                          item.setChecked(true);
                          break;
                      case  R.id.navigation_profile:
                          manager.beginTransaction().replace(R.id.container_main, ProfileFragment.newInstance("", "")).commit();
                          item.setChecked(true);
                          break;
                  }
                  return false;
              }
          });
    }
}