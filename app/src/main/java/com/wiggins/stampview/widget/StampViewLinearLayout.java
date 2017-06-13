package com.wiggins.stampview.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * @Description 自定义邮票背景布局
 * @Author 一花一世界
 */
public class StampViewLinearLayout extends LinearLayout {

    private StampView helper;

    public StampViewLinearLayout(Context context) {
        this(context, null);
    }

    public StampViewLinearLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public StampViewLinearLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        helper = new StampView(this, context, attrs, defStyle);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        helper.onSizeChanged(w, h);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        helper.onDraw(canvas);
    }

    public float getSemicircleGap() {
        return helper.getSemicircleGap();
    }

    public void setSemicircleGap(float semicircleGap) {
        helper.setSemicircleGap(semicircleGap);
    }

    public float getSemicircleRadius() {
        return helper.getSemicircleRadius();
    }

    public void setSemicircleRadius(float semicircleRadius) {
        helper.setSemicircleRadius(semicircleRadius);
    }

    public float getSemicircleCoverStrokeWidth() {
        return helper.getSemicircleCoverStrokeWidth();
    }

    public void setSemicircleCoverStrokeWidth(float semicircleCoverStrokeWidth) {
        helper.setSemicircleCoverStrokeWidth(semicircleCoverStrokeWidth);
    }

    public int getSemicircleColor() {
        return helper.getSemicircleColor();
    }

    public void setSemicircleColor(int semicircleColor) {
        helper.setSemicircleColor(semicircleColor);
    }

    public int getSemicircleCoverColor() {
        return helper.getSemicircleCoverColor();
    }

    public void setSemicircleCoverColor(int semicircleCoverColor) {
        helper.setSemicircleCoverColor(semicircleCoverColor);
    }

    public boolean isSemicircleTop() {
        return helper.isSemicircleTop();
    }

    public void setSemicircleTop(boolean semicircleTop) {
        helper.setSemicircleTop(semicircleTop);
    }

    public boolean isSemicircleBottom() {
        return helper.isSemicircleBottom();
    }

    public void setSemicircleBottom(boolean semicircleBottom) {
        helper.setSemicircleBottom(semicircleBottom);
    }

    public boolean isSemicircleLeft() {
        return helper.isSemicircleLeft();
    }

    public void setSemicircleLeft(boolean semicircleLeft) {
        helper.setSemicircleLeft(semicircleLeft);
    }

    public boolean isSemicircleRight() {
        return helper.isSemicircleRight();
    }

    public void setSemicircleRight(boolean semicircleRight) {
        helper.setSemicircleRight(semicircleRight);
    }

    public float getDashLineLength() {
        return helper.getDashLineLength();
    }

    public void setDashLineLength(float dashLineLength) {
        helper.setDashLineLength(dashLineLength);
    }

    public float getDashLineHeight() {
        return helper.getDashLineHeight();
    }

    public void setDashLineHeight(float dashLineHeight) {
        helper.setDashLineHeight(dashLineHeight);
    }

    public float getDashLineGap() {
        return helper.getDashLineGap();
    }

    public void setDashLineGap(float dashLineGap) {
        helper.setDashLineGap(dashLineGap);
    }

    public int getDashLineColor() {
        return helper.getDashLineColor();
    }

    public void setDashLineColor(int dashLineColor) {
        helper.setDashLineColor(dashLineColor);
    }

    public float getDashLineMarginTop() {
        return helper.getDashLineMarginTop();
    }

    public void setDashLineMarginTop(float dashLineMarginTop) {
        helper.setDashLineMarginTop(dashLineMarginTop);
    }

    public float getDashLineMarginBottom() {
        return helper.getDashLineMarginBottom();
    }

    public void setDashLineMarginBottom(float dashLineMarginBottom) {
        helper.setDashLineMarginBottom(dashLineMarginBottom);
    }

    public float getDashLineMarginLeft() {
        return helper.getDashLineMarginLeft();
    }

    public void setDashLineMarginLeft(float dashLineMarginLeft) {
        helper.setDashLineMarginLeft(dashLineMarginLeft);
    }

    public float getDashLineMarginRight() {
        return helper.getDashLineMarginRight();
    }

    public void setDashLineMarginRight(float dashLineMarginRight) {
        helper.setDashLineMarginRight(dashLineMarginRight);
    }

    public boolean isDashLineTop() {
        return helper.isDashLineTop();
    }

    public void setDashLineTop(boolean dashLineTop) {
        helper.setDashLineTop(dashLineTop);
    }

    public boolean isDashLineBottom() {
        return helper.isDashLineBottom();
    }

    public void setDashLineBottom(boolean dashLineBottom) {
        helper.setDashLineBottom(dashLineBottom);
    }

    public boolean isDashLineLeft() {
        return helper.isDashLineLeft();
    }

    public void setDashLineLeft(boolean dashLineLeft) {
        helper.setDashLineLeft(dashLineLeft);
    }

    public boolean isDashLineRight() {
        return helper.isDashLineRight();
    }

    public void setDashLineRight(boolean dashLineRight) {
        helper.setDashLineRight(dashLineRight);
    }
}
