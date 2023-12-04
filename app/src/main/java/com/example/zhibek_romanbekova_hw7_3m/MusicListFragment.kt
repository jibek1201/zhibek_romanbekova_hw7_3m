package com.example.zhibek_romanbekova_hw7_3m

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.zhibek_romanbekova_hw7_3m.databinding.FragmentMusicListBinding

class MusicListFragment : Fragment() {
    private lateinit var binding: FragmentMusicListBinding
    private val musicList = arrayListOf(
        MusicModel("1", "Applause", "Lady Gaga", "3:22"),
        MusicModel("2", "Art Deco", "Lana Del Ray", "5:36"),
        MusicModel("3", "Moth To A Flame", "The Weekend", "4:51"),
        MusicModel("4", "The Hills", "The Weekend", "3:41"),
        MusicModel("5", "Smack That", "Eminem", "3:06"),
        MusicModel("6", "Shameless", "Camilla Cabello", "2:40"),
        MusicModel("7", "All For Us", "Zendaya", "4:19"),
        MusicModel("8", "NDA", "Billy Eilish", "2:28"),
        MusicModel("9", "People You Know", "Selena Gomez", "3:06"),
        MusicModel("10", "Uptown Funk", "Bruno Mars", "3:22"),
        MusicModel("11", "Escapism", "Unanium", "3:11"),
        MusicModel("12", "Another Love", "Tom Odell", "3:04"),
        MusicModel("13", "Superman", "Eminem", "3:22"),
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMusicListBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val musicAdapter = MusicAdapter(musicList,this::onClick)
        binding.rvMusicList.adapter = musicAdapter
    }

    fun onClick(pos:Int){
        val intent = Intent(activity, SecondActivity::class.java)
        intent.putExtra("key",pos)
        startActivity(intent)
    }
}