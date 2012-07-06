package com.man_r.BatteryInfo;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BatteryInfoActivity extends Activity {
    
	private TextView batteryLevel, batteryVoltage, batteryTemperature,
	   batteryTechnology, batteryStatus, batteryHealth, intentKeys;
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        
        Button batteryServiceButton = (Button) findViewById(R.id.startbatteryservice);
        batteryServiceButton.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent batteryServiceIntent = new Intent(getApplicationContext(), BatteryInfoService.class);
				startService(batteryServiceIntent);
			}
		});
        
        Button stopBatteryServiceButton = (Button) findViewById(R.id.stopbatteryservice);
        stopBatteryServiceButton.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent stopBatteryService = new Intent(getApplicationContext(), BatteryInfoService.class);
				stopService(stopBatteryService);				
			}
		});
        
        intentKeys = (TextView) findViewById(R.id.intentkeys);
 	   	batteryLevel = (TextView)findViewById(R.id.batterylevel);
 	   	batteryVoltage = (TextView)findViewById(R.id.batteryvoltage);
        batteryTemperature = (TextView)findViewById(R.id.batterytemperature);
        batteryTechnology = (TextView)findViewById(R.id.batterytechology);
        batteryStatus = (TextView)findViewById(R.id.batterystatus);
        batteryHealth = (TextView)findViewById(R.id.batteryhealth);
        
        this.registerReceiver(this.myBatteryReceiver, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
    }
    
    private BroadcastReceiver myBatteryReceiver = new BroadcastReceiver(){

		@Override
		public void onReceive(Context arg0, Intent arg1) {
			// TODO Auto-generated method stub
	
			if (arg1.getAction().equals(Intent.ACTION_BATTERY_CHANGED)){
				
				//intentKeys.setText(arg1.getExtras().keySet().toString());
				intentKeys.setText(" ");
				batteryLevel.setText("Level: " + String.valueOf(arg1.getIntExtra("level", 0)) + "%");
				batteryVoltage.setText("Voltage: " + String.valueOf((float)arg1.getIntExtra("voltage", 0)/1000) + "V");
				batteryTemperature.setText("Temperature: " + String.valueOf((float)arg1.getIntExtra("temperature", 0)/10) + "c");
				batteryTechnology.setText("Technology: " + arg1.getStringExtra("technology"));
			  
				int status = arg1.getIntExtra("status", BatteryManager.BATTERY_STATUS_UNKNOWN);
				String strStatus;
				if (status == BatteryManager.BATTERY_STATUS_CHARGING){
					strStatus = "Charging";
				} else if (status == BatteryManager.BATTERY_STATUS_DISCHARGING){
					strStatus = "Dis-charging";
				} else if (status == BatteryManager.BATTERY_STATUS_NOT_CHARGING){
					strStatus = "Not charging";
				} else if (status == BatteryManager.BATTERY_STATUS_FULL){
				   strStatus = "Full";
				} else {
					strStatus = "Unknown";
				}
			   
				batteryStatus.setText("Status: " + strStatus);
			  
				int health = arg1.getIntExtra("health", BatteryManager.BATTERY_HEALTH_UNKNOWN);
				String strHealth;
				if (health == BatteryManager.BATTERY_HEALTH_GOOD){
					strHealth = "Good";
				} else if (health == BatteryManager.BATTERY_HEALTH_OVERHEAT){
					strHealth = "Over Heat";
				} else if (health == BatteryManager.BATTERY_HEALTH_DEAD){
					strHealth = "Dead";
				} else if (health == BatteryManager.BATTERY_HEALTH_OVER_VOLTAGE){
					strHealth = "Over Voltage";
				} else if (health == BatteryManager.BATTERY_HEALTH_UNSPECIFIED_FAILURE){
					strHealth = "Unspecified Failure";
				} else{
					strHealth = "Unknown";
				}
				
				batteryHealth.setText("Health: " + strHealth);
			  
		  }//if (arg1.getAction().equals(Intent.ACTION_BATTERY_CHANGED))
		}//public void onReceive(Context arg0, Intent arg1)
	};//private BroadcastReceiver myBatteryReceiver = new BroadcastReceiver(){
}