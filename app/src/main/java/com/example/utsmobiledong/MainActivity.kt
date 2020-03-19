package com.example.utsmobiledong

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val testFakultas = createListFakultas()
        rv_fakultas.layoutManager = LinearLayoutManager(this )
        rv_fakultas.setHasFixedSize(true)
        rv_fakultas.adapter = FakultasAdapter(testFakultas,{itemFakultas : DataFakultas -> itemFakultasCliked(itemFakultas)})
    }

    private fun itemFakultasCliked(itemFakultas : DataFakultas) {
        val showDetailActivityIntent= Intent(this, Detail:: class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, itemFakultas.image)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, itemFakultas.fakultas)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, itemFakultas.deskrip)
        startActivity(showDetailActivityIntent)
    }
    private fun createListFakultas(): List<DataFakultas> {
        val partList = ArrayList<DataFakultas>()
        partList.add(DataFakultas("FAKULTAS ILMU KOMPUTER", R.drawable.logoupnbaru,
            "Fakultas Ilmu Komputer merupakan salah satu dari 7 fakultas di UPN \"Veteran\" Jawa Timur. Yang terdiri dari program studi : \n" +
                "1. Teknik Informatika\n" +
                "2. Sistem Informasi" ))
        partList.add(DataFakultas("FAKULTAS TEKNIK",  R.drawable.logoupnbaru,
            "Fakultas Teknik merupakan salah satu dari 7 fakultas di UPN \"Veteran\" Jawa Timur. Yang terdiri dari program studi : \n" +
                    "1. Teknik Kimia\n" +
                    "2. Teknik Industri\n" +
                    "3. Teknik Sipil\n" +
                    "4. Teknik Lingkungan\n" +
                    "5. Teknik Pangan" ))
        partList.add(DataFakultas("FAKULTAS EKONOMI DAN BISNIS", R.drawable.logoupnbaru,
            "Fakultas Ekonomi Dan Bisnis merupakan salah satu dari 7 fakultas di UPN \"Veteran\" Jawa Timur. Yang terdiri dari program studi : \n" +
                    "1. Ekonomi Pembangunan\n" +
                    "2. Akutansi\n" +
                    "3. Manajemen\n" ))
        partList.add(DataFakultas("FAKULTAS PERTANIAN", R.drawable.logoupnbaru,
            "Fakultas Petanian merupakan salah satu dari 7 fakultas di UPN \"Veteran\" Jawa Timur. Yang terdiri dari program studi : \n" +
                    "1. Agroteknologi\n" +
                    "2. Agribisnis\n" +
                    "\n" ))
        partList.add(DataFakultas("PROFIL MAHASISWA", R.drawable.andro,
            "Nama : Dinda Siti Fatimah\n" +
                    "TTL : Banyu Urip Jaya 4/40 Surabaya\n" +
                    "No Telp : 089678818746\n" +
                    "Email : dindaasf.11@gmail.com\n" +
                    "Url Github : https://github.com/dindaasf/\n" +
                    "Riwayat Pendidikan :\n" +
                    "\t- SD : SDN Dr. Sutomo 4 Surabaya\n" +
                    "\t- SMP : MTs Unggulan Amanatul Ummah, Surabaya\n" +
                    "\t- SMA : MBI Amantul Ummah, Pacet Mojokerto\n" +
                    "Penghargaan yang Diterima :\n" +
                    "\t- Juara II LKTI Unesa 2017 tingkat Nasional"
        ))
        return partList
    }

}