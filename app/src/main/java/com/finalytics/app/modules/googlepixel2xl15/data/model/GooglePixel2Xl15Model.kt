package com.finalytics.app.modules.googlepixel2xl15.`data`.model

import com.finalytics.app.R
import com.finalytics.app.appcomponents.di.MyApp
import kotlin.String

public data class GooglePixel2Xl15Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSwotAnalysisO: String? =
      MyApp.getInstance().resources.getString(R.string.msg_swot_analysis_o)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWeakness: String? = MyApp.getInstance().resources.getString(R.string.lbl_weakness)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPrivacyIsAnI: String? =
      MyApp.getInstance().resources.getString(R.string.msg_privacy_is_an_i)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTransactionTim: String? =
      MyApp.getInstance().resources.getString(R.string.msg_transaction_tim)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtNotInAwarenes: String? =
      MyApp.getInstance().resources.getString(R.string.msg_not_in_awarenes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTrustIssuesRe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_trust_issues_re)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtContinue: String? = MyApp.getInstance().resources.getString(R.string.lbl_continue)

)
