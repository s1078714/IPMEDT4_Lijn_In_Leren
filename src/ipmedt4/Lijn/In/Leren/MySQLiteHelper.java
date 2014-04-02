package ipmedt4.Lijn.In.Leren;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

public class MySQLiteHelper extends SQLiteOpenHelper
{
	private static final String DATABASE_NAME = "LijnInLeren.db";
	private static final int DATABASE_VERSION = 0;
	private String TABLE_COMMENTS = tabelnaam op te halen uit phpMyAdmin;
	private MainActivity mainActivity;
	
	public MySQLiteHelper( Context context )
	{
		super(context, DATABASE_NAME, null, DATABASE_VERSION );
//		context.deleteDatabase(DATABASE_NAME);
//		context.openOrCreateDatabase(DATABASE_NAME, 0, null);

	}
	
	@Override
	  public void onCreate(SQLiteDatabase database) {
		try {
	    database.execSQL(DATABASE_NAME);
		}
		catch (Exception e){
			String message = "Unable to execute database (" + DATABASE_NAME + ")";
//			Toast.makeText(MySQLiteHelper.this, message, Toast.LENGTH_LONG).show();
			Toast.makeText(MySQLiteHelper.this, message, Toast.LENGTH_LONG).show();
		}
	  }
	
	@Override
	  public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	    Log.w(MySQLiteHelper.class.getName(),
	        "Upgrading database from version " + oldVersion + " to "
	            + newVersion + ", which will destroy all old data");
	    db.execSQL("DROP TABLE IF EXISTS " + TABLE_COMMENTS);
	    onCreate(db);
	  }
}