package com.example.tutorial3_yangyuqing

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*



/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [myFragment1.OnFragmentInteractionListener] interface
 * to handle interaction events.
 */
class myFragment1 : Fragment() {
    private var listener: OnFragmentInteractionListener? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_my_fragment1, container, false)
        val but_buttonInFragment = view.findViewById<Button>(R.id.button_in_fragment)

        var myInputEditText = view.findViewById(R.id.myEditText) as EditText
        var userInputWords = myInputEditText.text

        but_buttonInFragment.setOnClickListener{
            onButtonPressed(Uri.parse(userInputWords.toString()))
            Log.i("From myFragment1: ", "inside setOnCLickListener: Input word is :" + userInputWords.toString() +".")
            //onButtonPressed(Uri.parse("This Toast Message is from Fragment 3"))
        }

        return view
    }


    // TODO: Rename method, update argument and hook method into UI event
    fun onButtonPressed(uri: Uri) {
        listener?.onFragmentInteraction(uri)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnFragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + " must implement OnFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     *
     *
     * See the Android Training lesson [Communicating with Other Fragments]
     * (http://developer.android.com/training/basics/fragments/communicating.html)
     * for more information.
     */
    interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        fun onFragmentInteraction(uri: Uri)
    }

}
