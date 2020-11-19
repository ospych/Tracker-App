package com.example.fitnesstracker.ui.fragments

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.example.fitnessapp.R
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class CancelRunDialog: DialogFragment() {

    private var yesListener: (() -> Unit)? = null

    fun setYesListener(listener: () -> Unit) {
        yesListener = listener
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return MaterialAlertDialogBuilder(requireContext())
                .setTitle("Delete all Runs?")
                .setMessage("You will delete all Runs")
                .setIcon(R.drawable.ic_delete)
                .setPositiveButton("Yes") { _, _ ->
                    yesListener?.let { yes ->
                        yes()
                    }
                }
                .setNegativeButton("No") { dialogInterface, _ ->
                    dialogInterface.cancel()
                }
                .create()
    }
}