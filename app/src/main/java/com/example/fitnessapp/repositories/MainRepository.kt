package com.example.fitnessapp.repositories

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import com.example.fitnessapp.database.Run
import com.example.fitnessapp.database.RunDAO
import javax.inject.Inject

class MainRepository @Inject constructor(
        private val runDAO: RunDAO,
) {
    suspend fun insertRun(run: Run) = runDAO.insertRun(run)

    suspend fun deleteRun(run: Run) = runDAO.deleteRun(run)

    fun getAllRunSortedByDate() = runDAO.getAllRunsSortedByDate()
    fun getAllRunSortedByDistance() = runDAO.getAllRunsSortedByDistance()
    fun getAllRunSortedByTimeInMillis() = runDAO.getAllRunsSortedByTimeInMillis()
    fun getAllRunSortedByAvgSpeed() = runDAO.getAllRunsSortedByAvgSpeed()
}