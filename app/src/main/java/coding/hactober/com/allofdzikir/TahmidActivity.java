package coding.hactober.com.allofdzikir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TahmidActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvMain;
    Button btnDua;

    int nilai = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tahmid);

        tvMain = findViewById(R.id.tvMain2);
        btnDua = findViewById(R.id.buttonDua);
        tvMain.setOnClickListener(this);
        btnDua.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.buttonDua:
                nilai = nilai + 1;
                tvMain.setText(String.valueOf(nilai));

                if (nilai == 33){
                    startActivity(new Intent(TahmidActivity.this,ShalatActivity.class));
                    finish();
                }
        }

    }
}
