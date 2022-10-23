package com.example.ecommerceapp.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\"#$B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0018H\u0016J\u0018\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0018H\u0016J\u001a\u0010 \u001a\u00020\u00162\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u0015R\u001f\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/example/ecommerceapp/adapter/FavouritesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/ecommerceapp/adapter/FavouritesAdapter$FavoriteViewHolder;", "()V", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "Lcom/example/ecommerceapp/data/model/FavouriteModel;", "kotlin.jvm.PlatformType", "getDiffer", "()Landroidx/recyclerview/widget/AsyncListDiffer;", "differCallBack", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "getDifferCallBack", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "favoriteProducts", "", "onFavoriteClickListener", "Lcom/example/ecommerceapp/adapter/FavouritesAdapter$OnFavoriteClickListener;", "onFavoriteLongClickListener", "Lcom/example/ecommerceapp/adapter/FavouritesAdapter$OnFavoriteLongClickListener;", "onItemClickListener", "Lkotlin/Function1;", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onItemClicked", "listner", "FavoriteViewHolder", "OnFavoriteClickListener", "OnFavoriteLongClickListener", "app_debug"})
public final class FavouritesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.ecommerceapp.adapter.FavouritesAdapter.FavoriteViewHolder> {
    private java.util.List<com.example.ecommerceapp.data.model.FavouriteModel> favoriteProducts;
    private com.example.ecommerceapp.adapter.FavouritesAdapter.OnFavoriteClickListener onFavoriteClickListener;
    private com.example.ecommerceapp.adapter.FavouritesAdapter.OnFavoriteLongClickListener onFavoriteLongClickListener;
    @org.jetbrains.annotations.NotNull()
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.ecommerceapp.data.model.FavouriteModel> differCallBack = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.recyclerview.widget.AsyncListDiffer<com.example.ecommerceapp.data.model.FavouriteModel> differ = null;
    private kotlin.jvm.functions.Function1<? super com.example.ecommerceapp.data.model.FavouriteModel, kotlin.Unit> onItemClickListener;
    
    public FavouritesAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.ecommerceapp.data.model.FavouriteModel> getDifferCallBack() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.AsyncListDiffer<com.example.ecommerceapp.data.model.FavouriteModel> getDiffer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.ecommerceapp.adapter.FavouritesAdapter.FavoriteViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.ecommerceapp.adapter.FavouritesAdapter.FavoriteViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void onItemClicked(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.ecommerceapp.data.model.FavouriteModel, kotlin.Unit> listner) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/ecommerceapp/adapter/FavouritesAdapter$FavoriteViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/ecommerceapp/databinding/ItemFavouriteBinding;", "(Lcom/example/ecommerceapp/databinding/ItemFavouriteBinding;)V", "getBinding", "()Lcom/example/ecommerceapp/databinding/ItemFavouriteBinding;", "app_debug"})
    public static final class FavoriteViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.ecommerceapp.databinding.ItemFavouriteBinding binding = null;
        
        public FavoriteViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.ecommerceapp.databinding.ItemFavouriteBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.ecommerceapp.databinding.ItemFavouriteBinding getBinding() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/ecommerceapp/adapter/FavouritesAdapter$OnFavoriteClickListener;", "", "onFavoriteClick", "", "product", "Lcom/example/ecommerceapp/data/model/FavouriteModel;", "app_debug"})
    public static abstract interface OnFavoriteClickListener {
        
        public abstract void onFavoriteClick(@org.jetbrains.annotations.NotNull()
        com.example.ecommerceapp.data.model.FavouriteModel product);
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/ecommerceapp/adapter/FavouritesAdapter$OnFavoriteLongClickListener;", "", "onFavoriteLongCLick", "", "product", "Lcom/example/ecommerceapp/data/model/FavouriteModel;", "app_debug"})
    public static abstract interface OnFavoriteLongClickListener {
        
        public abstract void onFavoriteLongCLick(@org.jetbrains.annotations.NotNull()
        com.example.ecommerceapp.data.model.FavouriteModel product);
    }
}