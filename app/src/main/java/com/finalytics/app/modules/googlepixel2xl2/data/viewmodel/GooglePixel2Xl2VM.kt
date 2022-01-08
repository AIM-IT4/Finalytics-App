package com.finalytics.app.modules.googlepixel2xl2.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.finalytics.app.modules.googlepixel2xl2.`data`.model.GooglePixel2Xl2Model

public class GooglePixel2Xl2VM : ViewModel() {
  public val googlePixel2Xl2Model: MutableLiveData<GooglePixel2Xl2Model> =
      MutableLiveData(GooglePixel2Xl2Model())
}
