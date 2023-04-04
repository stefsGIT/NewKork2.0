package com.example.newkork;

import static android.app.ProgressDialog.show;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class Database extends SQLiteOpenHelper {

        private Context context;
        private static final String DATABASE_NAME = "wine.db";
        private static final int DATABASE_VERSION = 1;

        private static final String TABLE_NAME = "wineTable";
        private static final String COLUMN_ID = "wineID";
        private static final String COLUMN_TITLE = "wineName";
        private static final String COLUMN_TYPE = "wineType";

        public static final String SQL_Create =
                "create table " +
                        TABLE_NAME +
                        "(" +
                        COLUMN_ID +
                        " integer primary key autoincrement, " +
                        COLUMN_TITLE +
                        " text not null, " +
                        COLUMN_TYPE +
                        " text);"
                ;

        public Database(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
            this.context = context;
        }

        @Override
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            sqLiteDatabase.execSQL(SQL_Create);
        }

        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
            sqLiteDatabase.execSQL("drop table if exists " + TABLE_NAME);
            onCreate(sqLiteDatabase);
        }

        void add(String title, String type){
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues cv = new ContentValues();

            cv.put(COLUMN_TITLE, title);
            cv.put(COLUMN_TYPE, type);
            long result = db.insert(TABLE_NAME, null, cv);
            if(result == -1) {
                Toast.makeText(context, "Failed", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(context, "Succsessfull", Toast.LENGTH_SHORT).show();
            }
        }

        Cursor readData(){
            String querry = "SELECT * FROM " + TABLE_NAME;
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = null;
            if(db != null){
                cursor = db.rawQuery(querry, null );
            }
            return cursor;
        }
}
