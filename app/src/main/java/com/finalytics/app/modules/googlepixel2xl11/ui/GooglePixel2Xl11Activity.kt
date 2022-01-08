package com.finalytics.app.modules.googlepixel2xl11.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.finalytics.app.R
import com.finalytics.app.appcomponents.base.BaseActivity
import com.finalytics.app.databinding.ActivityGooglePixel2Xl11Binding
import com.finalytics.app.modules.googlepixel2xl11.`data`.viewmodel.GooglePixel2Xl11VM
import com.finalytics.app.modules.googlepixel2xl12.ui.GooglePixel2Xl12Activity
import kotlin.String
import kotlin.Unit

public class GooglePixel2Xl11Activity :
    BaseActivity<ActivityGooglePixel2Xl11Binding>(R.layout.activity_google_pixel_2_xl_11) {
  private val viewModel: GooglePixel2Xl11VM by viewModels<GooglePixel2Xl11VM>()

  public override fun setUpClicks(): Unit {
    binding.image.setOnClickListener {

      val destIntent = GooglePixel2Xl12Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.image.setOnClickListener {

      val destIntent = GooglePixel2Xl12Activity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public override fun onInitialized(): Unit {
    binding.googlePixel2Xl11VM = viewModel
  }

  public companion object {
    public const val TAG: String = "GOOGLE_PIXEL2XL11ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GooglePixel2Xl11Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
