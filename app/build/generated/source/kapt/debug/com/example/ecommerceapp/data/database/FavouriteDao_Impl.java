package com.example.ecommerceapp.data.database;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.ecommerceapp.data.model.FavouriteModel;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class FavouriteDao_Impl implements FavouriteDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<FavouriteModel> __insertionAdapterOfFavouriteModel;

  private final EntityDeletionOrUpdateAdapter<FavouriteModel> __deletionAdapterOfFavouriteModel;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllFavourites;

  public FavouriteDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFavouriteModel = new EntityInsertionAdapter<FavouriteModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `FavouriteModel` (`productId`,`productImage`,`productTitle`,`productDescription`,`productPrice`,`productBrandName`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FavouriteModel value) {
        stmt.bindLong(1, value.getProductId());
        stmt.bindLong(2, value.getProductImage());
        if (value.getProductTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getProductTitle());
        }
        if (value.getProductDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getProductDescription());
        }
        stmt.bindLong(5, value.getProductPrice());
        if (value.getProductBrandName() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getProductBrandName());
        }
      }
    };
    this.__deletionAdapterOfFavouriteModel = new EntityDeletionOrUpdateAdapter<FavouriteModel>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `FavouriteModel` WHERE `productId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FavouriteModel value) {
        stmt.bindLong(1, value.getProductId());
      }
    };
    this.__preparedStmtOfDeleteAllFavourites = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM FavouriteModel";
        return _query;
      }
    };
  }

  @Override
  public void saveFavourite(final FavouriteModel ProductModel) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfFavouriteModel.insert(ProductModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Object removeFavouriteFromFavorites(final FavouriteModel FavouriteModel,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfFavouriteModel.handle(FavouriteModel);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteAllFavourites(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllFavourites.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllFavourites.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public LiveData<List<FavouriteModel>> getAllFavoriteFavourites() {
    final String _sql = "SELECT * FROM FavouriteModel";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"FavouriteModel"}, false, new Callable<List<FavouriteModel>>() {
      @Override
      public List<FavouriteModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfProductId = CursorUtil.getColumnIndexOrThrow(_cursor, "productId");
          final int _cursorIndexOfProductImage = CursorUtil.getColumnIndexOrThrow(_cursor, "productImage");
          final int _cursorIndexOfProductTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "productTitle");
          final int _cursorIndexOfProductDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "productDescription");
          final int _cursorIndexOfProductPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "productPrice");
          final int _cursorIndexOfProductBrandName = CursorUtil.getColumnIndexOrThrow(_cursor, "productBrandName");
          final List<FavouriteModel> _result = new ArrayList<FavouriteModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final FavouriteModel _item;
            final int _tmpProductId;
            _tmpProductId = _cursor.getInt(_cursorIndexOfProductId);
            final int _tmpProductImage;
            _tmpProductImage = _cursor.getInt(_cursorIndexOfProductImage);
            final String _tmpProductTitle;
            if (_cursor.isNull(_cursorIndexOfProductTitle)) {
              _tmpProductTitle = null;
            } else {
              _tmpProductTitle = _cursor.getString(_cursorIndexOfProductTitle);
            }
            final String _tmpProductDescription;
            if (_cursor.isNull(_cursorIndexOfProductDescription)) {
              _tmpProductDescription = null;
            } else {
              _tmpProductDescription = _cursor.getString(_cursorIndexOfProductDescription);
            }
            final int _tmpProductPrice;
            _tmpProductPrice = _cursor.getInt(_cursorIndexOfProductPrice);
            final String _tmpProductBrandName;
            if (_cursor.isNull(_cursorIndexOfProductBrandName)) {
              _tmpProductBrandName = null;
            } else {
              _tmpProductBrandName = _cursor.getString(_cursorIndexOfProductBrandName);
            }
            _item = new FavouriteModel(_tmpProductId,_tmpProductImage,_tmpProductTitle,_tmpProductDescription,_tmpProductPrice,_tmpProductBrandName);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object getSpecificFavoriteFavourite(final String id,
      final Continuation<? super FavouriteModel> continuation) {
    final String _sql = "SELECT * FROM FavouriteModel WHERE productId =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<FavouriteModel>() {
      @Override
      public FavouriteModel call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfProductId = CursorUtil.getColumnIndexOrThrow(_cursor, "productId");
          final int _cursorIndexOfProductImage = CursorUtil.getColumnIndexOrThrow(_cursor, "productImage");
          final int _cursorIndexOfProductTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "productTitle");
          final int _cursorIndexOfProductDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "productDescription");
          final int _cursorIndexOfProductPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "productPrice");
          final int _cursorIndexOfProductBrandName = CursorUtil.getColumnIndexOrThrow(_cursor, "productBrandName");
          final FavouriteModel _result;
          if(_cursor.moveToFirst()) {
            final int _tmpProductId;
            _tmpProductId = _cursor.getInt(_cursorIndexOfProductId);
            final int _tmpProductImage;
            _tmpProductImage = _cursor.getInt(_cursorIndexOfProductImage);
            final String _tmpProductTitle;
            if (_cursor.isNull(_cursorIndexOfProductTitle)) {
              _tmpProductTitle = null;
            } else {
              _tmpProductTitle = _cursor.getString(_cursorIndexOfProductTitle);
            }
            final String _tmpProductDescription;
            if (_cursor.isNull(_cursorIndexOfProductDescription)) {
              _tmpProductDescription = null;
            } else {
              _tmpProductDescription = _cursor.getString(_cursorIndexOfProductDescription);
            }
            final int _tmpProductPrice;
            _tmpProductPrice = _cursor.getInt(_cursorIndexOfProductPrice);
            final String _tmpProductBrandName;
            if (_cursor.isNull(_cursorIndexOfProductBrandName)) {
              _tmpProductBrandName = null;
            } else {
              _tmpProductBrandName = _cursor.getString(_cursorIndexOfProductBrandName);
            }
            _result = new FavouriteModel(_tmpProductId,_tmpProductImage,_tmpProductTitle,_tmpProductDescription,_tmpProductPrice,_tmpProductBrandName);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public LiveData<FavouriteModel> getSpecificFavoriteFavouriteLiveData(final String id) {
    final String _sql = "SELECT * FROM FavouriteModel WHERE productId =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"FavouriteModel"}, false, new Callable<FavouriteModel>() {
      @Override
      public FavouriteModel call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfProductId = CursorUtil.getColumnIndexOrThrow(_cursor, "productId");
          final int _cursorIndexOfProductImage = CursorUtil.getColumnIndexOrThrow(_cursor, "productImage");
          final int _cursorIndexOfProductTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "productTitle");
          final int _cursorIndexOfProductDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "productDescription");
          final int _cursorIndexOfProductPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "productPrice");
          final int _cursorIndexOfProductBrandName = CursorUtil.getColumnIndexOrThrow(_cursor, "productBrandName");
          final FavouriteModel _result;
          if(_cursor.moveToFirst()) {
            final int _tmpProductId;
            _tmpProductId = _cursor.getInt(_cursorIndexOfProductId);
            final int _tmpProductImage;
            _tmpProductImage = _cursor.getInt(_cursorIndexOfProductImage);
            final String _tmpProductTitle;
            if (_cursor.isNull(_cursorIndexOfProductTitle)) {
              _tmpProductTitle = null;
            } else {
              _tmpProductTitle = _cursor.getString(_cursorIndexOfProductTitle);
            }
            final String _tmpProductDescription;
            if (_cursor.isNull(_cursorIndexOfProductDescription)) {
              _tmpProductDescription = null;
            } else {
              _tmpProductDescription = _cursor.getString(_cursorIndexOfProductDescription);
            }
            final int _tmpProductPrice;
            _tmpProductPrice = _cursor.getInt(_cursorIndexOfProductPrice);
            final String _tmpProductBrandName;
            if (_cursor.isNull(_cursorIndexOfProductBrandName)) {
              _tmpProductBrandName = null;
            } else {
              _tmpProductBrandName = _cursor.getString(_cursorIndexOfProductBrandName);
            }
            _result = new FavouriteModel(_tmpProductId,_tmpProductImage,_tmpProductTitle,_tmpProductDescription,_tmpProductPrice,_tmpProductBrandName);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public int isFavorite(final int id) {
    final String _sql = "SELECT EXISTS (SELECT 1 FROM FavouriteModel WHERE productId=?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
