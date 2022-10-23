package com.example.ecommerceapp.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001(B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u001c\u0010\u001f\u001a\u00020\u001c2\n\u0010 \u001a\u00060\u0002R\u00020\u00002\u0006\u0010!\u001a\u00020\u001eH\u0016J\u001c\u0010\"\u001a\u00060\u0002R\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001eH\u0016J\u001a\u0010&\u001a\u00020\u001c2\u0012\u0010\'\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001c0\u001bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001f\u0010\n\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/example/ecommerceapp/adapter/ProductsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/ecommerceapp/adapter/ProductsAdapter$ViewHolder;", "productViewModel", "Lcom/example/ecommerceapp/viewmodel/ProductViewModel;", "(Lcom/example/ecommerceapp/viewmodel/ProductViewModel;)V", "TAG", "", "_binding", "Lcom/example/ecommerceapp/databinding/ItemExploreBinding;", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "Lcom/example/ecommerceapp/data/model/ProductModel;", "kotlin.jvm.PlatformType", "getDiffer", "()Landroidx/recyclerview/widget/AsyncListDiffer;", "differCallBack", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "getDifferCallBack", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "favoriteProducts", "Lcom/example/ecommerceapp/data/model/FavouriteModel;", "getFavoriteProducts", "()Lcom/example/ecommerceapp/data/model/FavouriteModel;", "setFavoriteProducts", "(Lcom/example/ecommerceapp/data/model/FavouriteModel;)V", "onItemClickListener", "Lkotlin/Function1;", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onItemClicked", "listner", "ViewHolder", "app_debug"})
public final class ProductsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.ecommerceapp.adapter.ProductsAdapter.ViewHolder> {
    private final com.example.ecommerceapp.viewmodel.ProductViewModel productViewModel = null;
    private final java.lang.String TAG = "ProductsAdapter";
    private com.example.ecommerceapp.databinding.ItemExploreBinding _binding;
    public com.example.ecommerceapp.data.model.FavouriteModel favoriteProducts;
    @org.jetbrains.annotations.NotNull()
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.ecommerceapp.data.model.ProductModel> differCallBack = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.recyclerview.widget.AsyncListDiffer<com.example.ecommerceapp.data.model.ProductModel> differ = null;
    private kotlin.jvm.functions.Function1<? super com.example.ecommerceapp.data.model.ProductModel, kotlin.Unit> onItemClickListener;
    
    public ProductsAdapter(@org.jetbrains.annotations.NotNull()
    com.example.ecommerceapp.viewmodel.ProductViewModel productViewModel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.ecommerceapp.data.model.FavouriteModel getFavoriteProducts() {
        return null;
    }
    
    public final void setFavoriteProducts(@org.jetbrains.annotations.NotNull()
    com.example.ecommerceapp.data.model.FavouriteModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.ecommerceapp.data.model.ProductModel> getDifferCallBack() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.AsyncListDiffer<com.example.ecommerceapp.data.model.ProductModel> getDiffer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.ecommerceapp.adapter.ProductsAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.ecommerceapp.adapter.ProductsAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void onItemClicked(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.ecommerceapp.data.model.ProductModel, kotlin.Unit> listner) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/ecommerceapp/adapter/ProductsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/ecommerceapp/databinding/ItemExploreBinding;", "(Lcom/example/ecommerceapp/adapter/ProductsAdapter;Lcom/example/ecommerceapp/databinding/ItemExploreBinding;)V", "getBinding", "()Lcom/example/ecommerceapp/databinding/ItemExploreBinding;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.ecommerceapp.databinding.ItemExploreBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.ecommerceapp.databinding.ItemExploreBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.ecommerceapp.databinding.ItemExploreBinding getBinding() {
            return null;
        }
    }
}