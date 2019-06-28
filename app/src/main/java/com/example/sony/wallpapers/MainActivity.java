package com.example.sony.wallpapers;

import android.app.WallpaperManager;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    Integer[] myImageArray = {
            R.drawable.f1,
            R.drawable.f2,
            R.drawable.f3,
            R.drawable.f4
    };

    GridView myGridView;
    ImageView myCurrentWallpaper;
    Drawable myDrawable;
    WallpaperManager myWallManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myGridView = findViewById(R.id.myGridView);
        myCurrentWallpaper = findViewById(R.id.myImageView);

        UpdateMyWallpaper();

    }
    private void UpdateMyWallpaper(){
        myWallManager = WallpaperManager.getInstance(getApplicationContext());
        myDrawable = myWallManager.getDrawable();
        myCurrentWallpaper.setImageDrawable(myDrawable);

    }
}
