package com.finalytics.app.modules.googlepixel2xl11.`data`.model

import com.finalytics.app.R
import com.finalytics.app.appcomponents.di.MyApp
import kotlin.String

public data class GooglePixel2Xl11Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSwotAnalysisO: String? =
      MyApp.getInstance().resources.getString(R.string.msg_swot_analysis_o)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWeakeness: String? = MyApp.getInstance().resources.getString(R.string.lbl_weakeness)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtUpiAppNotA: String? =
      MyApp.getInstance().resources.getString(R.string.msg_upi_app_not_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtYouCanBookTr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_can_book_tr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtNoInterestOn: String? =
      MyApp.getInstance().resources.getString(R.string.msg_no_interest_on)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtContinue: String? = MyApp.getInstance().resources.getString(R.string.lbl_continue)

)
