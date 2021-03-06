package ipmedt4.Lijn.In.Leren;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

public class MySQLiteHelper extends SQLiteOpenHelper
{
	public static final String DATABASE_NAME = "LijnInLeren.db";
	private static final int DATABASE_VERSION = 0;
	public static final String TABLE_RESULTATEN = "Lijn_In_Leren_groep_tabel";
	
	public static final String COLUMN_LEERLIJN = "leerlijn";
	public static final String COLUMN_VAK = "vak";
	public static final String COLUMN_ONDERDEEL = "onderdeel";
	public static final String COLUMN_KERNDOEL = "kerndoel";
	public static final String COLUMN_BOUW = "bouw"; // onderdeel van tabel Lijn_In_Leren_groep_tabel
	public static final String COLUMN_GROEP = "groep"; // onderdeel van tabel Lijn_In_Leren_bouw_tabel
	public static final String COLUMN_INFORMATIE = "informatie";
	
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
	    db.execSQL("DROP TABLE IF EXISTS " + TABLE_RESULTATEN);
	    onCreate(db);
	  }
}