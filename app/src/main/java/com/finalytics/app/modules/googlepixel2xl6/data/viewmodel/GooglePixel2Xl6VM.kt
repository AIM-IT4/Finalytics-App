package com.finalytics.app.modules.googlepixel2xl6.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finalytics.app.modules.googlepixel2xl6.`data`.model.GooglePixel2Xl6Model

public class GooglePixel2Xl6VM : ViewModel() {
  public val googlePixel2Xl6Model: MutableLiveData<GooglePixel2Xl6Model> =
      MutableLiveData(GooglePixel2Xl6Model())
}
