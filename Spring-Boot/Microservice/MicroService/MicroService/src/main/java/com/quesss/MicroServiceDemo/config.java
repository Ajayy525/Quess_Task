package com.quesss.MicroServiceDemo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("firstmicroservice")
public class config {
    private float mx;
    private float mn;
    public config(){
    }

    public config(float mx, float mn) {
        this.mx = mx;
        this.mn = mn;
    }

    public float getMx() {
        return mx;
    }

    public void setMx(float mx) {
        this.mx = mx;
    }

    public float getMn() {
        return mn;
    }

    public void setMn(float mn) {
        this.mn = mn;
    }




}
