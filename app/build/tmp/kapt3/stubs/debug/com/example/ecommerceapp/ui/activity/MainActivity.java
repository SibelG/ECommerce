package com.example.ecommerceapp.ui.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010%\u001a\u00020&H\u0002J\b\u0010\'\u001a\u00020&H\u0002J\u0012\u0010(\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010*H\u0014J\"\u0010+\u001a\u00020&2\u0006\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010*H\u0016J\b\u00100\u001a\u00020&H\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$\u00a8\u00061"}, d2 = {"Lcom/example/ecommerceapp/ui/activity/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroidx/navigation/NavController$OnDestinationChangedListener;", "()V", "_binding", "Lcom/example/ecommerceapp/databinding/ActivityMainBinding;", "binding", "getBinding", "()Lcom/example/ecommerceapp/databinding/ActivityMainBinding;", "connectionLiveData", "Lcom/example/ecommerceapp/ui/ConnectionLiveData;", "dbRepository", "Lcom/example/ecommerceapp/di/DBRepository;", "getDbRepository", "()Lcom/example/ecommerceapp/di/DBRepository;", "setDbRepository", "(Lcom/example/ecommerceapp/di/DBRepository;)V", "firstCheckInternetConnection", "", "navBottomBar", "Lcom/google/android/material/bottomnavigation/BottomNavigationView;", "navController", "Landroidx/navigation/NavController;", "navHostFragment", "Landroidx/navigation/fragment/NavHostFragment;", "repository", "Lcom/example/ecommerceapp/repository/ProductRepository;", "getRepository", "()Lcom/example/ecommerceapp/repository/ProductRepository;", "setRepository", "(Lcom/example/ecommerceapp/repository/ProductRepository;)V", "viewModel", "Lcom/example/ecommerceapp/viewmodel/ProductViewModel;", "getViewModel", "()Lcom/example/ecommerceapp/viewmodel/ProductViewModel;", "setViewModel", "(Lcom/example/ecommerceapp/viewmodel/ProductViewModel;)V", "checkNetworkConnection", "", "initBottomNavigationView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestinationChanged", "controller", "destination", "Landroidx/navigation/NavDestination;", "arguments", "onPause", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements androidx.navigation.NavController.OnDestinationChangedListener {
    private com.example.ecommerceapp.databinding.ActivityMainBinding _binding;
    private androidx.navigation.fragment.NavHostFragment navHostFragment;
    private com.google.android.material.bottomnavigation.BottomNavigationView navBottomBar;
    private androidx.navigation.NavController navController;
    public com.example.ecommerceapp.viewmodel.ProductViewModel viewModel;
    public com.example.ecommerceapp.repository.ProductRepository repository;
    public com.example.ecommerceapp.di.DBRepository dbRepository;
    private com.example.ecommerceapp.ui.ConnectionLiveData connectionLiveData;
    private boolean firstCheckInternetConnection = true;
    
    public MainActivity() {
        super();
    }
    
    private final com.example.ecommerceapp.databinding.ActivityMainBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.ecommerceapp.viewmodel.ProductViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.example.ecommerceapp.viewmodel.ProductViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.ecommerceapp.repository.ProductRepository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    com.example.ecommerceapp.repository.ProductRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.ecommerceapp.di.DBRepository getDbRepository() {
        return null;
    }
    
    public final void setDbRepository(@org.jetbrains.annotations.NotNull()
    com.example.ecommerceapp.di.DBRepository p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestinationChanged(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController controller, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavDestination destination, @org.jetbrains.annotations.Nullable()
    android.os.Bundle arguments) {
    }
    
    private final void checkNetworkConnection() {
    }
    
    private final void initBottomNavigationView() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
}