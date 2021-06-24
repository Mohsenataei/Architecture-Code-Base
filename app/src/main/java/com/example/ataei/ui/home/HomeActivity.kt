package com.example.ataei.ui.home


import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.ataei.R
import com.example.ataei.databinding.ActivityMainBinding
import com.example.ataei.ui.base.BaseActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : BaseActivity<HomeViewModel, ActivityMainBinding>() {

    override val layoutId: Int = R.layout.activity_main
    override val viewModel: HomeViewModel by getLazyViewModel()

    override fun onViewInitialized(binding: ActivityMainBinding) {
        super.onViewInitialized(binding)


        val navView: BottomNavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment)



        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_articles, R.id.nav_profile
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)


    }
}