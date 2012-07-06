package com.man_r.BatteryInfo;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.IBinder;

public class BatteryInfoService extends Service {

	private static final int BATTERY_ID = 1;
	
	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		
		this.registerReceiver(this.myBatteryReceiver, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
	}
	
	
	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		String ns = Context.NOTIFICATION_SERVICE;
		NotificationManager mNotificationManager = (NotificationManager) getSystemService(ns);
		mNotificationManager.cancel(BATTERY_ID);
	}


	private BroadcastReceiver myBatteryReceiver = new BroadcastReceiver(){

		@Override
		public void onReceive(Context context, Intent intent) {
			// TODO Auto-generated method stub
			
			//Get a reference to the NotificationManager:
			String ns = Context.NOTIFICATION_SERVICE;
			NotificationManager mNotificationManager = (NotificationManager) context.getSystemService(ns);
			
			if (intent.getAction().equals(Intent.ACTION_BATTERY_CHANGED)){
				
				int level = intent.getIntExtra("level", 0);
				//int voltage = intent.getIntExtra("voltage", 0)/1000;
				//int temperature = intent.getIntExtra("temperature", 0)/10;
				//int technology = intent.getIntExtra("technology", 0);
				//int status = intent.getIntExtra("status", BatteryManager.BATTERY_STATUS_UNKNOWN);
				//int health = intent.getIntExtra("health", BatteryManager.BATTERY_HEALTH_UNKNOWN);
				
				
				//Instantiate the Notification:
				int icon = R.drawable.notification_icon;
				
				//*if ( status == BatteryManager.BATTERY_STATUS_CHARGING)
					//icon = R.drawable.notification_icon_charging;
				//else
				if ( level == 100 )
					icon = R.drawable.notification_icon_100;
				else if ( level == 99 )
					icon = R.drawable.notification_icon_99;
				else if ( level == 98 )
					icon = R.drawable.notification_icon_98;
				else if ( level == 97 )
					icon = R.drawable.notification_icon_97;
				else if ( level == 96 )
					icon = R.drawable.notification_icon_96;
				else if ( level == 95 )
					icon = R.drawable.notification_icon_95;
				else if ( level == 94 )
					icon = R.drawable.notification_icon_94;
				else if ( level == 93 )
					icon = R.drawable.notification_icon_93;
				else if ( level == 92 )
					icon = R.drawable.notification_icon_92;
				else if ( level == 91 )
					icon = R.drawable.notification_icon_91;
				else if ( level == 90 )
					icon = R.drawable.notification_icon_90;
				else if ( level == 89 )
					icon = R.drawable.notification_icon_89;
				else if ( level == 88 )
					icon = R.drawable.notification_icon_88;
				else if ( level == 87 )
					icon = R.drawable.notification_icon_87;
				else if ( level == 86 )
					icon = R.drawable.notification_icon_86;
				else if ( level == 85 )
					icon = R.drawable.notification_icon_85;
				else if ( level == 84 )
					icon = R.drawable.notification_icon_84;
				else if ( level == 83 )
					icon = R.drawable.notification_icon_83;
				else if ( level == 82 )
					icon = R.drawable.notification_icon_82;
				else if ( level == 81 )
					icon = R.drawable.notification_icon_81;
				else if ( level == 80 )
					icon = R.drawable.notification_icon_80;
				else if ( level == 79 )
					icon = R.drawable.notification_icon_79;
				else if ( level == 78 )
					icon = R.drawable.notification_icon_78;
				else if ( level == 77 )
					icon = R.drawable.notification_icon_77;
				else if ( level == 76 )
					icon = R.drawable.notification_icon_76;
				else if ( level == 75 )
					icon = R.drawable.notification_icon_75;
				else if ( level == 74 )
					icon = R.drawable.notification_icon_74;
				else if ( level == 73 )
					icon = R.drawable.notification_icon_73;
				else if ( level == 72 )
					icon = R.drawable.notification_icon_72;
				else if ( level == 71 )
					icon = R.drawable.notification_icon_71;
				else if ( level == 70 )
					icon = R.drawable.notification_icon_70;
				else if ( level == 69 )
					icon = R.drawable.notification_icon_69;
				else if ( level == 68 )
					icon = R.drawable.notification_icon_68;
				else if ( level == 67 )
					icon = R.drawable.notification_icon_67;
				else if ( level == 66 )
					icon = R.drawable.notification_icon_66;
				else if ( level == 65 )
					icon = R.drawable.notification_icon_65;
				else if ( level == 64 )
					icon = R.drawable.notification_icon_64;
				else if ( level == 63 )
					icon = R.drawable.notification_icon_63;
				else if ( level == 62 )
					icon = R.drawable.notification_icon_62;
				else if ( level == 61 )
					icon = R.drawable.notification_icon_61;
				else if ( level == 60 )
					icon = R.drawable.notification_icon_60;
				else if ( level == 59 )
					icon = R.drawable.notification_icon_59;
				else if ( level == 58 )
					icon = R.drawable.notification_icon_58;
				else if ( level == 57 )
					icon = R.drawable.notification_icon_57;
				else if ( level == 56 )
					icon = R.drawable.notification_icon_56;
				else if ( level == 55 )
					icon = R.drawable.notification_icon_55;
				else if ( level == 54 )
					icon = R.drawable.notification_icon_54;
				else if ( level == 53 )
					icon = R.drawable.notification_icon_53;
				else if ( level == 52 )
					icon = R.drawable.notification_icon_52;
				else if ( level == 51 )
					icon = R.drawable.notification_icon_51;
				else if ( level == 50 )
					icon = R.drawable.notification_icon_50;
				else if ( level == 49 )
					icon = R.drawable.notification_icon_49;
				else if ( level == 48 )
					icon = R.drawable.notification_icon_48;
				else if ( level == 47 )
					icon = R.drawable.notification_icon_47;
				else if ( level == 46 )
					icon = R.drawable.notification_icon_46;
				else if ( level == 45 )
					icon = R.drawable.notification_icon_45;
				else if ( level == 44 )
					icon = R.drawable.notification_icon_44;
				else if ( level == 43 )
					icon = R.drawable.notification_icon_43;
				else if ( level == 42 )
					icon = R.drawable.notification_icon_42;
				else if ( level == 41 )
					icon = R.drawable.notification_icon_41;
				else if ( level == 40 )
					icon = R.drawable.notification_icon_40;
				else if ( level == 39 )
					icon = R.drawable.notification_icon_39;
				else if ( level == 38 )
					icon = R.drawable.notification_icon_38;
				else if ( level == 37 )
					icon = R.drawable.notification_icon_37;
				else if ( level == 36 )
					icon = R.drawable.notification_icon_36;
				else if ( level == 35 )
					icon = R.drawable.notification_icon_35;
				else if ( level == 34 )
					icon = R.drawable.notification_icon_34;
				else if ( level == 33 )
					icon = R.drawable.notification_icon_33;
				else if ( level == 32 )
					icon = R.drawable.notification_icon_32;
				else if ( level == 31 )
					icon = R.drawable.notification_icon_31;
				else if ( level == 30 )
					icon = R.drawable.notification_icon_30;
				else if ( level == 29 )
					icon = R.drawable.notification_icon_29;
				else if ( level == 28 )
					icon = R.drawable.notification_icon_28;
				else if ( level == 27 )
					icon = R.drawable.notification_icon_27;
				else if ( level == 26 )
					icon = R.drawable.notification_icon_26;
				else if ( level == 25 )
					icon = R.drawable.notification_icon_25;
				else if ( level == 24 )
					icon = R.drawable.notification_icon_24;
				else if ( level == 23 )
					icon = R.drawable.notification_icon_23;
				else if ( level == 22 )
					icon = R.drawable.notification_icon_22;
				else if ( level == 21 )
					icon = R.drawable.notification_icon_21;
				else if ( level == 20 )
					icon = R.drawable.notification_icon_20;
				else if ( level == 19 )
					icon = R.drawable.notification_icon_19;
				else if ( level == 18 )
					icon = R.drawable.notification_icon_18;
				else if ( level == 17 )
					icon = R.drawable.notification_icon_17;
				else if ( level == 16 )
					icon = R.drawable.notification_icon_16;
				else if ( level == 15 )
					icon = R.drawable.notification_icon_15;
				else if ( level == 14 )
					icon = R.drawable.notification_icon_14;
				else if ( level == 13 )
					icon = R.drawable.notification_icon_13;
				else if ( level == 12 )
					icon = R.drawable.notification_icon_12;
				else if ( level == 11 )
					icon = R.drawable.notification_icon_11;
				else if ( level == 10 )
					icon = R.drawable.notification_icon_10;
				else if ( level == 9 )
					icon = R.drawable.notification_icon_09;
				else if ( level == 8 )
					icon = R.drawable.notification_icon_08;
				else if ( level == 7 )
					icon = R.drawable.notification_icon_07;
				else if ( level == 6 )
					icon = R.drawable.notification_icon_06;
				else if ( level == 5 )
					icon = R.drawable.notification_icon_05;
				else if ( level == 4 )
					icon = R.drawable.notification_icon_04;
				else if ( level == 3 )
					icon = R.drawable.notification_icon_03;
				else if ( level == 2 )
					icon = R.drawable.notification_icon_02;
				else if ( level == 1 )
					icon = R.drawable.notification_icon_01;
				else if ( level == 0 )
					icon = R.drawable.notification_icon_0;
				
				//icon = 0x7f020001 + level - 1;
				int health = intent.getIntExtra("health", BatteryManager.BATTERY_HEALTH_UNKNOWN);
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
				
				int status = intent.getIntExtra("status", BatteryManager.BATTERY_STATUS_UNKNOWN);
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
				
							
				Notification notification = new Notification();
				notification.flags = Notification.FLAG_ONGOING_EVENT;
				notification.icon = icon;
				
				//Define the notification message and PendingIntent
				CharSequence contentTitle = "BatteryInfo";
				CharSequence contentText = "health: " + strHealth + " / status: " + strStatus;
				Intent notificationIntent = new Intent(context, BatteryInfoActivity.class);
				PendingIntent contentIntent = PendingIntent.getActivity(context, 0, notificationIntent, 0);
				
				notification.setLatestEventInfo(context, contentTitle, contentText, contentIntent);
				
				//Pass the Notification to the NotificationManager
				mNotificationManager.notify(BATTERY_ID, notification);
				
				//reRegister(context);
				//Toast.makeText(context, "notification", Toast.LENGTH_SHORT).show();
				//getNotification(Context context, Intent intent);
			} //if (intent.getAction().equals(Intent.ACTION_BATTERY_CHANGED))
		}//public void onReceive(Context arg0, Intent arg1)
	};//private BroadcastReceiver myBatteryReceiver = new BroadcastReceiver(){
}
