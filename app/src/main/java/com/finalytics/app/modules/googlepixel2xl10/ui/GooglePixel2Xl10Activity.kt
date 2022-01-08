package com.finalytics.app.modules.googlepixel2xl10.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.finalytics.app.R
import com.finalytics.app.appcomponents.base.BaseActivity
import com.finalytics.app.databinding.ActivityGooglePixel2Xl10Binding
import com.finalytics.app.modules.googlepixel2xl10.`data`.viewmodel.GooglePixel2Xl10VM
import com.finalytics.app.modules.googlepixel2xl11.ui.GooglePixel2Xl11Activity
import kotlin.String
import kotlin.Unit

public class GooglePixel2Xl10Activity :
    BaseActivity<ActivityGooglePixel2Xl10Binding>(R.layout.activity_google_pixel_2_xl_10) {
  private val viewModel: GooglePixel2Xl10VM by viewModels<GooglePixel2Xl10VM>()

  public override fun setUpClicks(): Unit {
    binding.image.setOnClickListener {

              val destIntent = GooglePixel2Xl11Activity.getIntent(this, null)
              startActivity(destIntent)

            }
    binding.image.setOnClickListener {

              val destIntent = GooglePixel2Xl11Activity.getIntent(this, null)
              startActivity(destIntent)

            }
    binding.image.setOnClickListener {

              val destIntent = GooglePixel2Xl11Activity.getIntent(this, null)
              startActivity(destIntent)

            }
  }

  public override fun onInitialized(): Unit {
    binding.googlePixel2Xl10VM = viewModel
  }

  public companion object {
    public const val TAG: String = "GOOGLE_PIXEL2XL10ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GooglePixel2Xl10Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
