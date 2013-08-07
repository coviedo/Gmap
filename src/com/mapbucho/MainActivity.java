package com.mapbucho;

import android.os.Bundle;
import android.view.Menu;

import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import android.support.v4.app.FragmentActivity;

public class MainActivity extends FragmentActivity {
	private GoogleMap googleMap;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		SupportMapFragment sp = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        googleMap = sp.getMap();
        googleMap.addMarker(new MarkerOptions().position(new
                LatLng(34.739849,-92.307129)).title("SwagString"));
        
        googleMap.setMyLocationEnabled(true);
        googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
