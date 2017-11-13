package com.swallow;

import android.content.Context;
import android.util.DisplayMetrics;

/**
 * 类描述：
 * 创建人：swallow.li
 * 创建时间：
 * Email: swallow.li@kemai.cn
 * 修改备注：
 */
public class ResolutionUtil {

    /**
     * 设备屏幕的基准宽度,高度
     */
    public static final int WINDOWS_STANDARD_SIZE_WIDTH = 720;
    public static final int WINDOWS_STANDARD_SIZE_HIGH = 1280;

    /**
     * 标准密度
     */
    private static final float DEFAULTDENSITY = 160;

    /**
     * 标准缩放大小
     */
    private static final float DEFAULTFONTDESITY = 1.0F;

    /**
     * 屏幕密度
     */
    private static float density;

    /**
     * 当前屏幕的字体缩放比例
     */
    private static float fontDesity;

    /**
     * 当前屏幕和标准屏幕(720P)的比例
     */
    private static float scale;

    /**
     * 当前设备宽度
     */
    private static int deviceWidth;

    /**
     * 当前设备高度
     */
    private static int deviceHeight;

    /**
     * 横向屏幕比例
     */
    private static float scaleWidth;

    /**
     * 竖向屏幕比例
     */
    private static float scaleHeight;

    public ResolutionUtil(Context ctx) {
        DisplayMetrics dm = ctx.getResources().getDisplayMetrics();
        deviceWidth = dm.widthPixels;
        deviceHeight = dm.heightPixels;
        density = dm.densityDpi;
        fontDesity = dm.scaledDensity;
        if (deviceWidth > deviceHeight) {
            scaleWidth = (float) deviceWidth / WINDOWS_STANDARD_SIZE_HIGH;
            scaleHeight = (float) deviceHeight / WINDOWS_STANDARD_SIZE_WIDTH;
        } else {
            scaleWidth = (float) deviceWidth / WINDOWS_STANDARD_SIZE_WIDTH;
            scaleHeight = (float) deviceHeight / WINDOWS_STANDARD_SIZE_HIGH;
        }

    }

    public static int getWidth() {
        return deviceWidth;
    }

    public static int getHeight() {
        return deviceHeight;
    }

    /**
     * 根据屏幕宽高比与密度获取适配当前屏幕px
     *
     * @param pxVlaue px
     * @return
     */
    public static int px2dp2pxWidth(float pxVlaue) {
        float dp = pxVlaue / (density / DEFAULTDENSITY);
        return (int) (dp * (density / DEFAULTDENSITY) * scaleWidth);

    }

    /**
     * 根据屏幕宽高比与密度获取适配当前屏幕px
     *
     * @param pxVlaue px
     * @return
     */
    public static int px2dp2pxHeight(float pxVlaue) {
        float dp = pxVlaue / (density / DEFAULTDENSITY);
        return (int) (dp * (density / DEFAULTDENSITY) * scaleHeight);
    }

    /**
     * 根据屏幕宽度与字体缩放比获取适配当前屏幕字体大小
     *
     * @param spVlaue px
     * @return
     */
    public static int px2sp2px(float spVlaue) {
        float dp = spVlaue / fontDesity;
        int px = (int) (dp * (fontDesity / DEFAULTFONTDESITY) / fontDesity * scaleWidth);
        return px;
    }

    /**
     * 将dip转为px值
     *
     * @param dipValue
     * @return
     */
    public static int dip2px(float dipValue) {
        return (int) ((int) (dipValue * scale) * density + 0.5);
    }

    public static int px2dip(Context context, float pxValue) {
        return (int) ((int) (pxValue * scale) / density + 0.5);
    }
}
