package com.akshayteli.kotlinsafeargscustomobject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.navArgs


class EmployeDetailFragment : Fragment() {

    private val args by navArgs<EmployeDetailFragmentArgs>()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_employe_detail, container, false)

        val textView = view.findViewById<TextView>(R.id.textView)

        textView.text = "Name : ${args.employee.name} \n Age: ${args.employee.age} \n Address: ${args.employee.address}"
        return view

    }

}