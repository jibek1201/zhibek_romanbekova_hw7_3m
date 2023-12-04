package com.example.zhibek_romanbekova_hw7_3m

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.music_container, MusicFragment()).commit()
        supportFragmentManager.beginTransaction().add(R.id.music_list_container, MusicListFragment()).commit()
    }
}