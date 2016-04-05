package com.fzjt.xiaoliu.read.interfaces.util;

/**
 * 计算2点之间的距离
 * @className:com.fzjt.xiaoliu.read.interfaces.util.BaiDuMap
 * @description:TODO
 * @version:v1.0.0 
 * @date:2015-10-24 下午12:33:42
 * @author:ZhangYun
 */
public class BaiDuMap {
        static double DEF_PI = 3.14159265359; // PI
        static double DEF_2PI= 6.28318530712; // 2*PI
        static double DEF_PI180= 0.01745329252; // PI/180.0
        static double DEF_R =6370693.5; // radius of earth
                //适用于近距离
        public static double GetShortDistance(double lon1, double lat1, double lon2, double lat2)
        {
            double ew1, ns1, ew2, ns2;
            double dx, dy, dew;
            double distance;
            // 角度转换为弧度
            ew1 = lon1 * DEF_PI180;
            ns1 = lat1 * DEF_PI180;
            ew2 = lon2 * DEF_PI180;
            ns2 = lat2 * DEF_PI180;
            // 经度差
            dew = ew1 - ew2;
            // 若跨东经和西经180 度，进行调整
            if (dew > DEF_PI)
            dew = DEF_2PI - dew;
            else if (dew < -DEF_PI)
            dew = DEF_2PI + dew;
            dx = DEF_R * Math.cos(ns1) * dew; // 东西方向长度(在纬度圈上的投影长度)
            dy = DEF_R * (ns1 - ns2); // 南北方向长度(在经度圈上的投影长度)
            // 勾股定理求斜边长
            distance = Math.sqrt(dx * dx + dy * dy);
            return distance;
        }
                //适用于远距离
        public static double GetLongDistance(double lon1, double lat1, double lon2, double lat2)
        {
            double ew1, ns1, ew2, ns2;
            double distance;
            // 角度转换为弧度
            ew1 = lon1 * DEF_PI180;
            ns1 = lat1 * DEF_PI180;
            ew2 = lon2 * DEF_PI180;
            ns2 = lat2 * DEF_PI180;
            // 求大圆劣弧与球心所夹的角(弧度)
            distance = Math.sin(ns1) * Math.sin(ns2) + Math.cos(ns1) * Math.cos(ns2) * Math.cos(ew1 - ew2);
            // 调整到[-1..1]范围内，避免溢出
            if (distance > 1.0)
                 distance = 1.0;
            else if (distance < -1.0)
                  distance = -1.0;
            // 求大圆劣弧长度
            distance = DEF_R * Math.acos(distance);
            return distance;
        }
        public static void main(String[] args) {
            double mLat1 = 118.736195; // point1纬度
            double mLon1 = 32.010135; // point1经度
            double mLat2 = 118.737399;// point2纬度
            double mLon2 = 32.009377;// point2经度
            double distance = BaiDuMap.GetShortDistance(mLon1, mLat1, mLon2, mLat2);
        	int num=Integer.parseInt(new java.text.DecimalFormat("0").format(distance));
            System.out.println(num);
        }
         
}
