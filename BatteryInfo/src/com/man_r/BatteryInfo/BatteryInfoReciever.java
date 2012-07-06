package com.man_r.BatteryInfo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BatteryInfoReciever extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
	    // TODO Auto-generated method stub
		context.startService(new Intent(context, BatteryInfoService.class));
	}

}
