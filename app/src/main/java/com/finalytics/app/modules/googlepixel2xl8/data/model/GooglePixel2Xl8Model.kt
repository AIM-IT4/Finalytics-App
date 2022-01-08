package com.finalytics.app.modules.googlepixel2xl8.`data`.model

import com.finalytics.app.R
import com.finalytics.app.appcomponents.di.MyApp
import kotlin.String

public data class GooglePixel2Xl8Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtOppurtunities: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_oppurtunities)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLargerAudience: String? =
      MyApp.getInstance().resources.getString(R.string.msg_larger_audience)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAwarenessPayt: String? =
      MyApp.getInstance().resources.getString(R.string.msg_awareness_payt)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTheNumberOfW: String? =
      MyApp.getInstance().resources.getString(R.string.msg_the_number_of_w)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMore: String? = MyApp.getInstance().resources.getString(R.string.lbl_more)

)
