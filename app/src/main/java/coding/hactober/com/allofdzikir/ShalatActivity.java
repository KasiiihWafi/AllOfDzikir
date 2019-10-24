package coding.hactober.com.allofdzikir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageClickListener;
import com.synnapps.carouselview.ImageListener;

public class ShalatActivity extends AppCompatActivity {

    Button btnTasbihh, btnTahmidd, btnTakbirr;

    private int [] mImages = new int[]{
            R.drawable.dzikir, R.drawable.dzikirdua, R.drawable.dzikirtiga
    };

    private String [] mImageTitle = new String[]{
            ".", ".", "."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shalat);

        btnTasbihh = findViewById(R.id.btnTasbih);
        btnTahmidd = findViewById(R.id.btnTahmid);
        btnTakbirr = findViewById(R.id.btnTakbir);

        CarouselView carouselView = findViewById(R.id.carousel);
        carouselView.setPageCount(mImages.length);
        carouselView.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {

                imageView.setImageResource(mImages[position]);

            }
        });

        carouselView.setImageClickListener(new ImageClickListener() {
            @Override
            public void onClick(int position) {

                Toast.makeText(ShalatActivity.this, mImageTitle[position], Toast.LENGTH_SHORT).show();

            }
        });

        btnTasbihh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(ShalatActivity.this,TasbihActivity.class));

            }
        });

        btnTahmidd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(ShalatActivity.this,TahmidActivity.class));

            }
        });

        btnTakbirr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(ShalatActivity.this,TakbirActivity.class));

            }
        });

    }
}
