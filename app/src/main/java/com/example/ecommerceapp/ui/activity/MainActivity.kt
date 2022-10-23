package com.example.ecommerceapp.ui.activity

import android.os.Build
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import androidx.room.Database
import com.example.ecommerceapp.R
import com.example.ecommerceapp.databinding.ActivityMainBinding
import com.example.ecommerceapp.di.DBModule
import com.example.ecommerceapp.di.DBRepository
import com.example.ecommerceapp.repository.ProductRepository
import com.example.ecommerceapp.ui.ConnectionLiveData
import com.example.ecommerceapp.viewmodel.ProductViewModel
import com.example.ecommerceapp.viewmodel.ViewModelProductProvider
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(), NavController.OnDestinationChangedListener {

    //Binding
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding

    //BottomBar
    private lateinit var navHostFragment: NavHostFragment
    private lateinit var navBottomBar: BottomNavigationView
    private lateinit var navController: NavController

    //ViewModel
    lateinit var viewModel: ProductViewModel
    lateinit var repository: ProductRepository
    lateinit var dbRepository : DBRepository
    private lateinit var connectionLiveData : ConnectionLiveData
    private var firstCheckInternetConnection = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        //init NavBar & Setting it up
        initBottomNavigationView()
        checkNetworkConnection()

        //init ViewModel
        repository = ProductRepository()
        dbRepository= DBRepository(DBModule.provideAppDatabase(this))
        viewModel = ViewModelProvider(
            this,
            ViewModelProductProvider(repository,dbRepository)
        ).get(ProductViewModel::class.java)


    }

    override fun onDestinationChanged(
        controller: NavController,
        destination: NavDestination,
        arguments: Bundle?
    ) {

        when (destination.id) {
            R.id.exploreFragment -> {
                binding!!.editTextSearch.visibility = View.VISIBLE
                binding!!.cameraImageButton.visibility = View.VISIBLE
                binding!!.navBottom.visibility = View.VISIBLE
            }

            R.id.cartFragment, R.id.accountFragment, R.id.cardsFragment, R.id.addressFragment -> {
                binding!!.editTextSearch.visibility = View.GONE
                binding!!.cameraImageButton.visibility = View.GONE
                binding!!.navBottom.visibility = View.VISIBLE
            }

            else -> {
                binding!!.editTextSearch.visibility = View.GONE
                binding!!.cameraImageButton.visibility = View.GONE
                binding!!.navBottom.visibility = View.GONE
            }
        }



    }

    private fun checkNetworkConnection() {
        connectionLiveData = ConnectionLiveData(application)

        connectionLiveData.observe(this) { isConnected ->

            if (isConnected) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    Snackbar.make(
                        binding!!.parentLayout,
                        "Back online",
                        Snackbar.LENGTH_SHORT
                    )
                        .setBackgroundTint(getColor(R.color.green))
                        .show()
                }
            } else if (!isConnected) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    Snackbar.make(
                        binding!!.parentLayout,
                        "Connection lost",
                        Snackbar.LENGTH_SHORT
                    )
                        .setBackgroundTint(getColor(R.color.red))
                        .show()
                }
            }
            firstCheckInternetConnection = false
        }
    }
    private fun initBottomNavigationView() {
        navBottomBar = binding!!.navBottom
        navHostFragment =
            supportFragmentManager.findFragmentById(R.id.main_nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
        navBottomBar.setupWithNavController(navHostFragment.findNavController())
        navController.addOnDestinationChangedListener(this)
        navBottomBar.itemIconTintList = null
    }

    override fun onPause() {
        super.onPause()
        firstCheckInternetConnection = false
    }
}