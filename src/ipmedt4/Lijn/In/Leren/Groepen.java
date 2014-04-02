package ipmedt4.Lijn.In.Leren;



import com.example.lijn_in_leren.R;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;

public class Groepen extends ListActivity
{
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity );
		//listview setonclicklistener toevoegen
		populateListView();
	}
	
	private void populateListView() {
		// TODO Auto-generated method stub
		String[] klassen = new String[] {"Groep 1 ", "Groep 2 ", "Groep 3 " ,
				"Groep 4 ", "Groep 5 ", "Groep 6 ", "Groep 7 ", "Groep 8 "};
				// Hier vind de SQL naar android/java plaats.
		};
		
	
	}

