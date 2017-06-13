package com.wiggins.stampview.utils;

import android.content.Context;

import com.wiggins.stampview.R;
import com.wiggins.stampview.widget.loading.ShapeLoadingDialog;

/**
 * @Description Dialog工具类
 * @Author 一花一世界
 */
public class DialogUtil {

    private static ShapeLoadingDialog shapeLoadingDialog;

    /**
     * 显示加载状态框
     */
    public static void showDialogLoading(Context context, String message) {
        if (shapeLoadingDialog != null) {
            hideDialogLoading();
            shapeLoadingDialog = new ShapeLoadingDialog(context);
        } else {
            shapeLoadingDialog = new ShapeLoadingDialog(context);
        }

        if (!StringUtil.isEmpty(message)) {
            shapeLoadingDialog.setLoadingText(message);
        } else {
            shapeLoadingDialog.setLoadingText(UIUtils.getString(R.string.loading));
        }

        shapeLoadingDialog.setCanceledOnTouchOutside(false);
        shapeLoadingDialog.show();
    }

    /**
     * 关闭加载框
     */
    public static void hideDialogLoading() {
        if (shapeLoadingDialog != null) {
            if (shapeLoadingDialog.isShowing()) {
                shapeLoadingDialog.dismiss();
            }
            shapeLoadingDialog = null;
        }
    }
}
