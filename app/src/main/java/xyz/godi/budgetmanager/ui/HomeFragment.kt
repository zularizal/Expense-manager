package xyz.godi.budgetmanager.ui

import androidx.annotation.ContentView
import androidx.lifecycle.ViewModelProvider
import dagger.android.support.DaggerFragment
import xyz.godi.budgetmanager.R
import javax.inject.Inject

@ContentView
(R.layout.fragment_home)
class HomeFragment : DaggerFragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

}