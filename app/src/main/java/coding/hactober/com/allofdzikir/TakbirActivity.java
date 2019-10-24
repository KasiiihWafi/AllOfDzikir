package coding.hactober.com.allofdzikir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TakbirActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvMain;
    Button btnTiga;

    int  nilai = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takbir);

        tvMain = findViewById(R.id.tvMain3);
        btnTiga = findViewById(R.id.buttonTiga);
        tvMain.setOnClickListener(this);
        btnTiga.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.buttonTiga:
                nilai = nilai + 1;
                tvMain.setText(String.valueOf(nilai));

                if (nilai == 33){
                    startActivity(new Intent(TakbirActivity.this,ShalatActivity.class));
                    finish();
                }
        }

    }
}
