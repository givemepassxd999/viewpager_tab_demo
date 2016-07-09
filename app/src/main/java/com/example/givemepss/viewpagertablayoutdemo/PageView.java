package com.example.givemepss.viewpagertablayoutdemo;

import android.content.Context;
import android.widget.RelativeLayout;

/**
 * Created by rick on 2016/7/9.
 */

public abstract class PageView extends RelativeLayout{
    public PageView(Context context) {
        super(context);
    }
    public abstract void refresh();
}
