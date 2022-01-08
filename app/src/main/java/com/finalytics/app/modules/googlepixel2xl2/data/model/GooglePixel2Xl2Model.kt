package com.finalytics.app.modules.googlepixel2xl2.`data`.model

import com.finalytics.app.R
import com.finalytics.app.appcomponents.di.MyApp
import kotlin.String

public data class GooglePixel2Xl2Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtRegister: String? = MyApp.getInstance().resources.getString(R.string.lbl_register)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAlreadyRegiste: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_registe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSignIn: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etEnterNameValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etEnterEmailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etEnterPasswordValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etConfirmPassworValue: String? = null
)
