package com.finalytics.app.modules.googlepixel2xl15.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.finalytics.app.R
import com.finalytics.app.appcomponents.base.BaseActivity
import com.finalytics.app.databinding.ActivityGooglePixel2Xl15Binding
import com.finalytics.app.modules.googlepixel2xl15.`data`.viewmodel.GooglePixel2Xl15VM
import com.finalytics.app.modules.googlepixel2xl16.ui.GooglePixel2Xl16Activity
import kotlin.String
import kotlin.Unit

public class GooglePixel2Xl15Activity :
    BaseActivity<ActivityGooglePixel2Xl15Binding>(R.layout.activity_google_pixel_2_xl_15) {
  private val viewModel: GooglePixel2Xl15VM by viewModels<GooglePixel2Xl15VM>()

  public override fun setUpClicks(): Unit {
    binding.image1.setOnClickListener {

              val destIntent = GooglePixel2Xl16Activity.getIntent(this, null)
              startActivity(destIntent)

            }
    binding.image1.setOnClickListener {

              val destIntent = GooglePixel2Xl16Activity.getIntent(this, null)
              startActivity(destIntent)

            }
    binding.image1.setOnClickListener {

              val destIntent = GooglePixel2Xl16Activity.getIntent(this, null)
              startActivity(destIntent)

            }
  }

  public override fun onInitialized(): Unit {
    binding.googlePixel2Xl15VM = viewModel
  }

  public companion object {
    public const val TAG: String = "GOOGLE_PIXEL2XL15ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GooglePixel2Xl15Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
