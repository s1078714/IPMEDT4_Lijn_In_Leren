package ipmedt4.Lijn.In.Leren;

import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity 
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main );
		
		populateListView();
		
		List<Resultaat> values = datasource.getAllComments();
		
		ArrayAdapter<Resultaat> adapter = new ArrayAdapter<Resultaat>(this,
		        android.R.layout.simple_list_item_1, values);
		    setListAdapter(adapter);
	}

	/**
	 * Vult de lijst met items.
	 * @author Gunnar Kelders
	 * @version 0.1 -- 17 maart 2014
	 */
	private void populateListView() {
		// TODO Auto-generated method stub
		String[] myItems = {
				// Hier vind de SQL naar android/java plaats.
				//   SELECT leerlijn FROM Lijn_In_Leren_groep_tabel
				//   GROUP BY leerlijn
				return MySQLiteHelper.DATABASE_NAME.query(MySQLiteHelper.TABLE_RESULTATEN, 
						  new String[] { MySQLiteHelper.COLUMN_LEERLIJN }, 
						  null, null, null, MySQLiteHelper.COLUMN_LEERLIJN, null)

		};

		// Build adapter
		ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(
				this,				// Context for the activity
				R.layout.the_item, 	// Layout to use (create)
				myItems);			// Items to be displayed

		// Configure the list view
		ListView list = (ListView) findViewById(R.id.listViewMain);
		list.setAdapter(myAdapter);
	}
}
