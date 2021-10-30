package com.akshayteli.kotlinsafeargscustomobject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import com.google.android.material.textfield.TextInputEditText


class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_home, container, false)

        val button = view.findViewById<Button>(R.id.button)
        val txtName = view.findViewById<TextInputEditText>(R.id.name)
        val txtAge = view.findViewById<TextInputEditText>(R.id.age)
        val txtAddress = view.findViewById<TextInputEditText>(R.id.address)

        button.setOnClickListener {
            val name = txtName.text.toString()
            val age = txtAge.text.toString()
            val address = txtAddress.text.toString()

            val employee = Employee(name,age,address)

            val action:NavDirections = HomeFragmentDirections.homeToDetail(employee)
            findNavController().navigate(action)

        }

        return view
    }

}

