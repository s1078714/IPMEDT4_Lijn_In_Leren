package ipmedt4.Lijn.In.Leren;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class ResultatenDataSource {
	// Database fields
	  private SQLiteDatabase database;
	  private MySQLiteHelper dbHelper;
	  private String[] allColumns = { MySQLiteHelper.COLUMN_LEERLIJN,
	      MySQLiteHelper.COLUMN_VAK, MySQLiteHelper.COLUMN_ONDERDEEL, 
	      MySQLiteHelper.COLUMN_KERNDOEL, MySQLiteHelper.COLUMN_BOUW, 
	      MySQLiteHelper.COLUMN_GROEP, MySQLiteHelper.COLUMN_INFORMATIE };
	  		// Inclusief kolommen bouw en groep (uit oorspronkelijk 2 aparte tabellen)!

	  public ResultatenDataSource(Context context) {
	    dbHelper = new MySQLiteHelper(context);
	  }

	  public void open() throws SQLException {
	    database = dbHelper.getWritableDatabase();
	  }

	  public void close() {
	    dbHelper.close();
	  }

	  public List<Resultaat> getAlleResultaten() {
	    List<Resultaat> resultaten = new ArrayList<Resultaat>();

	    Cursor cursor = database.query(MySQLiteHelper.TABLE_RESULTATEN,
	        allColumns, null, null, null, null, null);

	    cursor.moveToFirst();
//	    while (!cursor.isAfterLast()) {
//	      Resultaat resultaat = cursorToResultaat(cursor);
//	      resultaten.add(resultaat);
//	      cursor.moveToNext();
//	    }
	    // make sure to close the cursor
	    cursor.close();
	    return resultaten;
	  }
}
