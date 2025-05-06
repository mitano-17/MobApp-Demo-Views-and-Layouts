package com.mobdeve.s21.ermitano.kate_justine.exercise1;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button purchaseBtn;
    private ImageButton favoriteBtn;
    private boolean favorite = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.purchaseBtn = this.findViewById(R.id.purchaseBtn);
        this.favoriteBtn = this.findViewById(R.id.favoriteBtn);

        this.purchaseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                purchaseBtn.setText("Purchased");
                purchaseBtn.setBackgroundTintList(ColorStateList.valueOf(Color.GRAY));
                purchaseBtn.setTextColor(ColorStateList.valueOf(Color.DKGRAY));
            }
        });

        // Set OnClickListener for the button
        favoriteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (favorite) {
                    favoriteBtn.setImageResource(R.drawable.grey_star);
                    //favoriteBtn.setColorFilter(getResources().getColor(R.color.starInactiveColor));
                    favorite = false;
                }
                else {
                    favoriteBtn.setImageResource(R.drawable.yellow_star);
                    //favoriteBtn.setColorFilter(getResources().getColor(R.color.starActiveColor));
                    favorite = true;
                }
            }
        });
    }
}
