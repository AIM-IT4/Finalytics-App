package com.finalytics.app.modules.googlepixel2xl7.`data`.model

import com.finalytics.app.R
import com.finalytics.app.appcomponents.di.MyApp
import kotlin.String

public data class GooglePixel2Xl7Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtWeakness2: String? = MyApp.getInstance().resources.getString(R.string.lbl_weakness2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDiversification: String? =
      MyApp.getInstance().resources.getString(R.string.msg_diversification)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCashUsageThe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_cash_usage_the)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMore: String? = MyApp.getInstance().resources.getString(R.string.lbl_more)

)
