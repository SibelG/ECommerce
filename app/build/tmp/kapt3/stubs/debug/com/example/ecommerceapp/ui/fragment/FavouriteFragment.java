package com.example.ecommerceapp.ui.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u0018\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J&\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010!\u001a\u00020\u0013H\u0016J\b\u0010\"\u001a\u00020\u0013H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006#"}, d2 = {"Lcom/example/ecommerceapp/ui/fragment/FavouriteFragment;", "Landroidx/fragment/app/Fragment;", "()V", "TAG", "", "_binding", "Lcom/example/ecommerceapp/databinding/FragmentFavouriteBinding;", "binding", "getBinding", "()Lcom/example/ecommerceapp/databinding/FragmentFavouriteBinding;", "favouritesAdapter", "Lcom/example/ecommerceapp/adapter/FavouritesAdapter;", "productsViewModel", "Lcom/example/ecommerceapp/viewmodel/ProductViewModel;", "getProductsViewModel", "()Lcom/example/ecommerceapp/viewmodel/ProductViewModel;", "setProductsViewModel", "(Lcom/example/ecommerceapp/viewmodel/ProductViewModel;)V", "initViewModel", "", "loadFavourites", "navigateToDetails", "product", "Lcom/example/ecommerceapp/data/model/FavouriteModel;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onResume", "app_debug"})
public final class FavouriteFragment extends androidx.fragment.app.Fragment {
    private final java.lang.String TAG = "ExploreFragment";
    public com.example.ecommerceapp.viewmodel.ProductViewModel productsViewModel;
    private com.example.ecommerceapp.databinding.FragmentFavouriteBinding _binding;
    private com.example.ecommerceapp.adapter.FavouritesAdapter favouritesAdapter;
    
    public FavouriteFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.ecommerceapp.viewmodel.ProductViewModel getProductsViewModel() {
        return null;
    }
    
    public final void setProductsViewModel(@org.jetbrains.annotations.NotNull()
    com.example.ecommerceapp.viewmodel.ProductViewModel p0) {
    }
    
    private final com.example.ecommerceapp.databinding.FragmentFavouriteBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void initViewModel() {
    }
    
    private final void loadFavourites() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void navigateToDetails(com.example.ecommerceapp.data.model.FavouriteModel product) {
    }
}