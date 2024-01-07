package com.sirketismi.tatilcase

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import com.sirketismi.tatilcase.databinding.FragmentNewNoteBinding
import com.sirketismi.tatilcase.db.AppDataBase
import com.sirketismi.tatilcase.model.User
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class NewNoteFragment : Fragment() {
    lateinit var viewModel: NewNoteViewModel
    lateinit var binding: FragmentNewNoteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNewNoteBinding.inflate(inflater)
        viewModel = ViewModelProvider(this).get(NewNoteViewModel::class.java)

        binding.viewModel = viewModel

        context?.let {
            val dataBase = AppDataBase.getDatabase(it)
            val repository = (dataBase.userDao())

            runBlocking {
                launch {
                    repository.insert(User(1,"Lala","Agayeva"))
                }
            }
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}