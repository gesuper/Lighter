package com.gesuper.lighter.widget;

import com.gesuper.lighter.R;
import com.gesuper.lighter.model.EventModel;
import com.gesuper.lighter.ui.MainActivity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class EventItemView extends ItemViewBase{
	public static final String TAG = "EventItemView";
	
	private TextView mEventCount;
	
	public EventItemView(Context context) {
		super(context, R.layout.event_item);
		// TODO Auto-generated constructor stub

		this.mEventCount = (TextView)findViewById(R.id.event_count);
	}
	
	public void setModel(EventModel mItemModel) {
		super.setModel(mItemModel);
	}
}
