package com.yanrou.dawnisland.trend

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.yanrou.dawnisland.R
import com.yanrou.dawnisland.content.SeriesContentFragment
import kotlinx.android.synthetic.main.fragment_trand.*

class TrendFragment : Fragment() {
    private val viewModel by viewModels<TrendViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val layoutManager = LinearLayoutManager(trend_recycleview!!.context)
        trend_recycleview!!.layoutManager = layoutManager
        val trendAdapter = TrendAdapter(emptyList()) { context, seriesId, forumName ->
            val fragment = SeriesContentFragment.newInstance(seriesId, forumName)
            requireParentFragment().parentFragmentManager
                    .beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(R.id.fragmentContainer, fragment, "series_content")
                    .addToBackStack("series_content")
                    .commit()
        }
        trend_recycleview!!.adapter = trendAdapter
        viewModel.listLiveData.observe(viewLifecycleOwner, Observer {
            trendAdapter.trendItems = it
            trendAdapter.notifyDataSetChanged()
        })
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_trand, container, false)
    }
}