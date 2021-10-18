package com.example.recylerview
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val biodataList = listOf<Biodata>(
            Biodata(
                R.drawable.foto2,
                nameBiodata = "Zayn Malik",
                descBiodata = "Zayn Malik - Ex member ONE DIRECTION\n" +
                        "Nama : Zayn Javvad Malik\n" +
                        "Tempat tanggal lahir : 12 Januari 1993\n" +
                        "Pekerjaan : Penyanyi dan penulis lagu\n" +
                        "Tahun aktif : 2010-Sekarang\n" +
                        "\n" +
                        "Genre : RnB, Alternative RnB, electropop\n" +
                        "Instrumen : Vokal\n" +
                        "Artis terkait : One Direction\n" +
                        "Label : Syco-Columbia-RCA\n"
            ),

            Biodata
                (
                R.drawable.foto1,
                nameBiodata = "Johnny Orlando",
                descBiodata = "Johnny Orlando\n" +
                        "Nama : John Vincent Orlando\n" +
                        "Tempat tanggal lahir : 24 Januari 2003\n" +
                        "Pekerjaan : Penyanyi \n" +
                        "Tahun aktif : 2011-Sekarang\n" +
                        "\n" +
                        "Genre : Pop, teen pop, dance pop\n" +
                        "Instrumen : Vokal, guitar, piano, tuba, drum\n" +
                        "Artis terkait : -\n" +
                        "Label : Universal Studio Music Canada\n"
            ),

            Biodata(
                R.drawable.foto5,
                nameBiodata = "Jaehyun",
                descBiodata = "Jaehyun - NCT\n" +
                        "Nama : Jeong Jae-hyun\n" +
                        "Tempat tanggal lahir : 14 Februari 1997\n" +
                        "Pekerjaan : Aktor, Vokalist, visual\n" +
                        "Tahun aktif : 2013-Sekarang\n" +
                        "\n" +
                        "Genre : KPOP dan RnB\n" +
                        "Instrumen : Vokal\n" +
                        "Artis terkait : NCT, NCT U, NCT 127, SM Rookies, SMTOWN\n" +
                        "Label : SM\n"
            ),

            Biodata(
                R.drawable.foto6,
                nameBiodata = "Renjun",
                descBiodata = "Renjun - NCT\n" +
                        "Nama : Huang Renjun/Hwang In Jun\n" +
                        "Tempat tanggal lahir : 23 Maret 2000\n" +
                        "Pekerjaan : Vokalist\n" +
                        "Tahun aktif : 2016-Sekarang\n" +
                        "\n" +
                        "Genre : KPOP dan RnB\n" +
                        "Instrumen : Vokal\n" +
                        "Artis terkait : NCT, NCT U, NCT Dream\n" +
                        "Label : SM\n"
            ),

            Biodata(
                R.drawable.foto3,
                nameBiodata = "Jisung",
                descBiodata = "Jisung - NCT\n" +
                        "Nama : Park Jisung\n" +
                        "Tempat tanggal lahir : 5 Februari 2002\n" +
                        "Pekerjaan : Vokalist\n" +
                        "Tahun aktif : 2016-Sekarang\n" +
                        "\n" +
                        "Genre : KPOP dan RnB\n" +
                        "Instrumen : Vokal, main dancer\n" +
                        "Artis terkait : NCT, NCT U, NCT Dream\n" +
                        "Label : SM\n"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_biodata)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = BiodataAdapter(this, biodataList){
            val intent = Intent(this, DetailBiodataActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}