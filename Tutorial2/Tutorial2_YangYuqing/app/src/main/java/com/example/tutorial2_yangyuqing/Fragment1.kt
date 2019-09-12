package com.example.tutorial2_yangyuqing


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView








/**
 * A simple [Fragment] subclass.
 */
class Fragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val rootView = inflater.inflate(R.layout.fragment_fragment1, container, false)
        val imageView = rootView.findViewById(R.id.image1) as ImageView
        imageView.setImageResource(R.drawable.meteora)

        return inflater.inflate(R.layout.fragment_fragment1, container, false)
    }


}
