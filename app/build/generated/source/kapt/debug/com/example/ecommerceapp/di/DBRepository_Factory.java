package com.example.ecommerceapp.di;

import com.example.ecommerceapp.data.database.FavouriteDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DBRepository_Factory implements Factory<DBRepository> {
  private final Provider<FavouriteDatabase> appDatabaseProvider;

  public DBRepository_Factory(Provider<FavouriteDatabase> appDatabaseProvider) {
    this.appDatabaseProvider = appDatabaseProvider;
  }

  @Override
  public DBRepository get() {
    return newInstance(appDatabaseProvider.get());
  }

  public static DBRepository_Factory create(Provider<FavouriteDatabase> appDatabaseProvider) {
    return new DBRepository_Factory(appDatabaseProvider);
  }

  public static DBRepository newInstance(FavouriteDatabase appDatabase) {
    return new DBRepository(appDatabase);
  }
}
