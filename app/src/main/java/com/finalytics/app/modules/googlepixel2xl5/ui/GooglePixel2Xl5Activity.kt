package com.finalytics.app.modules.googlepixel2xl5.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.finalytics.app.R
import com.finalytics.app.appcomponents.base.BaseActivity
import com.finalytics.app.databinding.ActivityGooglePixel2Xl5Binding
import com.finalytics.app.modules.a41.ui.A41Activity
import com.finalytics.app.modules.googlepixel2xl10.ui.GooglePixel2Xl10Activity
import com.finalytics.app.modules.googlepixel2xl14.ui.GooglePixel2Xl14Activity
import com.finalytics.app.modules.googlepixel2xl5.`data`.viewmodel.GooglePixel2Xl5VM
import com.finalytics.app.modules.googlepixel2xl6.ui.GooglePixel2Xl6Activity
import kotlin.String
import kotlin.Unit

public class GooglePixel2Xl5Activity :
    BaseActivity<ActivityGooglePixel2Xl5Binding>(R.layout.activity_google_pixel_2_xl_5) {
  private val viewModel: GooglePixel2Xl5VM by viewModels<GooglePixel2Xl5VM>()

  public override fun setUpClicks(): Unit {
    binding.btnPaytm.setOnClickListener {

      val destIntent = GooglePixel2Xl6Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.image.setOnClickListener {

      val destIntent = A41Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.btnMobikwik.setOnClickListener {

      val destIntent = GooglePixel2Xl14Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.btnPhonepe.setOnClickListener {

      val destIntent = GooglePixel2Xl10Activity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public override fun onInitialized(): Unit {
    binding.googlePixel2Xl5VM = viewModel
  }

  public companion object {
    public const val TAG: String = "GOOGLE_PIXEL2XL5ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GooglePixel2Xl5Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
