package com.example.container.appcontainer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        // Add a marker in Sydney, Australia,
        // and move the map's camera to the same location.
        LatLng sydney = new LatLng(-33.852, 151.211);
        googleMap.addMarker(new MarkerOptions().position(sydney)
                .title("Marker in Sydney"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

        // Add a marker in Sydney, Australia,
        // and move the map's camera to the same location.
        LatLng antartida = new LatLng(-79.054148, 26.783465);
        googleMap.addMarker(new MarkerOptions().position(antartida)
                .title("Marker in Antartida"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(antartida));

        // Add a marker in Sydney, Australia,
        // and move the map's camera to the same location.
        LatLng argentina = new LatLng(-38.726140, -62.270526);
        googleMap.addMarker(new MarkerOptions().position(argentina)
                .title("Marker in Argentina"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(argentina));
    }
}
