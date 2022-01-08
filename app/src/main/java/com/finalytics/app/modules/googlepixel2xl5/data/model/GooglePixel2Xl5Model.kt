package com.finalytics.app.modules.googlepixel2xl5.`data`.model

import com.finalytics.app.R
import com.finalytics.app.appcomponents.di.MyApp
import kotlin.String

public data class GooglePixel2Xl5Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtHeySweta: String? = MyApp.getInstance().resources.getString(R.string.lbl_hey_sweta)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtChooseAppToS: String? =
      MyApp.getInstance().resources.getString(R.string.msg_choose_app_to_s)

)
