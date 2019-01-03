package com.tsl.onthemove.ui.itemDetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.chad.library.adapter.base.BaseQuickAdapter
import com.tsl.onthemove.R
import com.tsl.onthemove.data.models.Category
import kotlinx.android.synthetic.main.fragment_item_details.*


class ItemDetailFragment : Fragment() {

    private var mCategoryList: MutableList<Category> = mutableListOf<Category>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_item_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerview.layoutManager = GridLayoutManager(activity, 2)
        val mAdapter = ItemListAdapter(mCategoryList)
        mAdapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_LEFT)
        recyclerview.adapter = mAdapter
        mCategoryList.add(Category(R.drawable.icon_bike, "Biking"))
        mCategoryList.add(Category(R.drawable.icon_boat, "Boating"))
        mCategoryList.add(Category(R.drawable.icon_food, "Food"))
        mCategoryList.add(Category(R.drawable.icon_movie, "Movie"))
        mCategoryList.add(Category(R.drawable.icon_park, "Park"))
        mCategoryList.add(Category(R.drawable.icon_painting, "Painting"))
        mCategoryList.add(Category(R.drawable.icon_shopping, "Shopping"))
        mAdapter.setNewData(mCategoryList)
//        mAdapter.setOnItemClickListener { adapter, view, position ->
//            // we dont need to store all videos to room so just save this video to sharedprefs
//            val item = mDonationList[position]
//            Hawk.put(CURRENT_DONATION, item)
//            Navigation.findNavController(view).navigate(ItemListFragmentDirections.actionItemListFragmentToItemDetailFragment())
//        }
    }
}
