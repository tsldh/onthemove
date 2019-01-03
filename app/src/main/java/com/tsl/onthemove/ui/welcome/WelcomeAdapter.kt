package com.tsl.onthemove.ui.welcome

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.tsl.onthemove.R
import com.tsl.onthemove.data.models.Location

class WelcomeAdapter (data: List<Location>) : BaseQuickAdapter<Location, BaseViewHolder>(R.layout.location_item, data) {

    override fun convert(helper: BaseViewHolder, location: Location) {
        Glide.with(mContext).load(location.image).into(helper.getView<ImageView>(R.id.location_image))
    }
}