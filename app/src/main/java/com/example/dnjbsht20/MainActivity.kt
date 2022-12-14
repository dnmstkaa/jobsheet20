package com.example.dnjbsht20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dnjbsht20.Kelas

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Kelas>()
    val listNama = arrayOf(
        "ADINDA WIDIA CHOIRUNISA",
        "ANDREAS ADI MINARSO",
        "ANITA SARI",
        "ARDIAN MUHAMMAD IQBAL",
        "BAGAS SAPUTRA",
        "CHELSEA ADITYA SUYATNO",
        "DIMAS ILHAMSYAH",
        "DINA MUSTIKA",
        "DWI RANI SYARIFAH",
        "FIFIT SHOLIKHATUL MUFALAH",
        "FIKA ISMATUL HAWA"
    )

    val listNis = arrayOf(
        "2972",
        "2994",
        "2975",
        "2976",
        "2978",
        "2980",
        "2983",
        "2984",
        "2986",
        "2989",
        "2990"
    )

    lateinit var kelasView: RecyclerView
    lateinit var kelasAdapter: KelasAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kelasView = findViewById(R.id.kelasView)
        kelasView.layoutManager = LinearLayoutManager(this)

        for (i in listNama.indices) {
            list.add(Kelas(listNama[i], listNis[i]))
        }

        kelasAdapter = KelasAdapter(list)
        kelasAdapter.notifyDataSetChanged()
        kelasView.adapter = kelasAdapter
    }
}