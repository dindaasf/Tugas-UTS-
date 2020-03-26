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
        showDetailActivityIntent.putExtra(Intent.EXTRA_CC, itemFakultas.url)
        startActivity(showDetailActivityIntent)
    }
    private fun createListFakultas(): List<DataFakultas> {
        val partList = ArrayList<DataFakultas>()
        partList.add(DataFakultas("FAKULTAS ILMU KOMPUTER", R.drawable.fik,
            "Fakultas Ilmu Komputer merupakan salah satu dari 7 fakultas di UPN \"Veteran\" Jawa Timur. Fakultas Ilmu Komputer (FIK) merupakan fakultas yng baru di UPN \"Veteran\" Jatim. 3 tahun lalu FIK masih menjadi satu dengan Fakultas Teknik atau dulu bernama Fakultas Teknik Industri. Untuk tahun ini FIK memiliki 1 Program Studi baru, yaitu Data Science. Berikut adalah Progran Studi Fakultas Ilmu Komputer : \n" +
                "1. Teknik Informatika\n" +
                "2. Sistem Informasi\n" +
                "3. Data Science", "http://fik.upnjatim.ac.id/"  ))
        partList.add(DataFakultas("FAKULTAS TEKNIK",  R.drawable.ft,
            "Fakultas Teknik merupakan salah satu dari 7 fakultas di UPN \"Veteran\" Jawa Timur. Fakultas Teknik dulunya bernama Fakultas Teknik Industri. Dimana dulunya program studi Sistem Informasi dan Teknik Informatika masih bergabung dengan fakultas ini. etelah memecah dan menjadi fakultas baru,FIK,nama FTI ini berubah menjadi Fakultas Teknik. Berikut adalah Progran Studi Fakultas Teknik : \n" +
                    "1. Teknik Kimia\n" +
                    "2. Teknik Industri\n" +
                    "3. Teknik Sipil\n" +
                    "4. Teknik Lingkungan\n" +
                    "5. Teknik Pangan", "http://ft.upnjatim.ac.id/" ))
        partList.add(DataFakultas("FAKULTAS EKONOMI DAN BISNIS", R.drawable.feb,
            "Fakultas Ekonomi Dan Bisnis merupakan salah satu dari 7 fakultas di UPN \"Veteran\" Jawa Timur. Fakultas ini merupakan fakultas tertua di UPN. Sudah ada sejak tahun 1956 bersama sama dengan Fakultas Pertanian. Berikut adalah Program Studi Di Fakultas Ekonomi dan Bisnis : \n" +
                    "1. Ekonomi Pembangunan\n" +
                    "2. Akutansi\n" +
                    "3. Manajemen\n", "http://febis.upnjatim.ac.id/" ))
        partList.add(DataFakultas("FAKULTAS PERTANIAN", R.drawable.fp2,
            "Fakultas Petanian merupakan salah satu dari 7 fakultas di UPN \"Veteran\" Jawa Timur. Fakultas Pertanian merupakan fakultas tertua di UPN bersama dengan Fakultas Ekonomi Dan Bisnis. Fakultas Pertanian merupakan Fakultas andalan UPN dari dulu. Fakultas ini sudah ada sejak awal setelah UPN dibangun. Berikut aalah Program Studi di Fakultas Pertanian : \n" +
                    "1. Agroteknologi\n" +
                    "2. Agribisnis", "http://faperta.upnjatim.ac.id/"))
        partList.add(DataFakultas("FAKULTAS ILMU SOSIAL DAN POLITIK", R.drawable.fisip2,
            "Fakultas Ilmu Sosial dan Politik merupakan salah satu dari 7 fakultas di UPN \"Veteran\" Jawa Timur. Yang terdiri dari program studi :\n" +
                    "1. Administrasi Negara\n" +
                    "2. Administrasi Bisnis\n" +
                    "3. Ilmu Komunikasi\n" +
                    "4. Hubungan Internasional", "https://adbis.upnjatim.ac.id/"))
        partList.add(DataFakultas("FAKULTAS HUKUM", R.drawable.hukum,
            "Fakultas Petanian merupakan salah satu dari 7 fakultas di UPN \"Veteran\" Jawa Timur. Yang terdiri dari program studi : \n" +
                   "1. Fakultas Hukum", "http://fhukum.upnjatim.ac.id/" ))
        partList.add(DataFakultas("FAKULTAS ARSITEKTUR DAN DESAIN", R.drawable.fad,
            "Fakultas Petanian merupakan salah satu dari 7 fakultas di UPN \"Veteran\" Jawa Timur. Yang terdiri dari program studi : \n" +
                    "1. Arsitektur\n" +
                    "2. Desain Komunikasi Visual" , "http://fad.upnjatim.ac.id/"))
        partList.add(DataFakultas("PROFIL MAHASISWA", R.drawable.andro,
            "Nama : Dinda Siti Fatimah\n" +
                    "TTL : Banyu Urip Jaya 4/40 Surabaya\n" +
                    "No Telp : 089678818746\n" +
                    "Email : dindaasf.11@gmail.com\n" +
                    "Riwayat Pendidikan :\n" +
                    "\t- SD : SDN Dr. Sutomo 4 Surabaya\n" +
                    "\t- SMP : MTs Unggulan Amanatul Ummah, Surabaya\n" +
                    "\t- SMA : MBI Amantul Ummah, Pacet Mojokerto\n" +
                    "\t- KULIAH : Sistem Informasi, UPN 'veteran' JATIM\n"+
                    "Penghargaan yang Diterima :\n" +
                    "\t- Juara II LKTI Unesa 2017 tingkat Nasional", "Url Github : https://github.com/dindaasf/"
        ))
        return partList
    }

}