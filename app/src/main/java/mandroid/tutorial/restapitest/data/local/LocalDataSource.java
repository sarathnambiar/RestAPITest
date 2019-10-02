package mandroid.tutorial.restapitest.data.local;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import static mandroid.tutorial.restapitest.data.local.LocalDBConstants.KEY_USER_ID;
import static mandroid.tutorial.restapitest.data.local.LocalDBConstants.KEY_USER_NAME;
import static mandroid.tutorial.restapitest.data.local.LocalDBConstants.TABLE_USER;

public class LocalDataSource implements DBHelper {

    SQLiteDatabase database;

    public LocalDataSource(Context context) {
        database = new DatabaseHandler(context).getWritableDatabase();
    }

    @Override
    public boolean insertUserData(String username) {
        try {
            ContentValues values = new ContentValues();
            values.put(KEY_USER_ID, 1);
            values.put(KEY_USER_NAME, username);
            database.insert(TABLE_USER, null, values);
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
            Log.e("Insertion Error : ", e.getMessage());
            return false;
        }
    }

    @Override
    public String getData() {
        String selectQuery = "SELECT  * FROM " + TABLE_USER;
        Cursor cursor = database.rawQuery(selectQuery, null);
        if (cursor != null && cursor.moveToFirst()) {
            String token = cursor.getString(cursor.getColumnIndex(KEY_USER_NAME));
            cursor.close();
            return token;
        } else {
            return null;
        }
    }

}
