package com.example.tdmprojet

import android.net.wifi.hotspot2.pps.Credential
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import okhttp3.Credentials.basic
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory


const val BASE_URL ="http://192.168.1.109:9200/tj/"
class MainActivity : AppCompatActivity() {
    lateinit var myAdapter: MyAdapter
    lateinit var linearLayoutManager: LinearLayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getMyData()
    }
    private fun getMyData() {
        val retrofitBuilder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(ApiInterface::class.java)
        val retrofitData = retrofitBuilder.getData()

      /*  val headerMap = HashMap<String?, String?>()
        headerMap["Autorization"] = Credential.basic("elastic","a+n0JF1OthAjt=mG4_TPEx")
        var searchString =""
        if(!param.equals("")){
            searchString="$searchString FTexte:$param*"
         }
        if(!type.equals("")){
            searchString="$searchString Texte_FR:$type*"
        }
        if(!organe.equals("")){
            searchString="$searchString Organe_FR:$organe*"
        }
        if(!secteur.equals("")){
            searchString="$searchString FTexte:$secteur*"
        }
        if(!date.equals("")){
            searchString="$searchString FTexte:$date"
        }

        val call =ApiInterface.getData(headerMap, "AND", searchString)*/
        retrofitData.enqueue(object : Callback<List<textJItem>?> {

            override fun onResponse(

                call: Call<List<textJItem>?>,
                response: Response<List<textJItem>?>
            ) {
                val responseBody = response.body()!!
                myAdapter = MyAdapter(baseContext, responseBody)
                myAdapter.notifyDataSetChanged()
                findViewById<RecyclerView>(R.id.Recyclerview_text).adapter = myAdapter

            }

            override fun onFailure(call: Call<List<textJItem>?>, t: Throwable) {
                Log.d("MainActivity", "onFailure:" + t.message)
            }
        })
    }
}