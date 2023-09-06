package com.example.sozlukveritabani

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var kelimelerListe:ArrayList<Kelimeler>
    private lateinit var adapter:KelimelerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val barAdi:androidx.appcompat.widget.Toolbar=findViewById(R.id.toolbar)
        val rv:RecyclerView=findViewById(R.id.rv)

        barAdi.title = "Sozluk"
        setSupportActionBar(barAdi)

        rv.setHasFixedSize(true)
        rv.layoutManager = LinearLayoutManager(this)

        kelimelerListe = ArrayList()
        val k1 = Kelimeler(1,"Dog", "Kopek")
        val k2 = Kelimeler(1,"Fish", "Balik")
        val k3 = Kelimeler(1,"Table", "Masa")

        kelimelerListe.add(k1)
        kelimelerListe.add(k2)
        kelimelerListe.add(k3)

        adapter = DenemeAdapter(this,kelimelerListe)
        rv.adapter = adapter


    }

}