package com.azure.graphview.activity;

import android.app.Activity;
import android.os.Bundle;
import com.azure.graphview.BarGraphView;
import com.azure.graphview.GraphView;
import com.azure.graphview.GraphViewSeries;
import com.azure.graphview.GraphView.GraphViewData;

public class GraphViewDemoActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		GraphView graphView = new BarGraphView(
				this
				, "GraphViewDemo"
		);
		graphView.addSeries(new GraphViewSeries(new GraphViewData[] {
				new GraphViewData(1, 2.0d)
				, new GraphViewData(2, 1.5d)
				, new GraphViewData(2.5, 3.0d)
				, new GraphViewData(3, 2.5d)
				, new GraphViewData(4, 1.0d)
				, new GraphViewData(5, 3.0d)
				, new GraphViewData(6, 4.5d)
		}));
		graphView.setHorizontalScrollBarEnabled(true);
		graphView.setHorizontalLabels(new String[]{"0","1","2","3","4","5","6"});
		graphView.setVerticalScrollBarEnabled(true);
		graphView.setVerticalLabels(new String[]{"6","5","4","3","2","1","0"});
		graphView.setShowLegend(true);
		graphView.setViewPort(0, 0);
		setContentView(graphView);
	}
}