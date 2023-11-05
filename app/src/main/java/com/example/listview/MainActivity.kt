package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.listview.adapter.EmailAdapter
import com.example.listview.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //
        val myDataset1 = Datasource().loadSenders()
        val myDataset2 = Datasource().loadTitles()
        val myDataset3 = Datasource().loadContents()
        val myDataset4 = Datasource().loadTime()
        val myDataset5 = Datasource().loadImage()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val adapter = EmailAdapter(
            this,
            myDataset1,
            myDataset2,
            myDataset3,
            myDataset4,
            myDataset5
        )
        recyclerView.adapter = adapter
        recyclerView.setHasFixedSize(true)
    }
}
