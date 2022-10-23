package com.example.ecommerceapp.di;

import android.content.Context;
import com.example.ecommerceapp.data.database.FavouriteDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DBModule_ProvideAppDatabaseFactory implements Factory<FavouriteDatabase> {
  private final Provider<Context> contextProvider;

  public DBModule_ProvideAppDatabaseFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public FavouriteDatabase get() {
    return provideAppDatabase(contextProvider.get());
  }

  public static DBModule_ProvideAppDatabaseFactory create(Provider<Context> contextProvider) {
    return new DBModule_ProvideAppDatabaseFactory(contextProvider);
  }

  public static FavouriteDatabase provideAppDatabase(Context context) {
    return Preconditions.checkNotNullFromProvides(DBModule.INSTANCE.provideAppDatabase(context));
  }
}
