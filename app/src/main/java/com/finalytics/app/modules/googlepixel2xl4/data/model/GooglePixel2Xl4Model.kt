package com.finalytics.app.modules.googlepixel2xl4.`data`.model

import com.finalytics.app.R
import com.finalytics.app.appcomponents.di.MyApp
import kotlin.String

public data class GooglePixel2Xl4Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtForgotPassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPleaseEnterYo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_please_enter_yo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSubmit: String? = MyApp.getInstance().resources.getString(R.string.lbl_submit)

)
