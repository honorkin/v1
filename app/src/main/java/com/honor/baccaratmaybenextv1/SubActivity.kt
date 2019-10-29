package com.honor.baccaratmaybenextv1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.InterstitialAd
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_sub.*

class SubActivity : AppCompatActivity() {

    private lateinit var mInterstitialAd: InterstitialAd

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        MobileAds.initialize(this,
            "ca-app-pub-4127534236390064~4647243710")
        mInterstitialAd = InterstitialAd(this)
        mInterstitialAd.adUnitId = "ca-app-pub-4127534236390064/4727134762"
        mInterstitialAd.loadAd(AdRequest.Builder().build())


        btn2.setOnClickListener {



            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
            }
        }

    }
}