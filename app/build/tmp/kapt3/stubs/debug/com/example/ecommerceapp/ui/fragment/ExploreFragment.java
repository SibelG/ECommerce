package com.example.ecommerceapp.ui.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u0018H\u0016J\u001a\u0010&\u001a\u00020\u00182\u0006\u0010\'\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/example/ecommerceapp/ui/fragment/ExploreFragment;", "Landroidx/fragment/app/Fragment;", "()V", "TAG", "", "_binding", "Lcom/example/ecommerceapp/databinding/FragmentExploreBinding;", "binding", "getBinding", "()Lcom/example/ecommerceapp/databinding/FragmentExploreBinding;", "brandsAdapter", "Lcom/example/ecommerceapp/adapter/BrandsAdapter;", "categoriesAdapter", "Lcom/example/ecommerceapp/adapter/CategoriesAdapter;", "productsAdapter", "Lcom/example/ecommerceapp/adapter/ProductsAdapter;", "productsViewModel", "Lcom/example/ecommerceapp/viewmodel/ProductViewModel;", "getProductsViewModel", "()Lcom/example/ecommerceapp/viewmodel/ProductViewModel;", "setProductsViewModel", "(Lcom/example/ecommerceapp/viewmodel/ProductViewModel;)V", "recommendedAdapter", "initRecycler", "", "initViewModel", "navigateToDetails", "product", "Lcom/example/ecommerceapp/data/model/ProductModel;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onViewCreated", "view", "app_debug"})
public final class ExploreFragment extends androidx.fragment.app.Fragment {
    private final java.lang.String TAG = "ExploreFragment";
    public com.example.ecommerceapp.viewmodel.ProductViewModel productsViewModel;
    private com.example.ecommerceapp.databinding.FragmentExploreBinding _binding;
    private com.example.ecommerceapp.adapter.CategoriesAdapter categoriesAdapter;
    private com.example.ecommerceapp.adapter.ProductsAdapter productsAdapter;
    private com.example.ecommerceapp.adapter.BrandsAdapter brandsAdapter;
    private com.example.ecommerceapp.adapter.ProductsAdapter recommendedAdapter;
    
    public ExploreFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.ecommerceapp.viewmodel.ProductViewModel getProductsViewModel() {
        return null;
    }
    
    public final void setProductsViewModel(@org.jetbrains.annotations.NotNull()
    com.example.ecommerceapp.viewmodel.ProductViewModel p0) {
    }
    
    private final com.example.ecommerceapp.databinding.FragmentExploreBinding getBinding() {
        return null;
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
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initViewModel() {
    }
    
    private final void initRecycler() {
    }
    
    private final void navigateToDetails(com.example.ecommerceapp.data.model.ProductModel product) {
    }
}