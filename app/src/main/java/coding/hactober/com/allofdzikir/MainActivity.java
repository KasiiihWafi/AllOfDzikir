package coding.hactober.com.allofdzikir;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnPagii, btnPetangg, btnHariann, btnShalatt, btnAboutt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPagii = findViewById(R.id.btnPagi);
        btnPetangg = findViewById(R.id.btnPetang);
        btnHariann = findViewById(R.id.btnHarian);
        btnShalatt = findViewById(R.id.btnShalat);
        btnAboutt = findViewById(R.id.btnAbout);

        btnPagii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,PagiActivity.class));
            }
        });

        btnPetangg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,PetangActivity.class));
            }
        });

        btnHariann.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,HarianActivity.class));
            }
        });

        btnShalatt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ShalatActivity.class));
            }
        });

        btnAboutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,AboutActivity.class));
            }
        });

    }
}
