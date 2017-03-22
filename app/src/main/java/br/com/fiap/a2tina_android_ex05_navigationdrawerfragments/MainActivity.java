package br.com.fiap.a2tina_android_ex05_navigationdrawerfragments;

import android.graphics.Typeface;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    TextView txtMyApp;
    ImageView gif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gif = (ImageView)findViewById(R.id.gif);
        txtMyApp = (TextView)findViewById(R.id.myapp);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/kaushan.ttf");
        txtMyApp.setTypeface(font);

        Glide.with(this)
                .load(R.drawable.gif1) // aqui é teu gif
                .asGif()
                .into(gif);
    }
}
