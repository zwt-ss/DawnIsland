package com.yanrou.dawnisland.span

import android.text.TextPaint
import android.text.style.ClickableSpan
import android.view.View
import com.yanrou.dawnisland.util.ReferenceHandler

class ReferenceClickableSpan(val seriesId: String, val listener: ReferenceHandler) : ClickableSpan() {
    private val end = 0
    override fun onClick(widget: View) = listener(seriesId)
    override fun updateDrawState(ds: TextPaint) {}
}