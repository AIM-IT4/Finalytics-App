package com.finalytics.app.modules.googlepixel2xl18.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finalytics.app.modules.googlepixel2xl18.`data`.model.GooglePixel2Xl18Model

public class GooglePixel2Xl18VM : ViewModel() {
  public val googlePixel2Xl18Model: MutableLiveData<GooglePixel2Xl18Model> =
      MutableLiveData(GooglePixel2Xl18Model())
}
