package com.sirketismi.tatilcase

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.sirketismi.tatilcase.databinding.FragmentNotesBinding

class NotesFragment : Fragment() {

    lateinit var binding : FragmentNotesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    fun openNewNotePage() {
        val action = NotesFragmentDirections.actionNotesToNewnote(title = "CRUD", description = "CRUD")
        findNavController().navigate(action)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNotesBinding.inflate(inflater)
        binding.floatingActionButton.setOnClickListener {
            openNewNotePage()
        }
        return binding.root
    }
}