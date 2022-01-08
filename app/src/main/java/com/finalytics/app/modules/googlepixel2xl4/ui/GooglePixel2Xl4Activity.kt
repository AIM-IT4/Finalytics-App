package com.finalytics.app.modules.googlepixel2xl4.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.finalytics.app.R
import com.finalytics.app.appcomponents.base.BaseActivity
import com.finalytics.app.databinding.ActivityGooglePixel2Xl4Binding
import com.finalytics.app.modules.googlepixel2xl3.ui.GooglePixel2Xl3Activity
import com.finalytics.app.modules.googlepixel2xl4.`data`.viewmodel.GooglePixel2Xl4VM
import kotlin.String
import kotlin.Unit

public class GooglePixel2Xl4Activity :
    BaseActivity<ActivityGooglePixel2Xl4Binding>(R.layout.activity_google_pixel_2_xl_4) {
  private val viewModel: GooglePixel2Xl4VM by viewModels<GooglePixel2Xl4VM>()

  public override fun setUpClicks(): Unit {
    binding.image1.setOnClickListener {

                  val destIntent = GooglePixel2Xl3Activity.getIntent(this, null)
                  startActivity(destIntent)

                }
    binding.image1.setOnClickListener {

                  val destIntent = GooglePixel2Xl3Activity.getIntent(this, null)
                  startActivity(destIntent)

                }
    binding.image.setOnClickListener {

                  val destIntent = GooglePixel2Xl3Activity.getIntent(this, null)
                  startActivity(destIntent)

                }
  }

  public override fun onInitialized(): Unit {
    binding.googlePixel2Xl4VM = viewModel
  }

  public companion object {
    public const val TAG: String = "GOOGLE_PIXEL2XL4ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GooglePixel2Xl4Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
