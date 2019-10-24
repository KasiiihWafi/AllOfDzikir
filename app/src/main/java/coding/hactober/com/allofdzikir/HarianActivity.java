package coding.hactober.com.allofdzikir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class HarianActivity extends AppCompatActivity {

    String [] idmenu = {
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "10",
            "11",
            "12",
            "13",
            "14",
            "15"
    };

    String[] menuItem = {
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""



    };

    String[] menuLagi = {
            "1. Doa Sebelum Makan",
            "2. Doa Sesudah Makan",
            "3. Doa Sesudah  Minum",
            "4. Doa Ketika Makan Lupa Membaca Doa",
            "5. Doa Sebelum Tidur",
            "6. Doa Ketika Mimpi Buruk",
            "7. Doa Bangun Tidur",
            "8. Doa Memakai Baju/Pakaian",
            "9. Doa Memakai baju baru",
            "10. Mendoakan Orang yang Memakai Baju Baju",
            "11. Doa Ketika Melepas Baju",
            "12. Doa masuk WC",
            "13. Doa Keluar WC",
            "14. Dzikir Sebelum Wudu",
            "15. Dzikir Setelah Selesai Whudu"



    };

    TextView arab, artinya;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harian);

        arab = findViewById(R.id.arab);
        artinya = findViewById(R.id.artinya);

        CostumListAdapter adapter = new CostumListAdapter(this, menuItem, menuLagi);
        listView = (ListView) findViewById(R.id.mobileList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(HarianActivity.this, DetailActivity.class)
                        .putExtra("KEY_MENU", idmenu[position]));



            }
        });

    }
}
