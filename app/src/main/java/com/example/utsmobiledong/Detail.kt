package com.example.utsmobiledong

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detail.*

class Detail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
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
        }
    }
}