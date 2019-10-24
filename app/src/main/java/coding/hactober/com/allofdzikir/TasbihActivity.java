package coding.hactober.com.allofdzikir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TasbihActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvMain;
    Button btnSatu;

    int nilai = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasbih);

        tvMain = findViewById(R.id.tvMain1);
        btnSatu = findViewById(R.id.buttonSatu);
        tvMain.setOnClickListener(this);
        btnSatu.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.buttonSatu:
                nilai = nilai + 1;
                tvMain.setText(String.valueOf(nilai));

                if (nilai == 33){
                    startActivity(new Intent(TasbihActivity.this,ShalatActivity.class));
                    finish();
                }
        }

    }
}
