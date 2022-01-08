package com.finalytics.app.modules.googlepixel2xl3.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.finalytics.app.R
import com.finalytics.app.appcomponents.base.BaseActivity
import com.finalytics.app.databinding.ActivityGooglePixel2Xl3Binding
import com.finalytics.app.modules.googlepixel2xl3.`data`.viewmodel.GooglePixel2Xl3VM
import com.finalytics.app.modules.googlepixel2xl4.ui.GooglePixel2Xl4Activity
import com.finalytics.app.modules.googlepixel2xl5.ui.GooglePixel2Xl5Activity
import kotlin.String
import kotlin.Unit

public class GooglePixel2Xl3Activity :
    BaseActivity<ActivityGooglePixel2Xl3Binding>(R.layout.activity_google_pixel_2_xl_3) {
  private val viewModel: GooglePixel2Xl3VM by viewModels<GooglePixel2Xl3VM>()

  public override fun setUpClicks(): Unit {
    binding.image2.setOnClickListener {

                                      val destIntent = GooglePixel2Xl4Activity.getIntent(this, null)
                                      startActivity(destIntent)

                                    }
    binding.image2.setOnClickListener {

                                      val destIntent = GooglePixel2Xl4Activity.getIntent(this, null)
                                      startActivity(destIntent)

                                    }
    binding.image1.setOnClickListener {

                                      val destIntent = GooglePixel2Xl5Activity.getIntent(this, null)
                                      startActivity(destIntent)

                                    }
    binding.image1.setOnClickListener {

                                      val destIntent = GooglePixel2Xl5Activity.getIntent(this, null)
                                      startActivity(destIntent)

                                    }
  }

  public override fun onInitialized(): Unit {
    binding.googlePixel2Xl3VM = viewModel
  }

  public companion object {
    public const val TAG: String = "GOOGLE_PIXEL2XL3ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GooglePixel2Xl3Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
