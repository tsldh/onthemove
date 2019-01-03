package com.tsl.onthemove.ui.welcome

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.tsl.onthemove.R
import com.tsl.onthemove.data.models.Location
import kotlinx.android.synthetic.main.fragment_welcome.*

class WelcomeFragment : Fragment() {
    private var mLocationList: MutableList<Location> = mutableListOf<Location>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_welcome, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var num: Int = 4
        time.text = num.toString() + "h"
        plus.setOnClickListener {
            num++
            time.text = num.toString() + "h"
        }
        minus.setOnClickListener {
            num--
            time.text = num.toString() + "h"
        }
        item_recyclerview.layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL, false)
        val mAdapter = WelcomeAdapter(mLocationList)
        mAdapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_LEFT)
        item_recyclerview.adapter = mAdapter
        mLocationList.add(Location(R.drawable.miami, "Miami"))
        mLocationList.add(Location(R.drawable.new_york, "New York"))
        mLocationList.add(Location(R.drawable.chicago, "Chicago"))
        mLocationList.add(Location(R.drawable.san_fran, "San Fransisco"))
        mAdapter.setNewData(mLocationList)
        mAdapter.setOnItemClickListener { adapter, view, position ->
            Navigation.findNavController(view).navigate(WelcomeFragmentDirections.actionWelcomeFragmentToItemDetailFragment2())
        }
    }

}
