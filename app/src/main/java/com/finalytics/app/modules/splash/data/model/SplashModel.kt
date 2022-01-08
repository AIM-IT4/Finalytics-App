package com.finalytics.app.modules.splash.`data`.model

import com.finalytics.app.R
import com.finalytics.app.appcomponents.di.MyApp
import kotlin.String

public data class SplashModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtFinalyticsApp: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_finalytics_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtClickOnGetSt: String? =
      MyApp.getInstance().resources.getString(R.string.msg_click_on_get_st)

)
