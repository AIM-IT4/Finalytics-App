package com.finalytics.app.modules.googlepixel2xl14.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.finalytics.app.R
import com.finalytics.app.appcomponents.base.BaseActivity
import com.finalytics.app.databinding.ActivityGooglePixel2Xl14Binding
import com.finalytics.app.modules.googlepixel2xl14.`data`.viewmodel.GooglePixel2Xl14VM
import com.finalytics.app.modules.googlepixel2xl15.ui.GooglePixel2Xl15Activity
import kotlin.String
import kotlin.Unit

public class GooglePixel2Xl14Activity :
    BaseActivity<ActivityGooglePixel2Xl14Binding>(R.layout.activity_google_pixel_2_xl_14) {
  private val viewModel: GooglePixel2Xl14VM by viewModels<GooglePixel2Xl14VM>()

  public override fun setUpClicks(): Unit {
    binding.image.setOnClickListener {

          val destIntent = GooglePixel2Xl15Activity.getIntent(this, null)
          startActivity(destIntent)

        }
    binding.image.setOnClickListener {

          val destIntent = GooglePixel2Xl15Activity.getIntent(this, null)
          startActivity(destIntent)

        }
  }

  public override fun onInitialized(): Unit {
    binding.googlePixel2Xl14VM = viewModel
  }

  public companion object {
    public const val TAG: String = "GOOGLE_PIXEL2XL14ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GooglePixel2Xl14Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
