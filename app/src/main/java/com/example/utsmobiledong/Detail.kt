package com.example.utsmobiledong

import android.content.Intent
import android.graphics.Paint.UNDERLINE_TEXT_FLAG
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detail.*

class Detail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        val listdaftar = arrayOf(
            "https://if.upnjatim.ac.id/",//0
            "http://sisfo.upnjatim.ac.id/",//1
            "http://tekkimia.upnjatim.ac.id/",//2
            "http://tekindustri.upnjatim.ac.id/",//3
            "http://teksipil.upnjatim.ac.id/",//4
            "http://teklingk.upnjatim.ac.id/",//5
            "http://tekpangan.upnjatim.ac.id/",//6
            "http://ekbang.upnjatim.ac.id/",//7
            "http://akuntansi.upnjatim.ac.id/",//8
            "http://manajemen.upnjatim.ac.id/",//9
            "http://agrotek.upnjatim.ac.id/",//10
            "http://agrotek.upnjatim.ac.id/",//11
            "http://adneg.upnjatim.ac.id/",//12
            "https://adbis.upnjatim.ac.id/",//13
            "http://ilkom.upnjatim.ac.id/",//14
            "http://hubint.upnjatim.ac.id/",//15
            "http://fhukum.upnjatim.ac.id/",//16
            "http://arsitektur.upnjatim.ac.id/",//17
            "http://dkv.upnjatim.ac.id/"//18
        )
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail)

        var intentThatStaredThisActivity = getIntent()

        if (intentThatStaredThisActivity.hasExtra(Intent.EXTRA_TEXT)){
            var gambar = intentThatStaredThisActivity.getIntExtra(Intent.EXTRA_TEXT,0 )
            gmbr.setImageResource(gambar)
            var part_id = intentThatStaredThisActivity.getStringExtra(Intent.EXTRA_TITLE)
            id_Fakultas.text = part_id
            var part2= intentThatStaredThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            id_deskrip.text = part2
            var link = intentThatStaredThisActivity.getStringExtra(Intent.EXTRA_CC)


            if (part_id=="FAKULTAS ILMU KOMPUTER"){

                setTitle(part_id)
                id_Fakultas.setPaintFlags(UNDERLINE_TEXT_FLAG)

                id_Fakultas.setOnClickListener {
                    val showDetailActivityIntent = Intent (this, webView::class.java )
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, link)
                    startActivity(showDetailActivityIntent)
                }
                imageButton.setOnClickListener {

                    val showDetailActivityIntent = Intent(this, webView::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdaftar[1])
                    startActivity(showDetailActivityIntent)
                }
                imageButton2.setOnClickListener {

                    val showDetailActivityIntent = Intent(this, webView::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdaftar[2])
                    startActivity(showDetailActivityIntent)
                }
                imageButton3.visibility = View.GONE
                imageButton4.visibility = View.GONE
                imageButton5.visibility = View.GONE
            }
            if (part_id=="FAKULTAS TEKNIK"){

                setTitle(part_id)
                id_Fakultas.setPaintFlags(UNDERLINE_TEXT_FLAG)

                id_Fakultas.setOnClickListener {
                    val showDetailActivityIntent = Intent (this, webView::class.java )
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, link)
                    startActivity(showDetailActivityIntent)
                }
                imageButton.setOnClickListener {

                    val showDetailActivityIntent = Intent(this, webView::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdaftar[3])
                    startActivity(showDetailActivityIntent)
                }
                imageButton2.setOnClickListener {

                    val showDetailActivityIntent = Intent(this, webView::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdaftar[4])
                    startActivity(showDetailActivityIntent)
                }
                imageButton3.setOnClickListener {

                    val showDetailActivityIntent = Intent(this, webView::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdaftar[5])
                    startActivity(showDetailActivityIntent)
                }
                imageButton4.setOnClickListener {

                    val showDetailActivityIntent = Intent(this, webView::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdaftar[6])
                    startActivity(showDetailActivityIntent)
                }
                imageButton5.setOnClickListener {

                    val showDetailActivityIntent = Intent(this, webView::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdaftar[7])
                    startActivity(showDetailActivityIntent)
                }

            }
            if (part_id=="FAKULTAS EKONOMI DAN BISNIS"){

                setTitle(part_id)
                id_Fakultas.setPaintFlags(UNDERLINE_TEXT_FLAG)

                id_Fakultas.setOnClickListener {
                    val showDetailActivityIntent = Intent (this, webView::class.java )
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, link)
                    startActivity(showDetailActivityIntent)
                }
                imageButton.setOnClickListener {

                    val showDetailActivityIntent = Intent(this, webView::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdaftar[8])
                    startActivity(showDetailActivityIntent)
                }
                imageButton2.setOnClickListener {

                    val showDetailActivityIntent = Intent(this, webView::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdaftar[9])
                    startActivity(showDetailActivityIntent)
                }
                imageButton3.setOnClickListener {

                    val showDetailActivityIntent = Intent(this, webView::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdaftar[10])
                    startActivity(showDetailActivityIntent)
                }

                imageButton4.visibility = View.GONE
                imageButton5.visibility = View.GONE

            }
            if (part_id=="FAKULTAS PERTANIAN"){

                setTitle(part_id)
                id_Fakultas.setPaintFlags(UNDERLINE_TEXT_FLAG)

                id_Fakultas.setOnClickListener {
                    val showDetailActivityIntent = Intent (this, webView::class.java )
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, link)
                    startActivity(showDetailActivityIntent)
                }
                imageButton.setOnClickListener {

                    val showDetailActivityIntent = Intent(this, webView::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdaftar[11])
                    startActivity(showDetailActivityIntent)
                }
                imageButton2.setOnClickListener {

                    val showDetailActivityIntent = Intent(this, webView::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdaftar[12])
                    startActivity(showDetailActivityIntent)
                }
                imageButton3.visibility = View.GONE
                imageButton4.visibility = View.GONE
                imageButton5.visibility = View.GONE

            }
            if (part_id=="FAKULTAS ILMU SOSIAL DAN POLITIK"){

                setTitle(part_id)
                id_Fakultas.setPaintFlags(UNDERLINE_TEXT_FLAG)

                id_Fakultas.setOnClickListener {
                    val showDetailActivityIntent = Intent (this, webView::class.java )
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, link)
                    startActivity(showDetailActivityIntent)
                }
                imageButton.setOnClickListener {

                    val showDetailActivityIntent = Intent(this, webView::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdaftar[13])
                    startActivity(showDetailActivityIntent)
                }
                imageButton2.setOnClickListener {

                    val showDetailActivityIntent = Intent(this, webView::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdaftar[14])
                    startActivity(showDetailActivityIntent)
                }
                imageButton3.setOnClickListener {

                    val showDetailActivityIntent = Intent(this, webView::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdaftar[15])
                    startActivity(showDetailActivityIntent)
                }
                imageButton4.setOnClickListener {

                    val showDetailActivityIntent = Intent(this, webView::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdaftar[16])
                    startActivity(showDetailActivityIntent)
                }

                imageButton5.visibility = View.GONE

            }
            if (part_id=="FAKULTAS HUKUM"){

                setTitle(part_id)
                id_Fakultas.setPaintFlags(UNDERLINE_TEXT_FLAG)

                id_Fakultas.setOnClickListener {
                    val showDetailActivityIntent = Intent (this, webView::class.java )
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, link)
                    startActivity(showDetailActivityIntent)
                }
                imageButton.setOnClickListener {

                    val showDetailActivityIntent = Intent(this, webView::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdaftar[17])
                    startActivity(showDetailActivityIntent)
                }
                imageButton2.visibility = View.GONE
                imageButton3.visibility = View.GONE
                imageButton4.visibility = View.GONE
                imageButton5.visibility = View.GONE

            }
            if (part_id=="FAKULTAS ARSITEKTUR DAN DESAIN"){

                setTitle(part_id)
                id_Fakultas.setPaintFlags(UNDERLINE_TEXT_FLAG)

                id_Fakultas.setOnClickListener {
                    val showDetailActivityIntent = Intent (this, webView::class.java )
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, link)
                    startActivity(showDetailActivityIntent)
                }
                imageButton.setOnClickListener {

                    val showDetailActivityIntent = Intent(this, webView::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdaftar[18])
                    startActivity(showDetailActivityIntent)
                }
                imageButton2.setOnClickListener {

                    val showDetailActivityIntent = Intent(this, webView::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdaftar[19])
                    startActivity(showDetailActivityIntent)
                }
                imageButton3.visibility = View.GONE
                imageButton4.visibility = View.GONE
                imageButton5.visibility = View.GONE

            }
            if (part_id=="PROFIL MAHASISWA") {
                setTitle(part_id)

                imageButton.visibility = View.GONE
                imageButton2.visibility = View.GONE
                imageButton4.visibility = View.GONE
                imageButton3.visibility = View.GONE
                imageButton5.visibility = View.GONE
                id_deskrip.text = link
                id_deskrip.setOnClickListener {
                    val showDetailActivityIntent = Intent(this, webView::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL,link)
                    startActivity(showDetailActivityIntent)
                }
            }
        }
    }
}


