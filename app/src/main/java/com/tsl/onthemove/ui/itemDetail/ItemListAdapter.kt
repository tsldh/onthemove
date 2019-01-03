package com.tsl.onthemove.ui.itemDetail

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.tsl.onthemove.R
import com.tsl.onthemove.data.models.Category
import com.tsl.onthemove.data.models.DonationItem
import com.tsl.onthemove.utils.Utils

class ItemListAdapter(data: List<Category>) : BaseQuickAdapter<Category, BaseViewHolder>(R.layout.category_item, data) {

    override fun convert(helper: BaseViewHolder, category: Category) {
        Glide.with(mContext).asBitmap().load(category.image).into(helper.getView<ImageView>(R.id.category_image))
    }
}