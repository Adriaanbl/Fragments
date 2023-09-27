package es.abd.videofragment

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import es.abd.fragments.R


class ColorFragment : Fragment() {
    private var backColor: Int = Color.WHITE

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            backColor = it.getInt(ARG_COLOR_KEY)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val mView = inflater.inflate(R.layout.fragment_color, container, false)
        mView.setBackgroundColor(backColor)
        return mView
    }

    companion object {
        const val ARG_COLOR_KEY = "COLOR"
    }
}