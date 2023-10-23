package com.polije.sisteminformasikaryawan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

            ImageView logoImageView = findViewById(R.id.logoImageView);

            // Load animasi dari file XML
            Animation fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in);
            logoImageView.startAnimation(fadeInAnimation);

            // Navigasi ke halaman berikutnya setelah durasi splash screen selesai
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent mainIntent = new Intent(SplashScreen.this, LoginActivity.class);
                    startActivity(mainIntent);
                    finish();
                }
            }, 5000);
        }

    }
