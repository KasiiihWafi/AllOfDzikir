package coding.hactober.com.allofdzikir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView arab, artinya, judul;
    String idmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        arab = findViewById(R.id.arab);
        artinya = findViewById(R.id.artinya);
        judul = findViewById(R.id.judul);

        idmenu = getIntent().getStringExtra("KEY_MENU");

        if (idmenu.equals("1")) {
            judul.setText("Dao sebelum makan");
            arab.setText("اَللّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّارِ");
            artinya.setText("Ya Allah, berkahilah kami dalam rezeki yang telah Engkau berikan kepada kami dan peliharalah kami dari siksa api neraka");
        } else if (idmenu.equals("2")) {
            judul.setText("Doa Sesudah Makan");
            arab.setText("اَلْحَمْدُ ِللهِ الَّذِىْ اَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مُسْلِمِيْنَ");
            artinya.setText("Segala puji bagi Allah yang telah memberi makan kami dan minuman kami, serta menjadikan kami sebagai orang-orang islam");
        } else if (idmenu.equals("3")) {
            judul.setText("Doa Sesudah  Minum");
            arab.setText("اَلْحَمْدُ ِللهِ الَّذِىْ جَعَلَهُ عَذْبًا فُرَاتًا بِرَحْمَتِهِ وَلَمْ يَجْعَلْهُ مِلْحًا اُجَاجًا بِذُنُوْبِنَا");
            artinya.setText("Segala puji bagi Allah yang telah menjadikan air ini (minuman) segar dan menggiatkan dengan rahmat-Nya dan tidak menjadikan air ini (minuman) asin lagi pahit karena dosa-dosa kami");
        } else if (idmenu.equals("4")) {
            judul.setText("Doa Ketika Makan Lupa Membaca Doa");
            arab.setText("بِسْمِ اللهِ فِىِ أَوَّلِهِ وَآخِرِهِ");
            artinya.setText("Dengan menyebut nama Allah pada awal dan akhirnya");
        } else if (idmenu.equals("5")) {
            judul.setText("Doa Sebelum Tidur");
            arab.setText("بِسْمِكَ اللّٰهُمَّ اَحْيَا وَاَمُوْتُ");
            artinya.setText("Dengan menyebut nama-Mu ya Allah, aku hidup dan aku mati");
        } else if (idmenu.equals("6")) {
            judul.setText("Doa Ketika Mimpi Buruk");
            arab.setText("اَللّٰهُمَّ إِنّىِ أَعُوْذُ بِكَ مِنْ عَمَلِ الشَّيْطَانِ وَسَيِّئاَتِ اْلأَحْلاَمِ");
            artinya.setText("Ya Allah, sesungguhnya aku mohon perlindungan kepada Engkau dari perbuatan setan dan dari mimpi-mimpi yang buruk");
        } else if (idmenu.equals("7")) {
            judul.setText("Doa Bangun Tidur");
            arab.setText("اَلْحَمْدُ ِللهِ الَّذِىْ اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْرُ");
            artinya.setText("Segala puji bagi Allah yang telah menghidupkan kami sesudah kami mati (membangunkan dari tidur) dan hanya kepada-Nya kami dikembalikan");
        } else if (idmenu.equals("8")) {
            judul.setText("Doa Memakai Baju/Pakaian");
            arab.setText("الْحَمْدُ لِلَّهِ الَّذِيْ كَسَانِيْ هَذَا (الثَّوْبَ) وَرَزَقَنِيْهِ مِنْ غَيْرِ حَوْلٍ مِنِّيْ وَلاَ قُوَّةٍ");
            artinya.setText("“Segala puji bagi Allah yang telah memakaikan kepadaku pakaian ini dan yang telah memberikan rizki pakaian ini kepadaku tanpa ada daya dan kekuatan dariku.” ");
        } else if (idmenu.equals("9")) {
            judul.setText("Do’a Memakai Baju Baru");
            arab.setText("اللَّهُمَّ لَكَ الْحَمْدُ أَنْتَ كَسَوْتَنِيْهِ، أَسْأَلُكَ مِنْ خَيْرِهِ وَخَيْرِ مَا صُنِعَ لَهُ، وَأَعُوْذُ بِكَ مِنْ شَرِّهِ وَشَرِّ مَا صُنِعَ لَهُ");
            artinya.setText("“Ya Allah, segala puji hanya untuk-Mu. Engkau telah memakaikan pakaian ini kepadaku. Aku meminta kepada-Mu akan kebaikannya dan kebaikan yang dibuat untuknya. Dan aku berlindung kepada-Mu dari kejelekannya dan kejelekan yang dibuat untuknya.” ");
        } else if (idmenu.equals("10")) {
            judul.setText("Mendo’akan Orang yang Memakai Baju Baru");
            arab.setText("تُبْلِي وَيُخْلِفُ اللهُ تَعَالَى");
            artinya.setText("Semoga berumur panjang, dipakai sampai usang dan diganti dengan yang lebih baik oleh Allah Ta’ala.”");

        } else if (idmenu.equals("11")) {
            judul.setText("Do’a ketika Melepas Baju");
            arab.setText("بِسْمِ اللهِ");
            artinya.setText("“Dengan nama Allah.”");

        } else if (idmenu.equals("12")) {
            judul.setText("Do’a Masuk WC");
            arab.setText("بِسْمِ اللهِ اللَّهُمَّ إِنِّيْ أَعُوْذُ بِكَ مِنَ الْخُبُثِ وَالْخَبَائِثِ");
            artinya.setText("Dengan nama Allah. Ya Allah, sesungguhnya aku berlindung kepada-Mu dari (gangguan) syaithan laki-laki dan syaithan perempuan.”");

        } else if (idmenu.equals("13")) {
            judul.setText("Do’a Keluar dari WC");
            arab.setText("غُفْرَانَكَِ");
            artinya.setText("“(Aku memohon) ampunan-Mu.” ");

        } else if (idmenu.equals("14")) {
            judul.setText("Dzikir Sebelum Wudhu`");
            arab.setText("بِسْمِ اللهِ");
            artinya.setText("“Dengan nama Allah.” ");

        } else if (idmenu.equals("15")) {
            judul.setText("Dzikir Setelah Selesai Wudhu`");
            arab.setText("أَشْهَدُ أَنْ لاَّ إِلَهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيْكَ لَهُ وَأَشْهَدُ أَنَّ مُحَمَّدًا عَبْدُهُ وَرَسُوْلُهُ");
            artinya.setText("“Aku bersaksi bahwasanya tidak ada tuhan yang berhak diibadahi kecuali Allah satu-satu-Nya, tidak ada sekutu bagi-Nya. Dan aku bersaksi bahwasanya Muhammad adalah hamba dan utusan-Nya.”");

        }

    }

}
