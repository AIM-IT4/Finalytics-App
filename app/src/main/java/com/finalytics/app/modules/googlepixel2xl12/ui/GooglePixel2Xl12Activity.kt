package com.finalytics.app.modules.googlepixel2xl12.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.finalytics.app.R
import com.finalytics.app.appcomponents.base.BaseActivity
import com.finalytics.app.databinding.ActivityGooglePixel2Xl12Binding
import com.finalytics.app.modules.googlepixel2xl12.`data`.viewmodel.GooglePixel2Xl12VM
import com.finalytics.app.modules.googlepixel2xl13.ui.GooglePixel2Xl13Activity
import kotlin.String
import kotlin.Unit

public class GooglePixel2Xl12Activity :
    BaseActivity<ActivityGooglePixel2Xl12Binding>(R.layout.activity_google_pixel_2_xl_12) {
  private val viewModel: GooglePixel2Xl12VM by viewModels<GooglePixel2Xl12VM>()

  public override fun setUpClicks(): Unit {
    binding.image.setOnClickListener {

                  val destIntent = GooglePixel2Xl13Activity.getIntent(this, null)
                  startActivity(destIntent)

                }
    binding.image.setOnClickListener {

                  val destIntent = GooglePixel2Xl13Activity.getIntent(this, null)
                  startActivity(destIntent)

                }
  }

  public override fun onInitialized(): Unit {
    binding.googlePixel2Xl12VM = viewModel
  }

  public companion object {
    public const val TAG: String = "GOOGLE_PIXEL2XL12ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GooglePixel2Xl12Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
