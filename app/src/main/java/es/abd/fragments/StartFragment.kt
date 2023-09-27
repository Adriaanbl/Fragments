package es.abd.videofragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import es.abd.fragments.R

class StartFragment : Fragment(), View.OnClickListener {

    private var mListener: ButtonsFragmentListener? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)

        if (context is ButtonsFragmentListener){
            mListener = context
        }else{
            throw Exception("The activity must implement the interface ButtonsFragmentListener")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.start_fragment, container, false)

        //val btnRed: Button = view.findViewById(R.id.btnRed)
        val btnGreen: Button = view.findViewById(R.id.btnlog)

        //btnRed.setOnClickListener(this)
        btnGreen.setOnClickListener(this)

        return view
    }

    override fun onClick(v: View) {
        when(v.id){
            //R.id.btnRed -> mListener?.onRedButtonClicked()
            R.id.btnlog -> mListener?.onLogButtonClicked()
        }
    }

    override fun onDetach() {
        super.onDetach()
        mListener = null
    }


    interface ButtonsFragmentListener{
        fun onRedButtonClicked()
        fun onLogButtonClicked()

    }
}