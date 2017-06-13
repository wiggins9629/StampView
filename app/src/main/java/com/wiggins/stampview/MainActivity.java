package com.wiggins.stampview;

import android.os.Bundle;
import android.view.View;

import com.wiggins.stampview.base.BaseActivity;
import com.wiggins.stampview.utils.UIUtils;
import com.wiggins.stampview.widget.TitleView;

/**
 * @Description 自定义邮票锯齿背景效果
 * @Author 一花一世界
 */
public class MainActivity extends BaseActivity {

    private TitleView titleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        titleView = (TitleView) findViewById(R.id.titleView);
        titleView.setAppTitle(UIUtils.getString(R.string.title));
        titleView.setLeftImageVisibility(View.GONE);
    }
}
