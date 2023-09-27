package es.abd.fragments

import android.content.res.Configuration.ORIENTATION_PORTRAIT
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import es.abd.videofragment.MenuFragment
import es.abd.videofragment.GenderFragment

class MainActivity : AppCompatActivity(), MenuFragment.ButtonsFragmentListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onMANButtonClicked() {
        val myBundle = bundleOf(GenderFragment.ARG_COLOR_KEY to Color.RED)
        if (resources.configuration.orientation == ORIENTATION_PORTRAIT) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                    replace<GenderFragment>(R.id.buttonsFragmentContainer, args = myBundle)
                addToBackStack(null)
            }
        }else{
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                    replace<GenderFragment>(R.id.colorFragmentContainer, args = myBundle)
                addToBackStack(null)
            }
        }
    }

    override fun onWOMANButtonClicked() {
        val myBundle = bundleOf(GenderFragment.ARG_COLOR_KEY to Color.GREEN)
        if (resources.configuration.orientation == ORIENTATION_PORTRAIT) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                replace<GenderFragment>(R.id.buttonsFragmentContainer, args = myBundle)
                addToBackStack(null)
            }
        }else{
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                replace<GenderFragment>(R.id.colorFragmentContainer, args = myBundle)
                addToBackStack(null)
            }
        }
    }
}