package com.example.user.resepmasakanadityarizqi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Resepku> resepList = new ArrayList<>();
    private RecyclerView recyclerView;
    private ResepAdapter mAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.rv_main);

        mAdapter = new ResepAdapter(this,resepList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        preparResepData();

    }

    public void preparResepData(){
        Resepku resepku = new Resepku("Ayam Betutu", R.drawable.ayam,
                "Makanan Daerah", "\nBahan-bahan yang dibutuhkan :\n\n"
                +"\t-1 ekor ayam kampung (bersihkan dan sisihkan jerohannya)\n"
                +"\t- 2 batang serai (memarkan) \n"
                +"\t- 2 lembar daun salam \n"
                +"\t- Daun pisang (secukupnya) \n"
                +"\t- 4 lembar daun jeruk \n"
                +"\t- Minyak goreng (secukupnya untuk menumis bumbu dan ayam) \n"
                +"\t- 15 buah cabai merah besar (buang isi) \n"
                +"\t- 5 cm jahe \n"
                +"\t- 6 cm kunyit \n"
                +"\t- 5 cm lengkuas \n"
                +"\t- 2 batang serai (bakar dulu dan ambil bagian batang yang putih saja) \n"
                +"\t- 100 gram bawang merah \n"
                +"\t- 7 siung bawang putih \n"
                +"\t- 1 sdt ketumbar \n"
                +"\t- 5 butir kemiri \n"
                +"\t- 1/2 sdt merica \n"
                +"\t- Garam (secukupnya, kira-kira 2 sdt) \n"
                +"\t- Gula (secukupnya) \n"
                +"\t- Kaldu ayam bubuk (secukupnya, agar rasa ayam betutu makin gurih) \n" + "Cara Membuat : \n\n"
                +"\t- 1. Tumis semua bumbu yang telah dihaluskan hingga harum dan cukup matang. Angkat bumbu lalu sisihkan sebentar biarkan bumbu cukup hangat atau dingin. \n"
                +"\t- 2. Lumuri daging ayam dengan bumbu yang telah ditumis sampai rata. Agar daging ayam makin sedap dan gurih, kita juga bisa melumurinya memakai perasan air jeruk nipis dan sedikit garam sebelum melumurinya dengan bumbu. \n"
                +"\t- 3. Bungkus daging ayam yang telah dilumuri dengan bumbu pakai daun pisang secukupnya. Tambahkan daun jeruk, daun dalam dan batang serai agar rasa ayam betutu makin sedap. \n"
                +"\t- 4. Jika ingin ayam betutu matang sempurna, setelah dibungkus memakai daun pisang, bungkus lagi dengan aluminium foil. \n"
                +"\t- 5. Kukus ayam di dalam dandang yang telah dipanaskan kira-kira selama 2 jam. \n"
                +"\t- 6. Terakhir, setelah selesai dikukus, panggang ayam betutu ke dalam oven dengan suhu 185 derajat celcius kira-kira selama 30 menit. \n"
                +"\t- 7. Angkat ayam dan sajikan bersama nasi putih, lalapan serta taburan bawang goreng di atasnya. \n");
        resepList.add(resepku);
        resepku = new Resepku("Cumi Saus Padang", R.drawable.cumi,
                "Makanan Lokal", "Bahan-bahan yang dibutuhkan :\n\n"
                +"\t- 500 gram cumi (cuci bersih, buang tintanya) \n"
                +"\t- Tepung maizena (larutkan dengan air, secukupnya) \n"
                +"\t- 1 batang serai (memarkan) \n"
                +"\t- 2 lembar daun jeruk \n"
                +"\t- 3 cm jahe \n"
                +"\t- 1/2 bawang bombay (iris tipis) \n"
                +"\t- Minyak goreng (secukupnya) \n"
                +"\t- 5 siung bawang putih \n"
                +"\t- 7 siung bawang merah \n"
                +"\t- 15 buah cabai rawit \n"
                +"\t- 5 buah cabai merah (buang isi) \n"
                +"\t- 2 sdm saus tiram \n"
                +"\t- 2 sdm saus sambal \n"
                +"\t- Garam (secukupnya) \n"
                +"\t- Gula (secukupnya) \n"
                +"\t- Penyedap rasa (secukupnya) \n" + "cara membuat : \n\n"
                +"\t- 1. Rendam cumi dengan air garam kurang lebih selama 10 menit. Cuci bersih. \n"
                +"\t- 2. Goreng cumi hingga setengah matang atau bagian luarnya cukup kering. \n"
                +"\t- 3. Panaskan minyak lalu tumis bumbu yang telah dihaluskan hingga harum. \n"
                +"\t- 4. Masukkan bawang bombay, batang serai, daun jeruk dan jahe. \n"
                +"\t- 5. Masukkan cumi lalu aduk semua bahan dan biarkan bumbu meresap dengan baik. \n"
                +"\t- 6. Tambahkan sedikit air, saus tiram, saus sambal dan tepung maizena. \n"
                +"\t- 7. Masak cumi hingga mendidih dan matang sempurna. \n"
                +"\t- 8. Koreksi rasa dan segera angkat jika sudah matang. Sajikan. \n");
        resepList.add(resepku);
        resepku = new Resepku("Gulai Kakap", R.drawable.gulai,
                "Makanan Lokal", "Bahan-bahan yang dibutuhkan :\n\n"
                +"\t- 1 ekor ikan kakap \n"
                +"\t- 1 buah jeruk nipis \n"
                +"\t- 1 buah tomat \n"
                +"\t- 4 buah cabe rawit \n"
                +"\t- 1 lembar daun salam \n"
                +"\t- 1 lembar daun jeruk \n"
                +"\t- 300 ml santan cair \n"
                +"\t- 150 ml santan kental \n"
                +"\t- 1 batang serei, digeprek \n"
                +"\t- garam dan gula pasir secukupnya \n"
                +"\t- Kemiri secukupnya \n"
                +"\t- 1 ruas jari kunyit \n"
                +"\t- 1 ruas jari jahe \n"
                +"\t- 1 ruas jari lengkuas \n"
                +"\t- 4 buah cabai merah \n"
                +"\t- 3 buah bawang merah \n"
                +"\t- 4 siung bawang putih \n" + "cara membuat : \n\n"
                +"\t- 1. Bersihkan ikan kakap buang bagian isi perutnya, lalu potong menjadi 4 bagian, cuci hingga bersih, lalu lumuri dengan [perasan jeruk nipis dan juga garam. \n"
                +"\t- 2. Langkah selanjutnya adalah panaskan minyak pada wajan, lalu tumis bahan bumbu halus, lalu aduk-aduk. \n"
                +"\t- 3. Kemudian tambahkan daun salam, daun jeruk dan juga serai, lalu aduk-aduk hingga aroma wangi. \n"
                +"\t- 4. Setelah itu masukan santan cair, aduk-aduk agar santan tidak pecah dan mendidih, kemudian tambahkan garam dan juga gula pasir secukupnya, aduk kembali \n"
                +"\t- 5. Setelah itu masukan ikan kakap, aduk aduk hingga merata dan bumbu meresap dan ikan kakapnya terlihat agak matang, lalu tambahkan cabe rawit dan juga tomat yang sudah di iris.Lalu aduk aduk terus agar santan tidak rusak. \n"
                +"\t- 6. Setelah mendidih dan ikan kakap agak matang, tambahkan santan kental, masak kembali hingga mendidih dan ikan kakapnya matang. \n"
                +"\t- 7. Angkat dan siap disajikan. \n");
        resepList.add(resepku);
        resepku = new Resepku("Nasi Goreng Kambing", R.drawable.nasi,
                "Makanan Lokal", "Bahan-bahan yang dibutuhkan :\n\n"
                +"\t- 250 gram nasi putih \n"
                +"\t- 2 sendok makan minyak untuk menumis \n"
                +"\t- 150 gram daging kambing muda,lalu potong kotak \n"
                +"\t- 3 batang daun bawang, iris halus \n"
                +"\t- 1/2 buah tomat merah, iris \n"
                +"\t- 2 sendok makan kecap manis \n"
                +"\t- 3 siung bawang putih \n"
                +"\t- 5 butir bawang merah \n"
                +"\t- 5 cabai merah keriting \n"
                +"\t- 1 butir kemiri \n"
                +"\t- 1/4 sendok teh merica \n"
                +"\t- 1/2 sendok teh terasi udang,goreng \n"
                +"\t- garam secukupnya \n"
                +"\t- Acar mentimun \n"
                +"\t- Emping goreng \n" + "cara membuat : \n\n"
                +"\t- 1. Haluskan bawang putih, bawang merah, cabai merah dan kemiri. Sisihkan \n"
                +"\t- 2. Cara membuat nasi goreng kambing \n"
                +"\t- 3. Panaskan minyak kemudian tumis bumbu yang sudah dihaluskan hingga harum. \n"
                +"\t- 4. Lanjutkan dengan memasukan tomat , daun bawang, dan juga tambahan daging kambing hingga berubah warna dan empuk kemudian aduk rata \n"
                +"\t- 5. Selanjutnya masukan daging kambing hingga matang, kemudian tambahkan nasi putih dan kecap manis, aduk hingga merata dan angkat \n");
        resepList.add(resepku);
        resepku = new Resepku("Sop Buntut", R.drawable.buntut,
                "Makanan Daerah", "Bahan-bahan yang dibutuhkan :\n\n"
                +"\t- 1 kilogram buntut sapi (potong sesuai keinginan) \n"
                +"\t- 2 liter air \n"
                +"\t- 3 buah kentang, potong kecil/dadu \n"
                +"\t- 2 sendok makan minyak goreng \n"
                +"\t- 4 buah wortel, kupas, potong 1/2 cm \n"
                +"\t- 1 sendok teh merica bubuk \n"
                +"\t- 6 siung bawang putih, memarkan \n"
                +"\t- 1 butir pala, memarkan \n"
                +"\t- gula, secukupnya \n"
                +"\t- 5 buah cengkeh \n"
                +"\t- garam, secukupnya \n"
                +"\t- 1 buah tomat merah, potong-potong (kasar) \n"
                +"\t- 2 cm kayu manis \n"
                +"\t- Bumbu kaldu instant (rasa sapi) \n"
                +"\t- Bawang goreng \n"
                +"\t- 1 batang daun seledri, iris tipis \n"
                +"\t- Sambal \n"
                +"\t- 2 batang daun bawang, iris tipis \n"
                +"\t- Kerupuk \n"
                +"\t- Jeruk nipis \n" + "cara membuat : \n\n"
                +"\t- 1. Langkah pertama yang bisa anda lakukan terlebih dahulu adalah dengan mencuci bersih buntu sapi dalam air yang mengalir kemudian pastikan anda mencucinya hingga bersih. \n"
                +"\t- 2. Setelah selesai, rebus air selama 10-15 menit dan masukkan buntut sapi, buang air rebusannya. \n"
                +"\t- 3. Kemudian siapkan panci mauskan air hingga mendidih dan kembali masukkan buntut, masukkan kayu manis serta cengkeh. \n"
                +"\t- 4. Masak air hingga menyusut kurang lebih hingga ukuran 1.5 liter. Kemudian matikan kompor. \n"
                +"\t- 5. Selagi menunggu dingin, ulek merica, pala, bawang putih dan garam kemudian tumis hingga menjadi harum. \n"
                +"\t- 6. Didihkan kembali buntut sapi, muuskan bumbu tumis kedalamnya aduk hingga rata dan masukan sayurannya hingga matang dan empuk. \n");
                resepList.add(resepku);
        mAdapter.notifyDataSetChanged();

    }
}
