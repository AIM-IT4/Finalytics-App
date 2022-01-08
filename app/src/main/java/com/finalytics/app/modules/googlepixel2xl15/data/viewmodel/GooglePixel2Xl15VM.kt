package com.finalytics.app.modules.googlepixel2xl15.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finalytics.app.modules.googlepixel2xl15.`data`.model.GooglePixel2Xl15Model

public class GooglePixel2Xl15VM : ViewModel() {
  public val googlePixel2Xl15Model: MutableLiveData<GooglePixel2Xl15Model> =
      MutableLiveData(GooglePixel2Xl15Model())
}
